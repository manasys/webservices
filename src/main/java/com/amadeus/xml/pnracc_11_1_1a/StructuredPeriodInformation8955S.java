
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey period in a structured way.
 * 
 * <p>Java class for StructuredPeriodInformation_8955S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPeriodInformation_8955S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDateTime" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeType_16347C"/>
 *         &lt;element name="endDateTime" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeType_16347C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPeriodInformation_8955S", propOrder = {
    "beginDateTime",
    "endDateTime"
})
public class StructuredPeriodInformation8955S {

    @XmlElement(required = true)
    protected StructuredDateTimeType16347C beginDateTime;
    @XmlElement(required = true)
    protected StructuredDateTimeType16347C endDateTime;

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType16347C }
     *     
     */
    public StructuredDateTimeType16347C getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType16347C }
     *     
     */
    public void setBeginDateTime(StructuredDateTimeType16347C value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType16347C }
     *     
     */
    public StructuredDateTimeType16347C getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType16347C }
     *     
     */
    public void setEndDateTime(StructuredDateTimeType16347C value) {
        this.endDateTime = value;
    }

}
