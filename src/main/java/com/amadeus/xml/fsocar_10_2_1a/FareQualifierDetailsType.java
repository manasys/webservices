
package com.amadeus.xml.fsocar_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details which qualify a fare
 * 
 * <p>Java class for FareQualifierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fareCategories" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareCategoryCodesTypeI" minOccurs="0"/>
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="additionalFareDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AdditionalFareQualifierDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="discountDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DiscountPenaltyInformationType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsType", propOrder = {
    "movementType",
    "fareCategories",
    "fareDetails",
    "additionalFareDetails",
    "discountDetails"
})
public class FareQualifierDetailsType {

    protected String movementType;
    protected FareCategoryCodesTypeI fareCategories;
    protected FareDetailsTypeI fareDetails;
    protected AdditionalFareQualifierDetailsTypeI additionalFareDetails;
    protected List<DiscountPenaltyInformationType> discountDetails;

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the fareCategories property.
     * 
     * @return
     *     possible object is
     *     {@link FareCategoryCodesTypeI }
     *     
     */
    public FareCategoryCodesTypeI getFareCategories() {
        return fareCategories;
    }

    /**
     * Sets the value of the fareCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareCategoryCodesTypeI }
     *     
     */
    public void setFareCategories(FareCategoryCodesTypeI value) {
        this.fareCategories = value;
    }

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsTypeI }
     *     
     */
    public FareDetailsTypeI getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsTypeI }
     *     
     */
    public void setFareDetails(FareDetailsTypeI value) {
        this.fareDetails = value;
    }

    /**
     * Gets the value of the additionalFareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFareQualifierDetailsTypeI }
     *     
     */
    public AdditionalFareQualifierDetailsTypeI getAdditionalFareDetails() {
        return additionalFareDetails;
    }

    /**
     * Sets the value of the additionalFareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFareQualifierDetailsTypeI }
     *     
     */
    public void setAdditionalFareDetails(AdditionalFareQualifierDetailsTypeI value) {
        this.additionalFareDetails = value;
    }

    /**
     * Gets the value of the discountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountPenaltyInformationType }
     * 
     * 
     */
    public List<DiscountPenaltyInformationType> getDiscountDetails() {
        if (discountDetails == null) {
            discountDetails = new ArrayList<DiscountPenaltyInformationType>();
        }
        return this.discountDetails;
    }

}
