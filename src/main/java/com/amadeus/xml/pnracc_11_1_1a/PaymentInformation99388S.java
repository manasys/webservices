
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning the payment.
 * 
 * <p>Java class for PaymentInformation_99388S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInformation_99388S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PaymentDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformation_99388S", propOrder = {
    "paymentDetails"
})
public class PaymentInformation99388S {

    @XmlElement(required = true)
    protected PaymentDetailsTypeI paymentDetails;

    /**
     * Gets the value of the paymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetailsTypeI }
     *     
     */
    public PaymentDetailsTypeI getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Sets the value of the paymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsTypeI }
     *     
     */
    public void setPaymentDetails(PaymentDetailsTypeI value) {
        this.paymentDetails = value;
    }

}
