
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * to specify details relating to the transaction
 * 
 * <p>Java class for TransactionInformationForTicketing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionInformationForTicketing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TransactionInformationsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInformationForTicketing", propOrder = {
    "transactionDetails"
})
public class TransactionInformationForTicketing {

    @XmlElement(required = true)
    protected TransactionInformationsType transactionDetails;

    /**
     * Gets the value of the transactionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInformationsType }
     *     
     */
    public TransactionInformationsType getTransactionDetails() {
        return transactionDetails;
    }

    /**
     * Sets the value of the transactionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInformationsType }
     *     
     */
    public void setTransactionDetails(TransactionInformationsType value) {
        this.transactionDetails = value;
    }

}
