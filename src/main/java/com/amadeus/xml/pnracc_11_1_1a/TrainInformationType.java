
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group together rail segment business data
 * 
 * <p>Java class for TrainInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyInformation"/>
 *         &lt;element name="updatePermission" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_20923S" minOccurs="0"/>
 *         &lt;element name="tripDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TrainDataType"/>
 *         &lt;element name="openSegment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_33257S" minOccurs="0"/>
 *         &lt;element name="journeyDirection" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelItineraryInformation" minOccurs="0"/>
 *         &lt;element name="providerTattoo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemReferencesAndVersions" minOccurs="0"/>
 *         &lt;element name="serviceInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation" minOccurs="0"/>
 *         &lt;element name="classInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ClassConfigurationDetails"/>
 *         &lt;element name="accommodationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AccommodationAllocationInformation" minOccurs="0"/>
 *         &lt;element name="coachInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CoachProductInformation" minOccurs="0"/>
 *         &lt;element name="reservableStatus" type="{http://xml.amadeus.com/PNRACC_11_1_1A}QuantityAndActionDetails_32609S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainInformationType", propOrder = {
    "companyInfo",
    "updatePermission",
    "tripDetails",
    "openSegment",
    "journeyDirection",
    "providerTattoo",
    "serviceInfo",
    "classInfo",
    "accommodationInfo",
    "coachInfo",
    "reservableStatus"
})
public class TrainInformationType {

    @XmlElement(required = true)
    protected CompanyInformation companyInfo;
    protected StatusDetails20923S updatePermission;
    @XmlElement(required = true)
    protected TrainDataType tripDetails;
    protected StatusDetails33257S openSegment;
    protected TravelItineraryInformation journeyDirection;
    protected ItemReferencesAndVersions providerTattoo;
    protected FreeTextInformation serviceInfo;
    @XmlElement(required = true)
    protected ClassConfigurationDetails classInfo;
    protected AccommodationAllocationInformation accommodationInfo;
    protected CoachProductInformation coachInfo;
    protected QuantityAndActionDetails32609S reservableStatus;

    /**
     * Gets the value of the companyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformation }
     *     
     */
    public CompanyInformation getCompanyInfo() {
        return companyInfo;
    }

    /**
     * Sets the value of the companyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformation }
     *     
     */
    public void setCompanyInfo(CompanyInformation value) {
        this.companyInfo = value;
    }

    /**
     * Gets the value of the updatePermission property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetails20923S }
     *     
     */
    public StatusDetails20923S getUpdatePermission() {
        return updatePermission;
    }

    /**
     * Sets the value of the updatePermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetails20923S }
     *     
     */
    public void setUpdatePermission(StatusDetails20923S value) {
        this.updatePermission = value;
    }

    /**
     * Gets the value of the tripDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TrainDataType }
     *     
     */
    public TrainDataType getTripDetails() {
        return tripDetails;
    }

    /**
     * Sets the value of the tripDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainDataType }
     *     
     */
    public void setTripDetails(TrainDataType value) {
        this.tripDetails = value;
    }

    /**
     * Gets the value of the openSegment property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetails33257S }
     *     
     */
    public StatusDetails33257S getOpenSegment() {
        return openSegment;
    }

    /**
     * Sets the value of the openSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetails33257S }
     *     
     */
    public void setOpenSegment(StatusDetails33257S value) {
        this.openSegment = value;
    }

    /**
     * Gets the value of the journeyDirection property.
     * 
     * @return
     *     possible object is
     *     {@link TravelItineraryInformation }
     *     
     */
    public TravelItineraryInformation getJourneyDirection() {
        return journeyDirection;
    }

    /**
     * Sets the value of the journeyDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelItineraryInformation }
     *     
     */
    public void setJourneyDirection(TravelItineraryInformation value) {
        this.journeyDirection = value;
    }

    /**
     * Gets the value of the providerTattoo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersions }
     *     
     */
    public ItemReferencesAndVersions getProviderTattoo() {
        return providerTattoo;
    }

    /**
     * Sets the value of the providerTattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersions }
     *     
     */
    public void setProviderTattoo(ItemReferencesAndVersions value) {
        this.providerTattoo = value;
    }

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformation }
     *     
     */
    public FreeTextInformation getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformation }
     *     
     */
    public void setServiceInfo(FreeTextInformation value) {
        this.serviceInfo = value;
    }

    /**
     * Gets the value of the classInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ClassConfigurationDetails }
     *     
     */
    public ClassConfigurationDetails getClassInfo() {
        return classInfo;
    }

    /**
     * Sets the value of the classInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassConfigurationDetails }
     *     
     */
    public void setClassInfo(ClassConfigurationDetails value) {
        this.classInfo = value;
    }

    /**
     * Gets the value of the accommodationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationAllocationInformation }
     *     
     */
    public AccommodationAllocationInformation getAccommodationInfo() {
        return accommodationInfo;
    }

    /**
     * Sets the value of the accommodationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationAllocationInformation }
     *     
     */
    public void setAccommodationInfo(AccommodationAllocationInformation value) {
        this.accommodationInfo = value;
    }

    /**
     * Gets the value of the coachInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CoachProductInformation }
     *     
     */
    public CoachProductInformation getCoachInfo() {
        return coachInfo;
    }

    /**
     * Sets the value of the coachInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoachProductInformation }
     *     
     */
    public void setCoachInfo(CoachProductInformation value) {
        this.coachInfo = value;
    }

    /**
     * Gets the value of the reservableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionDetails32609S }
     *     
     */
    public QuantityAndActionDetails32609S getReservableStatus() {
        return reservableStatus;
    }

    /**
     * Sets the value of the reservableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionDetails32609S }
     *     
     */
    public void setReservableStatus(QuantityAndActionDetails32609S value) {
        this.reservableStatus = value;
    }

}
