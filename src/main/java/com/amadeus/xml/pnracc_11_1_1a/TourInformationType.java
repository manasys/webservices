
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys tour booking information
 * 
 * <p>Java class for TourInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingSummaryInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_25428S"/>
 *         &lt;element name="bookingDurationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity" minOccurs="0"/>
 *         &lt;element name="stayingInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_25436S" minOccurs="0"/>
 *         &lt;element name="tourDescriptionInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditProdDetails" minOccurs="0"/>
 *         &lt;element name="bookingReferenceInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_25427S" maxOccurs="2"/>
 *         &lt;element name="statusInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}QuantityAndActionDetails"/>
 *         &lt;element name="insuranceIndication" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceCoverage_25483S" minOccurs="0"/>
 *         &lt;element name="passengerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_25441S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="expireInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_25444S" minOccurs="0"/>
 *         &lt;element name="bookingDescriptionInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_25445S" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="systemProviderInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TransportIdentifier" minOccurs="0"/>
 *         &lt;element name="tourOperatorInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyInformation_25420S" maxOccurs="10"/>
 *         &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_25447S" minOccurs="0"/>
 *         &lt;element name="passengerAssocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_25422S" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="tourAccountDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourAccountDetailsType" minOccurs="0"/>
 *         &lt;element name="tourProductDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourServiceDetailsType" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TourInformationType", propOrder = {
    "bookingSummaryInfo",
    "bookingDurationInfo",
    "stayingInfo",
    "tourDescriptionInfo",
    "bookingReferenceInfo",
    "statusInfo",
    "insuranceIndication",
    "passengerInfo",
    "expireInfo",
    "bookingDescriptionInfo",
    "systemProviderInfo",
    "tourOperatorInfo",
    "bookingSource",
    "passengerAssocation",
    "tourAccountDetails",
    "tourProductDetails"
})
public class TourInformationType {

    @XmlElement(required = true)
    protected TravelProductInformation25428S bookingSummaryInfo;
    protected Quantity bookingDurationInfo;
    protected PlaceLocationIdentification25436S stayingInfo;
    protected AdditProdDetails tourDescriptionInfo;
    @XmlElement(required = true)
    protected List<ReservationControlInformation25427S> bookingReferenceInfo;
    @XmlElement(required = true)
    protected QuantityAndActionDetails statusInfo;
    protected InsuranceCoverage25483S insuranceIndication;
    protected List<TravellerInformation25441S> passengerInfo;
    protected StructuredDateTimeInformation25444S expireInfo;
    protected List<FreeTextInformation25445S> bookingDescriptionInfo;
    protected TransportIdentifier systemProviderInfo;
    @XmlElement(required = true)
    protected List<CompanyInformation25420S> tourOperatorInfo;
    protected UserIdentification25447S bookingSource;
    protected List<ReferenceInformation25422S> passengerAssocation;
    protected TourAccountDetailsType tourAccountDetails;
    @XmlElement(required = true)
    protected List<TourServiceDetailsType> tourProductDetails;

    /**
     * Gets the value of the bookingSummaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformation25428S }
     *     
     */
    public TravelProductInformation25428S getBookingSummaryInfo() {
        return bookingSummaryInfo;
    }

    /**
     * Sets the value of the bookingSummaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformation25428S }
     *     
     */
    public void setBookingSummaryInfo(TravelProductInformation25428S value) {
        this.bookingSummaryInfo = value;
    }

    /**
     * Gets the value of the bookingDurationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getBookingDurationInfo() {
        return bookingDurationInfo;
    }

    /**
     * Sets the value of the bookingDurationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setBookingDurationInfo(Quantity value) {
        this.bookingDurationInfo = value;
    }

    /**
     * Gets the value of the stayingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentification25436S }
     *     
     */
    public PlaceLocationIdentification25436S getStayingInfo() {
        return stayingInfo;
    }

    /**
     * Sets the value of the stayingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentification25436S }
     *     
     */
    public void setStayingInfo(PlaceLocationIdentification25436S value) {
        this.stayingInfo = value;
    }

    /**
     * Gets the value of the tourDescriptionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditProdDetails }
     *     
     */
    public AdditProdDetails getTourDescriptionInfo() {
        return tourDescriptionInfo;
    }

    /**
     * Sets the value of the tourDescriptionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditProdDetails }
     *     
     */
    public void setTourDescriptionInfo(AdditProdDetails value) {
        this.tourDescriptionInfo = value;
    }

