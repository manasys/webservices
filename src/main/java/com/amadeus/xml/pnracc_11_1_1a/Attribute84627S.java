
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for Attribute_84627S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attribute_84627S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaSetType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="criteriaDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AttributeInformationTypeU_64138C" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribute_84627S", propOrder = {
    "criteriaSetType",
    "criteriaDetails"
})
public class Attribute84627S {

    @XmlElement(required = true)
    protected String criteriaSetType;
    @XmlElement(required = true)
    protected List<AttributeInformationTypeU64138C> criteriaDetails;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeInformationTypeU64138C }
     * 
     * 
     */
    public List<AttributeInformationTypeU64138C> getCriteriaDetails() {
        if (criteriaDetails == null) {
            criteriaDetails = new ArrayList<AttributeInformationTypeU64138C>();
        }
        return this.criteriaDetails;
    }

}
