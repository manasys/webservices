
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * cruise business data
 * 
 * <p>Java class for CruiseBusinessDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseBusinessDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sailingShipInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ShipIdentification_8952S"/>
 *         &lt;element name="sailingProviderInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation_8953S"/>
 *         &lt;element name="sailingPortsInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_8954S"/>
 *         &lt;element name="sailingDateInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_8955S"/>
 *         &lt;element name="passengerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_8956S" maxOccurs="9"/>
 *         &lt;element name="bookingDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cruiseBookingReferenceInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_8957S"/>
 *                   &lt;element name="bookingCompany" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation_26258S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bookingDate" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_20645S"/>
 *         &lt;element name="sailingGroupInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemReferencesAndVersions_9271S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseBusinessDataType", propOrder = {
    "sailingShipInformation",
    "sailingProviderInformation",
    "sailingPortsInformation",
    "sailingDateInformation",
    "passengerInfo",
    "bookingDetails",
    "bookingDate",
    "sailingGroupInformation"
})
public class CruiseBusinessDataType {

    @XmlElement(required = true)
    protected ShipIdentification8952S sailingShipInformation;
    @XmlElement(required = true)
    protected NonAirCompanyInformation8953S sailingProviderInformation;
    @XmlElement(required = true)
    protected PlaceLocationIdentification8954S sailingPortsInformation;
    @XmlElement(required = true)
    protected StructuredPeriodInformation8955S sailingDateInformation;
    @XmlElement(required = true)
    protected List<TravellerInformation8956S> passengerInfo;
    protected CruiseBusinessDataType.BookingDetails bookingDetails;
    @XmlElement(required = true)
    protected StructuredDateTimeInformation20645S bookingDate;
    protected ItemReferencesAndVersions9271S sailingGroupInformation;

    /**
     * Gets the value of the sailingShipInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdentification8952S }
     *     
     */
    public ShipIdentification8952S getSailingShipInformation() {
        return sailingShipInformation;
    }

    /**
     * Sets the value of the sailingShipInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdentification8952S }
     *     
     */
    public void setSailingShipInformation(ShipIdentification8952S value) {
        this.sailingShipInformation = value;
    }

    /**
     * Gets the value of the sailingProviderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link NonAirCompanyInformation8953S }
     *     
     */
    public NonAirCompanyInformation8953S getSailingProviderInformation() {
        return sailingProviderInformation;
    }

    /**
     * Sets the value of the sailingProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonAirCompanyInformation8953S }
     *     
     */
    public void setSailingProviderInformation(NonAirCompanyInformation8953S value) {
        this.sailingProviderInformation = value;
    }

    /**
     * Gets the value of the sailingPortsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentification8954S }
     *     
     */
    public PlaceLocationIdentification8954S getSailingPortsInformation() {
        return sailingPortsInformation;
    }

    /**
     * Sets the value of the sailingPortsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentification8954S }
     *     
     */
    public void setSailingPortsInformation(PlaceLocationIdentification8954S value) {
        this.sailingPortsInformation = value;
    }

    /**
     * Gets the value of the sailingDateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPeriodInformation8955S }
     *     
     */
    public StructuredPeriodInformation8955S getSailingDateInformation() {
        return sailingDateInformation;
    }

    /**
     * Sets the value of the sailingDateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPeriodInformation8955S }
     *     
     */
    public void setSailingDateInformation(StructuredPeriodInformation8955S value) {
        this.sailingDateInformation = value;
    }

    /**
     * Gets the value of the passengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerInformation8956S }
     * 
     * 
     */
    public List<TravellerInformation8956S> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<TravellerInformation8956S>();
        }
        return this.passengerInfo;
    }

    /**
     * Gets the value of the bookingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseBusinessDataType.BookingDetails }
     *     
     */
    public CruiseBusinessDataType.BookingDetails getBookingDetails() {
        return bookingDetails;
    }

    /**
     * Sets the value of the bookingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseBusinessDataType.BookingDetails }
     *     
     */
    public void setBookingDetails(CruiseBusinessDataType.BookingDetails value) {
        this.bookingDetails = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformation20645S }
     *     
     */
    public StructuredDateTimeInformation20645S getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformation20645S }
     *     
     */
    public void setBookingDate(StructuredDateTimeInformation20645S value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the sailingGroupInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersions9271S }
     *     
     */
    public ItemReferencesAndVersions9271S getSailingGroupInformation() {
        return sailingGroupInformation;
    }

    /**
     * Sets the value of the sailingGroupInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersions9271S }
     *     
     */
    public void setSailingGroupInformation(ItemReferencesAndVersions9271S value) {
        this.sailingGroupInformation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cruiseBookingReferenceInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_8957S"/>
     *         &lt;element name="bookingCompany" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation_26258S" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cruiseBookingReferenceInfo",
        "bookingCompany"
    })
    public static class BookingDetails {

        @XmlElement(required = true)
        protected ReservationControlInformation8957S cruiseBookingReferenceInfo;
        protected NonAirCompanyInformation26258S bookingCompany;

        /**
         * Gets the value of the cruiseBookingReferenceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformation8957S }
         *     
         */
        public ReservationControlInformation8957S getCruiseBookingReferenceInfo() {
            return cruiseBookingReferenceInfo;
        }

        /**
         * Sets the value of the cruiseBookingReferenceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformation8957S }
         *     
         */
        public void setCruiseBookingReferenceInfo(ReservationControlInformation8957S value) {
            this.cruiseBookingReferenceInfo = value;
        }

        /**
         * Gets the value of the bookingCompany property.
         * 
         * @return
         *     possible object is
         *     {@link NonAirCompanyInformation26258S }
         *     
         */
        public NonAirCompanyInformation26258S getBookingCompany() {
            return bookingCompany;
        }

        /**
         * Sets the value of the bookingCompany property.
         * 
         * @param value
         *     allowed object is
         *     {@link NonAirCompanyInformation26258S }
         *     
         */
        public void setBookingCompany(NonAirCompanyInformation26258S value) {
            this.bookingCompany = value;
        }

    }

}
