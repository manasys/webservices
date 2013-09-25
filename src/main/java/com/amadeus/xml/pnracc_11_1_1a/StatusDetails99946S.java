
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To advise the requester system the status of the reply
 * 
 * <p>Java class for StatusDetails_99946S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDetails_99946S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetailsType_148716C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDetails_99946S", propOrder = {
    "statusInformation"
})
public class StatusDetails99946S {

    @XmlElement(required = true)
    protected StatusDetailsType148716C statusInformation;

    /**
     * Gets the value of the statusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsType148716C }
     *     
     */
    public StatusDetailsType148716C getStatusInformation() {
        return statusInformation;
    }

    /**
     * Sets the value of the statusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsType148716C }
     *     
     */
    public void setStatusInformation(StatusDetailsType148716C value) {
        this.statusInformation = value;
    }

}
