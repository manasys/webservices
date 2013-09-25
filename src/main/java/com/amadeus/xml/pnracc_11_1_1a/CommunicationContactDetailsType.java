
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Communication number of a department or employee in a specified channel.
 * 
 * <p>Java class for CommunicationContactDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContactDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlAddress" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To512"/>
 *         &lt;element name="urlType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContactDetailsType", propOrder = {
    "urlAddress",
    "urlType"
})
public class CommunicationContactDetailsType {

    @XmlElement(required = true)
    protected String urlAddress;
    @XmlElement(required = true)
    protected String urlType;

    /**
     * Gets the value of the urlAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlAddress() {
        return urlAddress;
    }

    /**
     * Sets the value of the urlAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlAddress(String value) {
        this.urlAddress = value;
    }

    /**
     * Gets the value of the urlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlType() {
        return urlType;
    }

    /**
     * Sets the value of the urlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlType(String value) {
        this.urlType = value;
    }

}
