
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Content of SSR FQT elements
 * 
 * <p>Java class for FrequentFlyerInformationGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentFlyerInformationGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerInformation"/>
 *         &lt;element name="discountInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DiscountInformation" minOccurs="0"/>
 *         &lt;element name="bookingClassInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductInformation_73824S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentFlyerInformationGroupType", propOrder = {
    "frequentTravellerInfo",
    "discountInformation",
    "bookingClassInformation"
})
public class FrequentFlyerInformationGroupType {

    @XmlElement(required = true)
    protected FrequentTravellerInformation frequentTravellerInfo;
    protected DiscountInformation discountInformation;
    protected ProductInformation73824S bookingClassInformation;

    /**
     * Gets the value of the frequentTravellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerInformation }
     *     
     */
    public FrequentTravellerInformation getFrequentTravellerInfo() {
        return frequentTravellerInfo;
    }

    /**
     * Sets the value of the frequentTravellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerInformation }
     *     
     */
    public void setFrequentTravellerInfo(FrequentTravellerInformation value) {
        this.frequentTravellerInfo = value;
    }

    /**
     * Gets the value of the discountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountInformation }
     *     
     */
    public DiscountInformation getDiscountInformation() {
        return discountInformation;
    }

    /**
     * Sets the value of the discountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountInformation }
     *     
     */
    public void setDiscountInformation(DiscountInformation value) {
        this.discountInformation = value;
    }

    /**
     * Gets the value of the bookingClassInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformation73824S }
     *     
     */
    public ProductInformation73824S getBookingClassInformation() {
        return bookingClassInformation;
    }

    /**
     * Sets the value of the bookingClassInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformation73824S }
     *     
     */
    public void setBookingClassInformation(ProductInformation73824S value) {
        this.bookingClassInformation = value;
    }

}
