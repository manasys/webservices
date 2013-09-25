
package com.amadeus.xml.fsocar_10_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumberDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberIdentificationType_123805C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberType", propOrder = {
    "itemNumberDetails"
})
public class ItemNumberType {

    @XmlElement(required = true)
    protected ItemNumberIdentificationType123805C itemNumberDetails;

    /**
     * Gets the value of the itemNumberDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberIdentificationType123805C }
     *     
     */
    public ItemNumberIdentificationType123805C getItemNumberDetails() {
        return itemNumberDetails;
    }

    /**
     * Sets the value of the itemNumberDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberIdentificationType123805C }
     *     
     */
    public void setItemNumberDetails(ItemNumberIdentificationType123805C value) {
        this.itemNumberDetails = value;
    }

}
