
package com.amadeus.xml.pnrxcl_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/PNRXCL_11_1_1A}ReservationControlInformationType" minOccurs="0"/>
 *         &lt;element name="pnrActions" type="{http://xml.amadeus.com/PNRXCL_11_1_1A}OptionalPNRActionsType"/>
 *         &lt;element name="cancelElements" type="{http://xml.amadeus.com/PNRXCL_11_1_1A}CancelPNRElementType" maxOccurs="4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationInfo",
    "pnrActions",
    "cancelElements"
})
@XmlRootElement(name = "PNR_Cancel")
public class PNRCancel {

    protected ReservationControlInformationType reservationInfo;
    @XmlElement(required = true)
    protected OptionalPNRActionsType pnrActions;
    protected List<CancelPNRElementType> cancelElements;

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationType }
     *     
     */
    public ReservationControlInformationType getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationType }
     *     
     */
    public void setReservationInfo(ReservationControlInformationType value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the pnrActions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalPNRActionsType }
     *     
     */
    public OptionalPNRActionsType getPnrActions() {
        return pnrActions;
    }

    /**
     * Sets the value of the pnrActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalPNRActionsType }
     *     
     */
    public void setPnrActions(OptionalPNRActionsType value) {
        this.pnrActions = value;
    }

    /**
     * Gets the value of the cancelElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancelElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelPNRElementType }
     * 
     * 
     */
    public List<CancelPNRElementType> getCancelElements() {
        if (cancelElements == null) {
            cancelElements = new ArrayList<CancelPNRElementType>();
        }
        return this.cancelElements;
    }

}
