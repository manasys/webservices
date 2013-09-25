
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous, confidential, quality control and invoice remarks, as well as departure comments, applicable to Acceptance, Boarding, Baggage....
 * 
 * <p>Java class for MiscellaneousRemarks_12240S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousRemarks_12240S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remarkDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarkType_18076C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousRemarks_12240S", propOrder = {
    "remarkDetails"
})
public class MiscellaneousRemarks12240S {

    protected MiscellaneousRemarkType18076C remarkDetails;

    /**
     * Gets the value of the remarkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarkType18076C }
     *     
     */
    public MiscellaneousRemarkType18076C getRemarkDetails() {
        return remarkDetails;
    }

    /**
     * Sets the value of the remarkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarkType18076C }
     *     
     */
    public void setRemarkDetails(MiscellaneousRemarkType18076C value) {
        this.remarkDetails = value;
    }

}
