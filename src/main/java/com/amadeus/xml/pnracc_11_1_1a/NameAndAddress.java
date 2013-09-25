
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the name/address and their related function, either by C082 only and/or unstructured by C058 or structured by C080 thru 3207.
 * 
 * <p>Java class for NameAndAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameAndAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="addressDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NameAndAddressDetailsTypeU" minOccurs="0"/>
 *         &lt;element name="partyNameDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PartyNameBatchTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndAddress", propOrder = {
    "partyQualifier",
    "addressDetails",
    "partyNameDetails"
})
public class NameAndAddress {

    @XmlElement(required = true)
    protected String partyQualifier;
    protected NameAndAddressDetailsTypeU addressDetails;
    protected PartyNameBatchTypeU partyNameDetails;

    /**
     * Gets the value of the partyQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyQualifier() {
        return partyQualifier;
    }

    /**
     * Sets the value of the partyQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyQualifier(String value) {
        this.partyQualifier = value;
    }

    /**
     * Gets the value of the addressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddressDetailsTypeU }
     *     
     */
    public NameAndAddressDetailsTypeU getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddressDetailsTypeU }
     *     
     */
    public void setAddressDetails(NameAndAddressDetailsTypeU value) {
        this.addressDetails = value;
    }

    /**
     * Gets the value of the partyNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PartyNameBatchTypeU }
     *     
     */
    public PartyNameBatchTypeU getPartyNameDetails() {
        return partyNameDetails;
    }

    /**
     * Sets the value of the partyNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyNameBatchTypeU }
     *     
     */
    public void setPartyNameDetails(PartyNameBatchTypeU value) {
        this.partyNameDetails = value;
    }

}
