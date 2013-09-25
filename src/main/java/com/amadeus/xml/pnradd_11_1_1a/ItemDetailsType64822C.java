
package com.amadeus.xml.pnradd_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To describe an item (id card, discount...)
 * 
 * <p>Java class for ItemDetailsType_64822C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDetailsType_64822C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCardCode" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaString_Length2To2" minOccurs="0"/>
 *         &lt;element name="idCardType" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://xml.amadeus.com/PNRADD_11_1_1A}NumericInteger_Length1To13" minOccurs="0"/>
 *         &lt;element name="alphaCheck" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="certificateNumber" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDetailsType_64822C", propOrder = {
    "idCardCode",
    "idCardType",
    "cardNumber",
    "alphaCheck",
    "zipCode",
    "certificateNumber"
})
public class ItemDetailsType64822C {

    protected String idCardCode;
    protected String idCardType;
    protected BigInteger cardNumber;
    protected String alphaCheck;
    protected String zipCode;
    protected String certificateNumber;

    /**
     * Gets the value of the idCardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardCode() {
        return idCardCode;
    }

    /**
     * Sets the value of the idCardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardCode(String value) {
        this.idCardCode = value;
    }

    /**
     * Gets the value of the idCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCardType() {
        return idCardType;
    }

    /**
     * Sets the value of the idCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCardType(String value) {
        this.idCardType = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardNumber(BigInteger value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the alphaCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaCheck() {
        return alphaCheck;
    }

    /**
     * Sets the value of the alphaCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaCheck(String value) {
        this.alphaCheck = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
    }

}
