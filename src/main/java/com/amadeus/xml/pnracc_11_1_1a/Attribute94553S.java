
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for Attribute_94553S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attribute_94553S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaSetType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="criteriaDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AttributeInformationTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribute_94553S", propOrder = {
    "criteriaSetType",
    "criteriaDetails"
})
public class Attribute94553S {

    @XmlElement(required = true)
    protected String criteriaSetType;
    @XmlElement(required = true)
    protected AttributeInformationTypeU criteriaDetails;

    /**
     * Gets the value of the criteriaSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriteriaSetType() {
        return criteriaSetType;
    }

    /**
     * Sets the value of the criteriaSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriteriaSetType(String value) {
        this.criteriaSetType = value;
    }

    /**
     * Gets the value of the criteriaDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeInformationTypeU }
     *     
     */
    public AttributeInformationTypeU getCriteriaDetails() {
        return criteriaDetails;
    }

    /**
     * Sets the value of the criteriaDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeInformationTypeU }
     *     
     */
    public void setCriteriaDetails(AttributeInformationTypeU value) {
        this.criteriaDetails = value;
    }

}
