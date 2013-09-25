
package com.amadeus.xml.fsocaq_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="numberOfUnit" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}NumberOfUnitsType" minOccurs="0"/>
 *         &lt;element name="globalOptions" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AttributeType_78565S" minOccurs="0"/>
 *         &lt;element name="paxReference" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravellerReferenceInformationType" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="customerRef" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ConsumerReferenceInformationType" minOccurs="0"/>
 *         &lt;element name="formOfPaymentByPassenger" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FOPRepresentationType" maxOccurs="60" minOccurs="0"/>
 *         &lt;element name="fareFamilies" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="familyInformation" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyType"/>
 *                   &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
 *                   &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ReferenceInfoType"/>
 *                             &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="otherPossibleCriteria" maxOccurs="20" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="logicalLink" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}BooleanExpressionRuleType"/>
 *                             &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
 *                             &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ReferenceInfoType"/>
 *                                       &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fareOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pricingTickInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}PricingTicketingDetailsType"/>
 *                   &lt;element name="corporate" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CorporateIdentificationType" minOccurs="0"/>
 *                   &lt;element name="ticketingPriceScheme" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TicketingPriceSchemeType" minOccurs="0"/>
 *                   &lt;element name="feeIdDescription" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CodedAttributeType_78503S" minOccurs="0"/>
 *                   &lt;element name="conversionRate" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ConversionRateType" minOccurs="0"/>
 *                   &lt;element name="formOfPayment" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FormOfPaymentTypeI" minOccurs="0"/>
 *                   &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="monetaryCabinInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}MonetaryAndCabinInformationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="priceToBeat" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}MonetaryInformationType" minOccurs="0"/>
 *         &lt;element name="taxInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TaxDetailsType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="travelFlightInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelFlightInformationType" minOccurs="0"/>
 *         &lt;element name="itinerary" maxOccurs="18" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}OriginAndDestinationRequestType"/>
 *                   &lt;element name="departureLocalization" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DepartureLocationType" minOccurs="0"/>
 *                   &lt;element name="arrivalLocalization" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ArrivalLocalizationType" minOccurs="0"/>
 *                   &lt;element name="timeDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DateAndTimeInformationType" minOccurs="0"/>
 *                   &lt;element name="flightInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelFlightInformationType" minOccurs="0"/>
 *                   &lt;element name="flightInfoPNR" maxOccurs="4" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="travelResponseDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelProductInformationTypeI"/>
 *                             &lt;element name="timeTableDate" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}StructuredPeriodInformationType" minOccurs="0"/>
 *                             &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AdditionalProductDetailsTypeI" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="codeshareData" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CommercialAgreementsType" minOccurs="0"/>
 *                             &lt;element name="disclosure" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FreeTextInformationType" minOccurs="0"/>
 *                             &lt;element name="stopDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}RoutingInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="trafficRestrictionData" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TrafficRestrictionTypeI" minOccurs="0"/>
 *                             &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}PassengerItineraryInformationType" minOccurs="0"/>
 *                             &lt;element name="incidentalStopInfo" maxOccurs="8" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DateAndTimeInformationTypeI"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="requestedSegmentAction" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ActionIdentificationType" minOccurs="0"/>
 *                   &lt;element name="attributes" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CodedAttributeType_82309S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ticketChangeInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ticketNumberDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TicketNumberTypeI"/>
 *                   &lt;element name="ticketRequestedSegments" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="actionIdentification" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ActionIdentificationType"/>
 *                             &lt;element name="connectPointDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ConnectionTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="combinationFareFamilies" maxOccurs="2000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemFFCNumber" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ItemNumberType"/>
 *                   &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}NumberOfUnitsType_80154S" minOccurs="0"/>
 *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ReferenceInfoType" maxOccurs="6" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="feeOption" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}SelectionDetailsType"/>
 *                   &lt;element name="rateTax" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}MonetaryInformationType_80162S" minOccurs="0"/>
 *                   &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="feeInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}SpecificDataInformationType"/>
 *                             &lt;element name="associatedAmounts" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}MonetaryInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="feeDescriptionGrp" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ItemNumberType_80866S"/>
 *                                       &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AttributeType" minOccurs="0"/>
 *                                       &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="officeIdDetails" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="officeIdInformation" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}UserIdentificationType"/>
 *                   &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}NumberOfUnitsType_80154S" minOccurs="0"/>
 *                   &lt;element name="uidOption" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CodedAttributeType" minOccurs="0"/>
 *                   &lt;element name="pricingTickInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}PricingTicketingDetailsType" minOccurs="0"/>
 *                   &lt;element name="corporateFareInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CorporateFareInformationType" minOccurs="0"/>
 *                   &lt;element name="travelFlightInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelFlightInformationType" minOccurs="0"/>
 *                   &lt;element name="airlineDistributionDetails" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}OriginAndDestinationRequestType"/>
 *                             &lt;element name="flightInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelFlightInformationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "numberOfUnit",
    "globalOptions",
    "paxReference",
    "customerRef",
    "formOfPaymentByPassenger",
    "fareFamilies",
    "fareOptions",
    "priceToBeat",
    "taxInfo",
    "travelFlightInfo",
    "itinerary",
    "ticketChangeInfo",
    "combinationFareFamilies",
    "feeOption",
    "officeIdDetails"
})
@XmlRootElement(name = "Fare_SellByFareCalendar")
public class FareSellByFareCalendar {

    protected NumberOfUnitsType numberOfUnit;
    protected AttributeType78565S globalOptions;
    protected List<TravellerReferenceInformationType> paxReference;
    protected ConsumerReferenceInformationType customerRef;
    protected List<FOPRepresentationType> formOfPaymentByPassenger;
    protected List<FareSellByFareCalendar.FareFamilies> fareFamilies;
    protected FareSellByFareCalendar.FareOptions fareOptions;
    protected MonetaryInformationType priceToBeat;
    protected List<TaxDetailsType> taxInfo;
    protected TravelFlightInformationType travelFlightInfo;
    protected List<FareSellByFareCalendar.Itinerary> itinerary;
    protected FareSellByFareCalendar.TicketChangeInfo ticketChangeInfo;
    protected List<FareSellByFareCalendar.CombinationFareFamilies> combinationFareFamilies;
    protected List<FareSellByFareCalendar.FeeOption> feeOption;
    protected List<FareSellByFareCalendar.OfficeIdDetails> officeIdDetails;

