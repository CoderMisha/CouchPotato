//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.28 at 09:07:12 PM PST 
//


package com.microsoft.Malmo.Schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="VideoData" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="frameType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="framesSent" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="averageFpsSent" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="framesReceived" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="framesWritten" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "videoData"
})
@XmlRootElement(name = "MissionDiagnostics")
public class MissionDiagnostics {

    @XmlElement(name = "VideoData")
    protected List<MissionDiagnostics.VideoData> videoData;

    /**
     * Gets the value of the videoData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissionDiagnostics.VideoData }
     * 
     * 
     */
    public List<MissionDiagnostics.VideoData> getVideoData() {
        if (videoData == null) {
            videoData = new ArrayList<MissionDiagnostics.VideoData>();
        }
        return this.videoData;
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
     *       &lt;attribute name="frameType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="framesSent" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="averageFpsSent" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="framesReceived" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="framesWritten" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VideoData {

        @XmlAttribute(name = "frameType", required = true)
        protected String frameType;
        @XmlAttribute(name = "framesSent", required = true)
        protected int framesSent;
        @XmlAttribute(name = "averageFpsSent", required = true)
        protected BigDecimal averageFpsSent;
        @XmlAttribute(name = "framesReceived")
        protected Integer framesReceived;
        @XmlAttribute(name = "framesWritten")
        protected Integer framesWritten;

        /**
         * Gets the value of the frameType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrameType() {
            return frameType;
        }

        /**
         * Sets the value of the frameType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrameType(String value) {
            this.frameType = value;
        }

        /**
         * Gets the value of the framesSent property.
         * 
         */
        public int getFramesSent() {
            return framesSent;
        }

        /**
         * Sets the value of the framesSent property.
         * 
         */
        public void setFramesSent(int value) {
            this.framesSent = value;
        }

        /**
         * Gets the value of the averageFpsSent property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAverageFpsSent() {
            return averageFpsSent;
        }

        /**
         * Sets the value of the averageFpsSent property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAverageFpsSent(BigDecimal value) {
            this.averageFpsSent = value;
        }

        /**
         * Gets the value of the framesReceived property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFramesReceived() {
            return framesReceived;
        }

        /**
         * Sets the value of the framesReceived property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFramesReceived(Integer value) {
            this.framesReceived = value;
        }

        /**
         * Gets the value of the framesWritten property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFramesWritten() {
            return framesWritten;
        }

        /**
         * Sets the value of the framesWritten property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFramesWritten(Integer value) {
            this.framesWritten = value;
        }

    }

}
