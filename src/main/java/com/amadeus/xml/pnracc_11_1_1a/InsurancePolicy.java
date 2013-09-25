
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Insurance Policy Details
 * 
 * <p>Java class for InsurancePolicy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsurancePolicy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareDiscount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsurancePolicy", propOrder = {
    "fareDiscount"
})
public class InsurancePolicy {

    protected String fareDiscount;

    /**
     * Gets the value of the fareDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareDiscount() {
        return fareDiscount;
    }

    /**
     * Sets the value of the fareDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareDiscount(String value) {
        this.fareDiscount = value;
    }

}
