
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a reference to a reservation
 * 
 * <p>Java class for ReservationControlInformation_87792S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformation_87792S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformationDetailsTypeI_133146C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformation_87792S", propOrder = {
    "reservation"
})
public class ReservationControlInformation87792S {

    protected ReservationControlInformationDetailsTypeI133146C reservation;

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeI133146C }
     *     
     */
    public ReservationControlInformationDetailsTypeI133146C getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeI133146C }
     *     
     */
    public void setReservation(ReservationControlInformationDetailsTypeI133146C value) {
        this.reservation = value;
    }

}
