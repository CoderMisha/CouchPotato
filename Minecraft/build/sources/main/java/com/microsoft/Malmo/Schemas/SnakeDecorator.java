//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.03 at 12:38:54 AM PST 
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
 *         &lt;element name="FreshBlock" type="{http://ProjectMalmo.microsoft.com}SnakeBlock"/>
 *         &lt;element name="StaleBlock" type="{http://ProjectMalmo.microsoft.com}SnakeBlock"/>
 *         &lt;element name="GapProbability">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="variance" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StairsProbability">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="variance" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TurnProbability">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="variance" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SizeAndPosition">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="xOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="yOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="55" />
 *                 &lt;attribute name="zOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *                 &lt;attribute name="yMin" type="{http://www.w3.org/2001/XMLSchema}int" default="32" />
 *                 &lt;attribute name="yMax" type="{http://www.w3.org/2001/XMLSchema}int" default="250" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SpeedInTicks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxStairLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlRootElement(name = "SnakeDecorator")
public class SnakeDecorator {

    @XmlElement(name = "Seed", required = true)
    protected String seed;
    @XmlElement(name = "MaterialSeed")
    protected String materialSeed;
    @XmlElement(name = "FreshBlock", required = true)
    protected SnakeBlock freshBlock;
    @XmlElement(name = "StaleBlock", required = true)
    protected SnakeBlock staleBlock;
    @XmlElement(name = "GapProbability", required = true)
    protected SnakeDecorator.GapProbability gapProbability;
    @XmlElement(name = "StairsProbability", required = true)
    protected SnakeDecorator.StairsProbability stairsProbability;
    @XmlElement(name = "TurnProbability", required = true)
    protected SnakeDecorator.TurnProbability turnProbability;
    @XmlElement(name = "SizeAndPosition", required = true)
    protected SnakeDecorator.SizeAndPosition sizeAndPosition;
    @XmlElement(name = "SpeedInTicks", defaultValue = "6")
    protected int speedInTicks;
    @XmlElement(name = "MaxLength", defaultValue = "30")
    protected int maxLength;
    @XmlElement(name = "MaxStairLength", defaultValue = "20")
    protected int maxStairLength;

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
     * Gets the value of the freshBlock property.
     * 
     * @return
     *     possible object is
     *     {@link SnakeBlock }
     *     
     */
    public SnakeBlock getFreshBlock() {
        return freshBlock;
    }

    /**
     * Sets the value of the freshBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnakeBlock }
     *     
     */
    public void setFreshBlock(SnakeBlock value) {
        this.freshBlock = value;
    }

    /**
     * Gets the value of the staleBlock property.
     * 
     * @return
     *     possible object is
     *     {@link SnakeBlock }
     *     
     */
    public SnakeBlock getStaleBlock() {
        return staleBlock;
    }

    /**
     * Sets the value of the staleBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnakeBlock }
     *     
     */
    public void setStaleBlock(SnakeBlock value) {
        this.staleBlock = value;
    }

    /**
     * Gets the value of the gapProbability property.
     * 
     * @return
     *     possible object is
     *     {@link SnakeDecorator.GapProbability }
     *     
     */
    public SnakeDecorator.GapProbability getGapProbability() {
        return gapProbability;
    }

    /**
     * Sets the value of the gapProbability property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnakeDecorator.GapProbability }
     *     
     */
    public void setGapProbability(SnakeDecorator.GapProbability value) {
        this.gapProbability = value;
    }

    /**
     * Gets the value of the stairsProbability property.
     * 
     * @return
     *     possible object is
     *     {@link SnakeDecorator.StairsProbability }
     *     
     */
    public SnakeDecorator.StairsProbability getStairsProbability() {
        return stairsProbability;
    }

    /**
     * Sets the value of the stairsProbability property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnakeDecorator.StairsProbability }
     *     
     */
    public void setStairsProbability(SnakeDecorator.StairsProbability value) {
        this.stairsProbability = value;
    }

    /**
     * Gets the value of the turnProbability property.
     * 
     * @return
     *     possible object is
     *     {@link SnakeDecorator.TurnProbability }
     *     
     */
    public SnakeDecorator.TurnProbability getTurnProbability() {
        return turnProbability;
    }

    /**
     * Sets the value of the turnProbability property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnakeDecorator.TurnProbability }
     *     
     */
    public void setTurnProbability(SnakeDecorator.TurnProbability value) {
        this.turnProbability = value;
    }

    /**
     * Gets the value of the sizeAndPosition property.
     * 
     * @return
     *     possible object is
     *     {@link SnakeDecorator.SizeAndPosition }
     *     
     */
    public SnakeDecorator.SizeAndPosition getSizeAndPosition() {
        return sizeAndPosition;
    }

    /**
     * Sets the value of the sizeAndPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SnakeDecorator.SizeAndPosition }
     *     
     */
    public void setSizeAndPosition(SnakeDecorator.SizeAndPosition value) {
        this.sizeAndPosition = value;
    }

    /**
     * Gets the value of the speedInTicks property.
     * 
     */
    public int getSpeedInTicks() {
        return speedInTicks;
    }

    /**
     * Sets the value of the speedInTicks property.
     * 
     */
    public void setSpeedInTicks(int value) {
        this.speedInTicks = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     */
    public void setMaxLength(int value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the maxStairLength property.
     * 
     */
    public int getMaxStairLength() {
        return maxStairLength;
    }

    /**
     * Sets the value of the maxStairLength property.
     * 
     */
    public void setMaxStairLength(int value) {
        this.maxStairLength = value;
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
     *       &lt;attribute name="xOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="yOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="55" />
     *       &lt;attribute name="zOrigin" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
     *       &lt;attribute name="yMin" type="{http://www.w3.org/2001/XMLSchema}int" default="32" />
     *       &lt;attribute name="yMax" type="{http://www.w3.org/2001/XMLSchema}int" default="250" />
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

        @XmlAttribute(name = "xOrigin")
        protected Integer xOrigin;
        @XmlAttribute(name = "yOrigin")
        protected Integer yOrigin;
        @XmlAttribute(name = "zOrigin")
        protected Integer zOrigin;
        @XmlAttribute(name = "yMin")
        protected Integer yMin;
        @XmlAttribute(name = "yMax")
        protected Integer yMax;

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

        /**
         * Gets the value of the yMin property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getYMin() {
            if (yMin == null) {
                return  32;
            } else {
                return yMin;
            }
        }

        /**
         * Sets the value of the yMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYMin(Integer value) {
            this.yMin = value;
        }

        /**
         * Gets the value of the yMax property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public int getYMax() {
            if (yMax == null) {
                return  250;
            } else {
                return yMax;
            }
        }

        /**
         * Sets the value of the yMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setYMax(Integer value) {
            this.yMax = value;
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
    public static class StairsProbability {

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
    public static class TurnProbability {

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

}
