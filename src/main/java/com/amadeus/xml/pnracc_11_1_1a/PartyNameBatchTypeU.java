
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of a transaction party by name, one to five lines. Party name may be formatted.
 * 
 * <p>Java class for PartyNameBatchTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyNameBatchTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name1" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To35"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyNameBatchTypeU", propOrder = {
    "name1"
})
public class PartyNameBatchTypeU {

    @XmlElement(required = true)
    protected String name1;

    /**
     * Gets the value of the name1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Sets the value of the name1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

}
