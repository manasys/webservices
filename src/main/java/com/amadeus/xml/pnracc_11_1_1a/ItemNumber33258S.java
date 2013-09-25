
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumber_33258S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumber_33258S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumberDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemNumberIdentificationTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumber_33258S", propOrder = {
    "itemNumberDetails"
})
public class ItemNumber33258S {

    @XmlElement(required = true)
    protected ItemNumberIdentificationTypeU itemNumberDetails;

    /**
     * Gets the value of the itemNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberIdentificationTypeU }
     *     
     */
    public ItemNumberIdentificationTypeU getItemNumberDetails() {
        return itemNumberDetails;
    }

    /**
     * Sets the value of the itemNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberIdentificationTypeU }
     *     
     */
    public void setItemNumberDetails(ItemNumberIdentificationTypeU value) {
        this.itemNumberDetails = value;
    }

}
