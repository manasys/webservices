
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to specify the details of the documentation of the insuree.
 * 
 * <p>Java class for PassengerDocumentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerDocumentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDate" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="documentDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DocumentDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerDocumentDetails", propOrder = {
    "birthDate",
    "documentDetails"
})
public class PassengerDocumentDetails {

    protected String birthDate;
    protected DocumentDetailsType documentDetails;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentDetailsType }
     *     
     */
    public DocumentDetailsType getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentDetailsType }
     *     
     */
    public void setDocumentDetails(DocumentDetailsType value) {
        this.documentDetails = value;
    }

}
