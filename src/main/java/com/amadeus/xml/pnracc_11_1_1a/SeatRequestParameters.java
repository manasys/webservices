
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the selection criteria for a seat map request.
 * 
 * <p>Java class for SeatRequestParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequestParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genericDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}GenericDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequestParameters", propOrder = {
    "genericDetails"
})
public class SeatRequestParameters {

    protected GenericDetailsTypeI genericDetails;

    /**
     * Gets the value of the genericDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDetailsTypeI }
     *     
     */
    public GenericDetailsTypeI getGenericDetails() {
        return genericDetails;
    }

    /**
     * Sets the value of the genericDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDetailsTypeI }
     *     
     */
    public void setGenericDetails(GenericDetailsTypeI value) {
        this.genericDetails = value;
    }

}
