//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.04 at 06:44:57 PM PST 
//


package com.microsoft.Malmo.Schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Seed">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="random|[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MaterialSeed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="random|[0-9]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AllowDiagonalMovement" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SizeAndPosition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" default="10" />
 *                 &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}int" default="10" />
 *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" default="100" />
 *                 &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *                 &lt;attribute name="xOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="yOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="55" />
 *                 &lt;attribute name="zOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StartBlock" type="{http://ProjectMalmo.microsoft.com}MazeTerminus"/>
 *         &lt;element name="EndBlock" type="{http://ProjectMalmo.microsoft.com}MazeTerminus"/>
 *         &lt;element name="PathBlock" type="{http://ProjectMalmo.microsoft.com}MazeBlock"/>
 *         &lt;element name="FloorBlock" type="{http://ProjectMalmo.microsoft.com}MazeBlock"/>
 *         &lt;element name="GapBlock" type="{http://ProjectMalmo.microsoft.com}MazeBlock"/>
 *         &lt;element name="OptimalPathBlock" type="{http://ProjectMalmo.microsoft.com}MazeBlock" minOccurs="0"/>
 *         &lt;element name="SubgoalBlock" type="{http://ProjectMalmo.microsoft.com}MazeBlock" minOccurs="0"/>
 *         &lt;element name="Waypoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="WaypointBlock" type="{http://ProjectMalmo.microsoft.com}MazeBlock"/>
 *                   &lt;element name="WaypointItem" type="{http://ProjectMalmo.microsoft.com}BlockOrItemSpec"/>
 *                 &lt;/choice>
 *                 &lt;attribute name="quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GapProbability">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="variance" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AddQuitProducer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AddNavigationObservations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "MazeDecorator")
public class MazeDecorator {

    @XmlElement(name = "Seed", required = true)
    protected String seed;
    @XmlElement(name = "MaterialSeed")
    protected String materialSeed;
    @XmlElement(name = "AllowDiagonalMovement", defaultValue = "false")
    protected boolean allowDiagonalMovement;
    @XmlElement(name = "SizeAndPosition", required = true)
    protected MazeDecorator.SizeAndPosition sizeAndPosition;
    @XmlElement(name = "StartBlock", required = true)
    protected MazeTerminus startBlock;
    @XmlElement(name = "EndBlock", required = true)
    protected MazeTerminus endBlock;
    @XmlElement(name = "PathBlock", required = true)
    protected MazeBlock pathBlock;
    @XmlElement(name = "FloorBlock", required = true)
    protected MazeBlock floorBlock;
    @XmlElement(name = "GapBlock", required = true)
    protected MazeBlock gapBlock;
    @XmlElement(name = "OptimalPathBlock")
    protected MazeBlock optimalPathBlock;
    @XmlElement(name = "SubgoalBlock")
    protected MazeBlock subgoalBlock;
    @XmlElement(name = "Waypoints")
    protected MazeDecorator.Waypoints waypoints;
    @XmlElement(name = "GapProbability", required = true)
    protected MazeDecorator.GapProbability gapProbability;
    @XmlElement(name = "AddQuitProducer")
    protected MazeDecorator.AddQuitProducer addQuitProducer;
    @XmlElement(name = "AddNavigationObservations")
    protected MazeDecorator.AddNavigationObservations addNavigationObservations;

    /**
     * Gets the value of the seed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeed() {
        return seed;
    }

    /**
     * Sets the value of the seed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeed(String value) {
        this.seed = value;
    }

    /**
     * Gets the value of the materialSeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialSeed() {
        return materialSeed;
    }

    /**
     * Sets the value of the materialSeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialSeed(String value) {
        this.materialSeed = value;
    }

    /**
     * Gets the value of the allowDiagonalMovement property.
     * 
     */
    public boolean isAllowDiagonalMovement() {
        return allowDiagonalMovement;
    }

    /**
     * Sets the value of the allowDiagonalMovement property.
     * 
     */
    public void setAllowDiagonalMovement(boolean value) {
        this.allowDiagonalMovement = value;
    }

    /**
     * Gets the value of the sizeAndPosition property.
     * 
     * @return
     *     possible object is
     *     {@link MazeDecorator.SizeAndPosition }
     *     
     */
    public MazeDecorator.SizeAndPosition getSizeAndPosition() {
        return sizeAndPosition;
    }

    /**
     * Sets the value of the sizeAndPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeDecorator.SizeAndPosition }
     *     
     */
    public void setSizeAndPosition(MazeDecorator.SizeAndPosition value) {
        this.sizeAndPosition = value;
    }

