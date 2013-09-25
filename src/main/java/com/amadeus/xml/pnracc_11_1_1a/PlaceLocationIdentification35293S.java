
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a place or a location and/or related locations.
 * 
 * <p>Java class for PlaceLocationIdentification_35293S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceLocationIdentification_35293S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To2"/>
 *         &lt;element name="locationDescription" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LocationIdentificationBatchTypeU_60738C"/>
 *         &lt;element name="firstLocationDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RelatedLocationOneIdentificationTypeU_56455C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceLocationIdentification_35293S", propOrder = {
    "locationType",
    "locationDescription",
    "firstLocationDetails"
})
public class PlaceLocationIdentification35293S {

    @XmlElement(required = true)
    protected String locationType;
    @XmlElement(required = true)
    protected LocationIdentificationBatchTypeU60738C locationDescription;
    protected RelatedLocationOneIdentificationTypeU56455C firstLocationDetails;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentificationBatchTypeU60738C }
     *     
     */
    public LocationIdentificationBatchTypeU60738C getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentificationBatchTypeU60738C }
     *     
     */
    public void setLocationDescription(LocationIdentificationBatchTypeU60738C value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the firstLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationOneIdentificationTypeU56455C }
     *     
     */
    public RelatedLocationOneIdentificationTypeU56455C getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /**
     * Sets the value of the firstLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationOneIdentificationTypeU56455C }
     *     
     */
    public void setFirstLocationDetails(RelatedLocationOneIdentificationTypeU56455C value) {
        this.firstLocationDetails = value;
    }

}
