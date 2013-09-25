
package com.amadeus.xml.pnradd_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey full reference for a rail seat.
 * 
 * <p>Java class for RailSeatReferenceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailSeatReferenceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="railSeatReferenceDetails" type="{http://xml.amadeus.com/PNRADD_11_1_1A}SeatReferenceInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailSeatReferenceInformationType", propOrder = {
    "railSeatReferenceDetails"
})
public class RailSeatReferenceInformationType {

    protected SeatReferenceInformationType railSeatReferenceDetails;

    /**
     * Gets the value of the railSeatReferenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SeatReferenceInformationType }
     *     
     */
    public SeatReferenceInformationType getRailSeatReferenceDetails() {
        return railSeatReferenceDetails;
    }

    /**
     * Sets the value of the railSeatReferenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatReferenceInformationType }
     *     
     */
    public void setRailSeatReferenceDetails(SeatReferenceInformationType value) {
        this.railSeatReferenceDetails = value;
    }

}