    /**
     * Gets the value of the startBlock property.
     * 
     * @return
     *     possible object is
     *     {@link MazeTerminus }
     *     
     */
    public MazeTerminus getStartBlock() {
        return startBlock;
    }

    /**
     * Sets the value of the startBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeTerminus }
     *     
     */
    public void setStartBlock(MazeTerminus value) {
        this.startBlock = value;
    }

    /**
     * Gets the value of the endBlock property.
     * 
     * @return
     *     possible object is
     *     {@link MazeTerminus }
     *     
     */
    public MazeTerminus getEndBlock() {
        return endBlock;
    }

    /**
     * Sets the value of the endBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeTerminus }
     *     
     */
    public void setEndBlock(MazeTerminus value) {
        this.endBlock = value;
    }

    /**
     * Gets the value of the pathBlock property.
     * 
     * @return
     *     possible object is
     *     {@link MazeBlock }
     *     
     */
    public MazeBlock getPathBlock() {
        return pathBlock;
    }

    /**
     * Sets the value of the pathBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeBlock }
     *     
     */
    public void setPathBlock(MazeBlock value) {
        this.pathBlock = value;
    }

    /**
     * Gets the value of the floorBlock property.
     * 
     * @return
     *     possible object is
     *     {@link MazeBlock }
     *     
     */
    public MazeBlock getFloorBlock() {
        return floorBlock;
    }

    /**
     * Sets the value of the floorBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeBlock }
     *     
     */
    public void setFloorBlock(MazeBlock value) {
        this.floorBlock = value;
    }

    /**
     * Gets the value of the gapBlock property.
     * 
     * @return
     *     possible object is
     *     {@link MazeBlock }
     *     
     */
    public MazeBlock getGapBlock() {
        return gapBlock;
    }

    /**
     * Sets the value of the gapBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeBlock }
     *     
     */
    public void setGapBlock(MazeBlock value) {
        this.gapBlock = value;
    }

    /**
     * Gets the value of the optimalPathBlock property.
     * 
     * @return
     *     possible object is
     *     {@link MazeBlock }
     *     
     */
    public MazeBlock getOptimalPathBlock() {
        return optimalPathBlock;
    }

    /**
     * Sets the value of the optimalPathBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeBlock }
     *     
     */
    public void setOptimalPathBlock(MazeBlock value) {
        this.optimalPathBlock = value;
    }

    /**
     * Gets the value of the subgoalBlock property.
     * 
     * @return
     *     possible object is
     *     {@link MazeBlock }
     *     
     */
    public MazeBlock getSubgoalBlock() {
        return subgoalBlock;
    }

    /**
     * Sets the value of the subgoalBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeBlock }
     *     
     */
    public void setSubgoalBlock(MazeBlock value) {
        this.subgoalBlock = value;
    }

    /**
     * Gets the value of the waypoints property.
     * 
     * @return
     *     possible object is
     *     {@link MazeDecorator.Waypoints }
     *     
     */
    public MazeDecorator.Waypoints getWaypoints() {
        return waypoints;
    }

    /**
     * Sets the value of the waypoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeDecorator.Waypoints }
     *     
     */
    public void setWaypoints(MazeDecorator.Waypoints value) {
        this.waypoints = value;
    }

    /**
     * Gets the value of the gapProbability property.
     * 
     * @return
     *     possible object is
     *     {@link MazeDecorator.GapProbability }
     *     
     */
    public MazeDecorator.GapProbability getGapProbability() {
        return gapProbability;
    }

    /**
     * Sets the value of the gapProbability property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeDecorator.GapProbability }
     *     
     */
    public void setGapProbability(MazeDecorator.GapProbability value) {
        this.gapProbability = value;
    }

    /**
     * Gets the value of the addQuitProducer property.
     * 
     * @return
     *     possible object is
     *     {@link MazeDecorator.AddQuitProducer }
     *     
     */
    public MazeDecorator.AddQuitProducer getAddQuitProducer() {
        return addQuitProducer;
    }

    /**
     * Sets the value of the addQuitProducer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeDecorator.AddQuitProducer }
     *     
     */
    public void setAddQuitProducer(MazeDecorator.AddQuitProducer value) {
        this.addQuitProducer = value;
    }

    /**
     * Gets the value of the addNavigationObservations property.
     * 
     * @return
     *     possible object is
     *     {@link MazeDecorator.AddNavigationObservations }
     *     
     */
    public MazeDecorator.AddNavigationObservations getAddNavigationObservations() {
        return addNavigationObservations;
    }

