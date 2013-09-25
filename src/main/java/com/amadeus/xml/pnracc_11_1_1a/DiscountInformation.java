
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify main information about the discount.
 * 
 * <p>Java class for DiscountInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DiscountInformationDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountInformation", propOrder = {
    "discountDetails"
})
public class DiscountInformation {

    @XmlElement(required = true)
    protected DiscountInformationDetailsType discountDetails;

    /**
     * Gets the value of the discountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountInformationDetailsType }
     *     
     */
    public DiscountInformationDetailsType getDiscountDetails() {
        return discountDetails;
    }

    /**
     * Sets the value of the discountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountInformationDetailsType }
     *     
     */
    public void setDiscountDetails(DiscountInformationDetailsType value) {
        this.discountDetails = value;
    }

}