    /**
     * Gets the value of the bookingReferenceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingReferenceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingReferenceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationControlInformation25427S }
     * 
     * 
     */
    public List<ReservationControlInformation25427S> getBookingReferenceInfo() {
        if (bookingReferenceInfo == null) {
            bookingReferenceInfo = new ArrayList<ReservationControlInformation25427S>();
        }
        return this.bookingReferenceInfo;
    }

    /**
     * Gets the value of the statusInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionDetails }
     *     
     */
    public QuantityAndActionDetails getStatusInfo() {
        return statusInfo;
    }

    /**
     * Sets the value of the statusInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionDetails }
     *     
     */
    public void setStatusInfo(QuantityAndActionDetails value) {
        this.statusInfo = value;
    }

    /**
     * Gets the value of the insuranceIndication property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceCoverage25483S }
     *     
     */
    public InsuranceCoverage25483S getInsuranceIndication() {
        return insuranceIndication;
    }

    /**
     * Sets the value of the insuranceIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceCoverage25483S }
     *     
     */
    public void setInsuranceIndication(InsuranceCoverage25483S value) {
        this.insuranceIndication = value;
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
     * {@link TravellerInformation25441S }
     * 
     * 
     */
    public List<TravellerInformation25441S> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<TravellerInformation25441S>();
        }
        return this.passengerInfo;
    }

    /**
     * Gets the value of the expireInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformation25444S }
     *     
     */
    public StructuredDateTimeInformation25444S getExpireInfo() {
        return expireInfo;
    }

    /**
     * Sets the value of the expireInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformation25444S }
     *     
     */
    public void setExpireInfo(StructuredDateTimeInformation25444S value) {
        this.expireInfo = value;
    }

    /**
     * Gets the value of the bookingDescriptionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingDescriptionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingDescriptionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextInformation25445S }
     * 
     * 
     */
    public List<FreeTextInformation25445S> getBookingDescriptionInfo() {
        if (bookingDescriptionInfo == null) {
            bookingDescriptionInfo = new ArrayList<FreeTextInformation25445S>();
        }
        return this.bookingDescriptionInfo;
    }

    /**
     * Gets the value of the systemProviderInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransportIdentifier }
     *     
     */
    public TransportIdentifier getSystemProviderInfo() {
        return systemProviderInfo;
    }

    /**
     * Sets the value of the systemProviderInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportIdentifier }
     *     
     */
    public void setSystemProviderInfo(TransportIdentifier value) {
        this.systemProviderInfo = value;
    }

    /**
     * Gets the value of the tourOperatorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourOperatorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourOperatorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyInformation25420S }
     * 
     * 
     */
    public List<CompanyInformation25420S> getTourOperatorInfo() {
        if (tourOperatorInfo == null) {
            tourOperatorInfo = new ArrayList<CompanyInformation25420S>();
        }
        return this.tourOperatorInfo;
    }

    /**
     * Gets the value of the bookingSource property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentification25447S }
     *     
     */
    public UserIdentification25447S getBookingSource() {
        return bookingSource;
    }

    /**
     * Sets the value of the bookingSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentification25447S }
     *     
     */
    public void setBookingSource(UserIdentification25447S value) {
        this.bookingSource = value;
    }

    /**
     * Gets the value of the passengerAssocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerAssocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerAssocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformation25422S }
     * 
     * 
     */
    public List<ReferenceInformation25422S> getPassengerAssocation() {
        if (passengerAssocation == null) {
            passengerAssocation = new ArrayList<ReferenceInformation25422S>();
        }
        return this.passengerAssocation;
    }

    /**
     * Gets the value of the tourAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TourAccountDetailsType }
     *     
     */
    public TourAccountDetailsType getTourAccountDetails() {
        return tourAccountDetails;
    }

    /**
     * Sets the value of the tourAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourAccountDetailsType }
     *     
     */
    public void setTourAccountDetails(TourAccountDetailsType value) {
        this.tourAccountDetails = value;
    }

    /**
     * Gets the value of the tourProductDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourProductDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourProductDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourServiceDetailsType }
     * 
     * 
     */
    public List<TourServiceDetailsType> getTourProductDetails() {
        if (tourProductDetails == null) {
            tourProductDetails = new ArrayList<TourServiceDetailsType>();
        }
        return this.tourProductDetails;
    }

}
