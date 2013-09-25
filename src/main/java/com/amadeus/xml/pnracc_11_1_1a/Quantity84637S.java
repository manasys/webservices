
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a pertinent quantity.
 * 
 * <p>Java class for Quantity_84637S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quantity_84637S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}QuantityDetailsTypeI_128962C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity_84637S", propOrder = {
    "quantityDetails"
})
public class Quantity84637S {

    @XmlElement(required = true)
    protected QuantityDetailsTypeI128962C quantityDetails;

    /**
     * Gets the value of the quantityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDetailsTypeI128962C }
     *     
     */
    public QuantityDetailsTypeI128962C getQuantityDetails() {
        return quantityDetails;
    }

    /**
     * Sets the value of the quantityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDetailsTypeI128962C }
     *     
     */
    public void setQuantityDetails(QuantityDetailsTypeI128962C value) {
        this.quantityDetails = value;
    }

}
