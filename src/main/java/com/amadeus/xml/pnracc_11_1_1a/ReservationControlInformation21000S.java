
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a reference to a reservation
 * 
 * <p>Java class for ReservationControlInformation_21000S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformation_21000S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformationDetailsTypeI_37404C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformation_21000S", propOrder = {
    "reservation"
})
public class ReservationControlInformation21000S {

    protected ReservationControlInformationDetailsTypeI37404C reservation;

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeI37404C }
     *     
     */
    public ReservationControlInformationDetailsTypeI37404C getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeI37404C }
     *     
     */
    public void setReservation(ReservationControlInformationDetailsTypeI37404C value) {
        this.reservation = value;
    }

}