    /**
     * Gets the value of the numberOfUnit property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public NumberOfUnitsType getNumberOfUnit() {
        return numberOfUnit;
    }

    /**
     * Sets the value of the numberOfUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public void setNumberOfUnit(NumberOfUnitsType value) {
        this.numberOfUnit = value;
    }

    /**
     * Gets the value of the globalOptions property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType78565S }
     *     
     */
    public AttributeType78565S getGlobalOptions() {
        return globalOptions;
    }

    /**
     * Sets the value of the globalOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType78565S }
     *     
     */
    public void setGlobalOptions(AttributeType78565S value) {
        this.globalOptions = value;
    }

    /**
     * Gets the value of the paxReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerReferenceInformationType }
     * 
     * 
     */
    public List<TravellerReferenceInformationType> getPaxReference() {
        if (paxReference == null) {
            paxReference = new ArrayList<TravellerReferenceInformationType>();
        }
        return this.paxReference;
    }

    /**
     * Gets the value of the customerRef property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerReferenceInformationType }
     *     
     */
    public ConsumerReferenceInformationType getCustomerRef() {
        return customerRef;
    }

    /**
     * Sets the value of the customerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerReferenceInformationType }
     *     
     */
    public void setCustomerRef(ConsumerReferenceInformationType value) {
        this.customerRef = value;
    }

    /**
     * Gets the value of the formOfPaymentByPassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPaymentByPassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPaymentByPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FOPRepresentationType }
     * 
     * 
     */
    public List<FOPRepresentationType> getFormOfPaymentByPassenger() {
        if (formOfPaymentByPassenger == null) {
            formOfPaymentByPassenger = new ArrayList<FOPRepresentationType>();
        }
        return this.formOfPaymentByPassenger;
    }

    /**
     * Gets the value of the fareFamilies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareFamilies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareFamilies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendar.FareFamilies }
     * 
     * 
     */
    public List<FareSellByFareCalendar.FareFamilies> getFareFamilies() {
        if (fareFamilies == null) {
            fareFamilies = new ArrayList<FareSellByFareCalendar.FareFamilies>();
        }
        return this.fareFamilies;
    }

    /**
     * Gets the value of the fareOptions property.
     * 
     * @return
     *     possible object is
     *     {@link FareSellByFareCalendar.FareOptions }
     *     
     */
    public FareSellByFareCalendar.FareOptions getFareOptions() {
        return fareOptions;
    }

    /**
     * Sets the value of the fareOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSellByFareCalendar.FareOptions }
     *     
     */
    public void setFareOptions(FareSellByFareCalendar.FareOptions value) {
        this.fareOptions = value;
    }

    /**
     * Gets the value of the priceToBeat property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType }
     *     
     */
    public MonetaryInformationType getPriceToBeat() {
        return priceToBeat;
    }

