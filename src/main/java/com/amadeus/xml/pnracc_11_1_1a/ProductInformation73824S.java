
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to availability status or cabin configuration for a product.
 * 
 * <p>Java class for ProductInformation_73824S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformation_73824S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingClassDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformation_73824S", propOrder = {
    "bookingClassDetails"
})
public class ProductInformation73824S {

    @XmlElement(required = true)
    protected ProductDetailsTypeI bookingClassDetails;

    /**
     * Gets the value of the bookingClassDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsTypeI }
     *     
     */
    public ProductDetailsTypeI getBookingClassDetails() {
        return bookingClassDetails;
    }

    /**
     * Sets the value of the bookingClassDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsTypeI }
     *     
     */
    public void setBookingClassDetails(ProductDetailsTypeI value) {
        this.bookingClassDetails = value;
    }

}
