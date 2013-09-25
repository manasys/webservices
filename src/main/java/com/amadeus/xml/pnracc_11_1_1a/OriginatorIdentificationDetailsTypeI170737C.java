
package com.amadeus.xml.pnracc_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the originator of the travel request.
 * 
 * <p>Java class for OriginatorIdentificationDetailsTypeI_170737C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorIdentificationDetailsTypeI_170737C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originatorId" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumericInteger_Length1To9" minOccurs="0"/>
 *         &lt;element name="inHouseIdentification1" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To9"/>
 *         &lt;element name="inHouseIdentification2" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumericInteger_Length1To9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorIdentificationDetailsTypeI_170737C", propOrder = {
    "originatorId",
    "inHouseIdentification1",
    "inHouseIdentification2"
})
public class OriginatorIdentificationDetailsTypeI170737C {

    protected BigInteger originatorId;
    @XmlElement(required = true)
    protected String inHouseIdentification1;
    protected BigInteger inHouseIdentification2;

    /**
     * Gets the value of the originatorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginatorId() {
        return originatorId;
    }

    /**
     * Sets the value of the originatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginatorId(BigInteger value) {
        this.originatorId = value;
    }

    /**
     * Gets the value of the inHouseIdentification1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /**
     * Sets the value of the inHouseIdentification1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHouseIdentification1(String value) {
        this.inHouseIdentification1 = value;
    }

    /**
     * Gets the value of the inHouseIdentification2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInHouseIdentification2() {
        return inHouseIdentification2;
    }

    /**
     * Sets the value of the inHouseIdentification2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInHouseIdentification2(BigInteger value) {
        this.inHouseIdentification2 = value;
    }

}
