
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a segment of an itinerary and related details.
 * 
 * <p>Java class for TravelItineraryInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelItineraryInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelItineraryInformation", propOrder = {
    "movementType"
})
public class TravelItineraryInformation {

    @XmlElement(required = true)
    protected String movementType;

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

}
