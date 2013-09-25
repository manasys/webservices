
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide details relating to the sequence.
 * 
 * <p>Java class for SequenceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionRequest" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="sequenceDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SequenceInformationTypeU_24073C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceDetails", propOrder = {
    "actionRequest",
    "sequenceDetails"
})
public class SequenceDetails {

    protected String actionRequest;
    @XmlElement(required = true)
    protected SequenceInformationTypeU24073C sequenceDetails;

    /**
     * Gets the value of the actionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionRequest() {
        return actionRequest;
    }

    /**
     * Sets the value of the actionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequest(String value) {
        this.actionRequest = value;
    }

    /**
     * Gets the value of the sequenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceInformationTypeU24073C }
     *     
     */
    public SequenceInformationTypeU24073C getSequenceDetails() {
        return sequenceDetails;
    }

    /**
     * Sets the value of the sequenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceInformationTypeU24073C }
     *     
     */
    public void setSequenceDetails(SequenceInformationTypeU24073C value) {
        this.sequenceDetails = value;
    }

}
