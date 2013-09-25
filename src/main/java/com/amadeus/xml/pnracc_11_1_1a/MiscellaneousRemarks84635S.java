
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous, confidential, quality control and invoice remarks, as well as departure comments, applicable to Acceptance, Boarding, Baggage....
 * 
 * <p>Java class for MiscellaneousRemarks_84635S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousRemarks_84635S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remarkDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarkType_128960C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousRemarks_84635S", propOrder = {
    "remarkDetails"
})
public class MiscellaneousRemarks84635S {

    protected MiscellaneousRemarkType128960C remarkDetails;

    /**
     * Gets the value of the remarkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarkType128960C }
     *     
     */
    public MiscellaneousRemarkType128960C getRemarkDetails() {
        return remarkDetails;
    }

    /**
     * Sets the value of the remarkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarkType128960C }
     *     
     */
    public void setRemarkDetails(MiscellaneousRemarkType128960C value) {
        this.remarkDetails = value;
    }

}
