
package com.amadeus.xml.pnradd_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Product or account details
 * 
 * <p>Java class for ProductAccountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAccountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberQualifier" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="number" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To27"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAccountDetailsType", propOrder = {
    "numberQualifier",
    "number"
})
public class ProductAccountDetailsType {

    protected String numberQualifier;
    @XmlElement(required = true)
    protected String number;

    /**
     * Gets the value of the numberQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberQualifier() {
        return numberQualifier;
    }

    /**
     * Sets the value of the numberQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberQualifier(String value) {
        this.numberQualifier = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

}