    /**
     * Sets the value of the addNavigationObservations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MazeDecorator.AddNavigationObservations }
     *     
     */
    public void setAddNavigationObservations(MazeDecorator.AddNavigationObservations value) {
        this.addNavigationObservations = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AddNavigationObservations {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AddQuitProducer {

        @XmlAttribute(name = "description")
        protected String description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            if (description == null) {
                return "";
            } else {
                return description;
            }
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="variance" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class GapProbability {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "variance")
        protected BigDecimal variance;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the variance property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVariance() {
            if (variance == null) {
                return new BigDecimal("0");
            } else {
                return variance;
            }
        }

        /**
         * Sets the value of the variance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVariance(BigDecimal value) {
            this.variance = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" default="10" />
     *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}int" default="10" />
     *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" default="100" />
     *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
     *       &lt;attribute name="xOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="yOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="55" />
     *       &lt;attribute name="zOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SizeAndPosition {

        @XmlAttribute(name = "width")
        protected Integer width;
        @XmlAttribute(name = "length")
        protected Integer length;
        @XmlAttribute(name = "height")
        protected Integer height;
        @XmlAttribute(name = "scale")
        protected Integer scale;
        @XmlAttribute(name = "xOrigin")
        protected Integer xOrigin;
        @XmlAttribute(name = "yOrigin")
        protected Integer yOrigin;
        @XmlAttribute(name = "zOrigin")
        protected Integer zOrigin;

        /**
         * Gets the value of the width property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getWidth() {
            if (width == null) {
                return  10;
            } else {
                return width;
            }
        }

        /**
         * Sets the value of the width property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setWidth(Integer value) {
            this.width = value;
        }

        /**
         * Gets the value of the length property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getLength() {
            if (length == null) {
                return  10;
            } else {
                return length;
            }
        }

        /**
         * Sets the value of the length property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLength(Integer value) {
            this.length = value;
        }

        /**
         * Gets the value of the height property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getHeight() {
            if (height == null) {
                return  100;
            } else {
                return height;
            }
        }

        /**
         * Sets the value of the height property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setHeight(Integer value) {
            this.height = value;
        }

        /**
         * Gets the value of the scale property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getScale() {
            if (scale == null) {
                return  1;
            } else {
                return scale;
            }
        }

        /**
         * Sets the value of the scale property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setScale(Integer value) {
            this.scale = value;
        }

        /**
         * Gets the value of the xOrigin property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getXOrigin() {
            if (xOrigin == null) {
                return  0;
            } else {
                return xOrigin;
            }
        }

        /**
         * Sets the value of the xOrigin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setXOrigin(Integer value) {
            this.xOrigin = value;
        }

        /**
         * Gets the value of the yOrigin property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getYOrigin() {
            if (yOrigin == null) {
                return  55;
            } else {
                return yOrigin;
            }
        }

        /**
         * Sets the value of the yOrigin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYOrigin(Integer value) {
            this.yOrigin = value;
        }

        /**
         * Gets the value of the zOrigin property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getZOrigin() {
            if (zOrigin == null) {
                return  0;
            } else {
                return zOrigin;
            }
        }

        /**
         * Sets the value of the zOrigin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setZOrigin(Integer value) {
            this.zOrigin = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="WaypointBlock" type="{http://ProjectMalmo.microsoft.com}MazeBlock"/>
     *         &lt;element name="WaypointItem" type="{http://ProjectMalmo.microsoft.com}BlockOrItemSpec"/>
     *       &lt;/choice>
     *       &lt;attribute name="quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "waypointBlock",
        "waypointItem"
    })
    public static class Waypoints {

        @XmlElement(name = "WaypointBlock")
        protected MazeBlock waypointBlock;
        @XmlElement(name = "WaypointItem")
        protected BlockOrItemSpec waypointItem;
        @XmlAttribute(name = "quantity", required = true)
        protected int quantity;

        /**
         * Gets the value of the waypointBlock property.
         * 
         * @return
         *     possible object is
         *     {@link MazeBlock }
         *     
         */
        public MazeBlock getWaypointBlock() {
            return waypointBlock;
        }

        /**
         * Sets the value of the waypointBlock property.
         * 
         * @param value
         *     allowed object is
         *     {@link MazeBlock }
         *     
         */
        public void setWaypointBlock(MazeBlock value) {
            this.waypointBlock = value;
        }

        /**
         * Gets the value of the waypointItem property.
         * 
         * @return
         *     possible object is
         *     {@link BlockOrItemSpec }
         *     
         */
        public BlockOrItemSpec getWaypointItem() {
            return waypointItem;
        }

        /**
         * Sets the value of the waypointItem property.
         * 
         * @param value
         *     allowed object is
         *     {@link BlockOrItemSpec }
         *     
         */
        public void setWaypointItem(BlockOrItemSpec value) {
            this.waypointItem = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(int value) {
            this.quantity = value;
        }

    }

}
