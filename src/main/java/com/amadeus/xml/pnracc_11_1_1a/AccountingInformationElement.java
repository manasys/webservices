
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus Accounting Information element (AI element).
 * 
 * <p>Java class for AccountingInformationElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingInformationElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="account" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AccountingElementType" minOccurs="0"/>
 *         &lt;element name="accountNumberOfUnits" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingInformationElement", propOrder = {
    "account",
    "accountNumberOfUnits"
})
public class AccountingInformationElement {

    protected AccountingElementType account;
    protected String accountNumberOfUnits;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingElementType }
     *     
     */
    public AccountingElementType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingElementType }
     *     
     */
    public void setAccount(AccountingElementType value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountNumberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumberOfUnits() {
        return accountNumberOfUnits;
    }

    /**
     * Sets the value of the accountNumberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumberOfUnits(String value) {
        this.accountNumberOfUnits = value;
    }

}
