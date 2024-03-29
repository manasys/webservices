
package com.amadeus.xml.fsocaq_10_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify corporate fare information
 * 
 * <p>Java class for CorporateFareInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateFareInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateFareIdentifiers" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CorporateFareIdentifiersType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateFareInformationType", propOrder = {
    "corporateFareIdentifiers"
})
public class CorporateFareInformationType {

    protected CorporateFareIdentifiersType corporateFareIdentifiers;

    /**
     * Gets the value of the corporateFareIdentifiers property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFareIdentifiersType }
     *     
     */
    public CorporateFareIdentifiersType getCorporateFareIdentifiers() {
        return corporateFareIdentifiers;
    }

    /**
     * Sets the value of the corporateFareIdentifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFareIdentifiersType }
     *     
     */
    public void setCorporateFareIdentifiers(CorporateFareIdentifiersType value) {
        this.corporateFareIdentifiers = value;
    }

}
