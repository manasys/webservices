
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an association between references given to travellers, to products, to services
 * 
 * <p>Java class for ReferenceInformation_94524S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformation_94524S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferencingDetailsType_142140C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformation_94524S", propOrder = {
    "referenceDetails"
})
public class ReferenceInformation94524S {

    @XmlElement(required = true)
    protected ReferencingDetailsType142140C referenceDetails;

    /**
     * Gets the value of the referenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsType142140C }
     *     
     */
    public ReferencingDetailsType142140C getReferenceDetails() {
        return referenceDetails;
    }

    /**
     * Sets the value of the referenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsType142140C }
     *     
     */
    public void setReferenceDetails(ReferencingDetailsType142140C value) {
        this.referenceDetails = value;
    }

}
