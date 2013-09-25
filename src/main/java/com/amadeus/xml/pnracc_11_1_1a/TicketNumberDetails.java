
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information related to a specific ticket.
 * 
 * <p>Java class for TicketNumberDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketNumberDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TicketNumberDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketNumberDetails", propOrder = {
    "documentDetails"
})
public class TicketNumberDetails {

    @XmlElement(required = true)
    protected TicketNumberDetailsTypeI documentDetails;

    /**
     * Gets the value of the documentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumberDetailsTypeI }
     *     
     */
    public TicketNumberDetailsTypeI getDocumentDetails() {
        return documentDetails;
    }

    /**
     * Sets the value of the documentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumberDetailsTypeI }
     *     
     */
    public void setDocumentDetails(TicketNumberDetailsTypeI value) {
        this.documentDetails = value;
    }

}
