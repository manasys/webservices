
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes communication channel
 * 
 * <p>Java class for CommunicationContact_94522S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommunicationContact_94522S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="communication" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CommunicationContactDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationContact_94522S", propOrder = {
    "communication"
})
public class CommunicationContact94522S {

    @XmlElement(required = true)
    protected CommunicationContactDetailsType communication;

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContactDetailsType }
     *     
     */
    public CommunicationContactDetailsType getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContactDetailsType }
     *     
     */
    public void setCommunication(CommunicationContactDetailsType value) {
        this.communication = value;
    }

}
