
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify yield data for an air segment
 * 
 * <p>Java class for ODKeyPerformanceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODKeyPerformanceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scheduleChange" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="oversale" type="{http://xml.amadeus.com/PNRACC_11_1_1A}OversaleDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODKeyPerformanceData", propOrder = {
    "scheduleChange",
    "oversale"
})
public class ODKeyPerformanceData {

    protected String scheduleChange;
    protected OversaleDataType oversale;

    /**
     * Gets the value of the scheduleChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleChange() {
        return scheduleChange;
    }

    /**
     * Sets the value of the scheduleChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleChange(String value) {
        this.scheduleChange = value;
    }

    /**
     * Gets the value of the oversale property.
     * 
     * @return
     *     possible object is
     *     {@link OversaleDataType }
     *     
     */
    public OversaleDataType getOversale() {
        return oversale;
    }

    /**
     * Sets the value of the oversale property.
     * 
     * @param value
     *     allowed object is
     *     {@link OversaleDataType }
     *     
     */
    public void setOversale(OversaleDataType value) {
        this.oversale = value;
    }

}
