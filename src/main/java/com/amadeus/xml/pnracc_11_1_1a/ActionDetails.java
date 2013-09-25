
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the action that should be taken on a selected reference number.
 * 
 * <p>Java class for ActionDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfItemsDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProcessingInformationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionDetails", propOrder = {
    "numberOfItemsDetails"
})
public class ActionDetails {

    protected ProcessingInformationTypeI numberOfItemsDetails;

    /**
     * Gets the value of the numberOfItemsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingInformationTypeI }
     *     
     */
    public ProcessingInformationTypeI getNumberOfItemsDetails() {
        return numberOfItemsDetails;
    }

    /**
     * Sets the value of the numberOfItemsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingInformationTypeI }
     *     
     */
    public void setNumberOfItemsDetails(ProcessingInformationTypeI value) {
        this.numberOfItemsDetails = value;
    }

}
