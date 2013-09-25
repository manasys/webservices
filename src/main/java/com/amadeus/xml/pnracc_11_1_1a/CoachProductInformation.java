
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Coach Product Information
 * 
 * <p>Java class for CoachProductInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoachProductInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coachDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferencingDetailsTypeI_36941C" minOccurs="0"/>
 *         &lt;element name="equipmentCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoachProductInformation", propOrder = {
    "coachDetails",
    "equipmentCode"
})
public class CoachProductInformation {

    protected ReferencingDetailsTypeI36941C coachDetails;
    protected String equipmentCode;

    /**
     * Gets the value of the coachDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsTypeI36941C }
     *     
     */
    public ReferencingDetailsTypeI36941C getCoachDetails() {
        return coachDetails;
    }

    /**
     * Sets the value of the coachDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsTypeI36941C }
     *     
     */
    public void setCoachDetails(ReferencingDetailsTypeI36941C value) {
        this.coachDetails = value;
    }

    /**
     * Gets the value of the equipmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentCode() {
        return equipmentCode;
    }

    /**
     * Sets the value of the equipmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentCode(String value) {
        this.equipmentCode = value;
    }

}
