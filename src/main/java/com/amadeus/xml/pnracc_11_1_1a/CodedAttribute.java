
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for CodedAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttribute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CodedAttributeInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttribute", propOrder = {
    "attributeDetails"
})
public class CodedAttribute {

    @XmlElement(required = true)
    protected CodedAttributeInformationType attributeDetails;

    /**
     * Gets the value of the attributeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeInformationType }
     *     
     */
    public CodedAttributeInformationType getAttributeDetails() {
        return attributeDetails;
    }

    /**
     * Sets the value of the attributeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeInformationType }
     *     
     */
    public void setAttributeDetails(CodedAttributeInformationType value) {
        this.attributeDetails = value;
    }

}
