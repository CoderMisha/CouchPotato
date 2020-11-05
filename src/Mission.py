'''
script for xml environment
'''
import random


class Mission:
    def __init__(self):
        self._SIZE = 60
        self._DENSITY = 0.001

    def spawn_type(self, type):
        result_xml = ""
        for _ in range(int((self._SIZE*2)**2*self._DENSITY)):
            xd, zd = random.randint(
                0, self._SIZE), random.randint(0, self._SIZE)
            result_xml += "<DrawEntity x='{}' y='5' z='{}' type='{}'/>".format(
                xd, zd, type)
        return result_xml

    def draw_tree(self, x, z):
        leave_density = 1
        result_xml = ""
        for l in range(4, 9):
            result_xml += f"<DrawBlock x='{x}'  y='{l}' z='{z}' type='dirt' />"
        # Draw leaves
        for i, l in zip([2, 2, 1], range(7, 10)):
            for _ in range(int((2*i+1)**2*leave_density)):
                xd, zd = random.randint(x-i, x+i), random.randint(z-i, z+i)
                result_xml += f"<DrawBlock x='{xd}'  y='{l}' z='{zd}' type='leaves' />"
            leave_density -= .1
        return result_xml

    def draw_house(self, x1, x2, z1, z2):
        result_xml = "<DrawCuboid x1='{}' x2='{}' y1='3' y2='3' z1='{}' z2='{}' type='sand'/>".format(
            x1, x2, z1, z2)
        result_xml += "<DrawCuboid x1='{}' x2='{}' y1='8' y2='8' z1='{}' z2='{}' type='cobblestone'/>".format(
            x1, x2, z1, z2)
        # Draw wall
        for l in range(4, 8):
            for i in range(x1, x2+1):
                if i != (x1+x2)//2 and i != (x1+x2)//2+1:
                    result_xml += f"<DrawBlock x='{i}'  y='{l}' z='{z1}' type='gold_ore' />"
                result_xml += f"<DrawBlock x='{i}'  y='{l}' z='{z2}' type='gold_ore' />"
            for j in range(z1, z2+1):
                result_xml += f"<DrawBlock x='{x1}'  y='{l}' z='{j}' type='gold_ore' />"
                result_xml += f"<DrawBlock x='{x2}'  y='{l}' z='{j}' type='gold_ore' />"
        # Draw roof
        for i in range(x1, x2+1):
            result_xml += f"<DrawBlock x='{i}'  y='9' z='{z1}' type='oak_stairs' />"
            result_xml += f"<DrawBlock x='{i}'  y='9' z='{z2}' type='oak_stairs' />"
        for j in range(z1, z2+1):
            result_xml += f"<DrawBlock x='{x1}'  y='9' z='{j}' type='oak_stairs' />"
            result_xml += f"<DrawBlock x='{x2}'  y='9' z='{j}' type='oak_stairs' />"
        # Draw torch
        result_xml += f"<DrawBlock x='{x1+1}'  y='4' z='{z2-1}' type='torch' />"
        result_xml += f"<DrawBlock x='{x2-1}'  y='4' z='{z2-1}' type='torch' />"
        result_xml += f"<DrawBlock x='{x1+1}'  y='4' z='{z1+1}' type='torch' />"
        result_xml += f"<DrawBlock x='{x2-1}'  y='4' z='{z1+1}' type='torch' />"

        return result_xml

    def draw_wall(self, x1, x2, z1, z2):
        result_xml = ""
        for l in range(4, 7):
            for i in range(x1, x2+1):
                result_xml += f"<DrawBlock x='{i}'  y='{l}' z='{z1}' type='dark_oak_fence' />"
                result_xml += f"<DrawBlock x='{i}'  y='{l}' z='{z2}' type='dark_oak_fence' />"

            for j in range(z1, z2+1):
                result_xml += f"<DrawBlock x='{x1}'  y='{l}' z='{j}' type='dark_oak_fence' />"
                result_xml += f"<DrawBlock x='{x2}'  y='{l}' z='{j}' type='dark_oak_fence'/>"

        return result_xml

    def draw_lake(self, x1, x2, z1, z2):
        result_xml = ""
        result_xml += f"<DrawCuboid x1='{x1}' x2='{x2}' y1='3' y2='3' z1='{z1}' z2='{z2}' type='water'/>"
        # Draw stairs
        result_xml += f"<DrawBlock x='{x1+3}'  y='4' z='{z1-1}' type='oak_stairs' face ='SOUTH'/>"
        result_xml += f"<DrawBlock x='{x1+3}'  y='4' z='{z2+1}' type='oak_stairs' />"
        result_xml += f"<DrawBlock x='{x1+4}'  y='4' z='{z1-1}' type='oak_stairs' face ='SOUTH'/>"
        result_xml += f"<DrawBlock x='{x1+4}'  y='4' z='{z2+1}' type='oak_stairs' />"
        # Draw bridge
        result_xml += f"<DrawCuboid x1='{x1+3}' x2='{x1+4}' y1='5' y2='5' z1='{z1}' z2='{z2}' type='wooden_slab'/>"
        # Draw flowers
        flower_list = ["yellow_flower", "red_flower",
                       "brown_mushroom", "red_mushroom"]
        for i in range(int((x2-x1+2)*0.9)):
            xd = random.choice(list(i for i in range(
                x1-1, x2+1) if i not in [x1+3, x1+4]))
            result_xml += f"<DrawBlock x='{xd}'  y='4' z='{z1-1}' type='{random.choice(flower_list)}' />"
            xd = random.choice(list(i for i in range(
                x1-1, x2+1) if i not in [x1+3, x1+4]))
            result_xml += f"<DrawBlock x='{xd}'  y='4' z='{z2+1}' type='{random.choice(flower_list)}' />"

        for i in range(int((z2-z1+2)*0.9)):
            zd = random.randint(z1-1, z2+1)
            result_xml += f"<DrawBlock x='{x1-1}'  y='4' z='{zd}' type='{random.choice(flower_list)}' />"
            zd = random.randint(z1-1, z2+1)
            result_xml += f"<DrawBlock x='{x2+1}'  y='4' z='{zd}' type='{random.choice(flower_list)}' />"

        return result_xml

    def GetMission(self):

        return '''
        <?xml version="1.0" encoding="UTF-8" standalone="no" ?>
        <Mission xmlns="http://ProjectMalmo.microsoft.com" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">

        <About>
            <Summary>Environment Description</Summary>
        </About>

        <ServerSection>
            <ServerInitialConditions>
                <Time>
                    <StartTime>6000</StartTime>
                    <AllowPassageOfTime>true</AllowPassageOfTime>
                </Time>
                <Weather>normal</Weather>
                <AllowSpawning>false</AllowSpawing>
            </ServerInitialConditions>
            <ServerHandlers>
                <FlatWorldGenerator generatorString="3;7,2*3,1;1;biome_1,village,lake,lava_lake"/>
                <DrawingDecorator>''' +  \
            "<DrawCuboid x1='{}' x2='{}' y1='4' y2='4' z1='{}' z2='{}' type='air'/>".format(0, self._SIZE, 0, self._SIZE) + \
            "<DrawCuboid x1='{}' x2='{}' y1='3' y2='3' z1='{}' z2='{}' type='grass'/>".format(0, self._SIZE, 0, self._SIZE) + \
            self.spawn_type('Pig') + self.draw_wall(0, self._SIZE, 0, self._SIZE) + self.draw_house(30, 40, 30, 40) + self.draw_tree(20, 41) + \
            self.draw_tree(7, 13) + self.draw_tree(43, 17) + self.draw_tree(38, 11) + self.draw_lake(15, 25, 10, 20) + \
            '''</DrawingDecorator>
                <ServerQuitWhenAnyAgentFinishes/>
            </ServerHandlers>
        </ServerSection>
        
         <AgentSection mode="Creative">
            <Name>Environment Description</Name>
            <AgentStart>
                <Placement x="5" y="4" z="5" yaw="0"/>
            </AgentStart>
            <AgentHandlers>
                <ObservationFromFullStats/>
                <ObservationFromGrid>
                    <Grid name="floor3x3">
                        <min x="-1" y="-1" z="-1"/>
                        <max x="1" y="-1" z="1"/>
                    </Grid>
                </ObservationFromGrid>
                    <ContinuousMovementCommands turnSpeedDegs="180"/>
            </AgentHandlers>
        </AgentSection>
        </Mission>
        '''
