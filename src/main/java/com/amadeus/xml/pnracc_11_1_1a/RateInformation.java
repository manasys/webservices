
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the rate information
 * 
 * <p>Java class for RateInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ratePrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RatePriceType" minOccurs="0"/>
 *         &lt;element name="rateInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RateInformationDetailsType" minOccurs="0"/>
 *         &lt;element name="rateIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RateIndicatorsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInformation", propOrder = {
    "ratePrice",
    "rateInfo",
    "rateIndicator"
})
public class RateInformation {

    protected RatePriceType ratePrice;
    protected RateInformationDetailsType rateInfo;
    protected RateIndicatorsType rateIndicator;

    /**
     * Gets the value of the ratePrice property.
     * 
     * @return
     *     possible object is
     *     {@link RatePriceType }
     *     
     */
    public RatePriceType getRatePrice() {
        return ratePrice;
    }

    /**
     * Sets the value of the ratePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePriceType }
     *     
     */
    public void setRatePrice(RatePriceType value) {
        this.ratePrice = value;
    }

    /**
     * Gets the value of the rateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link RateInformationDetailsType }
     *     
     */
    public RateInformationDetailsType getRateInfo() {
        return rateInfo;
    }

    /**
     * Sets the value of the rateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInformationDetailsType }
     *     
     */
    public void setRateInfo(RateInformationDetailsType value) {
        this.rateInfo = value;
    }

    /**
     * Gets the value of the rateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link RateIndicatorsType }
     *     
     */
    public RateIndicatorsType getRateIndicator() {
        return rateIndicator;
    }

    /**
     * Sets the value of the rateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateIndicatorsType }
     *     
     */
    public void setRateIndicator(RateIndicatorsType value) {
        this.rateIndicator = value;
    }

}
