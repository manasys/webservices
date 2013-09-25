
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of name, the actual name or a code to identify the name, and the status of the              name
 * 
 * <p>Java class for NameInformationTypeU_9747C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameInformationTypeU_9747C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="name" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To30" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameInformationTypeU_9747C", propOrder = {
    "qualifier",
    "name",
    "identifier"
})
public class NameInformationTypeU9747C {

    @XmlElement(required = true)
    protected String qualifier;
    protected String name;
    protected String identifier;

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
