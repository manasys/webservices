
package com.amadeus.xml.fsocar_10_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * NEW FARE SEACH
 * 
 * <p>Java class for FareFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refNumber" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}NumericInteger_Length1To3"/>
 *         &lt;element name="fareFamilyname" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="hierarchy" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="cabin" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyType", propOrder = {
    "refNumber",
    "fareFamilyname",
    "hierarchy",
    "cabin"
})
public class FareFamilyType {

    @XmlElement(required = true)
    protected BigInteger refNumber;
    protected String fareFamilyname;
    protected BigInteger hierarchy;
    protected String cabin;

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefNumber(BigInteger value) {
        this.refNumber = value;
    }

    /**
     * Gets the value of the fareFamilyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamilyname() {
        return fareFamilyname;
    }

    /**
     * Sets the value of the fareFamilyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareFamilyname(String value) {
        this.fareFamilyname = value;
    }

    /**
     * Gets the value of the hierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHierarchy() {
        return hierarchy;
    }

    /**
     * Sets the value of the hierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHierarchy(BigInteger value) {
        this.hierarchy = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

}
