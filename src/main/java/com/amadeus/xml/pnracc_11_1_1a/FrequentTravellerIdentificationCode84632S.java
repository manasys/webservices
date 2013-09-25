
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information
 * 
 * <p>Java class for FrequentTravellerIdentificationCode_84632S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationCode_84632S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlineFrequentTraveler" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationCode_84632S", propOrder = {
    "airlineFrequentTraveler"
})
public class FrequentTravellerIdentificationCode84632S {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationType airlineFrequentTraveler;

    /**
     * Gets the value of the airlineFrequentTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationType }
     *     
     */
    public FrequentTravellerIdentificationType getAirlineFrequentTraveler() {
        return airlineFrequentTraveler;
    }

    /**
     * Sets the value of the airlineFrequentTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationType }
     *     
     */
    public void setAirlineFrequentTraveler(FrequentTravellerIdentificationType value) {
        this.airlineFrequentTraveler = value;
    }

}
