
package com.amadeus.xml.pnradd_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR Fare Print Override element
 * 
 * <p>Java class for FarePrintOverrideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarePrintOverrideType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="override" type="{http://xml.amadeus.com/PNRADD_11_1_1A}FarePrintOverrideDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePrintOverrideType", propOrder = {
    "passengerType",
    "override"
})
public class FarePrintOverrideType {

    protected String passengerType;
    protected FarePrintOverrideDetailsType override;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link FarePrintOverrideDetailsType }
     *     
     */
    public FarePrintOverrideDetailsType getOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePrintOverrideDetailsType }
     *     
     */
    public void setOverride(FarePrintOverrideDetailsType value) {
        this.override = value;
    }

}
