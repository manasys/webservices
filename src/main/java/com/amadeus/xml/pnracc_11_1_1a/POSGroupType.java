
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * POS data
 * 
 * <p>Java class for POSGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sbrUserIdentificationOwn" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification"/>
 *         &lt;element name="sbrSystemDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SystemDetailsInfo_33158S" minOccurs="0"/>
 *         &lt;element name="sbrPreferences" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserPreferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSGroupType", propOrder = {
    "sbrUserIdentificationOwn",
    "sbrSystemDetails",
    "sbrPreferences"
})
public class POSGroupType {

    @XmlElement(required = true)
    protected UserIdentification sbrUserIdentificationOwn;
    protected SystemDetailsInfo33158S sbrSystemDetails;
    protected UserPreferences sbrPreferences;

    /**
     * Gets the value of the sbrUserIdentificationOwn property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentification }
     *     
     */
    public UserIdentification getSbrUserIdentificationOwn() {
        return sbrUserIdentificationOwn;
    }

    /**
     * Sets the value of the sbrUserIdentificationOwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentification }
     *     
     */
    public void setSbrUserIdentificationOwn(UserIdentification value) {
        this.sbrUserIdentificationOwn = value;
    }

    /**
     * Gets the value of the sbrSystemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfo33158S }
     *     
     */
    public SystemDetailsInfo33158S getSbrSystemDetails() {
        return sbrSystemDetails;
    }

    /**
     * Sets the value of the sbrSystemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfo33158S }
     *     
     */
    public void setSbrSystemDetails(SystemDetailsInfo33158S value) {
        this.sbrSystemDetails = value;
    }

    /**
     * Gets the value of the sbrPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link UserPreferences }
     *     
     */
    public UserPreferences getSbrPreferences() {
        return sbrPreferences;
    }

    /**
     * Sets the value of the sbrPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPreferences }
     *     
     */
    public void setSbrPreferences(UserPreferences value) {
        this.sbrPreferences = value;
    }

}