    /**
     * Sets the value of the priceToBeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType }
     *     
     */
    public void setPriceToBeat(MonetaryInformationType value) {
        this.priceToBeat = value;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxDetailsType }
     * 
     * 
     */
    public List<TaxDetailsType> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TaxDetailsType>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the travelFlightInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravelFlightInformationType }
     *     
     */
    public TravelFlightInformationType getTravelFlightInfo() {
        return travelFlightInfo;
    }

    /**
     * Sets the value of the travelFlightInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelFlightInformationType }
     *     
     */
    public void setTravelFlightInfo(TravelFlightInformationType value) {
        this.travelFlightInfo = value;
    }

    /**
     * Gets the value of the itinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendar.Itinerary }
     * 
     * 
     */
    public List<FareSellByFareCalendar.Itinerary> getItinerary() {
        if (itinerary == null) {
            itinerary = new ArrayList<FareSellByFareCalendar.Itinerary>();
        }
        return this.itinerary;
    }

    /**
     * Gets the value of the ticketChangeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareSellByFareCalendar.TicketChangeInfo }
     *     
     */
    public FareSellByFareCalendar.TicketChangeInfo getTicketChangeInfo() {
        return ticketChangeInfo;
    }

    /**
     * Sets the value of the ticketChangeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSellByFareCalendar.TicketChangeInfo }
     *     
     */
    public void setTicketChangeInfo(FareSellByFareCalendar.TicketChangeInfo value) {
        this.ticketChangeInfo = value;
    }

    /**
     * Gets the value of the combinationFareFamilies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combinationFareFamilies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombinationFareFamilies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendar.CombinationFareFamilies }
     * 
     * 
     */
    public List<FareSellByFareCalendar.CombinationFareFamilies> getCombinationFareFamilies() {
        if (combinationFareFamilies == null) {
            combinationFareFamilies = new ArrayList<FareSellByFareCalendar.CombinationFareFamilies>();
        }
        return this.combinationFareFamilies;
    }

    /**
     * Gets the value of the feeOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendar.FeeOption }
     * 
     * 
     */
    public List<FareSellByFareCalendar.FeeOption> getFeeOption() {
        if (feeOption == null) {
            feeOption = new ArrayList<FareSellByFareCalendar.FeeOption>();
        }
        return this.feeOption;
    }

    /**
     * Gets the value of the officeIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officeIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficeIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendar.OfficeIdDetails }
     * 
     * 
     */
    public List<FareSellByFareCalendar.OfficeIdDetails> getOfficeIdDetails() {
        if (officeIdDetails == null) {
            officeIdDetails = new ArrayList<FareSellByFareCalendar.OfficeIdDetails>();
        }
        return this.officeIdDetails;
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
     *         &lt;element name="itemFFCNumber" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ItemNumberType"/>
     *         &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}NumberOfUnitsType_80154S" minOccurs="0"/>
     *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ReferenceInfoType" maxOccurs="6" minOccurs="0"/>
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
        "itemFFCNumber",
        "nbOfUnits",
        "referenceInfo"
    })
    public static class CombinationFareFamilies {

        @XmlElement(required = true)
        protected ItemNumberType itemFFCNumber;
        protected NumberOfUnitsType80154S nbOfUnits;
        protected List<ReferenceInfoType> referenceInfo;

        /**
         * Gets the value of the itemFFCNumber property.
         * 
         * @return
         *     possible object is
         *     {@link ItemNumberType }
         *     
         */
        public ItemNumberType getItemFFCNumber() {
            return itemFFCNumber;
        }

        /**
         * Sets the value of the itemFFCNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemNumberType }
         *     
         */
        public void setItemFFCNumber(ItemNumberType value) {
            this.itemFFCNumber = value;
        }

        /**
         * Gets the value of the nbOfUnits property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType80154S }
         *     
         */
        public NumberOfUnitsType80154S getNbOfUnits() {
            return nbOfUnits;
        }

        /**
         * Sets the value of the nbOfUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType80154S }
         *     
         */
        public void setNbOfUnits(NumberOfUnitsType80154S value) {
            this.nbOfUnits = value;
        }

        /**
         * Gets the value of the referenceInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referenceInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReferenceInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInfoType }
         * 
         * 
         */
        public List<ReferenceInfoType> getReferenceInfo() {
            if (referenceInfo == null) {
                referenceInfo = new ArrayList<ReferenceInfoType>();
            }
            return this.referenceInfo;
        }

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
     *         &lt;element name="familyInformation" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyType"/>
     *         &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
     *         &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ReferenceInfoType"/>
     *                   &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="otherPossibleCriteria" maxOccurs="20" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="logicalLink" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}BooleanExpressionRuleType"/>
     *                   &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
     *                   &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ReferenceInfoType"/>
     *                             &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "familyInformation",
        "familyCriteria",
        "fareFamilySegment",
        "otherPossibleCriteria"
    })
    public static class FareFamilies {

        @XmlElement(required = true)
        protected FareFamilyType familyInformation;
        protected FareFamilyCriteriaType familyCriteria;
        protected List<FareSellByFareCalendar.FareFamilies.FareFamilySegment> fareFamilySegment;
        protected List<FareSellByFareCalendar.FareFamilies.OtherPossibleCriteria> otherPossibleCriteria;

        /**
         * Gets the value of the familyInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FareFamilyType }
         *     
         */
        public FareFamilyType getFamilyInformation() {
            return familyInformation;
        }

        /**
         * Sets the value of the familyInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareFamilyType }
         *     
         */
        public void setFamilyInformation(FareFamilyType value) {
            this.familyInformation = value;
        }

        /**
         * Gets the value of the familyCriteria property.
         * 
         * @return
         *     possible object is
         *     {@link FareFamilyCriteriaType }
         *     
         */
        public FareFamilyCriteriaType getFamilyCriteria() {
            return familyCriteria;
        }

        /**
         * Sets the value of the familyCriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareFamilyCriteriaType }
         *     
         */
        public void setFamilyCriteria(FareFamilyCriteriaType value) {
            this.familyCriteria = value;
        }

        /**
         * Gets the value of the fareFamilySegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareFamilySegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareFamilySegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendar.FareFamilies.FareFamilySegment }
         * 
         * 
         */
        public List<FareSellByFareCalendar.FareFamilies.FareFamilySegment> getFareFamilySegment() {
            if (fareFamilySegment == null) {
                fareFamilySegment = new ArrayList<FareSellByFareCalendar.FareFamilies.FareFamilySegment>();
            }
            return this.fareFamilySegment;
        }

        /**
         * Gets the value of the otherPossibleCriteria property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherPossibleCriteria property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherPossibleCriteria().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendar.FareFamilies.OtherPossibleCriteria }
         * 
         * 
         */
        public List<FareSellByFareCalendar.FareFamilies.OtherPossibleCriteria> getOtherPossibleCriteria() {
            if (otherPossibleCriteria == null) {
                otherPossibleCriteria = new ArrayList<FareSellByFareCalendar.FareFamilies.OtherPossibleCriteria>();
            }
            return this.otherPossibleCriteria;
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
         *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ReferenceInfoType"/>
         *         &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
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
            "referenceInfo",
            "familyCriteria"
        })
        public static class FareFamilySegment {

            @XmlElement(required = true)
            protected ReferenceInfoType referenceInfo;
            protected FareFamilyCriteriaType familyCriteria;

            /**
             * Gets the value of the referenceInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getReferenceInfo() {
                return referenceInfo;
            }

            /**
             * Sets the value of the referenceInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setReferenceInfo(ReferenceInfoType value) {
                this.referenceInfo = value;
            }

            /**
             * Gets the value of the familyCriteria property.
             * 
             * @return
             *     possible object is
             *     {@link FareFamilyCriteriaType }
             *     
             */
            public FareFamilyCriteriaType getFamilyCriteria() {
                return familyCriteria;
            }

            /**
             * Sets the value of the familyCriteria property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareFamilyCriteriaType }
             *     
             */
            public void setFamilyCriteria(FareFamilyCriteriaType value) {
                this.familyCriteria = value;
            }

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
         *         &lt;element name="logicalLink" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}BooleanExpressionRuleType"/>
         *         &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
         *         &lt;element name="fareFamilySegment" maxOccurs="6" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ReferenceInfoType"/>
         *                   &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "logicalLink",
            "familyCriteria",
            "fareFamilySegment"
        })
        public static class OtherPossibleCriteria {

            @XmlElement(required = true)
            protected BooleanExpressionRuleType logicalLink;
            protected FareFamilyCriteriaType familyCriteria;
            protected List<FareSellByFareCalendar.FareFamilies.OtherPossibleCriteria.FareFamilySegment> fareFamilySegment;

            /**
             * Gets the value of the logicalLink property.
             * 
             * @return
             *     possible object is
             *     {@link BooleanExpressionRuleType }
             *     
             */
            public BooleanExpressionRuleType getLogicalLink() {
                return logicalLink;
            }

            /**
             * Sets the value of the logicalLink property.
             * 
             * @param value
             *     allowed object is
             *     {@link BooleanExpressionRuleType }
             *     
             */
            public void setLogicalLink(BooleanExpressionRuleType value) {
                this.logicalLink = value;
            }

            /**
             * Gets the value of the familyCriteria property.
             * 
             * @return
             *     possible object is
             *     {@link FareFamilyCriteriaType }
             *     
             */
            public FareFamilyCriteriaType getFamilyCriteria() {
                return familyCriteria;
            }

            /**
             * Sets the value of the familyCriteria property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareFamilyCriteriaType }
             *     
             */
            public void setFamilyCriteria(FareFamilyCriteriaType value) {
                this.familyCriteria = value;
            }

            /**
             * Gets the value of the fareFamilySegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fareFamilySegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFareFamilySegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareSellByFareCalendar.FareFamilies.OtherPossibleCriteria.FareFamilySegment }
             * 
             * 
             */
            public List<FareSellByFareCalendar.FareFamilies.OtherPossibleCriteria.FareFamilySegment> getFareFamilySegment() {
                if (fareFamilySegment == null) {
                    fareFamilySegment = new ArrayList<FareSellByFareCalendar.FareFamilies.OtherPossibleCriteria.FareFamilySegment>();
                }
                return this.fareFamilySegment;
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
             *         &lt;element name="referenceInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ReferenceInfoType"/>
             *         &lt;element name="familyCriteria" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FareFamilyCriteriaType" minOccurs="0"/>
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
                "referenceInfo",
                "familyCriteria"
            })
            public static class FareFamilySegment {

                @XmlElement(required = true)
                protected ReferenceInfoType referenceInfo;
                protected FareFamilyCriteriaType familyCriteria;

                /**
                 * Gets the value of the referenceInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType }
                 *     
                 */
                public ReferenceInfoType getReferenceInfo() {
                    return referenceInfo;
                }

                /**
                 * Sets the value of the referenceInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType }
                 *     
                 */
                public void setReferenceInfo(ReferenceInfoType value) {
                    this.referenceInfo = value;
                }

                /**
                 * Gets the value of the familyCriteria property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareFamilyCriteriaType }
                 *     
                 */
                public FareFamilyCriteriaType getFamilyCriteria() {
                    return familyCriteria;
                }

                /**
                 * Sets the value of the familyCriteria property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareFamilyCriteriaType }
                 *     
                 */
                public void setFamilyCriteria(FareFamilyCriteriaType value) {
                    this.familyCriteria = value;
                }

            }

        }

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
     *         &lt;element name="pricingTickInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}PricingTicketingDetailsType"/>
     *         &lt;element name="corporate" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CorporateIdentificationType" minOccurs="0"/>
     *         &lt;element name="ticketingPriceScheme" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TicketingPriceSchemeType" minOccurs="0"/>
     *         &lt;element name="feeIdDescription" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CodedAttributeType_78503S" minOccurs="0"/>
     *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ConversionRateType" minOccurs="0"/>
     *         &lt;element name="formOfPayment" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FormOfPaymentTypeI" minOccurs="0"/>
     *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FrequentTravellerInformationTypeI" minOccurs="0"/>
     *         &lt;element name="monetaryCabinInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}MonetaryAndCabinInformationType" minOccurs="0"/>
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
        "pricingTickInfo",
        "corporate",
        "ticketingPriceScheme",
        "feeIdDescription",
        "conversionRate",
        "formOfPayment",
        "frequentTravellerInfo",
        "monetaryCabinInfo"
    })
    public static class FareOptions {

        @XmlElement(required = true)
        protected PricingTicketingDetailsType pricingTickInfo;
        protected CorporateIdentificationType corporate;
        protected TicketingPriceSchemeType ticketingPriceScheme;
        protected CodedAttributeType78503S feeIdDescription;
        protected ConversionRateType conversionRate;
        protected FormOfPaymentTypeI formOfPayment;
        protected FrequentTravellerInformationTypeI frequentTravellerInfo;
        protected MonetaryAndCabinInformationType monetaryCabinInfo;

        /**
         * Gets the value of the pricingTickInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public PricingTicketingDetailsType getPricingTickInfo() {
            return pricingTickInfo;
        }

        /**
         * Sets the value of the pricingTickInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public void setPricingTickInfo(PricingTicketingDetailsType value) {
            this.pricingTickInfo = value;
        }

        /**
         * Gets the value of the corporate property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateIdentificationType }
         *     
         */
        public CorporateIdentificationType getCorporate() {
            return corporate;
        }

        /**
         * Sets the value of the corporate property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateIdentificationType }
         *     
         */
        public void setCorporate(CorporateIdentificationType value) {
            this.corporate = value;
        }

        /**
         * Gets the value of the ticketingPriceScheme property.
         * 
         * @return
         *     possible object is
         *     {@link TicketingPriceSchemeType }
         *     
         */
        public TicketingPriceSchemeType getTicketingPriceScheme() {
            return ticketingPriceScheme;
        }

        /**
         * Sets the value of the ticketingPriceScheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketingPriceSchemeType }
         *     
         */
        public void setTicketingPriceScheme(TicketingPriceSchemeType value) {
            this.ticketingPriceScheme = value;
        }

        /**
         * Gets the value of the feeIdDescription property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType78503S }
         *     
         */
        public CodedAttributeType78503S getFeeIdDescription() {
            return feeIdDescription;
        }

        /**
         * Sets the value of the feeIdDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType78503S }
         *     
         */
        public void setFeeIdDescription(CodedAttributeType78503S value) {
            this.feeIdDescription = value;
        }

        /**
         * Gets the value of the conversionRate property.
         * 
         * @return
         *     possible object is
         *     {@link ConversionRateType }
         *     
         */
        public ConversionRateType getConversionRate() {
            return conversionRate;
        }

        /**
         * Sets the value of the conversionRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConversionRateType }
         *     
         */
        public void setConversionRate(ConversionRateType value) {
            this.conversionRate = value;
        }

        /**
         * Gets the value of the formOfPayment property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public FormOfPaymentTypeI getFormOfPayment() {
            return formOfPayment;
        }

        /**
         * Sets the value of the formOfPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public void setFormOfPayment(FormOfPaymentTypeI value) {
            this.formOfPayment = value;
        }

        /**
         * Gets the value of the frequentTravellerInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerInformationTypeI }
         *     
         */
        public FrequentTravellerInformationTypeI getFrequentTravellerInfo() {
            return frequentTravellerInfo;
        }

        /**
         * Sets the value of the frequentTravellerInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerInformationTypeI }
         *     
         */
        public void setFrequentTravellerInfo(FrequentTravellerInformationTypeI value) {
            this.frequentTravellerInfo = value;
        }

        /**
         * Gets the value of the monetaryCabinInfo property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryAndCabinInformationType }
         *     
         */
        public MonetaryAndCabinInformationType getMonetaryCabinInfo() {
            return monetaryCabinInfo;
        }

        /**
         * Sets the value of the monetaryCabinInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryAndCabinInformationType }
         *     
         */
        public void setMonetaryCabinInfo(MonetaryAndCabinInformationType value) {
            this.monetaryCabinInfo = value;
        }

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
     *         &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}SelectionDetailsType"/>
     *         &lt;element name="rateTax" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}MonetaryInformationType_80162S" minOccurs="0"/>
     *         &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="feeInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}SpecificDataInformationType"/>
     *                   &lt;element name="associatedAmounts" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}MonetaryInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="feeDescriptionGrp" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ItemNumberType_80866S"/>
     *                             &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AttributeType" minOccurs="0"/>
     *                             &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "feeTypeInfo",
        "rateTax",
        "feeDetails"
    })
    public static class FeeOption {

        @XmlElement(required = true)
        protected SelectionDetailsType feeTypeInfo;
        protected MonetaryInformationType80162S rateTax;
        protected List<FareSellByFareCalendar.FeeOption.FeeDetails> feeDetails;

        /**
         * Gets the value of the feeTypeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SelectionDetailsType }
         *     
         */
        public SelectionDetailsType getFeeTypeInfo() {
            return feeTypeInfo;
        }

        /**
         * Sets the value of the feeTypeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectionDetailsType }
         *     
         */
        public void setFeeTypeInfo(SelectionDetailsType value) {
            this.feeTypeInfo = value;
        }

        /**
         * Gets the value of the rateTax property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType80162S }
         *     
         */
        public MonetaryInformationType80162S getRateTax() {
            return rateTax;
        }

        /**
         * Sets the value of the rateTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType80162S }
         *     
         */
        public void setRateTax(MonetaryInformationType80162S value) {
            this.rateTax = value;
        }

        /**
         * Gets the value of the feeDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feeDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeeDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendar.FeeOption.FeeDetails }
         * 
         * 
         */
        public List<FareSellByFareCalendar.FeeOption.FeeDetails> getFeeDetails() {
            if (feeDetails == null) {
                feeDetails = new ArrayList<FareSellByFareCalendar.FeeOption.FeeDetails>();
            }
            return this.feeDetails;
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
         *         &lt;element name="feeInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}SpecificDataInformationType"/>
         *         &lt;element name="associatedAmounts" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}MonetaryInformationTypeI" minOccurs="0"/>
         *         &lt;element name="feeDescriptionGrp" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ItemNumberType_80866S"/>
         *                   &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AttributeType" minOccurs="0"/>
         *                   &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "feeInfo",
            "associatedAmounts",
            "feeDescriptionGrp"
        })
        public static class FeeDetails {

            @XmlElement(required = true)
            protected SpecificDataInformationType feeInfo;
            protected MonetaryInformationTypeI associatedAmounts;
            protected FareSellByFareCalendar.FeeOption.FeeDetails.FeeDescriptionGrp feeDescriptionGrp;

            /**
             * Gets the value of the feeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public SpecificDataInformationType getFeeInfo() {
                return feeInfo;
            }

            /**
             * Sets the value of the feeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public void setFeeInfo(SpecificDataInformationType value) {
                this.feeInfo = value;
            }

            /**
             * Gets the value of the associatedAmounts property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getAssociatedAmounts() {
                return associatedAmounts;
            }

            /**
             * Sets the value of the associatedAmounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setAssociatedAmounts(MonetaryInformationTypeI value) {
                this.associatedAmounts = value;
            }

            /**
             * Gets the value of the feeDescriptionGrp property.
             * 
             * @return
             *     possible object is
             *     {@link FareSellByFareCalendar.FeeOption.FeeDetails.FeeDescriptionGrp }
             *     
             */
            public FareSellByFareCalendar.FeeOption.FeeDetails.FeeDescriptionGrp getFeeDescriptionGrp() {
                return feeDescriptionGrp;
            }

            /**
             * Sets the value of the feeDescriptionGrp property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareSellByFareCalendar.FeeOption.FeeDetails.FeeDescriptionGrp }
             *     
             */
            public void setFeeDescriptionGrp(FareSellByFareCalendar.FeeOption.FeeDetails.FeeDescriptionGrp value) {
                this.feeDescriptionGrp = value;
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
             *         &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ItemNumberType_80866S"/>
             *         &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AttributeType" minOccurs="0"/>
             *         &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
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
                "itemNumberInfo",
                "serviceAttributesInfo",
                "serviceDescriptionInfo"
            })
            public static class FeeDescriptionGrp {

                @XmlElement(required = true)
                protected ItemNumberType80866S itemNumberInfo;
                protected AttributeType serviceAttributesInfo;
                protected SpecialRequirementsDetailsType serviceDescriptionInfo;

                /**
                 * Gets the value of the itemNumberInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemNumberType80866S }
                 *     
                 */
                public ItemNumberType80866S getItemNumberInfo() {
                    return itemNumberInfo;
                }

                /**
                 * Sets the value of the itemNumberInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemNumberType80866S }
                 *     
                 */
                public void setItemNumberInfo(ItemNumberType80866S value) {
                    this.itemNumberInfo = value;
                }

                /**
                 * Gets the value of the serviceAttributesInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AttributeType }
                 *     
                 */
                public AttributeType getServiceAttributesInfo() {
                    return serviceAttributesInfo;
                }

                /**
                 * Sets the value of the serviceAttributesInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AttributeType }
                 *     
                 */
                public void setServiceAttributesInfo(AttributeType value) {
                    this.serviceAttributesInfo = value;
                }

                /**
                 * Gets the value of the serviceDescriptionInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecialRequirementsDetailsType }
                 *     
                 */
                public SpecialRequirementsDetailsType getServiceDescriptionInfo() {
                    return serviceDescriptionInfo;
                }

                /**
                 * Sets the value of the serviceDescriptionInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecialRequirementsDetailsType }
                 *     
                 */
                public void setServiceDescriptionInfo(SpecialRequirementsDetailsType value) {
                    this.serviceDescriptionInfo = value;
                }

            }

        }

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
     *         &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}OriginAndDestinationRequestType"/>
     *         &lt;element name="departureLocalization" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DepartureLocationType" minOccurs="0"/>
     *         &lt;element name="arrivalLocalization" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ArrivalLocalizationType" minOccurs="0"/>
     *         &lt;element name="timeDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DateAndTimeInformationType" minOccurs="0"/>
     *         &lt;element name="flightInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelFlightInformationType" minOccurs="0"/>
     *         &lt;element name="flightInfoPNR" maxOccurs="4" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="travelResponseDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelProductInformationTypeI"/>
     *                   &lt;element name="timeTableDate" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}StructuredPeriodInformationType" minOccurs="0"/>
     *                   &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AdditionalProductDetailsTypeI" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="codeshareData" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CommercialAgreementsType" minOccurs="0"/>
     *                   &lt;element name="disclosure" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FreeTextInformationType" minOccurs="0"/>
     *                   &lt;element name="stopDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}RoutingInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="trafficRestrictionData" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TrafficRestrictionTypeI" minOccurs="0"/>
     *                   &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}PassengerItineraryInformationType" minOccurs="0"/>
     *                   &lt;element name="incidentalStopInfo" maxOccurs="8" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DateAndTimeInformationTypeI"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="requestedSegmentAction" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ActionIdentificationType" minOccurs="0"/>
     *         &lt;element name="attributes" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CodedAttributeType_82309S" minOccurs="0"/>
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
        "requestedSegmentRef",
        "departureLocalization",
        "arrivalLocalization",
        "timeDetails",
        "flightInfo",
        "flightInfoPNR",
        "requestedSegmentAction",
        "attributes"
    })
    public static class Itinerary {

        @XmlElement(required = true)
        protected OriginAndDestinationRequestType requestedSegmentRef;
        protected DepartureLocationType departureLocalization;
        protected ArrivalLocalizationType arrivalLocalization;
        protected DateAndTimeInformationType timeDetails;
        protected TravelFlightInformationType flightInfo;
        protected List<FareSellByFareCalendar.Itinerary.FlightInfoPNR> flightInfoPNR;
        protected ActionIdentificationType requestedSegmentAction;
        protected CodedAttributeType82309S attributes;

        /**
         * Gets the value of the requestedSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationRequestType }
         *     
         */
        public OriginAndDestinationRequestType getRequestedSegmentRef() {
            return requestedSegmentRef;
        }

        /**
         * Sets the value of the requestedSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationRequestType }
         *     
         */
        public void setRequestedSegmentRef(OriginAndDestinationRequestType value) {
            this.requestedSegmentRef = value;
        }

        /**
         * Gets the value of the departureLocalization property.
         * 
         * @return
         *     possible object is
         *     {@link DepartureLocationType }
         *     
         */
        public DepartureLocationType getDepartureLocalization() {
            return departureLocalization;
        }

        /**
         * Sets the value of the departureLocalization property.
         * 
         * @param value
         *     allowed object is
         *     {@link DepartureLocationType }
         *     
         */
        public void setDepartureLocalization(DepartureLocationType value) {
            this.departureLocalization = value;
        }

        /**
         * Gets the value of the arrivalLocalization property.
         * 
         * @return
         *     possible object is
         *     {@link ArrivalLocalizationType }
         *     
         */
        public ArrivalLocalizationType getArrivalLocalization() {
            return arrivalLocalization;
        }

        /**
         * Sets the value of the arrivalLocalization property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrivalLocalizationType }
         *     
         */
        public void setArrivalLocalization(ArrivalLocalizationType value) {
            this.arrivalLocalization = value;
        }

        /**
         * Gets the value of the timeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link DateAndTimeInformationType }
         *     
         */
        public DateAndTimeInformationType getTimeDetails() {
            return timeDetails;
        }

        /**
         * Sets the value of the timeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateAndTimeInformationType }
         *     
         */
        public void setTimeDetails(DateAndTimeInformationType value) {
            this.timeDetails = value;
        }

        /**
         * Gets the value of the flightInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TravelFlightInformationType }
         *     
         */
        public TravelFlightInformationType getFlightInfo() {
            return flightInfo;
        }

        /**
         * Sets the value of the flightInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelFlightInformationType }
         *     
         */
        public void setFlightInfo(TravelFlightInformationType value) {
            this.flightInfo = value;
        }

        /**
         * Gets the value of the flightInfoPNR property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightInfoPNR property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightInfoPNR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendar.Itinerary.FlightInfoPNR }
         * 
         * 
         */
        public List<FareSellByFareCalendar.Itinerary.FlightInfoPNR> getFlightInfoPNR() {
            if (flightInfoPNR == null) {
                flightInfoPNR = new ArrayList<FareSellByFareCalendar.Itinerary.FlightInfoPNR>();
            }
            return this.flightInfoPNR;
        }

        /**
         * Gets the value of the requestedSegmentAction property.
         * 
         * @return
         *     possible object is
         *     {@link ActionIdentificationType }
         *     
         */
        public ActionIdentificationType getRequestedSegmentAction() {
            return requestedSegmentAction;
        }

        /**
         * Sets the value of the requestedSegmentAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionIdentificationType }
         *     
         */
        public void setRequestedSegmentAction(ActionIdentificationType value) {
            this.requestedSegmentAction = value;
        }

        /**
         * Gets the value of the attributes property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType82309S }
         *     
         */
        public CodedAttributeType82309S getAttributes() {
            return attributes;
        }

        /**
         * Sets the value of the attributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType82309S }
         *     
         */
        public void setAttributes(CodedAttributeType82309S value) {
            this.attributes = value;
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
         *         &lt;element name="travelResponseDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelProductInformationTypeI"/>
         *         &lt;element name="timeTableDate" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}StructuredPeriodInformationType" minOccurs="0"/>
         *         &lt;element name="terminalEquipmentDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}AdditionalProductDetailsTypeI" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="codeshareData" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CommercialAgreementsType" minOccurs="0"/>
         *         &lt;element name="disclosure" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}FreeTextInformationType" minOccurs="0"/>
         *         &lt;element name="stopDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}RoutingInformationTypeI" minOccurs="0"/>
         *         &lt;element name="trafficRestrictionData" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TrafficRestrictionTypeI" minOccurs="0"/>
         *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}PassengerItineraryInformationType" minOccurs="0"/>
         *         &lt;element name="incidentalStopInfo" maxOccurs="8" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DateAndTimeInformationTypeI"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "travelResponseDetails",
            "timeTableDate",
            "terminalEquipmentDetails",
            "codeshareData",
            "disclosure",
            "stopDetails",
            "trafficRestrictionData",
            "reservationInfo",
            "incidentalStopInfo"
        })
        public static class FlightInfoPNR {

            @XmlElement(required = true)
            protected TravelProductInformationTypeI travelResponseDetails;
            protected StructuredPeriodInformationType timeTableDate;
            protected List<AdditionalProductDetailsTypeI> terminalEquipmentDetails;
            protected CommercialAgreementsType codeshareData;
            protected FreeTextInformationType disclosure;
            protected RoutingInformationTypeI stopDetails;
            protected TrafficRestrictionTypeI trafficRestrictionData;
            protected PassengerItineraryInformationType reservationInfo;
            protected List<FareSellByFareCalendar.Itinerary.FlightInfoPNR.IncidentalStopInfo> incidentalStopInfo;

            /**
             * Gets the value of the travelResponseDetails property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public TravelProductInformationTypeI getTravelResponseDetails() {
                return travelResponseDetails;
            }

            /**
             * Sets the value of the travelResponseDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public void setTravelResponseDetails(TravelProductInformationTypeI value) {
                this.travelResponseDetails = value;
            }

            /**
             * Gets the value of the timeTableDate property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredPeriodInformationType }
             *     
             */
            public StructuredPeriodInformationType getTimeTableDate() {
                return timeTableDate;
            }

            /**
             * Sets the value of the timeTableDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredPeriodInformationType }
             *     
             */
            public void setTimeTableDate(StructuredPeriodInformationType value) {
                this.timeTableDate = value;
            }

            /**
             * Gets the value of the terminalEquipmentDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the terminalEquipmentDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTerminalEquipmentDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AdditionalProductDetailsTypeI }
             * 
             * 
             */
            public List<AdditionalProductDetailsTypeI> getTerminalEquipmentDetails() {
                if (terminalEquipmentDetails == null) {
                    terminalEquipmentDetails = new ArrayList<AdditionalProductDetailsTypeI>();
                }
                return this.terminalEquipmentDetails;
            }

            /**
             * Gets the value of the codeshareData property.
             * 
             * @return
             *     possible object is
             *     {@link CommercialAgreementsType }
             *     
             */
            public CommercialAgreementsType getCodeshareData() {
                return codeshareData;
            }

            /**
             * Sets the value of the codeshareData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommercialAgreementsType }
             *     
             */
            public void setCodeshareData(CommercialAgreementsType value) {
                this.codeshareData = value;
            }

            /**
             * Gets the value of the disclosure property.
             * 
             * @return
             *     possible object is
             *     {@link FreeTextInformationType }
             *     
             */
            public FreeTextInformationType getDisclosure() {
                return disclosure;
            }

            /**
             * Sets the value of the disclosure property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextInformationType }
             *     
             */
            public void setDisclosure(FreeTextInformationType value) {
                this.disclosure = value;
            }

            /**
             * Gets the value of the stopDetails property.
             * 
             * @return
             *     possible object is
             *     {@link RoutingInformationTypeI }
             *     
             */
            public RoutingInformationTypeI getStopDetails() {
                return stopDetails;
            }

            /**
             * Sets the value of the stopDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link RoutingInformationTypeI }
             *     
             */
            public void setStopDetails(RoutingInformationTypeI value) {
                this.stopDetails = value;
            }

            /**
             * Gets the value of the trafficRestrictionData property.
             * 
             * @return
             *     possible object is
             *     {@link TrafficRestrictionTypeI }
             *     
             */
            public TrafficRestrictionTypeI getTrafficRestrictionData() {
                return trafficRestrictionData;
            }

            /**
             * Sets the value of the trafficRestrictionData property.
             * 
             * @param value
             *     allowed object is
             *     {@link TrafficRestrictionTypeI }
             *     
             */
            public void setTrafficRestrictionData(TrafficRestrictionTypeI value) {
                this.trafficRestrictionData = value;
            }

            /**
             * Gets the value of the reservationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PassengerItineraryInformationType }
             *     
             */
            public PassengerItineraryInformationType getReservationInfo() {
                return reservationInfo;
            }

            /**
             * Sets the value of the reservationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PassengerItineraryInformationType }
             *     
             */
            public void setReservationInfo(PassengerItineraryInformationType value) {
                this.reservationInfo = value;
            }

            /**
             * Gets the value of the incidentalStopInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the incidentalStopInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIncidentalStopInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareSellByFareCalendar.Itinerary.FlightInfoPNR.IncidentalStopInfo }
             * 
             * 
             */
            public List<FareSellByFareCalendar.Itinerary.FlightInfoPNR.IncidentalStopInfo> getIncidentalStopInfo() {
                if (incidentalStopInfo == null) {
                    incidentalStopInfo = new ArrayList<FareSellByFareCalendar.Itinerary.FlightInfoPNR.IncidentalStopInfo>();
                }
                return this.incidentalStopInfo;
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
             *         &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}DateAndTimeInformationTypeI"/>
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
                "dateTimeInfo"
            })
            public static class IncidentalStopInfo {

                @XmlElement(required = true)
                protected DateAndTimeInformationTypeI dateTimeInfo;

                /**
                 * Gets the value of the dateTimeInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DateAndTimeInformationTypeI }
                 *     
                 */
                public DateAndTimeInformationTypeI getDateTimeInfo() {
                    return dateTimeInfo;
                }

                /**
                 * Sets the value of the dateTimeInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DateAndTimeInformationTypeI }
                 *     
                 */
                public void setDateTimeInfo(DateAndTimeInformationTypeI value) {
                    this.dateTimeInfo = value;
                }

            }

        }

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
     *         &lt;element name="officeIdInformation" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}UserIdentificationType"/>
     *         &lt;element name="nbOfUnits" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}NumberOfUnitsType_80154S" minOccurs="0"/>
     *         &lt;element name="uidOption" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CodedAttributeType" minOccurs="0"/>
     *         &lt;element name="pricingTickInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}PricingTicketingDetailsType" minOccurs="0"/>
     *         &lt;element name="corporateFareInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}CorporateFareInformationType" minOccurs="0"/>
     *         &lt;element name="travelFlightInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelFlightInformationType" minOccurs="0"/>
     *         &lt;element name="airlineDistributionDetails" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}OriginAndDestinationRequestType"/>
     *                   &lt;element name="flightInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelFlightInformationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "officeIdInformation",
        "nbOfUnits",
        "uidOption",
        "pricingTickInfo",
        "corporateFareInfo",
        "travelFlightInfo",
        "airlineDistributionDetails"
    })
    public static class OfficeIdDetails {

        @XmlElement(required = true)
        protected UserIdentificationType officeIdInformation;
        protected NumberOfUnitsType80154S nbOfUnits;
        protected CodedAttributeType uidOption;
        protected PricingTicketingDetailsType pricingTickInfo;
        protected CorporateFareInformationType corporateFareInfo;
        protected TravelFlightInformationType travelFlightInfo;
        protected List<FareSellByFareCalendar.OfficeIdDetails.AirlineDistributionDetails> airlineDistributionDetails;

        /**
         * Gets the value of the officeIdInformation property.
         * 
         * @return
         *     possible object is
         *     {@link UserIdentificationType }
         *     
         */
        public UserIdentificationType getOfficeIdInformation() {
            return officeIdInformation;
        }

        /**
         * Sets the value of the officeIdInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIdentificationType }
         *     
         */
        public void setOfficeIdInformation(UserIdentificationType value) {
            this.officeIdInformation = value;
        }

        /**
         * Gets the value of the nbOfUnits property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType80154S }
         *     
         */
        public NumberOfUnitsType80154S getNbOfUnits() {
            return nbOfUnits;
        }

        /**
         * Sets the value of the nbOfUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType80154S }
         *     
         */
        public void setNbOfUnits(NumberOfUnitsType80154S value) {
            this.nbOfUnits = value;
        }

        /**
         * Gets the value of the uidOption property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType }
         *     
         */
        public CodedAttributeType getUidOption() {
            return uidOption;
        }

        /**
         * Sets the value of the uidOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType }
         *     
         */
        public void setUidOption(CodedAttributeType value) {
            this.uidOption = value;
        }

        /**
         * Gets the value of the pricingTickInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public PricingTicketingDetailsType getPricingTickInfo() {
            return pricingTickInfo;
        }

        /**
         * Sets the value of the pricingTickInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public void setPricingTickInfo(PricingTicketingDetailsType value) {
            this.pricingTickInfo = value;
        }

        /**
         * Gets the value of the corporateFareInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateFareInformationType }
         *     
         */
        public CorporateFareInformationType getCorporateFareInfo() {
            return corporateFareInfo;
        }

        /**
         * Sets the value of the corporateFareInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateFareInformationType }
         *     
         */
        public void setCorporateFareInfo(CorporateFareInformationType value) {
            this.corporateFareInfo = value;
        }

        /**
         * Gets the value of the travelFlightInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TravelFlightInformationType }
         *     
         */
        public TravelFlightInformationType getTravelFlightInfo() {
            return travelFlightInfo;
        }

        /**
         * Sets the value of the travelFlightInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelFlightInformationType }
         *     
         */
        public void setTravelFlightInfo(TravelFlightInformationType value) {
            this.travelFlightInfo = value;
        }

        /**
         * Gets the value of the airlineDistributionDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlineDistributionDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlineDistributionDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendar.OfficeIdDetails.AirlineDistributionDetails }
         * 
         * 
         */
        public List<FareSellByFareCalendar.OfficeIdDetails.AirlineDistributionDetails> getAirlineDistributionDetails() {
            if (airlineDistributionDetails == null) {
                airlineDistributionDetails = new ArrayList<FareSellByFareCalendar.OfficeIdDetails.AirlineDistributionDetails>();
            }
            return this.airlineDistributionDetails;
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
         *         &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}OriginAndDestinationRequestType"/>
         *         &lt;element name="flightInfo" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TravelFlightInformationType" minOccurs="0"/>
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
            "requestedSegmentRef",
            "flightInfo"
        })
        public static class AirlineDistributionDetails {

            @XmlElement(required = true)
            protected OriginAndDestinationRequestType requestedSegmentRef;
            protected TravelFlightInformationType flightInfo;

            /**
             * Gets the value of the requestedSegmentRef property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public OriginAndDestinationRequestType getRequestedSegmentRef() {
                return requestedSegmentRef;
            }

            /**
             * Sets the value of the requestedSegmentRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public void setRequestedSegmentRef(OriginAndDestinationRequestType value) {
                this.requestedSegmentRef = value;
            }

            /**
             * Gets the value of the flightInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TravelFlightInformationType }
             *     
             */
            public TravelFlightInformationType getFlightInfo() {
                return flightInfo;
            }

            /**
             * Sets the value of the flightInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelFlightInformationType }
             *     
             */
            public void setFlightInfo(TravelFlightInformationType value) {
                this.flightInfo = value;
            }

        }

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
     *         &lt;element name="ticketNumberDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TicketNumberTypeI"/>
     *         &lt;element name="ticketRequestedSegments" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="actionIdentification" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ActionIdentificationType"/>
     *                   &lt;element name="connectPointDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ConnectionTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "ticketNumberDetails",
        "ticketRequestedSegments"
    })
    public static class TicketChangeInfo {

        @XmlElement(required = true)
        protected TicketNumberTypeI ticketNumberDetails;
        protected List<FareSellByFareCalendar.TicketChangeInfo.TicketRequestedSegments> ticketRequestedSegments;

        /**
         * Gets the value of the ticketNumberDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public TicketNumberTypeI getTicketNumberDetails() {
            return ticketNumberDetails;
        }

        /**
         * Sets the value of the ticketNumberDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberTypeI }
         *     
         */
        public void setTicketNumberDetails(TicketNumberTypeI value) {
            this.ticketNumberDetails = value;
        }

        /**
         * Gets the value of the ticketRequestedSegments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketRequestedSegments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketRequestedSegments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendar.TicketChangeInfo.TicketRequestedSegments }
         * 
         * 
         */
        public List<FareSellByFareCalendar.TicketChangeInfo.TicketRequestedSegments> getTicketRequestedSegments() {
            if (ticketRequestedSegments == null) {
                ticketRequestedSegments = new ArrayList<FareSellByFareCalendar.TicketChangeInfo.TicketRequestedSegments>();
            }
            return this.ticketRequestedSegments;
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
         *         &lt;element name="actionIdentification" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ActionIdentificationType"/>
         *         &lt;element name="connectPointDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}ConnectionTypeI" minOccurs="0"/>
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
            "actionIdentification",
            "connectPointDetails"
        })
        public static class TicketRequestedSegments {

            @XmlElement(required = true)
            protected ActionIdentificationType actionIdentification;
            protected ConnectionTypeI connectPointDetails;

            /**
             * Gets the value of the actionIdentification property.
             * 
             * @return
             *     possible object is
             *     {@link ActionIdentificationType }
             *     
             */
            public ActionIdentificationType getActionIdentification() {
                return actionIdentification;
            }

            /**
             * Sets the value of the actionIdentification property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionIdentificationType }
             *     
             */
            public void setActionIdentification(ActionIdentificationType value) {
                this.actionIdentification = value;
            }

            /**
             * Gets the value of the connectPointDetails property.
             * 
             * @return
             *     possible object is
             *     {@link ConnectionTypeI }
             *     
             */
            public ConnectionTypeI getConnectPointDetails() {
                return connectPointDetails;
            }

            /**
             * Sets the value of the connectPointDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConnectionTypeI }
             *     
             */
            public void setConnectPointDetails(ConnectionTypeI value) {
                this.connectPointDetails = value;
            }

        }

    }

}
