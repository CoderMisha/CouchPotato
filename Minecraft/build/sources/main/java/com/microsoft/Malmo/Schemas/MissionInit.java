//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.09 at 04:39:13 PM PST 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ProjectMalmo.microsoft.com}Mission"/>
 *         &lt;element name="ExperimentUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://ProjectMalmo.microsoft.com}MinecraftServerConnection" minOccurs="0"/>
 *         &lt;element name="ClientRole" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://ProjectMalmo.microsoft.com}ClientAgentConnection"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SchemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="PlatformVersion" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mission",
    "experimentUID",
    "minecraftServerConnection",
    "clientRole",
    "clientAgentConnection"
})
@XmlRootElement(name = "MissionInit")
public class MissionInit {

    @XmlElement(name = "Mission", required = true)
    protected Mission mission;
    @XmlElement(name = "ExperimentUID", required = true)
    protected String experimentUID;
    @XmlElement(name = "MinecraftServerConnection")
    protected MinecraftServerConnection minecraftServerConnection;
    @XmlElement(name = "ClientRole")
    protected int clientRole;
    @XmlElement(name = "ClientAgentConnection", required = true)
    protected ClientAgentConnection clientAgentConnection;
    @XmlAttribute(name = "SchemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;
    @XmlAttribute(name = "PlatformVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String platformVersion;

    /**
     * Gets the value of the mission property.
     * 
     * @return
     *     possible object is
     *     {@link Mission }
     *     
     */
    public Mission getMission() {
        return mission;
    }

    /**
     * Sets the value of the mission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mission }
     *     
     */
    public void setMission(Mission value) {
        this.mission = value;
    }

    /**
     * Gets the value of the experimentUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentUID() {
        return experimentUID;
    }

    /**
     * Sets the value of the experimentUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentUID(String value) {
        this.experimentUID = value;
    }

    /**
     * Gets the value of the minecraftServerConnection property.
     * 
     * @return
     *     possible object is
     *     {@link MinecraftServerConnection }
     *     
     */
    public MinecraftServerConnection getMinecraftServerConnection() {
        return minecraftServerConnection;
    }

    /**
     * Sets the value of the minecraftServerConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MinecraftServerConnection }
     *     
     */
    public void setMinecraftServerConnection(MinecraftServerConnection value) {
        this.minecraftServerConnection = value;
    }

    /**
     * Gets the value of the clientRole property.
     * 
     */
    public int getClientRole() {
        return clientRole;
    }

    /**
     * Sets the value of the clientRole property.
     * 
     */
    public void setClientRole(int value) {
        this.clientRole = value;
    }

    /**
     * Gets the value of the clientAgentConnection property.
     * 
     * @return
     *     possible object is
     *     {@link ClientAgentConnection }
     *     
     */
    public ClientAgentConnection getClientAgentConnection() {
        return clientAgentConnection;
    }

    /**
     * Sets the value of the clientAgentConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientAgentConnection }
     *     
     */
    public void setClientAgentConnection(ClientAgentConnection value) {
        this.clientAgentConnection = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    /**
     * Gets the value of the platformVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * Sets the value of the platformVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformVersion(String value) {
        this.platformVersion = value;
    }

}
