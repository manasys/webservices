
package com.amadeus.xml.fsocaq_10_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the dates and times associated with a product.
 * 
 * <p>Java class for ProductDateTimeTypeI_120743C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDateTimeTypeI_120743C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}Date_DDMMYY"/>
 *         &lt;element name="otherDate" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}Date_DDMMYY" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDateTimeTypeI_120743C", propOrder = {
    "date",
    "otherDate"
})
public class ProductDateTimeTypeI120743C {

    @XmlElement(required = true)
    protected String date;
    protected String otherDate;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the otherDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDate() {
        return otherDate;
    }

    /**
     * Sets the value of the otherDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDate(String value) {
        this.otherDate = value;
    }

}
