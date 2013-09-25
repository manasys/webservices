
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific reference identification for a traveller.
 * 
 * <p>Java class for ReferenceInformation_84639S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformation_84639S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferencingDetailsTypeI_128964C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformation_84639S", propOrder = {
    "referenceDetails"
})
public class ReferenceInformation84639S {

    @XmlElement(required = true)
    protected ReferencingDetailsTypeI128964C referenceDetails;

    /**
     * Gets the value of the referenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsTypeI128964C }
     *     
     */
    public ReferencingDetailsTypeI128964C getReferenceDetails() {
        return referenceDetails;
    }

    /**
     * Sets the value of the referenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsTypeI128964C }
     *     
     */
    public void setReferenceDetails(ReferencingDetailsTypeI128964C value) {
        this.referenceDetails = value;
    }

}
