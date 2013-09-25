
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * email
 * 
 * <p>Java class for CommunicationContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contact" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CommunicationContactDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContact", propOrder = {
    "contact"
})
public class CommunicationContact {

    @XmlElement(required = true)
    protected CommunicationContactDetailsTypeU contact;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactDetailsTypeU }
     *     
     */
    public CommunicationContactDetailsTypeU getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactDetailsTypeU }
     *     
     */
    public void setContact(CommunicationContactDetailsTypeU value) {
        this.contact = value;
    }

}
