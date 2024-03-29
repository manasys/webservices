
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey period in a structured way.
 * 
 * <p>Java class for StructuredPeriodInformation_11026S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPeriodInformation_11026S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessSemantic" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="timeMode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="beginDateTime" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeType_18725C"/>
 *         &lt;element name="endDateTime" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeType_18725C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPeriodInformation_11026S", propOrder = {
    "businessSemantic",
    "timeMode",
    "beginDateTime",
    "endDateTime"
})
public class StructuredPeriodInformation11026S {

    protected String businessSemantic;
    protected String timeMode;
    @XmlElement(required = true)
    protected StructuredDateTimeType18725C beginDateTime;
    @XmlElement(required = true)
    protected StructuredDateTimeType18725C endDateTime;

    /**
     * Gets the value of the businessSemantic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /**
     * Sets the value of the businessSemantic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSemantic(String value) {
        this.businessSemantic = value;
    }

    /**
     * Gets the value of the timeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeMode() {
        return timeMode;
    }

    /**
     * Sets the value of the timeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeMode(String value) {
        this.timeMode = value;
    }

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType18725C }
     *     
     */
    public StructuredDateTimeType18725C getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType18725C }
     *     
     */
    public void setBeginDateTime(StructuredDateTimeType18725C value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType18725C }
     *     
     */
    public StructuredDateTimeType18725C getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType18725C }
     *     
     */
    public void setEndDateTime(StructuredDateTimeType18725C value) {
        this.endDateTime = value;
    }

}
