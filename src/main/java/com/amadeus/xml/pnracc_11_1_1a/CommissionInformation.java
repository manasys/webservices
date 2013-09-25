
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about a commission.
 * 
 * <p>Java class for CommissionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commissionDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CommissionDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionInformation", propOrder = {
    "commissionDetails"
})
public class CommissionInformation {

    @XmlElement(required = true)
    protected CommissionDetailsType commissionDetails;

    /**
     * Gets the value of the commissionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionDetailsType }
     *     
     */
    public CommissionDetailsType getCommissionDetails() {
        return commissionDetails;
    }

    /**
     * Sets the value of the commissionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionDetailsType }
     *     
     */
    public void setCommissionDetails(CommissionDetailsType value) {
        this.commissionDetails = value;
    }

}
