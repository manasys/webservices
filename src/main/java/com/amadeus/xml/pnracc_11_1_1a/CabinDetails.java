
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the physical layout of a cabin class or cabin compartment of an aircraft.
 * 
 * <p>Java class for CabinDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CabinClassDesignationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDetails", propOrder = {
    "cabinDetails"
})
public class CabinDetails {

    protected CabinClassDesignationType cabinDetails;

    /**
     * Gets the value of the cabinDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassDesignationType }
     *     
     */
    public CabinClassDesignationType getCabinDetails() {
        return cabinDetails;
    }

    /**
     * Sets the value of the cabinDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassDesignationType }
     *     
     */
    public void setCabinDetails(CabinClassDesignationType value) {
        this.cabinDetails = value;
    }

}
