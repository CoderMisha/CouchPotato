'''
This is a script for actionclass that call Malmo action
based on given command
How many pigs?
Where is the village?
What is in front of the house?
'''

import malmo.MalmoPython
import json
import math
from collections import defaultdict
import numpy as np

# What is the closest entity (relative to agent)? ✅
# Where is the closest (entity) (relative to agent) ?
# Where is the (entity A) relative to (Block B)?  拿到block坐标，找离他最近的block，方向
# How many (entity/Block) can you see? question: min max observationfromgrid
# What is the clostest entity relative to a (Block)?
# ------- after status -------
# Where are you? / Describe your location

#direction, nearest, color,
# train model to have multiple tags?


#### GLOABL #####
TREE_LIST = [(7, 13), (43, 17), (38, 11), (7, 50)]
HOUSE = [(30, 30), (40, 40)]
LAKE = [(10, 20), (15, 25)]
###############


class CommandAction:

    def __init__(self, agentHost):
        self.agent = agentHost
        self.observation = self.get_observation()
        self.world_state = self.get_latest_world()

    ####### --------------------------- HELPER FUNCTION ------------------------------------- ########
    def get_latest_world(self):
        latest_world = self.agent.peekWorldState()
        return latest_world

    def get_observation(self):
        lastest_world = self.get_latest_world()
        observation = json.loads(lastest_world.observations[-1].text)
        return observation

    def get_grid_from_observation(self):
        if self.world_state.number_of_observations_since_last_state > 0:
            msg = self.world_state.observations[-1].text
            observations = json.loads(msg)
            grid = observations.get(u'ground_layer', 0)
        return grid

    def get_agent_pos(self):
        return (self.observation['XPos'], self.observation['ZPos'])

    def get_distance(self, x1, x2, z1, z2):
        """
        Get distance of two coordinate
        """
        return math.sqrt((x1 - x2)**2 + (z1 - z2)**2)

    def entity_angle(self, p1: tuple):
        """
        Get angle between two points p1 coordinate of the entity/agent
        """
        ang1 = np.arctan2(*p1[::-1])
        ang2 = np.arctan2(*(0, 0)[::-1])
        return -1 * int(np.rad2deg((ang1 - ang2) % (2 * np.pi)))

    def get_entity_dict(self, block_type):
        """
        input: block type include agent and others "agent"/global variable
        return a dict of all types of entities : [distance, angle, coord]
        """
        print(block_type)
        entity_dict = {}
        if block_type == "agent":
            x = self.get_agent_pos()[0]
            z = self.get_agent_pos()[1]
        else:

            x = self.find_closest_block_relative_agent(block_type)[0]
            z = self.find_closest_block_relative_agent(block_type)[1]

        for e in self.observation["Entities"][1:]:
            entity_x = e["x"]
            entity_z = e["z"]
            entity_name = e["name"]
            angle = self.entity_angle((entity_x, entity_z))
            dist = self.get_distance(x, entity_x, z, entity_z)
            if entity_name not in entity_dict.keys():
                entity_dict[entity_name] = []
            entity_dict[entity_name].append(
                (dist, angle, (entity_x, entity_z)))
        # print(entity_dict)
        return entity_dict

    def get_entity_closest_relative_block(self, block_type):
        '''
        input: "agent"/global variable(block type)
        Return list of tuple : [('Pig', 4.234), ('Cow', 5)...] For getting
        animal distances
        '''
        if block_type == "agent":
            x = self.get_agent_pos()[0]
            z = self.get_agent_pos()[1]

        elif type(block_type) == list and block_type[0][0] in ['Pig', 'Cow', 'Sheep']:
            x = block_type[0][1][0]
            z = block_type[0][1][1]
            #print(x, z)

        else:
            x = self.find_closest_block_relative_agent(block_type)[0]
            z = self.find_closest_block_relative_agent(block_type)[1]

        entity_distance_dict = []
        for e in self.observation["Entities"][1:]:
            entity_x = e["x"]
            entity_z = e["z"]
            dist = self.get_distance(x, entity_x, z, entity_z)
            entity_distance_dict.append(
                (e["name"], dist, (entity_x, entity_z)))
        entity_distance_dict.sort(key=lambda x: x[1])
        # print(entity_distance_dict)
        return entity_distance_dict

    def find_closest_block_relative_agent(self, block_type: [tuple]):
        '''
        根据agent找最近的block
        Find the closest bloack(e.g. tree) relative to agent
        input: a block type --- list of tuple 
        output: the cloest block coordinate --- tuple
        '''
        # print(block_type)
        if block_type == TREE_LIST:
            dist_list = []
            for cor in block_type:
                dist_list.append(self.get_distance(cor[0], self.get_agent_pos()[
                    0], cor[1], self.get_agent_pos()[1]))
            return block_type[dist_list.index(min(dist_list))]
        elif block_type == HOUSE:
            return (35, 35)
        elif block_type == LAKE:
            return (12.5, 22.5)

    def find_closest_entity_relative_to_block(self, block_type, entity_type: str):
        '''
        Find the closest entity(type) relative to agent
        input: an entity type : string
        output: a list [distance, angle, coord] of closest entity(type)
        '''
        entity_list = self.get_entity_dict(
            block_type)[entity_type.capitalize()]
        entity_list = sorted(entity_list, key=lambda entity: entity[0])
        # print(entity_list)
        return entity_list[0]

    ####### --------------------------- END OF HELPER FUNCTION ------------------------------------- ########

    ####### --------------------------- ACTION FUNCTION ------------------------------------- #############

    def getDirection(self, entity_type, target="agent"):
        '''
        Get the direction of entity correlated to the agent or an architect
        '''
        # print(entity_type)
        closest_entity = self.find_closest_entity_relative_to_block(
            target, entity_type)
        # print(closest_entity)
        direction = ""
        if target == "agent":
            agent_yaw = self.observation['Yaw']
            direction_of_closet = agent_yaw-closest_entity[1]
            entity_dist = self.get_distance(
                closest_entity[2][0], 0, closest_entity[2][1], 0)
            agent_dist = self.get_distance(
                self.get_agent_pos()[0], 0, self.get_agent_pos()[1], 0)
            if entity_dist > agent_dist:
                if direction_of_closet >= -50 and direction_of_closet <= 50:
                    direction = "right in front of me"
                elif direction_of_closet < -50 and direction_of_closet >= -160:
                    direction = "on my right hand"
                elif direction_of_closet > 50 and direction_of_closet < 160:
                    direction = "on my left hand"
                else:
                    direction = f"I cannot see any {entity_type}, maybe it's behind me"
            else:
                if direction_of_closet >= -50 and direction_of_closet <= 50:
                    direction = f"I cannot see any {entity_type}, maybe it's behind me"
                elif direction_of_closet < -50 and direction_of_closet >= -160:
                    direction = "on my left hand"
                elif direction_of_closet > 50 and direction_of_closet < 160:
                    direction = "on my right hand"
                else:
                    direction = f"right in front of me"
        else:
            cor1 = closest_entity[2]
            if target == HOUSE:
                cor2 = HOUSE
            elif target == LAKE:
                cor2 = LAKE
            else:  # Tree
                cor2 = [self.find_closest_block_relative_agent(target)]
            if len(cor2) != 1:
                cor2_x1 = cor2[0][0]
                cor2_z1 = cor2[0][1]
                cor2_x2 = cor2[1][0]
                cor2_z2 = cor2[1][1]
                center_x = cor2_x1+(cor2_x2-cor2_x1)//2
                center_y = cor2_z1+(cor2_z2-cor2_z1)//2

                if cor1[0] < center_x + 20 and cor1[0] > center_x - 20 and cor1[1] < center_y + 20 and cor1[1] > center_y - 20:
                    if cor1[1] > cor2_z2:
                        if cor1[0] > cor2_x2:
                            direction = "Top left corner"
                        elif cor1[0] > cor2_x1 and cor1[0] < cor2_x2:
                            direction = "Behind"
                        else:
                            direction = "Top right corner"
                    elif cor1[1] > cor2_z1 and cor1[1] < cor2_z2:
                        if cor1[0] > cor2_x2:
                            direction = "Left"
                        elif cor1[0] > cor2_x1 and cor1[0] < cor2_x2:
                            direction = "inside"
                        else:
                            direction = "Right"
                    else:
                        if cor1[0] > cor2_x2:
                            direction = "Bottom left corner"
                        elif cor1[0] > cor2_x1 and cor1[0] < cor2_x2:
                            direction = "Front"
                        else:
                            direction = "Bottom right corner"
                else:
                    direction = "This entity is not in the range."
            else:  # Tree
                cor2_x = cor2[0][0]
                cor2_z = cor2[0][1]
                if cor1[0] < cor2_x + 4 and cor1[0] > cor2_x - 4 and cor1[1] < cor2_z + 4 and cor1[1] > cor2_z - 4:
                    direction = "This entity is around the tree."
                else:
                    direction = "This entity is not in the range."
        return direction

    def closest(self, block_type, num=1):
        '''
        input block type: "agent"/global variable(block type)/animal type
        output name of closest animal
        '''
        entity_list = self.get_entity_closest_relative_block(block_type)
        if type(block_type) == list:
            entity_list = entity_list[1:]
        # print(entity_list)
        count = 0
        result = []
        index = 0
        while count < num:
            if entity_list[index][0] in ['Pig', 'Cow', 'Sheep']:
                result.append((entity_list[index][0], entity_list[index][2]))
                count += 1
            index += 1
        return result

    def inside(self, block):
        inside = []
        if block == "house":
            block = HOUSE
        elif block == "lake":
            block = LAKE
        entity_dict = self.get_entity_dict(block)
        x1 = block[0][0]
        x2 = block[1][0]
        z1 = block[0][1]
        z2 = block[1][1]
        for key in entity_dict.keys():
            for each in entity_dict[key]:
                if each[2][0] > x1 and each[2][0] < x2 and each[2][1] > z1 and each[2][1] < z2:
                    inside.append(key)
        return inside

    def count(self, animal, block):
        inside = self.inside(block)
        if animal != 'animals':
            num = inside.count(animal)
        else:
            num = len(inside)
        return num

    def describe_agent_location(self):
        ground = self.get_grid_from_observation()
        #agent_x, agent_z = self.get_agent_pos()

        stand = ""
        if ground[1] == "grass":
            stand = "on the grass"
        elif ground[1] == "sand":
            stand = "inside the house"
        elif ground[1] == "water":
            stand = "in the water"

        entity = self.closest("agent", 3)
        entity = ",".join(entity)

        result = f"I am standing {stand}, and I can see there are {entity} near me"
        return result
