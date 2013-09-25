
package com.amadeus.xml.pnradd_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Amadeus commission information
 * 
 * <p>Java class for CommissionInformationType_6428C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommissionInformationType_6428C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="percentage" type="{http://xml.amadeus.com/PNRADD_11_1_1A}NumericInteger_Length1To5" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/PNRADD_11_1_1A}NumericInteger_Length1To10" minOccurs="0"/>
 *         &lt;element name="vatIndicator" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="remitIndicator" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionInformationType_6428C", propOrder = {
    "percentage",
    "amount",
    "vatIndicator",
    "remitIndicator"
})
public class CommissionInformationType6428C {

    protected BigInteger percentage;
    protected BigInteger amount;
    protected String vatIndicator;
    protected String remitIndicator;

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentage(BigInteger value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmount(BigInteger value) {
        this.amount = value;
    }

    /**
     * Gets the value of the vatIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatIndicator() {
        return vatIndicator;
    }

    /**
     * Sets the value of the vatIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatIndicator(String value) {
        this.vatIndicator = value;
    }

    /**
     * Gets the value of the remitIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitIndicator() {
        return remitIndicator;
    }

    /**
     * Sets the value of the remitIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitIndicator(String value) {
        this.remitIndicator = value;
    }

}
