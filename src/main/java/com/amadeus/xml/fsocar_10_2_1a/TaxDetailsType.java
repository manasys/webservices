
package com.amadeus.xml.fsocar_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a rate, type of tax, and currency code.
 * 
 * <p>Java class for TaxDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rate" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="indicator" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaNumericString_Length1To3" maxOccurs="98" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailsType", propOrder = {
    "rate",
    "countryCode",
    "currencyCode",
    "type",
    "indicator"
})
public class TaxDetailsType {

    protected String rate;
    protected String countryCode;
    protected String currencyCode;
    protected String type;
    protected List<String> indicator;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIndicator() {
        if (indicator == null) {
            indicator = new ArrayList<String>();
        }
        return this.indicator;
    }

}
