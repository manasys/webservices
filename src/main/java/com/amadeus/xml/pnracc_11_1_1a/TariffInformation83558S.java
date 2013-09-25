
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify tariff details relating to a service or product.
 * 
 * <p>Java class for TariffInformation_83558S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformation_83558S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformationDetailsTypeU_127523C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformation_83558S", propOrder = {
    "priceDetails"
})
public class TariffInformation83558S {

    @XmlElement(required = true)
    protected TariffInformationDetailsTypeU127523C priceDetails;

    /**
     * Gets the value of the priceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationDetailsTypeU127523C }
     *     
     */
    public TariffInformationDetailsTypeU127523C getPriceDetails() {
        return priceDetails;
    }

    /**
     * Sets the value of the priceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationDetailsTypeU127523C }
     *     
     */
    public void setPriceDetails(TariffInformationDetailsTypeU127523C value) {
        this.priceDetails = value;
    }

}
