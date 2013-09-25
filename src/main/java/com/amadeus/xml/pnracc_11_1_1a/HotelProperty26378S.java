
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the Hotel Property information
 * 
 * <p>Java class for HotelProperty_26378S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelProperty_26378S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelReference" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelUniqueIdType_47769C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelProperty_26378S", propOrder = {
    "hotelReference"
})
public class HotelProperty26378S {

    @XmlElement(required = true)
    protected HotelUniqueIdType47769C hotelReference;

    /**
     * Gets the value of the hotelReference property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUniqueIdType47769C }
     *     
     */
    public HotelUniqueIdType47769C getHotelReference() {
        return hotelReference;
    }

    /**
     * Sets the value of the hotelReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUniqueIdType47769C }
     *     
     */
    public void setHotelReference(HotelUniqueIdType47769C value) {
        this.hotelReference = value;
    }

}
