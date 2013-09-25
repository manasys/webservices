
package com.amadeus.xml.fsocaq_10_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Target estimated or actual dates and times
 * 
 * <p>Java class for DateAndTimeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstDateTimeDetail" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DateAndTimeDetailsTypeI"/>
 *         &lt;element name="rangeOfDate" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DateAndTimeDetailsType_120843C" minOccurs="0"/>
 *         &lt;element name="tripDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DateAndTimeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeInformationType", propOrder = {
    "firstDateTimeDetail",
    "rangeOfDate",
    "tripDetails"
})
public class DateAndTimeInformationType {

    @XmlElement(required = true)
    protected DateAndTimeDetailsTypeI firstDateTimeDetail;
    protected DateAndTimeDetailsType120843C rangeOfDate;
    protected DateAndTimeDetailsType tripDetails;

    /**
     * Gets the value of the firstDateTimeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsTypeI }
     *     
     */
    public DateAndTimeDetailsTypeI getFirstDateTimeDetail() {
        return firstDateTimeDetail;
    }

    /**
     * Sets the value of the firstDateTimeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsTypeI }
     *     
     */
    public void setFirstDateTimeDetail(DateAndTimeDetailsTypeI value) {
        this.firstDateTimeDetail = value;
    }

    /**
     * Gets the value of the rangeOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsType120843C }
     *     
     */
    public DateAndTimeDetailsType120843C getRangeOfDate() {
        return rangeOfDate;
    }

    /**
     * Sets the value of the rangeOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsType120843C }
     *     
     */
    public void setRangeOfDate(DateAndTimeDetailsType120843C value) {
        this.rangeOfDate = value;
    }

    /**
     * Gets the value of the tripDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndTimeDetailsType }
     *     
     */
    public DateAndTimeDetailsType getTripDetails() {
        return tripDetails;
    }

    /**
     * Sets the value of the tripDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndTimeDetailsType }
     *     
     */
    public void setTripDetails(DateAndTimeDetailsType value) {
        this.tripDetails = value;
    }

}
