
package com.amadeus.xml.fsocaq_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateFareIdentifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateFareIdentifiersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareQualifier" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="identifyNumber" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AlphaNumericString_Length1To35" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateFareIdentifiersType", propOrder = {
    "fareQualifier",
    "identifyNumber"
})
public class CorporateFareIdentifiersType {

    protected String fareQualifier;
    protected List<String> identifyNumber;

    /**
     * Gets the value of the fareQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareQualifier() {
        return fareQualifier;
    }

    /**
     * Sets the value of the fareQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareQualifier(String value) {
        this.fareQualifier = value;
    }

    /**
     * Gets the value of the identifyNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifyNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifyNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentifyNumber() {
        if (identifyNumber == null) {
            identifyNumber = new ArrayList<String>();
        }
        return this.identifyNumber;
    }

}
