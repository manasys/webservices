
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information concerning a tour.
 * 
 * <p>Java class for TourInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tourInformationDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourInformation", propOrder = {
    "tourInformationDetails"
})
public class TourInformation {

    @XmlElement(required = true)
    protected TourDetailsTypeI tourInformationDetails;

    /**
     * Gets the value of the tourInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TourDetailsTypeI }
     *     
     */
    public TourDetailsTypeI getTourInformationDetails() {
        return tourInformationDetails;
    }

    /**
     * Sets the value of the tourInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourDetailsTypeI }
     *     
     */
    public void setTourInformationDetails(TourDetailsTypeI value) {
        this.tourInformationDetails = value;
    }

}
