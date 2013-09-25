
package com.amadeus.xml.fsocar_10_2_1a;

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
 *         &lt;element name="replyStatus" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}StatusType" minOccurs="0"/>
 *         &lt;element name="errorMessage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="applicationError" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ApplicationErrorInformationType_78543S"/>
 *                   &lt;element name="errorMessageText" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType_78544S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ConversionRateTypeI" minOccurs="0"/>
 *         &lt;element name="familyInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareFamilyType" maxOccurs="200" minOccurs="0"/>
 *         &lt;element name="feeDetails" maxOccurs="2099" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="feeReference" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemReferencesAndVersionsType_78564S"/>
 *                   &lt;element name="feeInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
 *                   &lt;element name="feeParameters" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AttributeType_78561S" minOccurs="0"/>
 *                   &lt;element name="convertedOrOriginalInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ConversionRateTypeI_78562S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="companyIdText" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}CompanyIdentificationTextType" maxOccurs="5000" minOccurs="0"/>
 *         &lt;element name="officeIdDetails" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="officeIdInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}UserIdentificationType"/>
 *                   &lt;element name="officeIdReference" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemReferencesAndVersionsType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="flightIndex" maxOccurs="6" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType"/>
 *                   &lt;element name="groupOfFlights" maxOccurs="2000">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ProposedSegmentType"/>
 *                             &lt;element name="flightDetails" maxOccurs="4">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="flightInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TravelProductType"/>
 *                                       &lt;element name="technicalStop" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
 *                                       &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}CommercialAgreementsType" minOccurs="0"/>
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
 *         &lt;element name="recommendation" maxOccurs="2000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemNumber" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType_82401S"/>
 *                   &lt;element name="warningMessage" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType_78544S" maxOccurs="4" minOccurs="0"/>
 *                   &lt;element name="fareFamilyRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80160S" minOccurs="0"/>
 *                   &lt;element name="recPriceInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType"/>
 *                   &lt;element name="miniRule" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MiniRulesType" maxOccurs="9" minOccurs="0"/>
 *                   &lt;element name="segmentFlightRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_78556S" maxOccurs="2009" minOccurs="0"/>
 *                   &lt;element name="recommandationSegmentsFareDetails" maxOccurs="6" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="recommendationSegRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType"/>
 *                             &lt;element name="segmentMonetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_80712S" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="paxFareProduct" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="paxFareDetail" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}PricingTicketingSubsequentType_81187S"/>
 *                             &lt;element name="feeRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_78556S" minOccurs="0"/>
 *                             &lt;element name="paxReference" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TravellerReferenceInformationType" maxOccurs="6"/>
 *                             &lt;element name="passengerTaxDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TaxDetailsType_70623S" minOccurs="0"/>
 *                             &lt;element name="fare" maxOccurs="7" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="pricingMessage" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType_78559S"/>
 *                                       &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_81184S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fareDetails" maxOccurs="6">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="segmentRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType"/>
 *                                       &lt;element name="groupOfFares" maxOccurs="4">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="productInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType_78558S"/>
 *                                                 &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareCalculationCodeDetailsType" minOccurs="0"/>
 *                                                 &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareQualifierDetailsType" minOccurs="0"/>
 *                                                 &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="psgSegMonetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_80712S" minOccurs="0"/>
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
 *                   &lt;element name="specificRecDetails" maxOccurs="2000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="specificRecItem" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemReferencesAndVersionsType"/>
 *                             &lt;element name="specificProductDetails" maxOccurs="10" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="productReferences" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}PricingTicketingSubsequentType"/>
 *                                       &lt;element name="fareContextDetails" maxOccurs="6" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType_78552S"/>
 *                                                 &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *         &lt;element name="warningInfo" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="globalMessageMarker" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DummySegmentTypeI"/>
 *                   &lt;element name="globalMessage" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="globalInformation" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attributes" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}CodedAttributeType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serviceFeesGrp" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceTypeInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SelectionDetailsType"/>
 *                   &lt;element name="serviceFeeRefGrp" maxOccurs="2000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="serviceCoverageInfoGrp" maxOccurs="2000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType_81188S"/>
 *                             &lt;element name="serviceCovInfoGrp" maxOccurs="200" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificTravellerType"/>
 *                                       &lt;element name="coveragePerFlightsInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ActionDetailsType" maxOccurs="6" minOccurs="0"/>
 *                                       &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S" minOccurs="0"/>
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
 *                   &lt;element name="globalMessageMarker" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DummySegmentTypeI"/>
 *                   &lt;element name="serviceFeeInfoGrp" maxOccurs="2000" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType_81191S"/>
 *                             &lt;element name="serviceDetailsGrp" maxOccurs="200" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S"/>
 *                                       &lt;element name="serviceMatchedInfoGroup" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificTravellerType"/>
 *                                                 &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareInformationType" minOccurs="0"/>
 *                                                 &lt;element name="amountInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                   &lt;element name="serviceDetailsGrp" maxOccurs="200" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="serviceOptionInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificDataInformationType"/>
 *                             &lt;element name="feeDescriptionGrp" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType"/>
 *                                       &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AttributeType" minOccurs="0"/>
 *                                       &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
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
    "replyStatus",
    "errorMessage",
    "conversionRate",
    "familyInformation",
    "feeDetails",
    "companyIdText",
    "officeIdDetails",
    "flightIndex",
    "recommendation",
    "warningInfo",
    "globalInformation",
    "serviceFeesGrp"
})
@XmlRootElement(name = "Fare_SellByFareCalendarReply")
public class FareSellByFareCalendarReply {

    protected StatusType replyStatus;
    protected FareSellByFareCalendarReply.ErrorMessage errorMessage;
    protected ConversionRateTypeI conversionRate;
    protected List<FareFamilyType> familyInformation;
    protected List<FareSellByFareCalendarReply.FeeDetails> feeDetails;
    protected List<CompanyIdentificationTextType> companyIdText;
    protected List<FareSellByFareCalendarReply.OfficeIdDetails> officeIdDetails;
    protected List<FareSellByFareCalendarReply.FlightIndex> flightIndex;
    protected List<FareSellByFareCalendarReply.Recommendation> recommendation;
    protected List<FareSellByFareCalendarReply.WarningInfo> warningInfo;
    protected List<FareSellByFareCalendarReply.GlobalInformation> globalInformation;
    protected List<FareSellByFareCalendarReply.ServiceFeesGrp> serviceFeesGrp;

