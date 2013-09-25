
package com.amadeus.xml.fsocar_10_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberType_81188S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberType_81188S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberIdentificationType_124279C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberType_81188S", propOrder = {
    "itemNumber"
})
public class ItemNumberType81188S {

    @XmlElement(required = true)
    protected ItemNumberIdentificationType124279C itemNumber;

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberIdentificationType124279C }
     *     
     */
    public ItemNumberIdentificationType124279C getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberIdentificationType124279C }
     *     
     */
    public void setItemNumber(ItemNumberIdentificationType124279C value) {
        this.itemNumber = value;
    }

}
