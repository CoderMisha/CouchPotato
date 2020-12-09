//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:07:12 PM PST 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *         {{{name}}} - Each grid has a text label to identify it.
 *         
 *         {{{absoluteCoords}}} - If true, the min and max coordinates of the grid are interpreted as world coordinates. If false (the default)
 *         then the coordinates are relative to the player.
 *         
 *         {{{min}}}, {{{max}}} - The corners of the grid.
 *       
 * 
 * <p>Java class for GridDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GridDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="min" type="{http://ProjectMalmo.microsoft.com}Pos"/>
 *         &lt;element name="max" type="{http://ProjectMalmo.microsoft.com}Pos"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}Name" />
 *       &lt;attribute name="absoluteCoords" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridDefinition", propOrder = {
    "min",
    "max"
})
public class GridDefinition {

    @XmlElement(required = true)
    protected Pos min;
    @XmlElement(required = true)
    protected Pos max;
    @XmlAttribute(name = "name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String name;
    @XmlAttribute(name = "absoluteCoords")
    protected Boolean absoluteCoords;

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link Pos }
     *     
     */
    public Pos getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pos }
     *     
     */
    public void setMin(Pos value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link Pos }
     *     
     */
    public Pos getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pos }
     *     
     */
    public void setMax(Pos value) {
        this.max = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the absoluteCoords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAbsoluteCoords() {
        if (absoluteCoords == null) {
            return false;
        } else {
            return absoluteCoords;
        }
    }

    /**
     * Sets the value of the absoluteCoords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAbsoluteCoords(Boolean value) {
        this.absoluteCoords = value;
    }

}