    /**
     * Gets the value of the replyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getReplyStatus() {
        return replyStatus;
    }

    /**
     * Sets the value of the replyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setReplyStatus(StatusType value) {
        this.replyStatus = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link FareSellByFareCalendarReply.ErrorMessage }
     *     
     */
    public FareSellByFareCalendarReply.ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareSellByFareCalendarReply.ErrorMessage }
     *     
     */
    public void setErrorMessage(FareSellByFareCalendarReply.ErrorMessage value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateTypeI }
     *     
     */
    public ConversionRateTypeI getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateTypeI }
     *     
     */
    public void setConversionRate(ConversionRateTypeI value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the familyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the familyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFamilyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareFamilyType }
     * 
     * 
     */
    public List<FareFamilyType> getFamilyInformation() {
        if (familyInformation == null) {
            familyInformation = new ArrayList<FareFamilyType>();
        }
        return this.familyInformation;
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
     * {@link FareSellByFareCalendarReply.FeeDetails }
     * 
     * 
     */
    public List<FareSellByFareCalendarReply.FeeDetails> getFeeDetails() {
        if (feeDetails == null) {
            feeDetails = new ArrayList<FareSellByFareCalendarReply.FeeDetails>();
        }
        return this.feeDetails;
    }

    /**
     * Gets the value of the companyIdText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyIdText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyIdText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyIdentificationTextType }
     * 
     * 
     */
    public List<CompanyIdentificationTextType> getCompanyIdText() {
        if (companyIdText == null) {
            companyIdText = new ArrayList<CompanyIdentificationTextType>();
        }
        return this.companyIdText;
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
     * {@link FareSellByFareCalendarReply.OfficeIdDetails }
     * 
     * 
     */
    public List<FareSellByFareCalendarReply.OfficeIdDetails> getOfficeIdDetails() {
        if (officeIdDetails == null) {
            officeIdDetails = new ArrayList<FareSellByFareCalendarReply.OfficeIdDetails>();
        }
        return this.officeIdDetails;
    }

    /**
     * Gets the value of the flightIndex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightIndex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightIndex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendarReply.FlightIndex }
     * 
     * 
     */
    public List<FareSellByFareCalendarReply.FlightIndex> getFlightIndex() {
        if (flightIndex == null) {
            flightIndex = new ArrayList<FareSellByFareCalendarReply.FlightIndex>();
        }
        return this.flightIndex;
    }

    /**
     * Gets the value of the recommendation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recommendation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecommendation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendarReply.Recommendation }
     * 
     * 
     */
    public List<FareSellByFareCalendarReply.Recommendation> getRecommendation() {
        if (recommendation == null) {
            recommendation = new ArrayList<FareSellByFareCalendarReply.Recommendation>();
        }
        return this.recommendation;
    }

    /**
     * Gets the value of the warningInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warningInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarningInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendarReply.WarningInfo }
     * 
     * 
     */
    public List<FareSellByFareCalendarReply.WarningInfo> getWarningInfo() {
        if (warningInfo == null) {
            warningInfo = new ArrayList<FareSellByFareCalendarReply.WarningInfo>();
        }
        return this.warningInfo;
    }

    /**
     * Gets the value of the globalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the globalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGlobalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendarReply.GlobalInformation }
     * 
     * 
     */
    public List<FareSellByFareCalendarReply.GlobalInformation> getGlobalInformation() {
        if (globalInformation == null) {
            globalInformation = new ArrayList<FareSellByFareCalendarReply.GlobalInformation>();
        }
        return this.globalInformation;
    }

    /**
     * Gets the value of the serviceFeesGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeesGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeesGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareSellByFareCalendarReply.ServiceFeesGrp }
     * 
     * 
     */
    public List<FareSellByFareCalendarReply.ServiceFeesGrp> getServiceFeesGrp() {
        if (serviceFeesGrp == null) {
            serviceFeesGrp = new ArrayList<FareSellByFareCalendarReply.ServiceFeesGrp>();
        }
        return this.serviceFeesGrp;
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
     *         &lt;element name="applicationError" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ApplicationErrorInformationType_78543S"/>
     *         &lt;element name="errorMessageText" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType_78544S" minOccurs="0"/>
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
        "applicationError",
        "errorMessageText"
    })
    public static class ErrorMessage {

        @XmlElement(required = true)
        protected ApplicationErrorInformationType78543S applicationError;
        protected InteractiveFreeTextType78544S errorMessageText;

        /**
         * Gets the value of the applicationError property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformationType78543S }
         *     
         */
        public ApplicationErrorInformationType78543S getApplicationError() {
            return applicationError;
        }

        /**
         * Sets the value of the applicationError property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformationType78543S }
         *     
         */
        public void setApplicationError(ApplicationErrorInformationType78543S value) {
            this.applicationError = value;
        }

        /**
         * Gets the value of the errorMessageText property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextType78544S }
         *     
         */
        public InteractiveFreeTextType78544S getErrorMessageText() {
            return errorMessageText;
        }

        /**
         * Sets the value of the errorMessageText property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextType78544S }
         *     
         */
        public void setErrorMessageText(InteractiveFreeTextType78544S value) {
            this.errorMessageText = value;
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
     *         &lt;element name="feeReference" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemReferencesAndVersionsType_78564S"/>
     *         &lt;element name="feeInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DiscountAndPenaltyInformationType" minOccurs="0"/>
     *         &lt;element name="feeParameters" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AttributeType_78561S" minOccurs="0"/>
     *         &lt;element name="convertedOrOriginalInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ConversionRateTypeI_78562S" minOccurs="0"/>
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
        "feeReference",
        "feeInformation",
        "feeParameters",
        "convertedOrOriginalInfo"
    })
    public static class FeeDetails {

        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType78564S feeReference;
        protected DiscountAndPenaltyInformationType feeInformation;
        protected AttributeType78561S feeParameters;
        protected ConversionRateTypeI78562S convertedOrOriginalInfo;

        /**
         * Gets the value of the feeReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType78564S }
         *     
         */
        public ItemReferencesAndVersionsType78564S getFeeReference() {
            return feeReference;
        }

        /**
         * Sets the value of the feeReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType78564S }
         *     
         */
        public void setFeeReference(ItemReferencesAndVersionsType78564S value) {
            this.feeReference = value;
        }

        /**
         * Gets the value of the feeInformation property.
         * 
         * @return
         *     possible object is
         *     {@link DiscountAndPenaltyInformationType }
         *     
         */
        public DiscountAndPenaltyInformationType getFeeInformation() {
            return feeInformation;
        }

        /**
         * Sets the value of the feeInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiscountAndPenaltyInformationType }
         *     
         */
        public void setFeeInformation(DiscountAndPenaltyInformationType value) {
            this.feeInformation = value;
        }

        /**
         * Gets the value of the feeParameters property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeType78561S }
         *     
         */
        public AttributeType78561S getFeeParameters() {
            return feeParameters;
        }

        /**
         * Sets the value of the feeParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeType78561S }
         *     
         */
        public void setFeeParameters(AttributeType78561S value) {
            this.feeParameters = value;
        }

        /**
         * Gets the value of the convertedOrOriginalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ConversionRateTypeI78562S }
         *     
         */
        public ConversionRateTypeI78562S getConvertedOrOriginalInfo() {
            return convertedOrOriginalInfo;
        }

        /**
         * Sets the value of the convertedOrOriginalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConversionRateTypeI78562S }
         *     
         */
        public void setConvertedOrOriginalInfo(ConversionRateTypeI78562S value) {
            this.convertedOrOriginalInfo = value;
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
     *         &lt;element name="requestedSegmentRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType"/>
     *         &lt;element name="groupOfFlights" maxOccurs="2000">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ProposedSegmentType"/>
     *                   &lt;element name="flightDetails" maxOccurs="4">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="flightInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TravelProductType"/>
     *                             &lt;element name="technicalStop" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
     *                             &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}CommercialAgreementsType" minOccurs="0"/>
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
        "requestedSegmentRef",
        "groupOfFlights"
    })
    public static class FlightIndex {

        @XmlElement(required = true)
        protected OriginAndDestinationRequestType requestedSegmentRef;
        @XmlElement(required = true)
        protected List<FareSellByFareCalendarReply.FlightIndex.GroupOfFlights> groupOfFlights;

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
         * Gets the value of the groupOfFlights property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the groupOfFlights property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroupOfFlights().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendarReply.FlightIndex.GroupOfFlights }
         * 
         * 
         */
        public List<FareSellByFareCalendarReply.FlightIndex.GroupOfFlights> getGroupOfFlights() {
            if (groupOfFlights == null) {
                groupOfFlights = new ArrayList<FareSellByFareCalendarReply.FlightIndex.GroupOfFlights>();
            }
            return this.groupOfFlights;
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
         *         &lt;element name="propFlightGrDetail" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ProposedSegmentType"/>
         *         &lt;element name="flightDetails" maxOccurs="4">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="flightInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TravelProductType"/>
         *                   &lt;element name="technicalStop" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
         *                   &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}CommercialAgreementsType" minOccurs="0"/>
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
            "propFlightGrDetail",
            "flightDetails"
        })
        public static class GroupOfFlights {

            @XmlElement(required = true)
            protected ProposedSegmentType propFlightGrDetail;
            @XmlElement(required = true)
            protected List<FareSellByFareCalendarReply.FlightIndex.GroupOfFlights.FlightDetails> flightDetails;

            /**
             * Gets the value of the propFlightGrDetail property.
             * 
             * @return
             *     possible object is
             *     {@link ProposedSegmentType }
             *     
             */
            public ProposedSegmentType getPropFlightGrDetail() {
                return propFlightGrDetail;
            }

            /**
             * Sets the value of the propFlightGrDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProposedSegmentType }
             *     
             */
            public void setPropFlightGrDetail(ProposedSegmentType value) {
                this.propFlightGrDetail = value;
            }

            /**
             * Gets the value of the flightDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareSellByFareCalendarReply.FlightIndex.GroupOfFlights.FlightDetails }
             * 
             * 
             */
            public List<FareSellByFareCalendarReply.FlightIndex.GroupOfFlights.FlightDetails> getFlightDetails() {
                if (flightDetails == null) {
                    flightDetails = new ArrayList<FareSellByFareCalendarReply.FlightIndex.GroupOfFlights.FlightDetails>();
                }
                return this.flightDetails;
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
             *         &lt;element name="flightInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TravelProductType"/>
             *         &lt;element name="technicalStop" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DateAndTimeInformationType" maxOccurs="5" minOccurs="0"/>
             *         &lt;element name="commercialAgreement" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}CommercialAgreementsType" minOccurs="0"/>
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
                "flightInformation",
                "technicalStop",
                "commercialAgreement"
            })
            public static class FlightDetails {

                @XmlElement(required = true)
                protected TravelProductType flightInformation;
                protected List<DateAndTimeInformationType> technicalStop;
                protected CommercialAgreementsType commercialAgreement;

                /**
                 * Gets the value of the flightInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductType }
                 *     
                 */
                public TravelProductType getFlightInformation() {
                    return flightInformation;
                }

                /**
                 * Sets the value of the flightInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductType }
                 *     
                 */
                public void setFlightInformation(TravelProductType value) {
                    this.flightInformation = value;
                }

                /**
                 * Gets the value of the technicalStop property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the technicalStop property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTechnicalStop().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DateAndTimeInformationType }
                 * 
                 * 
                 */
                public List<DateAndTimeInformationType> getTechnicalStop() {
                    if (technicalStop == null) {
                        technicalStop = new ArrayList<DateAndTimeInformationType>();
                    }
                    return this.technicalStop;
                }

                /**
                 * Gets the value of the commercialAgreement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommercialAgreementsType }
                 *     
                 */
                public CommercialAgreementsType getCommercialAgreement() {
                    return commercialAgreement;
                }

                /**
                 * Sets the value of the commercialAgreement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommercialAgreementsType }
                 *     
                 */
                public void setCommercialAgreement(CommercialAgreementsType value) {
                    this.commercialAgreement = value;
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
     *         &lt;element name="attributes" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}CodedAttributeType"/>
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
        "attributes"
    })
    public static class GlobalInformation {

        @XmlElement(required = true)
        protected CodedAttributeType attributes;

        /**
         * Gets the value of the attributes property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType }
         *     
         */
        public CodedAttributeType getAttributes() {
            return attributes;
        }

        /**
         * Sets the value of the attributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType }
         *     
         */
        public void setAttributes(CodedAttributeType value) {
            this.attributes = value;
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
     *         &lt;element name="officeIdInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}UserIdentificationType"/>
     *         &lt;element name="officeIdReference" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemReferencesAndVersionsType"/>
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
        "officeIdReference"
    })
    public static class OfficeIdDetails {

        @XmlElement(required = true)
        protected UserIdentificationType officeIdInformation;
        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType officeIdReference;

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
         * Gets the value of the officeIdReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public ItemReferencesAndVersionsType getOfficeIdReference() {
            return officeIdReference;
        }

        /**
         * Sets the value of the officeIdReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType }
         *     
         */
        public void setOfficeIdReference(ItemReferencesAndVersionsType value) {
            this.officeIdReference = value;
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
     *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType_82401S"/>
     *         &lt;element name="warningMessage" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType_78544S" maxOccurs="4" minOccurs="0"/>
     *         &lt;element name="fareFamilyRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80160S" minOccurs="0"/>
     *         &lt;element name="recPriceInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType"/>
     *         &lt;element name="miniRule" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MiniRulesType" maxOccurs="9" minOccurs="0"/>
     *         &lt;element name="segmentFlightRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_78556S" maxOccurs="2009" minOccurs="0"/>
     *         &lt;element name="recommandationSegmentsFareDetails" maxOccurs="6" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="recommendationSegRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType"/>
     *                   &lt;element name="segmentMonetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_80712S" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="paxFareProduct" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="paxFareDetail" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}PricingTicketingSubsequentType_81187S"/>
     *                   &lt;element name="feeRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_78556S" minOccurs="0"/>
     *                   &lt;element name="paxReference" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TravellerReferenceInformationType" maxOccurs="6"/>
     *                   &lt;element name="passengerTaxDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TaxDetailsType_70623S" minOccurs="0"/>
     *                   &lt;element name="fare" maxOccurs="7" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="pricingMessage" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType_78559S"/>
     *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_81184S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fareDetails" maxOccurs="6">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="segmentRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType"/>
     *                             &lt;element name="groupOfFares" maxOccurs="4">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="productInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType_78558S"/>
     *                                       &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareCalculationCodeDetailsType" minOccurs="0"/>
     *                                       &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareQualifierDetailsType" minOccurs="0"/>
     *                                       &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="psgSegMonetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_80712S" minOccurs="0"/>
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
     *         &lt;element name="specificRecDetails" maxOccurs="2000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="specificRecItem" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemReferencesAndVersionsType"/>
     *                   &lt;element name="specificProductDetails" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="productReferences" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}PricingTicketingSubsequentType"/>
     *                             &lt;element name="fareContextDetails" maxOccurs="6" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType_78552S"/>
     *                                       &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
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
        "itemNumber",
        "warningMessage",
        "fareFamilyRef",
        "recPriceInfo",
        "miniRule",
        "segmentFlightRef",
        "recommandationSegmentsFareDetails",
        "paxFareProduct",
        "specificRecDetails"
    })
    public static class Recommendation {

        @XmlElement(required = true)
        protected ItemNumberType82401S itemNumber;
        protected List<InteractiveFreeTextType78544S> warningMessage;
        protected ReferenceInfoType80160S fareFamilyRef;
        @XmlElement(required = true)
        protected MonetaryInformationType recPriceInfo;
        protected List<MiniRulesType> miniRule;
        protected List<ReferenceInfoType78556S> segmentFlightRef;
        protected List<FareSellByFareCalendarReply.Recommendation.RecommandationSegmentsFareDetails> recommandationSegmentsFareDetails;
        @XmlElement(required = true)
        protected List<FareSellByFareCalendarReply.Recommendation.PaxFareProduct> paxFareProduct;
        protected List<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails> specificRecDetails;

        /**
         * Gets the value of the itemNumber property.
         * 
         * @return
         *     possible object is
         *     {@link ItemNumberType82401S }
         *     
         */
        public ItemNumberType82401S getItemNumber() {
            return itemNumber;
        }

        /**
         * Sets the value of the itemNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemNumberType82401S }
         *     
         */
        public void setItemNumber(ItemNumberType82401S value) {
            this.itemNumber = value;
        }

        /**
         * Gets the value of the warningMessage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warningMessage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarningMessage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InteractiveFreeTextType78544S }
         * 
         * 
         */
        public List<InteractiveFreeTextType78544S> getWarningMessage() {
            if (warningMessage == null) {
                warningMessage = new ArrayList<InteractiveFreeTextType78544S>();
            }
            return this.warningMessage;
        }

        /**
         * Gets the value of the fareFamilyRef property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType80160S }
         *     
         */
        public ReferenceInfoType80160S getFareFamilyRef() {
            return fareFamilyRef;
        }

        /**
         * Sets the value of the fareFamilyRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType80160S }
         *     
         */
        public void setFareFamilyRef(ReferenceInfoType80160S value) {
            this.fareFamilyRef = value;
        }

        /**
         * Gets the value of the recPriceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType }
         *     
         */
        public MonetaryInformationType getRecPriceInfo() {
            return recPriceInfo;
        }

        /**
         * Sets the value of the recPriceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType }
         *     
         */
        public void setRecPriceInfo(MonetaryInformationType value) {
            this.recPriceInfo = value;
        }

        /**
         * Gets the value of the miniRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the miniRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMiniRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MiniRulesType }
         * 
         * 
         */
        public List<MiniRulesType> getMiniRule() {
            if (miniRule == null) {
                miniRule = new ArrayList<MiniRulesType>();
            }
            return this.miniRule;
        }

        /**
         * Gets the value of the segmentFlightRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentFlightRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentFlightRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReferenceInfoType78556S }
         * 
         * 
         */
        public List<ReferenceInfoType78556S> getSegmentFlightRef() {
            if (segmentFlightRef == null) {
                segmentFlightRef = new ArrayList<ReferenceInfoType78556S>();
            }
            return this.segmentFlightRef;
        }

        /**
         * Gets the value of the recommandationSegmentsFareDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recommandationSegmentsFareDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecommandationSegmentsFareDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendarReply.Recommendation.RecommandationSegmentsFareDetails }
         * 
         * 
         */
        public List<FareSellByFareCalendarReply.Recommendation.RecommandationSegmentsFareDetails> getRecommandationSegmentsFareDetails() {
            if (recommandationSegmentsFareDetails == null) {
                recommandationSegmentsFareDetails = new ArrayList<FareSellByFareCalendarReply.Recommendation.RecommandationSegmentsFareDetails>();
            }
            return this.recommandationSegmentsFareDetails;
        }

        /**
         * Gets the value of the paxFareProduct property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paxFareProduct property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaxFareProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendarReply.Recommendation.PaxFareProduct }
         * 
         * 
         */
        public List<FareSellByFareCalendarReply.Recommendation.PaxFareProduct> getPaxFareProduct() {
            if (paxFareProduct == null) {
                paxFareProduct = new ArrayList<FareSellByFareCalendarReply.Recommendation.PaxFareProduct>();
            }
            return this.paxFareProduct;
        }

        /**
         * Gets the value of the specificRecDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the specificRecDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSpecificRecDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendarReply.Recommendation.SpecificRecDetails }
         * 
         * 
         */
        public List<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails> getSpecificRecDetails() {
            if (specificRecDetails == null) {
                specificRecDetails = new ArrayList<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails>();
            }
            return this.specificRecDetails;
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
         *         &lt;element name="paxFareDetail" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}PricingTicketingSubsequentType_81187S"/>
         *         &lt;element name="feeRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_78556S" minOccurs="0"/>
         *         &lt;element name="paxReference" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TravellerReferenceInformationType" maxOccurs="6"/>
         *         &lt;element name="passengerTaxDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}TaxDetailsType_70623S" minOccurs="0"/>
         *         &lt;element name="fare" maxOccurs="7" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="pricingMessage" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType_78559S"/>
         *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_81184S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fareDetails" maxOccurs="6">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="segmentRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType"/>
         *                   &lt;element name="groupOfFares" maxOccurs="4">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="productInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType_78558S"/>
         *                             &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareCalculationCodeDetailsType" minOccurs="0"/>
         *                             &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareQualifierDetailsType" minOccurs="0"/>
         *                             &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="psgSegMonetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_80712S" minOccurs="0"/>
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
            "paxFareDetail",
            "feeRef",
            "paxReference",
            "passengerTaxDetails",
            "fare",
            "fareDetails"
        })
        public static class PaxFareProduct {

            @XmlElement(required = true)
            protected PricingTicketingSubsequentType81187S paxFareDetail;
            protected ReferenceInfoType78556S feeRef;
            @XmlElement(required = true)
            protected List<TravellerReferenceInformationType> paxReference;
            protected TaxDetailsType70623S passengerTaxDetails;
            protected List<FareSellByFareCalendarReply.Recommendation.PaxFareProduct.Fare> fare;
            @XmlElement(required = true)
            protected List<FareSellByFareCalendarReply.Recommendation.PaxFareProduct.FareDetails> fareDetails;

            /**
             * Gets the value of the paxFareDetail property.
             * 
             * @return
             *     possible object is
             *     {@link PricingTicketingSubsequentType81187S }
             *     
             */
            public PricingTicketingSubsequentType81187S getPaxFareDetail() {
                return paxFareDetail;
            }

            /**
             * Sets the value of the paxFareDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingTicketingSubsequentType81187S }
             *     
             */
            public void setPaxFareDetail(PricingTicketingSubsequentType81187S value) {
                this.paxFareDetail = value;
            }

            /**
             * Gets the value of the feeRef property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType78556S }
             *     
             */
            public ReferenceInfoType78556S getFeeRef() {
                return feeRef;
            }

            /**
             * Sets the value of the feeRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType78556S }
             *     
             */
            public void setFeeRef(ReferenceInfoType78556S value) {
                this.feeRef = value;
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
             * Gets the value of the passengerTaxDetails property.
             * 
             * @return
             *     possible object is
             *     {@link TaxDetailsType70623S }
             *     
             */
            public TaxDetailsType70623S getPassengerTaxDetails() {
                return passengerTaxDetails;
            }

            /**
             * Sets the value of the passengerTaxDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxDetailsType70623S }
             *     
             */
            public void setPassengerTaxDetails(TaxDetailsType70623S value) {
                this.passengerTaxDetails = value;
            }

            /**
             * Gets the value of the fare property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fare property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFare().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareSellByFareCalendarReply.Recommendation.PaxFareProduct.Fare }
             * 
             * 
             */
            public List<FareSellByFareCalendarReply.Recommendation.PaxFareProduct.Fare> getFare() {
                if (fare == null) {
                    fare = new ArrayList<FareSellByFareCalendarReply.Recommendation.PaxFareProduct.Fare>();
                }
                return this.fare;
            }

            /**
             * Gets the value of the fareDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fareDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFareDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareSellByFareCalendarReply.Recommendation.PaxFareProduct.FareDetails }
             * 
             * 
             */
            public List<FareSellByFareCalendarReply.Recommendation.PaxFareProduct.FareDetails> getFareDetails() {
                if (fareDetails == null) {
                    fareDetails = new ArrayList<FareSellByFareCalendarReply.Recommendation.PaxFareProduct.FareDetails>();
                }
                return this.fareDetails;
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
             *         &lt;element name="pricingMessage" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType_78559S"/>
             *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_81184S" minOccurs="0"/>
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
                "pricingMessage",
                "monetaryInformation"
            })
            public static class Fare {

                @XmlElement(required = true)
                protected InteractiveFreeTextType78559S pricingMessage;
                protected MonetaryInformationType81184S monetaryInformation;

                /**
                 * Gets the value of the pricingMessage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InteractiveFreeTextType78559S }
                 *     
                 */
                public InteractiveFreeTextType78559S getPricingMessage() {
                    return pricingMessage;
                }

                /**
                 * Sets the value of the pricingMessage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InteractiveFreeTextType78559S }
                 *     
                 */
                public void setPricingMessage(InteractiveFreeTextType78559S value) {
                    this.pricingMessage = value;
                }

                /**
                 * Gets the value of the monetaryInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType81184S }
                 *     
                 */
                public MonetaryInformationType81184S getMonetaryInformation() {
                    return monetaryInformation;
                }

                /**
                 * Sets the value of the monetaryInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType81184S }
                 *     
                 */
                public void setMonetaryInformation(MonetaryInformationType81184S value) {
                    this.monetaryInformation = value;
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
             *         &lt;element name="segmentRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType"/>
             *         &lt;element name="groupOfFares" maxOccurs="4">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="productInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType_78558S"/>
             *                   &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareCalculationCodeDetailsType" minOccurs="0"/>
             *                   &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareQualifierDetailsType" minOccurs="0"/>
             *                   &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="psgSegMonetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_80712S" minOccurs="0"/>
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
                "segmentRef",
                "groupOfFares",
                "psgSegMonetaryInformation"
            })
            public static class FareDetails {

                @XmlElement(required = true)
                protected OriginAndDestinationRequestType segmentRef;
                @XmlElement(required = true)
                protected List<FareSellByFareCalendarReply.Recommendation.PaxFareProduct.FareDetails.GroupOfFares> groupOfFares;
                protected MonetaryInformationType80712S psgSegMonetaryInformation;

                /**
                 * Gets the value of the segmentRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginAndDestinationRequestType }
                 *     
                 */
                public OriginAndDestinationRequestType getSegmentRef() {
                    return segmentRef;
                }

                /**
                 * Sets the value of the segmentRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginAndDestinationRequestType }
                 *     
                 */
                public void setSegmentRef(OriginAndDestinationRequestType value) {
                    this.segmentRef = value;
                }

                /**
                 * Gets the value of the groupOfFares property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the groupOfFares property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGroupOfFares().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareSellByFareCalendarReply.Recommendation.PaxFareProduct.FareDetails.GroupOfFares }
                 * 
                 * 
                 */
                public List<FareSellByFareCalendarReply.Recommendation.PaxFareProduct.FareDetails.GroupOfFares> getGroupOfFares() {
                    if (groupOfFares == null) {
                        groupOfFares = new ArrayList<FareSellByFareCalendarReply.Recommendation.PaxFareProduct.FareDetails.GroupOfFares>();
                    }
                    return this.groupOfFares;
                }

                /**
                 * Gets the value of the psgSegMonetaryInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType80712S }
                 *     
                 */
                public MonetaryInformationType80712S getPsgSegMonetaryInformation() {
                    return psgSegMonetaryInformation;
                }

                /**
                 * Sets the value of the psgSegMonetaryInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType80712S }
                 *     
                 */
                public void setPsgSegMonetaryInformation(MonetaryInformationType80712S value) {
                    this.psgSegMonetaryInformation = value;
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
                 *         &lt;element name="productInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType_78558S"/>
                 *         &lt;element name="fareCalculationCodeDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareCalculationCodeDetailsType" minOccurs="0"/>
                 *         &lt;element name="ticketInfos" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareQualifierDetailsType" minOccurs="0"/>
                 *         &lt;element name="fareFamiliesRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType" minOccurs="0"/>
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
                    "productInformation",
                    "fareCalculationCodeDetails",
                    "ticketInfos",
                    "fareFamiliesRef"
                })
                public static class GroupOfFares {

                    @XmlElement(required = true)
                    protected FlightProductInformationType78558S productInformation;
                    protected FareCalculationCodeDetailsType fareCalculationCodeDetails;
                    protected FareQualifierDetailsType ticketInfos;
                    protected ReferenceInfoType fareFamiliesRef;

                    /**
                     * Gets the value of the productInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FlightProductInformationType78558S }
                     *     
                     */
                    public FlightProductInformationType78558S getProductInformation() {
                        return productInformation;
                    }

                    /**
                     * Sets the value of the productInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FlightProductInformationType78558S }
                     *     
                     */
                    public void setProductInformation(FlightProductInformationType78558S value) {
                        this.productInformation = value;
                    }

                    /**
                     * Gets the value of the fareCalculationCodeDetails property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareCalculationCodeDetailsType }
                     *     
                     */
                    public FareCalculationCodeDetailsType getFareCalculationCodeDetails() {
                        return fareCalculationCodeDetails;
                    }

                    /**
                     * Sets the value of the fareCalculationCodeDetails property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareCalculationCodeDetailsType }
                     *     
                     */
                    public void setFareCalculationCodeDetails(FareCalculationCodeDetailsType value) {
                        this.fareCalculationCodeDetails = value;
                    }

                    /**
                     * Gets the value of the ticketInfos property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareQualifierDetailsType }
                     *     
                     */
                    public FareQualifierDetailsType getTicketInfos() {
                        return ticketInfos;
                    }

                    /**
                     * Sets the value of the ticketInfos property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareQualifierDetailsType }
                     *     
                     */
                    public void setTicketInfos(FareQualifierDetailsType value) {
                        this.ticketInfos = value;
                    }

                    /**
                     * Gets the value of the fareFamiliesRef property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ReferenceInfoType }
                     *     
                     */
                    public ReferenceInfoType getFareFamiliesRef() {
                        return fareFamiliesRef;
                    }

                    /**
                     * Sets the value of the fareFamiliesRef property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ReferenceInfoType }
                     *     
                     */
                    public void setFareFamiliesRef(ReferenceInfoType value) {
                        this.fareFamiliesRef = value;
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
         *         &lt;element name="recommendationSegRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType"/>
         *         &lt;element name="segmentMonetaryInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType_80712S" minOccurs="0"/>
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
            "recommendationSegRef",
            "segmentMonetaryInformation"
        })
        public static class RecommandationSegmentsFareDetails {

            @XmlElement(required = true)
            protected OriginAndDestinationRequestType recommendationSegRef;
            protected MonetaryInformationType80712S segmentMonetaryInformation;

            /**
             * Gets the value of the recommendationSegRef property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public OriginAndDestinationRequestType getRecommendationSegRef() {
                return recommendationSegRef;
            }

            /**
             * Sets the value of the recommendationSegRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationRequestType }
             *     
             */
            public void setRecommendationSegRef(OriginAndDestinationRequestType value) {
                this.recommendationSegRef = value;
            }

            /**
             * Gets the value of the segmentMonetaryInformation property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationType80712S }
             *     
             */
            public MonetaryInformationType80712S getSegmentMonetaryInformation() {
                return segmentMonetaryInformation;
            }

            /**
             * Sets the value of the segmentMonetaryInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationType80712S }
             *     
             */
            public void setSegmentMonetaryInformation(MonetaryInformationType80712S value) {
                this.segmentMonetaryInformation = value;
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
         *         &lt;element name="specificRecItem" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemReferencesAndVersionsType"/>
         *         &lt;element name="specificProductDetails" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="productReferences" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}PricingTicketingSubsequentType"/>
         *                   &lt;element name="fareContextDetails" maxOccurs="6" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType_78552S"/>
         *                             &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType"/>
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
            "specificRecItem",
            "specificProductDetails"
        })
        public static class SpecificRecDetails {

            @XmlElement(required = true)
            protected ItemReferencesAndVersionsType specificRecItem;
            protected List<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails> specificProductDetails;

            /**
             * Gets the value of the specificRecItem property.
             * 
             * @return
             *     possible object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public ItemReferencesAndVersionsType getSpecificRecItem() {
                return specificRecItem;
            }

            /**
             * Sets the value of the specificRecItem property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public void setSpecificRecItem(ItemReferencesAndVersionsType value) {
                this.specificRecItem = value;
            }

            /**
             * Gets the value of the specificProductDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the specificProductDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSpecificProductDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails }
             * 
             * 
             */
            public List<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails> getSpecificProductDetails() {
                if (specificProductDetails == null) {
                    specificProductDetails = new ArrayList<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails>();
                }
                return this.specificProductDetails;
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
             *         &lt;element name="productReferences" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}PricingTicketingSubsequentType"/>
             *         &lt;element name="fareContextDetails" maxOccurs="6" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType_78552S"/>
             *                   &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType"/>
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
                "productReferences",
                "fareContextDetails"
            })
            public static class SpecificProductDetails {

                @XmlElement(required = true)
                protected PricingTicketingSubsequentType productReferences;
                protected List<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails> fareContextDetails;

                /**
                 * Gets the value of the productReferences property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PricingTicketingSubsequentType }
                 *     
                 */
                public PricingTicketingSubsequentType getProductReferences() {
                    return productReferences;
                }

                /**
                 * Sets the value of the productReferences property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PricingTicketingSubsequentType }
                 *     
                 */
                public void setProductReferences(PricingTicketingSubsequentType value) {
                    this.productReferences = value;
                }

                /**
                 * Gets the value of the fareContextDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fareContextDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFareContextDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails }
                 * 
                 * 
                 */
                public List<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails> getFareContextDetails() {
                    if (fareContextDetails == null) {
                        fareContextDetails = new ArrayList<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails>();
                    }
                    return this.fareContextDetails;
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
                 *         &lt;element name="requestedSegmentInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}OriginAndDestinationRequestType_78552S"/>
                 *         &lt;element name="cnxContextDetails" maxOccurs="4" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType"/>
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
                    "requestedSegmentInfo",
                    "cnxContextDetails"
                })
                public static class FareContextDetails {

                    @XmlElement(required = true)
                    protected OriginAndDestinationRequestType78552S requestedSegmentInfo;
                    protected List<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails.CnxContextDetails> cnxContextDetails;

                    /**
                     * Gets the value of the requestedSegmentInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OriginAndDestinationRequestType78552S }
                     *     
                     */
                    public OriginAndDestinationRequestType78552S getRequestedSegmentInfo() {
                        return requestedSegmentInfo;
                    }

                    /**
                     * Sets the value of the requestedSegmentInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OriginAndDestinationRequestType78552S }
                     *     
                     */
                    public void setRequestedSegmentInfo(OriginAndDestinationRequestType78552S value) {
                        this.requestedSegmentInfo = value;
                    }

                    /**
                     * Gets the value of the cnxContextDetails property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the cnxContextDetails property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCnxContextDetails().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails.CnxContextDetails }
                     * 
                     * 
                     */
                    public List<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails.CnxContextDetails> getCnxContextDetails() {
                        if (cnxContextDetails == null) {
                            cnxContextDetails = new ArrayList<FareSellByFareCalendarReply.Recommendation.SpecificRecDetails.SpecificProductDetails.FareContextDetails.CnxContextDetails>();
                        }
                        return this.cnxContextDetails;
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
                     *         &lt;element name="fareCnxInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FlightProductInformationType"/>
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
                        "fareCnxInfo"
                    })
                    public static class CnxContextDetails {

                        @XmlElement(required = true)
                        protected FlightProductInformationType fareCnxInfo;

                        /**
                         * Gets the value of the fareCnxInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FlightProductInformationType }
                         *     
                         */
                        public FlightProductInformationType getFareCnxInfo() {
                            return fareCnxInfo;
                        }

                        /**
                         * Sets the value of the fareCnxInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FlightProductInformationType }
                         *     
                         */
                        public void setFareCnxInfo(FlightProductInformationType value) {
                            this.fareCnxInfo = value;
                        }

                    }

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
     *         &lt;element name="serviceTypeInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SelectionDetailsType"/>
     *         &lt;element name="serviceFeeRefGrp" maxOccurs="2000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="serviceCoverageInfoGrp" maxOccurs="2000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType_81188S"/>
     *                   &lt;element name="serviceCovInfoGrp" maxOccurs="200" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificTravellerType"/>
     *                             &lt;element name="coveragePerFlightsInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ActionDetailsType" maxOccurs="6" minOccurs="0"/>
     *                             &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S" minOccurs="0"/>
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
     *         &lt;element name="globalMessageMarker" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DummySegmentTypeI"/>
     *         &lt;element name="serviceFeeInfoGrp" maxOccurs="2000" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType_81191S"/>
     *                   &lt;element name="serviceDetailsGrp" maxOccurs="200" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S"/>
     *                             &lt;element name="serviceMatchedInfoGroup" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificTravellerType"/>
     *                                       &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareInformationType" minOccurs="0"/>
     *                                       &lt;element name="amountInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType" minOccurs="0"/>
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
     *         &lt;element name="serviceDetailsGrp" maxOccurs="200" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="serviceOptionInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificDataInformationType"/>
     *                   &lt;element name="feeDescriptionGrp" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType"/>
     *                             &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AttributeType" minOccurs="0"/>
     *                             &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
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
        "serviceTypeInfo",
        "serviceFeeRefGrp",
        "serviceCoverageInfoGrp",
        "globalMessageMarker",
        "serviceFeeInfoGrp",
        "serviceDetailsGrp"
    })
    public static class ServiceFeesGrp {

        @XmlElement(required = true)
        protected SelectionDetailsType serviceTypeInfo;
        protected List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeRefGrp> serviceFeeRefGrp;
        protected List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceCoverageInfoGrp> serviceCoverageInfoGrp;
        @XmlElement(required = true)
        protected DummySegmentTypeI globalMessageMarker;
        protected List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp> serviceFeeInfoGrp;
        protected List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceDetailsGrp> serviceDetailsGrp;

        /**
         * Gets the value of the serviceTypeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link SelectionDetailsType }
         *     
         */
        public SelectionDetailsType getServiceTypeInfo() {
            return serviceTypeInfo;
        }

        /**
         * Sets the value of the serviceTypeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectionDetailsType }
         *     
         */
        public void setServiceTypeInfo(SelectionDetailsType value) {
            this.serviceTypeInfo = value;
        }

        /**
         * Gets the value of the serviceFeeRefGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFeeRefGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFeeRefGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeRefGrp }
         * 
         * 
         */
        public List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeRefGrp> getServiceFeeRefGrp() {
            if (serviceFeeRefGrp == null) {
                serviceFeeRefGrp = new ArrayList<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeRefGrp>();
            }
            return this.serviceFeeRefGrp;
        }

        /**
         * Gets the value of the serviceCoverageInfoGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceCoverageInfoGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceCoverageInfoGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendarReply.ServiceFeesGrp.ServiceCoverageInfoGrp }
         * 
         * 
         */
        public List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceCoverageInfoGrp> getServiceCoverageInfoGrp() {
            if (serviceCoverageInfoGrp == null) {
                serviceCoverageInfoGrp = new ArrayList<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceCoverageInfoGrp>();
            }
            return this.serviceCoverageInfoGrp;
        }

        /**
         * Gets the value of the globalMessageMarker property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getGlobalMessageMarker() {
            return globalMessageMarker;
        }

        /**
         * Sets the value of the globalMessageMarker property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setGlobalMessageMarker(DummySegmentTypeI value) {
            this.globalMessageMarker = value;
        }

        /**
         * Gets the value of the serviceFeeInfoGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFeeInfoGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFeeInfoGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp }
         * 
         * 
         */
        public List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp> getServiceFeeInfoGrp() {
            if (serviceFeeInfoGrp == null) {
                serviceFeeInfoGrp = new ArrayList<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp>();
            }
            return this.serviceFeeInfoGrp;
        }

        /**
         * Gets the value of the serviceDetailsGrp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceDetailsGrp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceDetailsGrp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareSellByFareCalendarReply.ServiceFeesGrp.ServiceDetailsGrp }
         * 
         * 
         */
        public List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceDetailsGrp> getServiceDetailsGrp() {
            if (serviceDetailsGrp == null) {
                serviceDetailsGrp = new ArrayList<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceDetailsGrp>();
            }
            return this.serviceDetailsGrp;
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
         *         &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType_81188S"/>
         *         &lt;element name="serviceCovInfoGrp" maxOccurs="200" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificTravellerType"/>
         *                   &lt;element name="coveragePerFlightsInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ActionDetailsType" maxOccurs="6" minOccurs="0"/>
         *                   &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S" minOccurs="0"/>
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
            "itemNumberInfo",
            "serviceCovInfoGrp"
        })
        public static class ServiceCoverageInfoGrp {

            @XmlElement(required = true)
            protected ItemNumberType81188S itemNumberInfo;
            protected List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp> serviceCovInfoGrp;

            /**
             * Gets the value of the itemNumberInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ItemNumberType81188S }
             *     
             */
            public ItemNumberType81188S getItemNumberInfo() {
                return itemNumberInfo;
            }

            /**
             * Sets the value of the itemNumberInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemNumberType81188S }
             *     
             */
            public void setItemNumberInfo(ItemNumberType81188S value) {
                this.itemNumberInfo = value;
            }

            /**
             * Gets the value of the serviceCovInfoGrp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceCovInfoGrp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceCovInfoGrp().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareSellByFareCalendarReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp }
             * 
             * 
             */
            public List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp> getServiceCovInfoGrp() {
                if (serviceCovInfoGrp == null) {
                    serviceCovInfoGrp = new ArrayList<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp>();
                }
                return this.serviceCovInfoGrp;
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
             *         &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificTravellerType"/>
             *         &lt;element name="coveragePerFlightsInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ActionDetailsType" maxOccurs="6" minOccurs="0"/>
             *         &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S" minOccurs="0"/>
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
                "paxRefInfo",
                "coveragePerFlightsInfo",
                "refInfo"
            })
            public static class ServiceCovInfoGrp {

                @XmlElement(required = true)
                protected SpecificTravellerType paxRefInfo;
                protected List<ActionDetailsType> coveragePerFlightsInfo;
                protected ReferenceInfoType80865S refInfo;

                /**
                 * Gets the value of the paxRefInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecificTravellerType }
                 *     
                 */
                public SpecificTravellerType getPaxRefInfo() {
                    return paxRefInfo;
                }

                /**
                 * Sets the value of the paxRefInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecificTravellerType }
                 *     
                 */
                public void setPaxRefInfo(SpecificTravellerType value) {
                    this.paxRefInfo = value;
                }

                /**
                 * Gets the value of the coveragePerFlightsInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the coveragePerFlightsInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCoveragePerFlightsInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ActionDetailsType }
                 * 
                 * 
                 */
                public List<ActionDetailsType> getCoveragePerFlightsInfo() {
                    if (coveragePerFlightsInfo == null) {
                        coveragePerFlightsInfo = new ArrayList<ActionDetailsType>();
                    }
                    return this.coveragePerFlightsInfo;
                }

                /**
                 * Gets the value of the refInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType80865S }
                 *     
                 */
                public ReferenceInfoType80865S getRefInfo() {
                    return refInfo;
                }

                /**
                 * Sets the value of the refInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType80865S }
                 *     
                 */
                public void setRefInfo(ReferenceInfoType80865S value) {
                    this.refInfo = value;
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
         *         &lt;element name="serviceOptionInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificDataInformationType"/>
         *         &lt;element name="feeDescriptionGrp" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType"/>
         *                   &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AttributeType" minOccurs="0"/>
         *                   &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
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
            "serviceOptionInfo",
            "feeDescriptionGrp"
        })
        public static class ServiceDetailsGrp {

            @XmlElement(required = true)
            protected SpecificDataInformationType serviceOptionInfo;
            protected FareSellByFareCalendarReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp feeDescriptionGrp;

            /**
             * Gets the value of the serviceOptionInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public SpecificDataInformationType getServiceOptionInfo() {
                return serviceOptionInfo;
            }

            /**
             * Sets the value of the serviceOptionInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecificDataInformationType }
             *     
             */
            public void setServiceOptionInfo(SpecificDataInformationType value) {
                this.serviceOptionInfo = value;
            }

            /**
             * Gets the value of the feeDescriptionGrp property.
             * 
             * @return
             *     possible object is
             *     {@link FareSellByFareCalendarReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp }
             *     
             */
            public FareSellByFareCalendarReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp getFeeDescriptionGrp() {
                return feeDescriptionGrp;
            }

            /**
             * Sets the value of the feeDescriptionGrp property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareSellByFareCalendarReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp }
             *     
             */
            public void setFeeDescriptionGrp(FareSellByFareCalendarReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp value) {
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
             *         &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType"/>
             *         &lt;element name="serviceAttributesInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AttributeType" minOccurs="0"/>
             *         &lt;element name="serviceDescriptionInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
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
                protected ItemNumberType itemNumberInfo;
                protected AttributeType serviceAttributesInfo;
                protected SpecialRequirementsDetailsType serviceDescriptionInfo;

                /**
                 * Gets the value of the itemNumberInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemNumberType }
                 *     
                 */
                public ItemNumberType getItemNumberInfo() {
                    return itemNumberInfo;
                }

                /**
                 * Sets the value of the itemNumberInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemNumberType }
                 *     
                 */
                public void setItemNumberInfo(ItemNumberType value) {
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
         *         &lt;element name="itemNumberInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ItemNumberType_81191S"/>
         *         &lt;element name="serviceDetailsGrp" maxOccurs="200" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S"/>
         *                   &lt;element name="serviceMatchedInfoGroup" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificTravellerType"/>
         *                             &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareInformationType" minOccurs="0"/>
         *                             &lt;element name="amountInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType" minOccurs="0"/>
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
            "itemNumberInfo",
            "serviceDetailsGrp"
        })
        public static class ServiceFeeInfoGrp {

            @XmlElement(required = true)
            protected ItemNumberType81191S itemNumberInfo;
            protected List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp> serviceDetailsGrp;

            /**
             * Gets the value of the itemNumberInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ItemNumberType81191S }
             *     
             */
            public ItemNumberType81191S getItemNumberInfo() {
                return itemNumberInfo;
            }

            /**
             * Sets the value of the itemNumberInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemNumberType81191S }
             *     
             */
            public void setItemNumberInfo(ItemNumberType81191S value) {
                this.itemNumberInfo = value;
            }

            /**
             * Gets the value of the serviceDetailsGrp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceDetailsGrp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceDetailsGrp().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp }
             * 
             * 
             */
            public List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp> getServiceDetailsGrp() {
                if (serviceDetailsGrp == null) {
                    serviceDetailsGrp = new ArrayList<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp>();
                }
                return this.serviceDetailsGrp;
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
             *         &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S"/>
             *         &lt;element name="serviceMatchedInfoGroup" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificTravellerType"/>
             *                   &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareInformationType" minOccurs="0"/>
             *                   &lt;element name="amountInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType" minOccurs="0"/>
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
                "refInfo",
                "serviceMatchedInfoGroup"
            })
            public static class ServiceDetailsGrp {

                @XmlElement(required = true)
                protected ReferenceInfoType80865S refInfo;
                protected List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp.ServiceMatchedInfoGroup> serviceMatchedInfoGroup;

                /**
                 * Gets the value of the refInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType80865S }
                 *     
                 */
                public ReferenceInfoType80865S getRefInfo() {
                    return refInfo;
                }

                /**
                 * Sets the value of the refInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType80865S }
                 *     
                 */
                public void setRefInfo(ReferenceInfoType80865S value) {
                    this.refInfo = value;
                }

                /**
                 * Gets the value of the serviceMatchedInfoGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the serviceMatchedInfoGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getServiceMatchedInfoGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp.ServiceMatchedInfoGroup }
                 * 
                 * 
                 */
                public List<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp.ServiceMatchedInfoGroup> getServiceMatchedInfoGroup() {
                    if (serviceMatchedInfoGroup == null) {
                        serviceMatchedInfoGroup = new ArrayList<FareSellByFareCalendarReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp.ServiceMatchedInfoGroup>();
                    }
                    return this.serviceMatchedInfoGroup;
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
                 *         &lt;element name="paxRefInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}SpecificTravellerType"/>
                 *         &lt;element name="pricingInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}FareInformationType" minOccurs="0"/>
                 *         &lt;element name="amountInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}MonetaryInformationType" minOccurs="0"/>
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
                    "paxRefInfo",
                    "pricingInfo",
                    "amountInfo"
                })
                public static class ServiceMatchedInfoGroup {

                    @XmlElement(required = true)
                    protected SpecificTravellerType paxRefInfo;
                    protected FareInformationType pricingInfo;
                    protected MonetaryInformationType amountInfo;

                    /**
                     * Gets the value of the paxRefInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SpecificTravellerType }
                     *     
                     */
                    public SpecificTravellerType getPaxRefInfo() {
                        return paxRefInfo;
                    }

                    /**
                     * Sets the value of the paxRefInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SpecificTravellerType }
                     *     
                     */
                    public void setPaxRefInfo(SpecificTravellerType value) {
                        this.paxRefInfo = value;
                    }

                    /**
                     * Gets the value of the pricingInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareInformationType }
                     *     
                     */
                    public FareInformationType getPricingInfo() {
                        return pricingInfo;
                    }

                    /**
                     * Sets the value of the pricingInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareInformationType }
                     *     
                     */
                    public void setPricingInfo(FareInformationType value) {
                        this.pricingInfo = value;
                    }

                    /**
                     * Gets the value of the amountInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MonetaryInformationType }
                     *     
                     */
                    public MonetaryInformationType getAmountInfo() {
                        return amountInfo;
                    }

                    /**
                     * Sets the value of the amountInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MonetaryInformationType }
                     *     
                     */
                    public void setAmountInfo(MonetaryInformationType value) {
                        this.amountInfo = value;
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
         *         &lt;element name="refInfo" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceInfoType_80865S"/>
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
            "refInfo"
        })
        public static class ServiceFeeRefGrp {

            @XmlElement(required = true)
            protected ReferenceInfoType80865S refInfo;

            /**
             * Gets the value of the refInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType80865S }
             *     
             */
            public ReferenceInfoType80865S getRefInfo() {
                return refInfo;
            }

            /**
             * Sets the value of the refInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType80865S }
             *     
             */
            public void setRefInfo(ReferenceInfoType80865S value) {
                this.refInfo = value;
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
     *         &lt;element name="globalMessageMarker" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DummySegmentTypeI"/>
     *         &lt;element name="globalMessage" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}InteractiveFreeTextType"/>
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
        "globalMessageMarker",
        "globalMessage"
    })
    public static class WarningInfo {

        @XmlElement(required = true)
        protected DummySegmentTypeI globalMessageMarker;
        @XmlElement(required = true)
        protected InteractiveFreeTextType globalMessage;

        /**
         * Gets the value of the globalMessageMarker property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getGlobalMessageMarker() {
            return globalMessageMarker;
        }

        /**
         * Sets the value of the globalMessageMarker property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setGlobalMessageMarker(DummySegmentTypeI value) {
            this.globalMessageMarker = value;
        }

        /**
         * Gets the value of the globalMessage property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeTextType }
         *     
         */
        public InteractiveFreeTextType getGlobalMessage() {
            return globalMessage;
        }

        /**
         * Sets the value of the globalMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeTextType }
         *     
         */
        public void setGlobalMessage(InteractiveFreeTextType value) {
            this.globalMessage = value;
        }

    }

}
