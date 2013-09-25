
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a place or a location and/or related locations.
 * 
 * <p>Java class for PlaceLocationIdentification_8954S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceLocationIdentification_8954S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstLocationDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RelatedLocationOneIdentificationTypeU_16345C"/>
 *         &lt;element name="secondLocationDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RelatedLocationTwoIdentificationTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceLocationIdentification_8954S", propOrder = {
    "firstLocationDetails",
    "secondLocationDetails"
})
public class PlaceLocationIdentification8954S {

    @XmlElement(required = true)
    protected RelatedLocationOneIdentificationTypeU16345C firstLocationDetails;
    @XmlElement(required = true)
    protected RelatedLocationTwoIdentificationTypeU secondLocationDetails;

    /**
     * Gets the value of the firstLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationOneIdentificationTypeU16345C }
     *     
     */
    public RelatedLocationOneIdentificationTypeU16345C getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /**
     * Sets the value of the firstLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationOneIdentificationTypeU16345C }
     *     
     */
    public void setFirstLocationDetails(RelatedLocationOneIdentificationTypeU16345C value) {
        this.firstLocationDetails = value;
    }

    /**
     * Gets the value of the secondLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationTwoIdentificationTypeU }
     *     
     */
    public RelatedLocationTwoIdentificationTypeU getSecondLocationDetails() {
        return secondLocationDetails;
    }

    /**
     * Sets the value of the secondLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationTwoIdentificationTypeU }
     *     
     */
    public void setSecondLocationDetails(RelatedLocationTwoIdentificationTypeU value) {
        this.secondLocationDetails = value;
    }

}
