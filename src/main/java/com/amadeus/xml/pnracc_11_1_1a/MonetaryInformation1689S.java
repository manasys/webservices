
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * MONETARY INFORMATION
 * 
 * <p>Java class for MonetaryInformation_1689S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformation_1689S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="information" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformationDetailsTypeI_4220C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformation_1689S", propOrder = {
    "information"
})
public class MonetaryInformation1689S {

    protected MonetaryInformationDetailsTypeI4220C information;

    /**
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI4220C }
     *     
     */
    public MonetaryInformationDetailsTypeI4220C getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI4220C }
     *     
     */
    public void setInformation(MonetaryInformationDetailsTypeI4220C value) {
        this.information = value;
    }

}
