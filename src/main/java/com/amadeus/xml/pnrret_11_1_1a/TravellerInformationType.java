
package com.amadeus.xml.pnrret_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Traveller information
 * 
 * <p>Java class for TravellerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="traveller" type="{http://xml.amadeus.com/PNRRET_11_1_1A}TravellerSurnameInformationTypeI"/>
 *         &lt;element name="passenger" type="{http://xml.amadeus.com/PNRRET_11_1_1A}TravellerDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationType", propOrder = {
    "traveller",
    "passenger"
})
public class TravellerInformationType {

    @XmlElement(required = true)
    protected TravellerSurnameInformationTypeI traveller;
    protected TravellerDetailsTypeI passenger;

    /**
     * Gets the value of the traveller property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationTypeI }
     *     
     */
    public TravellerSurnameInformationTypeI getTraveller() {
        return traveller;
    }

    /**
     * Sets the value of the traveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationTypeI }
     *     
     */
    public void setTraveller(TravellerSurnameInformationTypeI value) {
        this.traveller = value;
    }

    /**
     * Gets the value of the passenger property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerDetailsTypeI }
     *     
     */
    public TravellerDetailsTypeI getPassenger() {
        return passenger;
    }

    /**
     * Sets the value of the passenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerDetailsTypeI }
     *     
     */
    public void setPassenger(TravellerDetailsTypeI value) {
        this.passenger = value;
    }

}
