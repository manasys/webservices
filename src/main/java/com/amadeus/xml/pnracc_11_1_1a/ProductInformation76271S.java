
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to availability status or cabin configuration for a product.
 * 
 * <p>Java class for ProductInformation_76271S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformation_76271S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingClassDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductDetailsTypeI_118108C" maxOccurs="26" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformation_76271S", propOrder = {
    "bookingClassDetails"
})
public class ProductInformation76271S {

    protected List<ProductDetailsTypeI118108C> bookingClassDetails;

    /**
     * Gets the value of the bookingClassDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDetailsTypeI118108C }
     * 
     * 
     */
    public List<ProductDetailsTypeI118108C> getBookingClassDetails() {
        if (bookingClassDetails == null) {
            bookingClassDetails = new ArrayList<ProductDetailsTypeI118108C>();
        }
        return this.bookingClassDetails;
    }

}
