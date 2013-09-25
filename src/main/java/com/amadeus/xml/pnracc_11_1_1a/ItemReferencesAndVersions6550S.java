
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Exchange and link unique identifiers
 * 
 * <p>Java class for ItemReferencesAndVersions_6550S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReferencesAndVersions_6550S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iDSection" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UniqueIdDescriptionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReferencesAndVersions_6550S", propOrder = {
    "idSection"
})
public class ItemReferencesAndVersions6550S {

    @XmlElement(name = "iDSection", required = true)
    protected UniqueIdDescriptionType idSection;

    /**
     * Gets the value of the idSection property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public UniqueIdDescriptionType getIDSection() {
        return idSection;
    }

    /**
     * Sets the value of the idSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public void setIDSection(UniqueIdDescriptionType value) {
        this.idSection = value;
    }

}
