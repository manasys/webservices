
package com.amadeus.xml.fsocar_10_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional characteristics of a product or service.
 * 
 * <p>Java class for ProductTypeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTypeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availabilityCnxType" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTypeDetailsType", propOrder = {
    "availabilityCnxType"
})
public class ProductTypeDetailsType {

    @XmlElement(required = true)
    protected String availabilityCnxType;

    /**
     * Gets the value of the availabilityCnxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityCnxType() {
        return availabilityCnxType;
    }

    /**
     * Sets the value of the availabilityCnxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityCnxType(String value) {
        this.availabilityCnxType = value;
    }

}
