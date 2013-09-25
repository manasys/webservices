
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys data of the credit card authentication
 * 
 * <p>Java class for CreditCardSecurity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardSecurity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authenticationDataDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AuthenticationDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardSecurity", propOrder = {
    "authenticationDataDetails"
})
public class CreditCardSecurity {

    protected AuthenticationDataType authenticationDataDetails;

    /**
     * Gets the value of the authenticationDataDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationDataType }
     *     
     */
    public AuthenticationDataType getAuthenticationDataDetails() {
        return authenticationDataDetails;
    }

    /**
     * Sets the value of the authenticationDataDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationDataType }
     *     
     */
    public void setAuthenticationDataDetails(AuthenticationDataType value) {
        this.authenticationDataDetails = value;
    }

}
