
package com.amadeus.xml.pnracc_11_1_1a;

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
 *         &lt;element name="pnrHeader" maxOccurs="198" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reservationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_87792S"/>
 *                   &lt;element name="referenceForRecordLocator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationSecurityInformation" minOccurs="0"/>
 *         &lt;element name="queueInformations" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Queue" minOccurs="0"/>
 *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits_2048S" minOccurs="0"/>
 *         &lt;element name="generalErrorInfo" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="messageErrorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
 *                   &lt;element name="messageErrorText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="freetextData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LongFreeText" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="pnrHeaderTag" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_99944S" minOccurs="0"/>
 *         &lt;element name="freeFormText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="historyData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PnrHistoryData_6022S" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="sbrPOSDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}POSGroupType"/>
 *         &lt;element name="sbrCreationPosDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}POSGroupType"/>
 *         &lt;element name="sbrUpdatorPosDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}POSGroupType"/>
 *         &lt;element name="technicalData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enveloppeNumberData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SequenceDetails"/>
 *                   &lt;element name="lastTransmittedEnvelopeNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PnrHistoryData" minOccurs="0"/>
 *                   &lt;element name="purgeDateData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_27086S" minOccurs="0"/>
 *                   &lt;element name="generalPNRInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_32775S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="travellerInfo" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="elementManagementPassenger" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment"/>
 *                   &lt;element name="passengerData" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_6097S"/>
 *                             &lt;element name="groupCounters" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits_76106S" minOccurs="0"/>
 *                             &lt;element name="dateOfBirth" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DateAndTimeInformation_32722S" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="nameError" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nameErrorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
 *                             &lt;element name="nameErrorFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
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
 *         &lt;element name="originDestinationDetails" maxOccurs="50" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/PNRACC_11_1_1A}OriginAndDestinationDetails"/>
 *                   &lt;element name="itineraryInfo" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment"/>
 *                             &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation" minOccurs="0"/>
 *                             &lt;element name="itineraryMessageAction" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MessageActionDetails" minOccurs="0"/>
 *                             &lt;element name="itineraryReservationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_21000S" minOccurs="0"/>
 *                             &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RelatedProductInformation" minOccurs="0"/>
 *                             &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_99946S" minOccurs="0"/>
 *                             &lt;element name="flightDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalProductDetails" minOccurs="0"/>
 *                             &lt;element name="cabinDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CabinDetails" minOccurs="0"/>
 *                             &lt;element name="selectionDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails" minOccurs="0"/>
 *                             &lt;element name="itineraryfreeFormText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="itineraryFreetext" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LongFreeText" minOccurs="0"/>
 *                             &lt;element name="hotelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelProductInformation" minOccurs="0"/>
 *                             &lt;element name="rateInformations" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RateInformation" minOccurs="0"/>
 *                             &lt;element name="generalOption" type="{http://xml.amadeus.com/PNRACC_11_1_1A}GeneralOption" maxOccurs="199" minOccurs="0"/>
 *                             &lt;element name="country" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CountryCodeList" minOccurs="0"/>
 *                             &lt;element name="itineraryMonetaryInformations" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" maxOccurs="20" minOccurs="0"/>
 *                             &lt;element name="taxInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TaxDetails" maxOccurs="3" minOccurs="0"/>
 *                             &lt;element name="customerTransactionData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CustomerTransactionData" minOccurs="0"/>
 *                             &lt;element name="yieldGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="yieldData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ODKeyPerformanceData"/>
 *                                       &lt;element name="yieldDataGroup" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ONDType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="legInfo" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="markerLegInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FlightSegmentDetails"/>
 *                                       &lt;element name="legTravelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_99362S"/>
 *                                       &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText_99363S" maxOccurs="2" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DateAndTimeInformation" minOccurs="0"/>
 *                             &lt;element name="lccTypicalData" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="lccFareData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_28460S"/>
 *                                       &lt;element name="lccConnectionData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemReferencesAndVersions_6550S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="insuranceInformation" maxOccurs="198" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="insuranceName" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceName"/>
 *                                       &lt;element name="insuranceMonetaryInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" minOccurs="0"/>
 *                                       &lt;element name="insurancePremiumInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInsuranceInformation" minOccurs="0"/>
 *                                       &lt;element name="insuranceDocInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerDocumentInformation" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="insuranceDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceBusinessDataType" minOccurs="0"/>
 *                             &lt;element name="hotelReservationInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="hotelPropertyInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelProperty"/>
 *                                       &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation"/>
 *                                       &lt;element name="requestedDates" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_11026S"/>
 *                                       &lt;element name="roomRateDetails" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom"/>
 *                                                 &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
 *                                                 &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation"/>
 *                                                 &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_21000S" maxOccurs="3"/>
 *                                       &lt;element name="roomstayIndex" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemNumber_33258S" minOccurs="0"/>
 *                                       &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_21014S"/>
 *                                       &lt;element name="billableInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}BillableInformation" minOccurs="0"/>
 *                                       &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ConsumerReferenceInformation" minOccurs="0"/>
 *                                       &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationCode" minOccurs="0"/>
 *                                       &lt;element name="guaranteeOrDeposit" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PaymentInformation_99388S"/>
 *                                                 &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_29553S" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="textOptions" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_664S" maxOccurs="5" minOccurs="0"/>
 *                                       &lt;element name="savingAmountInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" minOccurs="0"/>
 *                                       &lt;element name="writtenConfirmationContact" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ContactInformation" minOccurs="0"/>
 *                                       &lt;element name="writtenConfirmationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NameAndAddress" minOccurs="0"/>
 *                                       &lt;element name="documentInformationDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DocumentInformationDetails_9936S" minOccurs="0"/>
 *                                       &lt;element name="arrivalFlightDetails" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_26981S"/>
 *                                                 &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalTransportDetails"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="bookingIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_99582S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="typicalCarData" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}VehicleInformation"/>
 *                                       &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
 *                                       &lt;element name="voucherPrintAck" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_84639S" minOccurs="0"/>
 *                                       &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation"/>
 *                                       &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84634S" maxOccurs="6"/>
 *                                       &lt;element name="deliveryAndCollection" maxOccurs="2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_31454S"/>
 *                                                 &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84645S"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="pickupDropoffTimes" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S"/>
 *                                       &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_84638S" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="rateCodeGroup" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FareQualifierDetails"/>
 *                                                 &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="fFlyerNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationCode_84632S" minOccurs="0"/>
 *                                       &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ConsumerReferenceInformation" minOccurs="0"/>
 *                                       &lt;element name="rateInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84641S" maxOccurs="10" minOccurs="0"/>
 *                                       &lt;element name="errorWarning" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation_84657S"/>
 *                                                 &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="rulesPoliciesGroup" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
 *                                                 &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails_84647S" minOccurs="0"/>
 *                                                 &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
 *                                                 &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S"/>
 *                                                           &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
 *                                                           &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
 *                                                                     &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84654S"/>
 *                                                                     &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation_84655S"/>
 *                                                           &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S" maxOccurs="2" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84651S"/>
 *                                                           &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_84650S" minOccurs="0"/>
 *                                                           &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84653S" maxOccurs="10" minOccurs="0"/>
 *                                                           &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84652S" maxOccurs="2" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
 *                                                           &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
 *                                                                     &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84649S" minOccurs="0"/>
 *                                                           &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S" maxOccurs="6"/>
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
 *                                       &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_84631S" minOccurs="0"/>
 *                                       &lt;element name="billingData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}BillableInformation" minOccurs="0"/>
 *                                       &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalBusinessSourceInformation" minOccurs="0"/>
 *                                       &lt;element name="inclusiveTour" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourInformation" minOccurs="0"/>
 *                                       &lt;element name="marketingInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="supleInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_84635S" maxOccurs="6" minOccurs="0"/>
 *                                       &lt;element name="estimatedDistance" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity_84637S" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="agentInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Name_84636S" minOccurs="0"/>
 *                                       &lt;element name="trackingOpt" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AgreementIdentification" minOccurs="0"/>
 *                                       &lt;element name="electronicVoucherNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TicketNumberDetails" minOccurs="0"/>
 *                                       &lt;element name="customerEmail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CommunicationContact" minOccurs="0"/>
 *                                       &lt;element name="attribute" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Attribute_84627S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="typicalCruiseData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CruiseBusinessDataType" minOccurs="0"/>
 *                             &lt;element name="railInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TrainInformationType" minOccurs="0"/>
 *                             &lt;element name="markerRailTour" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
 *                             &lt;element name="tourInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourInformationType" minOccurs="0"/>
 *                             &lt;element name="ferryLegInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FerryBookingDescriptionType" minOccurs="0"/>
 *                             &lt;element name="errorInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="errorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
 *                                       &lt;element name="errorfreeFormText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="referenceForSegment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
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
 *         &lt;element name="segmentGroupingInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SegmentGroupingInformation" maxOccurs="50" minOccurs="0"/>
 *         &lt;element name="dataElementsMaster" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="marker2" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
 *                   &lt;element name="dataElementsIndiv" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="elementManagementData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment"/>
 *                             &lt;element name="pnrSecurity" type="{http://xml.amadeus.com/PNRACC_11_1_1A}IndividualPnrSecurityInformation" minOccurs="0"/>
 *                             &lt;element name="accounting" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AccountingInformationElement" minOccurs="0"/>
 *                             &lt;element name="miscellaneousRemarks" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_211S" minOccurs="0"/>
 *                             &lt;element name="serviceRequest" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SpecialRequirementsDetails" minOccurs="0"/>
 *                             &lt;element name="seatPaxInfo" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="seatPaxDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SeatRequestParameters"/>
 *                                       &lt;element name="seatPaxIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_33257S" minOccurs="0"/>
 *                                       &lt;element name="crossRef" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_6074S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="railSeatPreferences" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RailSeatPreferences" minOccurs="0"/>
 *                             &lt;element name="cityPair" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_35293S"/>
 *                                       &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_35293S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="railSeatDetails" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="railSeatReferenceInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RailSeatReferenceInformation"/>
 *                                       &lt;element name="railSeatDenomination" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_29860S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dateAndTimeInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DateAndTimeInformation" minOccurs="0"/>
 *                             &lt;element name="frequentFlyerInformationGroup" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentFlyerInformationGroupType" minOccurs="0"/>
 *                             &lt;element name="ticketElement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TicketElement" minOccurs="0"/>
 *                             &lt;element name="referencedRecord" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="referencedReservationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_87792S"/>
 *                                       &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationSecurityInformation_4193S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="optionElement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}OptionElement" minOccurs="0"/>
 *                             &lt;element name="otherDataFreetext" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LongFreeText" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="structuredAddress" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredAddress" minOccurs="0"/>
 *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="elementErrorInformation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="errorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
 *                                       &lt;element name="elementErrorText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="mcoRecord" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="mcoType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousChargeOrder"/>
 *                                       &lt;element name="mcoInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_9865S"/>
 *                                       &lt;element name="groupOfFareElements" maxOccurs="20" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SequenceDetails"/>
 *                                                 &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_9865S"/>
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
 *                             &lt;element name="totalPrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TotalPriceType" minOccurs="0"/>
 *                             &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_33257S" maxOccurs="5" minOccurs="0"/>
 *                             &lt;element name="referenceForDataElement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
 *                             &lt;element name="structuredFop" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FOPRepresentationType" maxOccurs="3" minOccurs="0"/>
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
 *         &lt;element name="tstData" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tstGeneralInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TstGeneralInformation"/>
 *                   &lt;element name="tstFreetext" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LongFreeText" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="fareBasisInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FareBasisCodesLine" minOccurs="0"/>
 *                   &lt;element name="fareData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FareData" minOccurs="0"/>
 *                   &lt;element name="segmentAssociation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails" minOccurs="0"/>
 *                   &lt;element name="referenceForTstData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
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
    "pnrHeader",
    "securityInformation",
    "queueInformations",
    "numberOfUnits",
    "generalErrorInfo",
    "freetextData",
    "pnrHeaderTag",
    "freeFormText",
    "historyData",
    "sbrPOSDetails",
    "sbrCreationPosDetails",
    "sbrUpdatorPosDetails",
    "technicalData",
    "travellerInfo",
    "originDestinationDetails",
    "segmentGroupingInfo",
    "dataElementsMaster",
    "tstData"
})
@XmlRootElement(name = "PNR_Reply")
public class PNRReply {

    protected List<PNRReply.PnrHeader> pnrHeader;
    protected ReservationSecurityInformation securityInformation;
    protected Queue queueInformations;
    protected NumberOfUnits2048S numberOfUnits;
    protected List<PNRReply.GeneralErrorInfo> generalErrorInfo;
    protected List<LongFreeText> freetextData;
    protected StatusDetails99944S pnrHeaderTag;
    protected List<InteractiveFreeText> freeFormText;
    protected List<PnrHistoryData6022S> historyData;
    @XmlElement(required = true)
    protected POSGroupType sbrPOSDetails;
    @XmlElement(required = true)
    protected POSGroupType sbrCreationPosDetails;
    @XmlElement(required = true)
    protected POSGroupType sbrUpdatorPosDetails;
    protected PNRReply.TechnicalData technicalData;
    protected List<PNRReply.TravellerInfo> travellerInfo;
    protected List<PNRReply.OriginDestinationDetails> originDestinationDetails;
    protected List<SegmentGroupingInformation> segmentGroupingInfo;
    protected PNRReply.DataElementsMaster dataElementsMaster;
    protected List<PNRReply.TstData> tstData;

    /**
     * Gets the value of the pnrHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRReply.PnrHeader }
     * 
     * 
     */
    public List<PNRReply.PnrHeader> getPnrHeader() {
        if (pnrHeader == null) {
            pnrHeader = new ArrayList<PNRReply.PnrHeader>();
        }
        return this.pnrHeader;
    }

    /**
     * Gets the value of the securityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationSecurityInformation }
     *     
     */
    public ReservationSecurityInformation getSecurityInformation() {
        return securityInformation;
    }

    /**
     * Sets the value of the securityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationSecurityInformation }
     *     
     */
    public void setSecurityInformation(ReservationSecurityInformation value) {
        this.securityInformation = value;
    }

    /**
     * Gets the value of the queueInformations property.
     * 
     * @return
     *     possible object is
     *     {@link Queue }
     *     
     */
    public Queue getQueueInformations() {
        return queueInformations;
    }

    /**
     * Sets the value of the queueInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Queue }
     *     
     */
    public void setQueueInformations(Queue value) {
        this.queueInformations = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnits2048S }
     *     
     */
    public NumberOfUnits2048S getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnits2048S }
     *     
     */
    public void setNumberOfUnits(NumberOfUnits2048S value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the generalErrorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalErrorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralErrorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRReply.GeneralErrorInfo }
     * 
     * 
     */
    public List<PNRReply.GeneralErrorInfo> getGeneralErrorInfo() {
        if (generalErrorInfo == null) {
            generalErrorInfo = new ArrayList<PNRReply.GeneralErrorInfo>();
        }
        return this.generalErrorInfo;
    }

    /**
     * Gets the value of the freetextData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freetextData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreetextData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LongFreeText }
     * 
     * 
     */
    public List<LongFreeText> getFreetextData() {
        if (freetextData == null) {
            freetextData = new ArrayList<LongFreeText>();
        }
        return this.freetextData;
    }

    /**
     * Gets the value of the pnrHeaderTag property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetails99944S }
     *     
     */
    public StatusDetails99944S getPnrHeaderTag() {
        return pnrHeaderTag;
    }

    /**
     * Sets the value of the pnrHeaderTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetails99944S }
     *     
     */
    public void setPnrHeaderTag(StatusDetails99944S value) {
        this.pnrHeaderTag = value;
    }

    /**
     * Gets the value of the freeFormText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeFormText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeFormText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractiveFreeText }
     * 
     * 
     */
    public List<InteractiveFreeText> getFreeFormText() {
        if (freeFormText == null) {
            freeFormText = new ArrayList<InteractiveFreeText>();
        }
        return this.freeFormText;
    }

    /**
     * Gets the value of the historyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrHistoryData6022S }
     * 
     * 
     */
    public List<PnrHistoryData6022S> getHistoryData() {
        if (historyData == null) {
            historyData = new ArrayList<PnrHistoryData6022S>();
        }
        return this.historyData;
    }

    /**
     * Gets the value of the sbrPOSDetails property.
     * 
     * @return
     *     possible object is
     *     {@link POSGroupType }
     *     
     */
    public POSGroupType getSbrPOSDetails() {
        return sbrPOSDetails;
    }

    /**
     * Sets the value of the sbrPOSDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSGroupType }
     *     
     */
    public void setSbrPOSDetails(POSGroupType value) {
        this.sbrPOSDetails = value;
    }

    /**
     * Gets the value of the sbrCreationPosDetails property.
     * 
     * @return
     *     possible object is
     *     {@link POSGroupType }
     *     
     */
    public POSGroupType getSbrCreationPosDetails() {
        return sbrCreationPosDetails;
    }

    /**
     * Sets the value of the sbrCreationPosDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSGroupType }
     *     
     */
    public void setSbrCreationPosDetails(POSGroupType value) {
        this.sbrCreationPosDetails = value;
    }

    /**
     * Gets the value of the sbrUpdatorPosDetails property.
     * 
     * @return
     *     possible object is
     *     {@link POSGroupType }
     *     
     */
    public POSGroupType getSbrUpdatorPosDetails() {
        return sbrUpdatorPosDetails;
    }

    /**
     * Sets the value of the sbrUpdatorPosDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSGroupType }
     *     
     */
    public void setSbrUpdatorPosDetails(POSGroupType value) {
        this.sbrUpdatorPosDetails = value;
    }

    /**
     * Gets the value of the technicalData property.
     * 
     * @return
     *     possible object is
     *     {@link PNRReply.TechnicalData }
     *     
     */
    public PNRReply.TechnicalData getTechnicalData() {
        return technicalData;
    }

    /**
     * Sets the value of the technicalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRReply.TechnicalData }
     *     
     */
    public void setTechnicalData(PNRReply.TechnicalData value) {
        this.technicalData = value;
    }

    /**
     * Gets the value of the travellerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRReply.TravellerInfo }
     * 
     * 
     */
    public List<PNRReply.TravellerInfo> getTravellerInfo() {
        if (travellerInfo == null) {
            travellerInfo = new ArrayList<PNRReply.TravellerInfo>();
        }
        return this.travellerInfo;
    }

    /**
     * Gets the value of the originDestinationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRReply.OriginDestinationDetails }
     * 
     * 
     */
    public List<PNRReply.OriginDestinationDetails> getOriginDestinationDetails() {
        if (originDestinationDetails == null) {
            originDestinationDetails = new ArrayList<PNRReply.OriginDestinationDetails>();
        }
        return this.originDestinationDetails;
    }

    /**
     * Gets the value of the segmentGroupingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentGroupingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentGroupingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentGroupingInformation }
     * 
     * 
     */
    public List<SegmentGroupingInformation> getSegmentGroupingInfo() {
        if (segmentGroupingInfo == null) {
            segmentGroupingInfo = new ArrayList<SegmentGroupingInformation>();
        }
        return this.segmentGroupingInfo;
    }

    /**
     * Gets the value of the dataElementsMaster property.
     * 
     * @return
     *     possible object is
     *     {@link PNRReply.DataElementsMaster }
     *     
     */
    public PNRReply.DataElementsMaster getDataElementsMaster() {
        return dataElementsMaster;
    }

    /**
     * Sets the value of the dataElementsMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRReply.DataElementsMaster }
     *     
     */
    public void setDataElementsMaster(PNRReply.DataElementsMaster value) {
        this.dataElementsMaster = value;
    }

    /**
     * Gets the value of the tstData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tstData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTstData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRReply.TstData }
     * 
     * 
     */
    public List<PNRReply.TstData> getTstData() {
        if (tstData == null) {
            tstData = new ArrayList<PNRReply.TstData>();
        }
        return this.tstData;
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
     *         &lt;element name="marker2" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
     *         &lt;element name="dataElementsIndiv" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="elementManagementData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment"/>
     *                   &lt;element name="pnrSecurity" type="{http://xml.amadeus.com/PNRACC_11_1_1A}IndividualPnrSecurityInformation" minOccurs="0"/>
     *                   &lt;element name="accounting" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AccountingInformationElement" minOccurs="0"/>
     *                   &lt;element name="miscellaneousRemarks" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_211S" minOccurs="0"/>
     *                   &lt;element name="serviceRequest" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SpecialRequirementsDetails" minOccurs="0"/>
     *                   &lt;element name="seatPaxInfo" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="seatPaxDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SeatRequestParameters"/>
     *                             &lt;element name="seatPaxIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_33257S" minOccurs="0"/>
     *                             &lt;element name="crossRef" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_6074S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="railSeatPreferences" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RailSeatPreferences" minOccurs="0"/>
     *                   &lt;element name="cityPair" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_35293S"/>
     *                             &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_35293S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="railSeatDetails" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="railSeatReferenceInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RailSeatReferenceInformation"/>
     *                             &lt;element name="railSeatDenomination" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_29860S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dateAndTimeInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DateAndTimeInformation" minOccurs="0"/>
     *                   &lt;element name="frequentFlyerInformationGroup" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentFlyerInformationGroupType" minOccurs="0"/>
     *                   &lt;element name="ticketElement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TicketElement" minOccurs="0"/>
     *                   &lt;element name="referencedRecord" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="referencedReservationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_87792S"/>
     *                             &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationSecurityInformation_4193S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="optionElement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}OptionElement" minOccurs="0"/>
     *                   &lt;element name="otherDataFreetext" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LongFreeText" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="structuredAddress" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredAddress" minOccurs="0"/>
     *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="elementErrorInformation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="errorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
     *                             &lt;element name="elementErrorText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="mcoRecord" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="mcoType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousChargeOrder"/>
     *                             &lt;element name="mcoInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_9865S"/>
     *                             &lt;element name="groupOfFareElements" maxOccurs="20" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SequenceDetails"/>
     *                                       &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_9865S"/>
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
     *                   &lt;element name="totalPrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TotalPriceType" minOccurs="0"/>
     *                   &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_33257S" maxOccurs="5" minOccurs="0"/>
     *                   &lt;element name="referenceForDataElement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
     *                   &lt;element name="structuredFop" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FOPRepresentationType" maxOccurs="3" minOccurs="0"/>
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
        "marker2",
        "dataElementsIndiv"
    })
    public static class DataElementsMaster {

        @XmlElement(required = true)
        protected DummySegment marker2;
        protected List<PNRReply.DataElementsMaster.DataElementsIndiv> dataElementsIndiv;

        /**
         * Gets the value of the marker2 property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegment }
         *     
         */
        public DummySegment getMarker2() {
            return marker2;
        }

        /**
         * Sets the value of the marker2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegment }
         *     
         */
        public void setMarker2(DummySegment value) {
            this.marker2 = value;
        }

        /**
         * Gets the value of the dataElementsIndiv property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataElementsIndiv property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataElementsIndiv().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRReply.DataElementsMaster.DataElementsIndiv }
         * 
         * 
         */
        public List<PNRReply.DataElementsMaster.DataElementsIndiv> getDataElementsIndiv() {
            if (dataElementsIndiv == null) {
                dataElementsIndiv = new ArrayList<PNRReply.DataElementsMaster.DataElementsIndiv>();
            }
            return this.dataElementsIndiv;
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
         *         &lt;element name="elementManagementData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment"/>
         *         &lt;element name="pnrSecurity" type="{http://xml.amadeus.com/PNRACC_11_1_1A}IndividualPnrSecurityInformation" minOccurs="0"/>
         *         &lt;element name="accounting" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AccountingInformationElement" minOccurs="0"/>
         *         &lt;element name="miscellaneousRemarks" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_211S" minOccurs="0"/>
         *         &lt;element name="serviceRequest" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SpecialRequirementsDetails" minOccurs="0"/>
         *         &lt;element name="seatPaxInfo" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="seatPaxDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SeatRequestParameters"/>
         *                   &lt;element name="seatPaxIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_33257S" minOccurs="0"/>
         *                   &lt;element name="crossRef" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_6074S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="railSeatPreferences" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RailSeatPreferences" minOccurs="0"/>
         *         &lt;element name="cityPair" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_35293S"/>
         *                   &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_35293S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="railSeatDetails" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="railSeatReferenceInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RailSeatReferenceInformation"/>
         *                   &lt;element name="railSeatDenomination" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_29860S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dateAndTimeInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DateAndTimeInformation" minOccurs="0"/>
         *         &lt;element name="frequentFlyerInformationGroup" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentFlyerInformationGroupType" minOccurs="0"/>
         *         &lt;element name="ticketElement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TicketElement" minOccurs="0"/>
         *         &lt;element name="referencedRecord" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="referencedReservationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_87792S"/>
         *                   &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationSecurityInformation_4193S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="optionElement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}OptionElement" minOccurs="0"/>
         *         &lt;element name="otherDataFreetext" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LongFreeText" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="structuredAddress" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredAddress" minOccurs="0"/>
         *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="elementErrorInformation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="errorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
         *                   &lt;element name="elementErrorText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="mcoRecord" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="mcoType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousChargeOrder"/>
         *                   &lt;element name="mcoInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_9865S"/>
         *                   &lt;element name="groupOfFareElements" maxOccurs="20" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SequenceDetails"/>
         *                             &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_9865S"/>
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
         *         &lt;element name="totalPrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TotalPriceType" minOccurs="0"/>
         *         &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_33257S" maxOccurs="5" minOccurs="0"/>
         *         &lt;element name="referenceForDataElement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
         *         &lt;element name="structuredFop" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FOPRepresentationType" maxOccurs="3" minOccurs="0"/>
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
            "elementManagementData",
            "pnrSecurity",
            "accounting",
            "miscellaneousRemarks",
            "serviceRequest",
            "seatPaxInfo",
            "railSeatPreferences",
            "cityPair",
            "railSeatDetails",
            "dateAndTimeInformation",
            "frequentFlyerInformationGroup",
            "ticketElement",
            "referencedRecord",
            "optionElement",
            "otherDataFreetext",
            "structuredAddress",
            "monetaryInformation",
            "elementErrorInformation",
            "mcoRecord",
            "totalPrice",
            "elementsIndicators",
            "referenceForDataElement",
            "structuredFop"
        })
        public static class DataElementsIndiv {

            @XmlElement(required = true)
            protected ElementManagementSegment elementManagementData;
            protected IndividualPnrSecurityInformation pnrSecurity;
            protected AccountingInformationElement accounting;
            protected MiscellaneousRemarks211S miscellaneousRemarks;
            protected SpecialRequirementsDetails serviceRequest;
            protected List<PNRReply.DataElementsMaster.DataElementsIndiv.SeatPaxInfo> seatPaxInfo;
            protected RailSeatPreferences railSeatPreferences;
            protected PNRReply.DataElementsMaster.DataElementsIndiv.CityPair cityPair;
            protected List<PNRReply.DataElementsMaster.DataElementsIndiv.RailSeatDetails> railSeatDetails;
            protected DateAndTimeInformation dateAndTimeInformation;
            protected FrequentFlyerInformationGroupType frequentFlyerInformationGroup;
            protected TicketElement ticketElement;
            protected PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord referencedRecord;
            protected OptionElement optionElement;
            protected List<LongFreeText> otherDataFreetext;
            protected StructuredAddress structuredAddress;
            protected List<MonetaryInformation1689S> monetaryInformation;
            protected PNRReply.DataElementsMaster.DataElementsIndiv.ElementErrorInformation elementErrorInformation;
            protected PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord mcoRecord;
            protected TotalPriceType totalPrice;
            protected List<StatusDetails33257S> elementsIndicators;
            protected ReferenceInformation referenceForDataElement;
            protected List<FOPRepresentationType> structuredFop;

            /**
             * Gets the value of the elementManagementData property.
             * 
             * @return
             *     possible object is
             *     {@link ElementManagementSegment }
             *     
             */
            public ElementManagementSegment getElementManagementData() {
                return elementManagementData;
            }

            /**
             * Sets the value of the elementManagementData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElementManagementSegment }
             *     
             */
            public void setElementManagementData(ElementManagementSegment value) {
                this.elementManagementData = value;
            }

            /**
             * Gets the value of the pnrSecurity property.
             * 
             * @return
             *     possible object is
             *     {@link IndividualPnrSecurityInformation }
             *     
             */
            public IndividualPnrSecurityInformation getPnrSecurity() {
                return pnrSecurity;
            }

            /**
             * Sets the value of the pnrSecurity property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndividualPnrSecurityInformation }
             *     
             */
            public void setPnrSecurity(IndividualPnrSecurityInformation value) {
                this.pnrSecurity = value;
            }

            /**
             * Gets the value of the accounting property.
             * 
             * @return
             *     possible object is
             *     {@link AccountingInformationElement }
             *     
             */
            public AccountingInformationElement getAccounting() {
                return accounting;
            }

            /**
             * Sets the value of the accounting property.
             * 
             * @param value
             *     allowed object is
             *     {@link AccountingInformationElement }
             *     
             */
            public void setAccounting(AccountingInformationElement value) {
                this.accounting = value;
            }

            /**
             * Gets the value of the miscellaneousRemarks property.
             * 
             * @return
             *     possible object is
             *     {@link MiscellaneousRemarks211S }
             *     
             */
            public MiscellaneousRemarks211S getMiscellaneousRemarks() {
                return miscellaneousRemarks;
            }

            /**
             * Sets the value of the miscellaneousRemarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link MiscellaneousRemarks211S }
             *     
             */
            public void setMiscellaneousRemarks(MiscellaneousRemarks211S value) {
                this.miscellaneousRemarks = value;
            }

            /**
             * Gets the value of the serviceRequest property.
             * 
             * @return
             *     possible object is
             *     {@link SpecialRequirementsDetails }
             *     
             */
            public SpecialRequirementsDetails getServiceRequest() {
                return serviceRequest;
            }

            /**
             * Sets the value of the serviceRequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecialRequirementsDetails }
             *     
             */
            public void setServiceRequest(SpecialRequirementsDetails value) {
                this.serviceRequest = value;
            }

            /**
             * Gets the value of the seatPaxInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatPaxInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatPaxInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PNRReply.DataElementsMaster.DataElementsIndiv.SeatPaxInfo }
             * 
             * 
             */
            public List<PNRReply.DataElementsMaster.DataElementsIndiv.SeatPaxInfo> getSeatPaxInfo() {
                if (seatPaxInfo == null) {
                    seatPaxInfo = new ArrayList<PNRReply.DataElementsMaster.DataElementsIndiv.SeatPaxInfo>();
                }
                return this.seatPaxInfo;
            }

            /**
             * Gets the value of the railSeatPreferences property.
             * 
             * @return
             *     possible object is
             *     {@link RailSeatPreferences }
             *     
             */
            public RailSeatPreferences getRailSeatPreferences() {
                return railSeatPreferences;
            }

            /**
             * Sets the value of the railSeatPreferences property.
             * 
             * @param value
             *     allowed object is
             *     {@link RailSeatPreferences }
             *     
             */
            public void setRailSeatPreferences(RailSeatPreferences value) {
                this.railSeatPreferences = value;
            }

            /**
             * Gets the value of the cityPair property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.CityPair }
             *     
             */
            public PNRReply.DataElementsMaster.DataElementsIndiv.CityPair getCityPair() {
                return cityPair;
            }

            /**
             * Sets the value of the cityPair property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.CityPair }
             *     
             */
            public void setCityPair(PNRReply.DataElementsMaster.DataElementsIndiv.CityPair value) {
                this.cityPair = value;
            }

            /**
             * Gets the value of the railSeatDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the railSeatDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRailSeatDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PNRReply.DataElementsMaster.DataElementsIndiv.RailSeatDetails }
             * 
             * 
             */
            public List<PNRReply.DataElementsMaster.DataElementsIndiv.RailSeatDetails> getRailSeatDetails() {
                if (railSeatDetails == null) {
                    railSeatDetails = new ArrayList<PNRReply.DataElementsMaster.DataElementsIndiv.RailSeatDetails>();
                }
                return this.railSeatDetails;
            }

            /**
             * Gets the value of the dateAndTimeInformation property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformation }
             *     
             */
            public DateAndTimeInformation getDateAndTimeInformation() {
                return dateAndTimeInformation;
            }

            /**
             * Sets the value of the dateAndTimeInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformation }
             *     
             */
            public void setDateAndTimeInformation(DateAndTimeInformation value) {
                this.dateAndTimeInformation = value;
            }

            /**
             * Gets the value of the frequentFlyerInformationGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FrequentFlyerInformationGroupType }
             *     
             */
            public FrequentFlyerInformationGroupType getFrequentFlyerInformationGroup() {
                return frequentFlyerInformationGroup;
            }

            /**
             * Sets the value of the frequentFlyerInformationGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FrequentFlyerInformationGroupType }
             *     
             */
            public void setFrequentFlyerInformationGroup(FrequentFlyerInformationGroupType value) {
                this.frequentFlyerInformationGroup = value;
            }

            /**
             * Gets the value of the ticketElement property.
             * 
             * @return
             *     possible object is
             *     {@link TicketElement }
             *     
             */
            public TicketElement getTicketElement() {
                return ticketElement;
            }

            /**
             * Sets the value of the ticketElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketElement }
             *     
             */
            public void setTicketElement(TicketElement value) {
                this.ticketElement = value;
            }

            /**
             * Gets the value of the referencedRecord property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord }
             *     
             */
            public PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord getReferencedRecord() {
                return referencedRecord;
            }

            /**
             * Sets the value of the referencedRecord property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord }
             *     
             */
            public void setReferencedRecord(PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord value) {
                this.referencedRecord = value;
            }

            /**
             * Gets the value of the optionElement property.
             * 
             * @return
             *     possible object is
             *     {@link OptionElement }
             *     
             */
            public OptionElement getOptionElement() {
                return optionElement;
            }

            /**
             * Sets the value of the optionElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link OptionElement }
             *     
             */
            public void setOptionElement(OptionElement value) {
                this.optionElement = value;
            }

            /**
             * Gets the value of the otherDataFreetext property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherDataFreetext property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherDataFreetext().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LongFreeText }
             * 
             * 
             */
            public List<LongFreeText> getOtherDataFreetext() {
                if (otherDataFreetext == null) {
                    otherDataFreetext = new ArrayList<LongFreeText>();
                }
                return this.otherDataFreetext;
            }

            /**
             * Gets the value of the structuredAddress property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredAddress }
             *     
             */
            public StructuredAddress getStructuredAddress() {
                return structuredAddress;
            }

            /**
             * Sets the value of the structuredAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredAddress }
             *     
             */
            public void setStructuredAddress(StructuredAddress value) {
                this.structuredAddress = value;
            }

            /**
             * Gets the value of the monetaryInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the monetaryInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMonetaryInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MonetaryInformation1689S }
             * 
             * 
             */
            public List<MonetaryInformation1689S> getMonetaryInformation() {
                if (monetaryInformation == null) {
                    monetaryInformation = new ArrayList<MonetaryInformation1689S>();
                }
                return this.monetaryInformation;
            }

            /**
             * Gets the value of the elementErrorInformation property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.ElementErrorInformation }
             *     
             */
            public PNRReply.DataElementsMaster.DataElementsIndiv.ElementErrorInformation getElementErrorInformation() {
                return elementErrorInformation;
            }

            /**
             * Sets the value of the elementErrorInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.ElementErrorInformation }
             *     
             */
            public void setElementErrorInformation(PNRReply.DataElementsMaster.DataElementsIndiv.ElementErrorInformation value) {
                this.elementErrorInformation = value;
            }

            /**
             * Gets the value of the mcoRecord property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord }
             *     
             */
            public PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord getMcoRecord() {
                return mcoRecord;
            }

            /**
             * Sets the value of the mcoRecord property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord }
             *     
             */
            public void setMcoRecord(PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord value) {
                this.mcoRecord = value;
            }

            /**
             * Gets the value of the totalPrice property.
             * 
             * @return
             *     possible object is
             *     {@link TotalPriceType }
             *     
             */
            public TotalPriceType getTotalPrice() {
                return totalPrice;
            }

            /**
             * Sets the value of the totalPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalPriceType }
             *     
             */
            public void setTotalPrice(TotalPriceType value) {
                this.totalPrice = value;
            }

            /**
             * Gets the value of the elementsIndicators property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the elementsIndicators property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getElementsIndicators().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusDetails33257S }
             * 
             * 
             */
            public List<StatusDetails33257S> getElementsIndicators() {
                if (elementsIndicators == null) {
                    elementsIndicators = new ArrayList<StatusDetails33257S>();
                }
                return this.elementsIndicators;
            }

            /**
             * Gets the value of the referenceForDataElement property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInformation }
             *     
             */
            public ReferenceInformation getReferenceForDataElement() {
                return referenceForDataElement;
            }

            /**
             * Sets the value of the referenceForDataElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInformation }
             *     
             */
            public void setReferenceForDataElement(ReferenceInformation value) {
                this.referenceForDataElement = value;
            }

            /**
             * Gets the value of the structuredFop property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the structuredFop property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStructuredFop().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FOPRepresentationType }
             * 
             * 
             */
            public List<FOPRepresentationType> getStructuredFop() {
                if (structuredFop == null) {
                    structuredFop = new ArrayList<FOPRepresentationType>();
                }
                return this.structuredFop;
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
             *         &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_35293S"/>
             *         &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_35293S"/>
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
                "depLocation",
                "arrLocation"
            })
            public static class CityPair {

                @XmlElement(required = true)
                protected PlaceLocationIdentification35293S depLocation;
                @XmlElement(required = true)
                protected PlaceLocationIdentification35293S arrLocation;

                /**
                 * Gets the value of the depLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PlaceLocationIdentification35293S }
                 *     
                 */
                public PlaceLocationIdentification35293S getDepLocation() {
                    return depLocation;
                }

                /**
                 * Sets the value of the depLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PlaceLocationIdentification35293S }
                 *     
                 */
                public void setDepLocation(PlaceLocationIdentification35293S value) {
                    this.depLocation = value;
                }

                /**
                 * Gets the value of the arrLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PlaceLocationIdentification35293S }
                 *     
                 */
                public PlaceLocationIdentification35293S getArrLocation() {
                    return arrLocation;
                }

                /**
                 * Sets the value of the arrLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PlaceLocationIdentification35293S }
                 *     
                 */
                public void setArrLocation(PlaceLocationIdentification35293S value) {
                    this.arrLocation = value;
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
             *         &lt;element name="errorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
             *         &lt;element name="elementErrorText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
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
                "errorInformation",
                "elementErrorText"
            })
            public static class ElementErrorInformation {

                @XmlElement(required = true)
                protected ApplicationErrorInformation errorInformation;
                protected InteractiveFreeText elementErrorText;

                /**
                 * Gets the value of the errorInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ApplicationErrorInformation }
                 *     
                 */
                public ApplicationErrorInformation getErrorInformation() {
                    return errorInformation;
                }

                /**
                 * Sets the value of the errorInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ApplicationErrorInformation }
                 *     
                 */
                public void setErrorInformation(ApplicationErrorInformation value) {
                    this.errorInformation = value;
                }

                /**
                 * Gets the value of the elementErrorText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InteractiveFreeText }
                 *     
                 */
                public InteractiveFreeText getElementErrorText() {
                    return elementErrorText;
                }

                /**
                 * Sets the value of the elementErrorText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InteractiveFreeText }
                 *     
                 */
                public void setElementErrorText(InteractiveFreeText value) {
                    this.elementErrorText = value;
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
             *         &lt;element name="mcoType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousChargeOrder"/>
             *         &lt;element name="mcoInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_9865S"/>
             *         &lt;element name="groupOfFareElements" maxOccurs="20" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SequenceDetails"/>
             *                   &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_9865S"/>
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
                "mcoType",
                "mcoInformation",
                "groupOfFareElements"
            })
            public static class McoRecord {

                @XmlElement(required = true)
                protected MiscellaneousChargeOrder mcoType;
                @XmlElement(required = true)
                protected FreeTextInformation9865S mcoInformation;
                protected List<PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements> groupOfFareElements;

                /**
                 * Gets the value of the mcoType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MiscellaneousChargeOrder }
                 *     
                 */
                public MiscellaneousChargeOrder getMcoType() {
                    return mcoType;
                }

                /**
                 * Sets the value of the mcoType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MiscellaneousChargeOrder }
                 *     
                 */
                public void setMcoType(MiscellaneousChargeOrder value) {
                    this.mcoType = value;
                }

                /**
                 * Gets the value of the mcoInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformation9865S }
                 *     
                 */
                public FreeTextInformation9865S getMcoInformation() {
                    return mcoInformation;
                }

                /**
                 * Sets the value of the mcoInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformation9865S }
                 *     
                 */
                public void setMcoInformation(FreeTextInformation9865S value) {
                    this.mcoInformation = value;
                }

                /**
                 * Gets the value of the groupOfFareElements property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the groupOfFareElements property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGroupOfFareElements().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements }
                 * 
                 * 
                 */
                public List<PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements> getGroupOfFareElements() {
                    if (groupOfFareElements == null) {
                        groupOfFareElements = new ArrayList<PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements>();
                    }
                    return this.groupOfFareElements;
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
                 *         &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SequenceDetails"/>
                 *         &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_9865S"/>
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
                    "sequenceNumber",
                    "fareElementData"
                })
                public static class GroupOfFareElements {

                    @XmlElement(required = true)
                    protected SequenceDetails sequenceNumber;
                    @XmlElement(required = true)
                    protected FreeTextInformation9865S fareElementData;

                    /**
                     * Gets the value of the sequenceNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SequenceDetails }
                     *     
                     */
                    public SequenceDetails getSequenceNumber() {
                        return sequenceNumber;
                    }

                    /**
                     * Sets the value of the sequenceNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SequenceDetails }
                     *     
                     */
                    public void setSequenceNumber(SequenceDetails value) {
                        this.sequenceNumber = value;
                    }

                    /**
                     * Gets the value of the fareElementData property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FreeTextInformation9865S }
                     *     
                     */
                    public FreeTextInformation9865S getFareElementData() {
                        return fareElementData;
                    }

                    /**
                     * Sets the value of the fareElementData property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FreeTextInformation9865S }
                     *     
                     */
                    public void setFareElementData(FreeTextInformation9865S value) {
                        this.fareElementData = value;
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
             *         &lt;element name="railSeatReferenceInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RailSeatReferenceInformation"/>
             *         &lt;element name="railSeatDenomination" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_29860S" minOccurs="0"/>
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
                "railSeatReferenceInformation",
                "railSeatDenomination"
            })
            public static class RailSeatDetails {

                @XmlElement(required = true)
                protected RailSeatReferenceInformation railSeatReferenceInformation;
                protected FreeTextInformation29860S railSeatDenomination;

                /**
                 * Gets the value of the railSeatReferenceInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RailSeatReferenceInformation }
                 *     
                 */
                public RailSeatReferenceInformation getRailSeatReferenceInformation() {
                    return railSeatReferenceInformation;
                }

                /**
                 * Sets the value of the railSeatReferenceInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RailSeatReferenceInformation }
                 *     
                 */
                public void setRailSeatReferenceInformation(RailSeatReferenceInformation value) {
                    this.railSeatReferenceInformation = value;
                }

                /**
                 * Gets the value of the railSeatDenomination property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformation29860S }
                 *     
                 */
                public FreeTextInformation29860S getRailSeatDenomination() {
                    return railSeatDenomination;
                }

                /**
                 * Sets the value of the railSeatDenomination property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformation29860S }
                 *     
                 */
                public void setRailSeatDenomination(FreeTextInformation29860S value) {
                    this.railSeatDenomination = value;
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
             *         &lt;element name="referencedReservationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_87792S"/>
             *         &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationSecurityInformation_4193S"/>
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
                "referencedReservationInfo",
                "securityInformation"
            })
            public static class ReferencedRecord {

                @XmlElement(required = true)
                protected ReservationControlInformation87792S referencedReservationInfo;
                @XmlElement(required = true)
                protected ReservationSecurityInformation4193S securityInformation;

                /**
                 * Gets the value of the referencedReservationInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReservationControlInformation87792S }
                 *     
                 */
                public ReservationControlInformation87792S getReferencedReservationInfo() {
                    return referencedReservationInfo;
                }

                /**
                 * Sets the value of the referencedReservationInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReservationControlInformation87792S }
                 *     
                 */
                public void setReferencedReservationInfo(ReservationControlInformation87792S value) {
                    this.referencedReservationInfo = value;
                }

                /**
                 * Gets the value of the securityInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReservationSecurityInformation4193S }
                 *     
                 */
                public ReservationSecurityInformation4193S getSecurityInformation() {
                    return securityInformation;
                }

                /**
                 * Sets the value of the securityInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReservationSecurityInformation4193S }
                 *     
                 */
                public void setSecurityInformation(ReservationSecurityInformation4193S value) {
                    this.securityInformation = value;
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
             *         &lt;element name="seatPaxDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SeatRequestParameters"/>
             *         &lt;element name="seatPaxIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_33257S" minOccurs="0"/>
             *         &lt;element name="crossRef" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_6074S"/>
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
                "seatPaxDetails",
                "seatPaxIndicator",
                "crossRef"
            })
            public static class SeatPaxInfo {

                @XmlElement(required = true)
                protected SeatRequestParameters seatPaxDetails;
                protected StatusDetails33257S seatPaxIndicator;
                @XmlElement(required = true)
                protected ReferenceInformation6074S crossRef;

                /**
                 * Gets the value of the seatPaxDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SeatRequestParameters }
                 *     
                 */
                public SeatRequestParameters getSeatPaxDetails() {
                    return seatPaxDetails;
                }

                /**
                 * Sets the value of the seatPaxDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SeatRequestParameters }
                 *     
                 */
                public void setSeatPaxDetails(SeatRequestParameters value) {
                    this.seatPaxDetails = value;
                }

                /**
                 * Gets the value of the seatPaxIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusDetails33257S }
                 *     
                 */
                public StatusDetails33257S getSeatPaxIndicator() {
                    return seatPaxIndicator;
                }

                /**
                 * Sets the value of the seatPaxIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusDetails33257S }
                 *     
                 */
                public void setSeatPaxIndicator(StatusDetails33257S value) {
                    this.seatPaxIndicator = value;
                }

                /**
                 * Gets the value of the crossRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInformation6074S }
                 *     
                 */
                public ReferenceInformation6074S getCrossRef() {
                    return crossRef;
                }

                /**
                 * Sets the value of the crossRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInformation6074S }
                 *     
                 */
                public void setCrossRef(ReferenceInformation6074S value) {
                    this.crossRef = value;
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
     *         &lt;element name="messageErrorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
     *         &lt;element name="messageErrorText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText"/>
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
        "messageErrorInformation",
        "messageErrorText"
    })
    public static class GeneralErrorInfo {

        @XmlElement(required = true)
        protected ApplicationErrorInformation messageErrorInformation;
        @XmlElement(required = true)
        protected InteractiveFreeText messageErrorText;

        /**
         * Gets the value of the messageErrorInformation property.
         * 
         * @return
         *     possible object is
         *     {@link ApplicationErrorInformation }
         *     
         */
        public ApplicationErrorInformation getMessageErrorInformation() {
            return messageErrorInformation;
        }

        /**
         * Sets the value of the messageErrorInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ApplicationErrorInformation }
         *     
         */
        public void setMessageErrorInformation(ApplicationErrorInformation value) {
            this.messageErrorInformation = value;
        }

        /**
         * Gets the value of the messageErrorText property.
         * 
         * @return
         *     possible object is
         *     {@link InteractiveFreeText }
         *     
         */
        public InteractiveFreeText getMessageErrorText() {
            return messageErrorText;
        }

        /**
         * Sets the value of the messageErrorText property.
         * 
         * @param value
         *     allowed object is
         *     {@link InteractiveFreeText }
         *     
         */
        public void setMessageErrorText(InteractiveFreeText value) {
            this.messageErrorText = value;
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
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/PNRACC_11_1_1A}OriginAndDestinationDetails"/>
     *         &lt;element name="itineraryInfo" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment"/>
     *                   &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation" minOccurs="0"/>
     *                   &lt;element name="itineraryMessageAction" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MessageActionDetails" minOccurs="0"/>
     *                   &lt;element name="itineraryReservationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_21000S" minOccurs="0"/>
     *                   &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RelatedProductInformation" minOccurs="0"/>
     *                   &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_99946S" minOccurs="0"/>
     *                   &lt;element name="flightDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalProductDetails" minOccurs="0"/>
     *                   &lt;element name="cabinDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CabinDetails" minOccurs="0"/>
     *                   &lt;element name="selectionDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails" minOccurs="0"/>
     *                   &lt;element name="itineraryfreeFormText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="itineraryFreetext" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LongFreeText" minOccurs="0"/>
     *                   &lt;element name="hotelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelProductInformation" minOccurs="0"/>
     *                   &lt;element name="rateInformations" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RateInformation" minOccurs="0"/>
     *                   &lt;element name="generalOption" type="{http://xml.amadeus.com/PNRACC_11_1_1A}GeneralOption" maxOccurs="199" minOccurs="0"/>
     *                   &lt;element name="country" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CountryCodeList" minOccurs="0"/>
     *                   &lt;element name="itineraryMonetaryInformations" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" maxOccurs="20" minOccurs="0"/>
     *                   &lt;element name="taxInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TaxDetails" maxOccurs="3" minOccurs="0"/>
     *                   &lt;element name="customerTransactionData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CustomerTransactionData" minOccurs="0"/>
     *                   &lt;element name="yieldGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="yieldData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ODKeyPerformanceData"/>
     *                             &lt;element name="yieldDataGroup" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ONDType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="legInfo" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="markerLegInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FlightSegmentDetails"/>
     *                             &lt;element name="legTravelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_99362S"/>
     *                             &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText_99363S" maxOccurs="2" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DateAndTimeInformation" minOccurs="0"/>
     *                   &lt;element name="lccTypicalData" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="lccFareData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_28460S"/>
     *                             &lt;element name="lccConnectionData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemReferencesAndVersions_6550S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="insuranceInformation" maxOccurs="198" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="insuranceName" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceName"/>
     *                             &lt;element name="insuranceMonetaryInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" minOccurs="0"/>
     *                             &lt;element name="insurancePremiumInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInsuranceInformation" minOccurs="0"/>
     *                             &lt;element name="insuranceDocInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerDocumentInformation" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="insuranceDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceBusinessDataType" minOccurs="0"/>
     *                   &lt;element name="hotelReservationInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="hotelPropertyInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelProperty"/>
     *                             &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation"/>
     *                             &lt;element name="requestedDates" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_11026S"/>
     *                             &lt;element name="roomRateDetails" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom"/>
     *                                       &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
     *                                       &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation"/>
     *                                       &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_21000S" maxOccurs="3"/>
     *                             &lt;element name="roomstayIndex" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemNumber_33258S" minOccurs="0"/>
     *                             &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_21014S"/>
     *                             &lt;element name="billableInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}BillableInformation" minOccurs="0"/>
     *                             &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ConsumerReferenceInformation" minOccurs="0"/>
     *                             &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationCode" minOccurs="0"/>
     *                             &lt;element name="guaranteeOrDeposit" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PaymentInformation_99388S"/>
     *                                       &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_29553S" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="textOptions" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_664S" maxOccurs="5" minOccurs="0"/>
     *                             &lt;element name="savingAmountInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" minOccurs="0"/>
     *                             &lt;element name="writtenConfirmationContact" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ContactInformation" minOccurs="0"/>
     *                             &lt;element name="writtenConfirmationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NameAndAddress" minOccurs="0"/>
     *                             &lt;element name="documentInformationDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DocumentInformationDetails_9936S" minOccurs="0"/>
     *                             &lt;element name="arrivalFlightDetails" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_26981S"/>
     *                                       &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalTransportDetails"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="bookingIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_99582S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="typicalCarData" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}VehicleInformation"/>
     *                             &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
     *                             &lt;element name="voucherPrintAck" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_84639S" minOccurs="0"/>
     *                             &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation"/>
     *                             &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84634S" maxOccurs="6"/>
     *                             &lt;element name="deliveryAndCollection" maxOccurs="2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_31454S"/>
     *                                       &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84645S"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="pickupDropoffTimes" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S"/>
     *                             &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_84638S" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="rateCodeGroup" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FareQualifierDetails"/>
     *                                       &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="fFlyerNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationCode_84632S" minOccurs="0"/>
     *                             &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ConsumerReferenceInformation" minOccurs="0"/>
     *                             &lt;element name="rateInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84641S" maxOccurs="10" minOccurs="0"/>
     *                             &lt;element name="errorWarning" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation_84657S"/>
     *                                       &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="rulesPoliciesGroup" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
     *                                       &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails_84647S" minOccurs="0"/>
     *                                       &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
     *                                       &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S"/>
     *                                                 &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
     *                                                 &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
     *                                                           &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84654S"/>
     *                                                           &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
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
     *                                       &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation_84655S"/>
     *                                                 &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S" maxOccurs="2" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84651S"/>
     *                                                 &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_84650S" minOccurs="0"/>
     *                                                 &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84653S" maxOccurs="10" minOccurs="0"/>
     *                                                 &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84652S" maxOccurs="2" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
     *                                                 &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
     *                                                           &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84649S" minOccurs="0"/>
     *                                                 &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S" maxOccurs="6"/>
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
     *                             &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_84631S" minOccurs="0"/>
     *                             &lt;element name="billingData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}BillableInformation" minOccurs="0"/>
     *                             &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalBusinessSourceInformation" minOccurs="0"/>
     *                             &lt;element name="inclusiveTour" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourInformation" minOccurs="0"/>
     *                             &lt;element name="marketingInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="supleInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_84635S" maxOccurs="6" minOccurs="0"/>
     *                             &lt;element name="estimatedDistance" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity_84637S" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="agentInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Name_84636S" minOccurs="0"/>
     *                             &lt;element name="trackingOpt" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AgreementIdentification" minOccurs="0"/>
     *                             &lt;element name="electronicVoucherNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TicketNumberDetails" minOccurs="0"/>
     *                             &lt;element name="customerEmail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CommunicationContact" minOccurs="0"/>
     *                             &lt;element name="attribute" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Attribute_84627S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="typicalCruiseData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CruiseBusinessDataType" minOccurs="0"/>
     *                   &lt;element name="railInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TrainInformationType" minOccurs="0"/>
     *                   &lt;element name="markerRailTour" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
     *                   &lt;element name="tourInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourInformationType" minOccurs="0"/>
     *                   &lt;element name="ferryLegInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FerryBookingDescriptionType" minOccurs="0"/>
     *                   &lt;element name="errorInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="errorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
     *                             &lt;element name="errorfreeFormText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="referenceForSegment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
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
        "originDestination",
        "itineraryInfo"
    })
    public static class OriginDestinationDetails {

        @XmlElement(required = true)
        protected OriginAndDestinationDetails originDestination;
        protected List<PNRReply.OriginDestinationDetails.ItineraryInfo> itineraryInfo;

        /**
         * Gets the value of the originDestination property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationDetails }
         *     
         */
        public OriginAndDestinationDetails getOriginDestination() {
            return originDestination;
        }

        /**
         * Sets the value of the originDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationDetails }
         *     
         */
        public void setOriginDestination(OriginAndDestinationDetails value) {
            this.originDestination = value;
        }

        /**
         * Gets the value of the itineraryInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itineraryInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItineraryInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRReply.OriginDestinationDetails.ItineraryInfo }
         * 
         * 
         */
        public List<PNRReply.OriginDestinationDetails.ItineraryInfo> getItineraryInfo() {
            if (itineraryInfo == null) {
                itineraryInfo = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo>();
            }
            return this.itineraryInfo;
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
         *         &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment"/>
         *         &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation" minOccurs="0"/>
         *         &lt;element name="itineraryMessageAction" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MessageActionDetails" minOccurs="0"/>
         *         &lt;element name="itineraryReservationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_21000S" minOccurs="0"/>
         *         &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RelatedProductInformation" minOccurs="0"/>
         *         &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_99946S" minOccurs="0"/>
         *         &lt;element name="flightDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalProductDetails" minOccurs="0"/>
         *         &lt;element name="cabinDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CabinDetails" minOccurs="0"/>
         *         &lt;element name="selectionDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails" minOccurs="0"/>
         *         &lt;element name="itineraryfreeFormText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="itineraryFreetext" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LongFreeText" minOccurs="0"/>
         *         &lt;element name="hotelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelProductInformation" minOccurs="0"/>
         *         &lt;element name="rateInformations" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RateInformation" minOccurs="0"/>
         *         &lt;element name="generalOption" type="{http://xml.amadeus.com/PNRACC_11_1_1A}GeneralOption" maxOccurs="199" minOccurs="0"/>
         *         &lt;element name="country" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CountryCodeList" minOccurs="0"/>
         *         &lt;element name="itineraryMonetaryInformations" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" maxOccurs="20" minOccurs="0"/>
         *         &lt;element name="taxInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TaxDetails" maxOccurs="3" minOccurs="0"/>
         *         &lt;element name="customerTransactionData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CustomerTransactionData" minOccurs="0"/>
         *         &lt;element name="yieldGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="yieldData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ODKeyPerformanceData"/>
         *                   &lt;element name="yieldDataGroup" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ONDType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="legInfo" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="markerLegInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FlightSegmentDetails"/>
         *                   &lt;element name="legTravelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_99362S"/>
         *                   &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText_99363S" maxOccurs="2" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DateAndTimeInformation" minOccurs="0"/>
         *         &lt;element name="lccTypicalData" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="lccFareData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_28460S"/>
         *                   &lt;element name="lccConnectionData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemReferencesAndVersions_6550S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="insuranceInformation" maxOccurs="198" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="insuranceName" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceName"/>
         *                   &lt;element name="insuranceMonetaryInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" minOccurs="0"/>
         *                   &lt;element name="insurancePremiumInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInsuranceInformation" minOccurs="0"/>
         *                   &lt;element name="insuranceDocInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerDocumentInformation" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="insuranceDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceBusinessDataType" minOccurs="0"/>
         *         &lt;element name="hotelReservationInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="hotelPropertyInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelProperty"/>
         *                   &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation"/>
         *                   &lt;element name="requestedDates" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_11026S"/>
         *                   &lt;element name="roomRateDetails" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom"/>
         *                             &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
         *                             &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation"/>
         *                             &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_21000S" maxOccurs="3"/>
         *                   &lt;element name="roomstayIndex" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemNumber_33258S" minOccurs="0"/>
         *                   &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_21014S"/>
         *                   &lt;element name="billableInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}BillableInformation" minOccurs="0"/>
         *                   &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ConsumerReferenceInformation" minOccurs="0"/>
         *                   &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationCode" minOccurs="0"/>
         *                   &lt;element name="guaranteeOrDeposit" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PaymentInformation_99388S"/>
         *                             &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_29553S" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="textOptions" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_664S" maxOccurs="5" minOccurs="0"/>
         *                   &lt;element name="savingAmountInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" minOccurs="0"/>
         *                   &lt;element name="writtenConfirmationContact" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ContactInformation" minOccurs="0"/>
         *                   &lt;element name="writtenConfirmationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NameAndAddress" minOccurs="0"/>
         *                   &lt;element name="documentInformationDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DocumentInformationDetails_9936S" minOccurs="0"/>
         *                   &lt;element name="arrivalFlightDetails" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_26981S"/>
         *                             &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalTransportDetails"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="bookingIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_99582S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="typicalCarData" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}VehicleInformation"/>
         *                   &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
         *                   &lt;element name="voucherPrintAck" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_84639S" minOccurs="0"/>
         *                   &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation"/>
         *                   &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84634S" maxOccurs="6"/>
         *                   &lt;element name="deliveryAndCollection" maxOccurs="2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_31454S"/>
         *                             &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84645S"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="pickupDropoffTimes" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S"/>
         *                   &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_84638S" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="rateCodeGroup" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FareQualifierDetails"/>
         *                             &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="fFlyerNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationCode_84632S" minOccurs="0"/>
         *                   &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ConsumerReferenceInformation" minOccurs="0"/>
         *                   &lt;element name="rateInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84641S" maxOccurs="10" minOccurs="0"/>
         *                   &lt;element name="errorWarning" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation_84657S"/>
         *                             &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="rulesPoliciesGroup" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
         *                             &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails_84647S" minOccurs="0"/>
         *                             &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
         *                             &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S"/>
         *                                       &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
         *                                       &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
         *                                                 &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84654S"/>
         *                                                 &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
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
         *                             &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation_84655S"/>
         *                                       &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S" maxOccurs="2" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84651S"/>
         *                                       &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_84650S" minOccurs="0"/>
         *                                       &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84653S" maxOccurs="10" minOccurs="0"/>
         *                                       &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84652S" maxOccurs="2" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
         *                                       &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
         *                                                 &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84649S" minOccurs="0"/>
         *                                       &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S" maxOccurs="6"/>
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
         *                   &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_84631S" minOccurs="0"/>
         *                   &lt;element name="billingData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}BillableInformation" minOccurs="0"/>
         *                   &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalBusinessSourceInformation" minOccurs="0"/>
         *                   &lt;element name="inclusiveTour" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourInformation" minOccurs="0"/>
         *                   &lt;element name="marketingInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="supleInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_84635S" maxOccurs="6" minOccurs="0"/>
         *                   &lt;element name="estimatedDistance" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity_84637S" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="agentInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Name_84636S" minOccurs="0"/>
         *                   &lt;element name="trackingOpt" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AgreementIdentification" minOccurs="0"/>
         *                   &lt;element name="electronicVoucherNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TicketNumberDetails" minOccurs="0"/>
         *                   &lt;element name="customerEmail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CommunicationContact" minOccurs="0"/>
         *                   &lt;element name="attribute" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Attribute_84627S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="typicalCruiseData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CruiseBusinessDataType" minOccurs="0"/>
         *         &lt;element name="railInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TrainInformationType" minOccurs="0"/>
         *         &lt;element name="markerRailTour" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
         *         &lt;element name="tourInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourInformationType" minOccurs="0"/>
         *         &lt;element name="ferryLegInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FerryBookingDescriptionType" minOccurs="0"/>
         *         &lt;element name="errorInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="errorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
         *                   &lt;element name="errorfreeFormText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="referenceForSegment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
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
            "elementManagementItinerary",
            "travelProduct",
            "itineraryMessageAction",
            "itineraryReservationInfo",
            "relatedProduct",
            "elementsIndicators",
            "flightDetail",
            "cabinDetails",
            "selectionDetails",
            "itineraryfreeFormText",
            "itineraryFreetext",
            "hotelProduct",
            "rateInformations",
            "generalOption",
            "country",
            "itineraryMonetaryInformations",
            "taxInformation",
            "customerTransactionData",
            "yieldGroup",
            "legInfo",
            "dateTimeDetails",
            "lccTypicalData",
            "insuranceInformation",
            "insuranceDetails",
            "hotelReservationInfo",
            "typicalCarData",
            "typicalCruiseData",
            "railInfo",
            "markerRailTour",
            "tourInfo",
            "ferryLegInformation",
            "errorInfo",
            "referenceForSegment"
        })
        public static class ItineraryInfo {

            @XmlElement(required = true)
            protected ElementManagementSegment elementManagementItinerary;
            protected TravelProductInformation travelProduct;
            protected MessageActionDetails itineraryMessageAction;
            protected ReservationControlInformation21000S itineraryReservationInfo;
            protected RelatedProductInformation relatedProduct;
            protected StatusDetails99946S elementsIndicators;
            protected AdditionalProductDetails flightDetail;
            protected CabinDetails cabinDetails;
            protected SelectionDetails selectionDetails;
            protected List<InteractiveFreeText> itineraryfreeFormText;
            protected LongFreeText itineraryFreetext;
            protected HotelProductInformation hotelProduct;
            protected RateInformation rateInformations;
            protected List<GeneralOption> generalOption;
            protected CountryCodeList country;
            protected List<MonetaryInformation1689S> itineraryMonetaryInformations;
            protected List<TaxDetails> taxInformation;
            protected CustomerTransactionData customerTransactionData;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup yieldGroup;
            protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.LegInfo> legInfo;
            protected DateAndTimeInformation dateTimeDetails;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData lccTypicalData;
            protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.InsuranceInformation> insuranceInformation;
            protected InsuranceBusinessDataType insuranceDetails;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo hotelReservationInfo;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData typicalCarData;
            protected CruiseBusinessDataType typicalCruiseData;
            protected TrainInformationType railInfo;
            @XmlElement(required = true)
            protected DummySegment markerRailTour;
            protected TourInformationType tourInfo;
            protected FerryBookingDescriptionType ferryLegInformation;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.ErrorInfo errorInfo;
            protected ReferenceInformation referenceForSegment;

            /**
             * Gets the value of the elementManagementItinerary property.
             * 
             * @return
             *     possible object is
             *     {@link ElementManagementSegment }
             *     
             */
            public ElementManagementSegment getElementManagementItinerary() {
                return elementManagementItinerary;
            }

            /**
             * Sets the value of the elementManagementItinerary property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElementManagementSegment }
             *     
             */
            public void setElementManagementItinerary(ElementManagementSegment value) {
                this.elementManagementItinerary = value;
            }

            /**
             * Gets the value of the travelProduct property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformation }
             *     
             */
            public TravelProductInformation getTravelProduct() {
                return travelProduct;
            }

            /**
             * Sets the value of the travelProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformation }
             *     
             */
            public void setTravelProduct(TravelProductInformation value) {
                this.travelProduct = value;
            }

            /**
             * Gets the value of the itineraryMessageAction property.
             * 
             * @return
             *     possible object is
             *     {@link MessageActionDetails }
             *     
             */
            public MessageActionDetails getItineraryMessageAction() {
                return itineraryMessageAction;
            }

            /**
             * Sets the value of the itineraryMessageAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link MessageActionDetails }
             *     
             */
            public void setItineraryMessageAction(MessageActionDetails value) {
                this.itineraryMessageAction = value;
            }

            /**
             * Gets the value of the itineraryReservationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ReservationControlInformation21000S }
             *     
             */
            public ReservationControlInformation21000S getItineraryReservationInfo() {
                return itineraryReservationInfo;
            }

            /**
             * Sets the value of the itineraryReservationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReservationControlInformation21000S }
             *     
             */
            public void setItineraryReservationInfo(ReservationControlInformation21000S value) {
                this.itineraryReservationInfo = value;
            }

            /**
             * Gets the value of the relatedProduct property.
             * 
             * @return
             *     possible object is
             *     {@link RelatedProductInformation }
             *     
             */
            public RelatedProductInformation getRelatedProduct() {
                return relatedProduct;
            }

            /**
             * Sets the value of the relatedProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link RelatedProductInformation }
             *     
             */
            public void setRelatedProduct(RelatedProductInformation value) {
                this.relatedProduct = value;
            }

            /**
             * Gets the value of the elementsIndicators property.
             * 
             * @return
             *     possible object is
             *     {@link StatusDetails99946S }
             *     
             */
            public StatusDetails99946S getElementsIndicators() {
                return elementsIndicators;
            }

            /**
             * Sets the value of the elementsIndicators property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusDetails99946S }
             *     
             */
            public void setElementsIndicators(StatusDetails99946S value) {
                this.elementsIndicators = value;
            }

            /**
             * Gets the value of the flightDetail property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalProductDetails }
             *     
             */
            public AdditionalProductDetails getFlightDetail() {
                return flightDetail;
            }

            /**
             * Sets the value of the flightDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalProductDetails }
             *     
             */
            public void setFlightDetail(AdditionalProductDetails value) {
                this.flightDetail = value;
            }

            /**
             * Gets the value of the cabinDetails property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetails }
             *     
             */
            public CabinDetails getCabinDetails() {
                return cabinDetails;
            }

            /**
             * Sets the value of the cabinDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetails }
             *     
             */
            public void setCabinDetails(CabinDetails value) {
                this.cabinDetails = value;
            }

            /**
             * Gets the value of the selectionDetails property.
             * 
             * @return
             *     possible object is
             *     {@link SelectionDetails }
             *     
             */
            public SelectionDetails getSelectionDetails() {
                return selectionDetails;
            }

            /**
             * Sets the value of the selectionDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link SelectionDetails }
             *     
             */
            public void setSelectionDetails(SelectionDetails value) {
                this.selectionDetails = value;
            }

            /**
             * Gets the value of the itineraryfreeFormText property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the itineraryfreeFormText property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItineraryfreeFormText().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InteractiveFreeText }
             * 
             * 
             */
            public List<InteractiveFreeText> getItineraryfreeFormText() {
                if (itineraryfreeFormText == null) {
                    itineraryfreeFormText = new ArrayList<InteractiveFreeText>();
                }
                return this.itineraryfreeFormText;
            }

            /**
             * Gets the value of the itineraryFreetext property.
             * 
             * @return
             *     possible object is
             *     {@link LongFreeText }
             *     
             */
            public LongFreeText getItineraryFreetext() {
                return itineraryFreetext;
            }

            /**
             * Sets the value of the itineraryFreetext property.
             * 
             * @param value
             *     allowed object is
             *     {@link LongFreeText }
             *     
             */
            public void setItineraryFreetext(LongFreeText value) {
                this.itineraryFreetext = value;
            }

            /**
             * Gets the value of the hotelProduct property.
             * 
             * @return
             *     possible object is
             *     {@link HotelProductInformation }
             *     
             */
            public HotelProductInformation getHotelProduct() {
                return hotelProduct;
            }

            /**
             * Sets the value of the hotelProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link HotelProductInformation }
             *     
             */
            public void setHotelProduct(HotelProductInformation value) {
                this.hotelProduct = value;
            }

            /**
             * Gets the value of the rateInformations property.
             * 
             * @return
             *     possible object is
             *     {@link RateInformation }
             *     
             */
            public RateInformation getRateInformations() {
                return rateInformations;
            }

            /**
             * Sets the value of the rateInformations property.
             * 
             * @param value
             *     allowed object is
             *     {@link RateInformation }
             *     
             */
            public void setRateInformations(RateInformation value) {
                this.rateInformations = value;
            }

            /**
             * Gets the value of the generalOption property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the generalOption property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGeneralOption().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GeneralOption }
             * 
             * 
             */
            public List<GeneralOption> getGeneralOption() {
                if (generalOption == null) {
                    generalOption = new ArrayList<GeneralOption>();
                }
                return this.generalOption;
            }

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link CountryCodeList }
             *     
             */
            public CountryCodeList getCountry() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link CountryCodeList }
             *     
             */
            public void setCountry(CountryCodeList value) {
                this.country = value;
            }

            /**
             * Gets the value of the itineraryMonetaryInformations property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the itineraryMonetaryInformations property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItineraryMonetaryInformations().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MonetaryInformation1689S }
             * 
             * 
             */
            public List<MonetaryInformation1689S> getItineraryMonetaryInformations() {
                if (itineraryMonetaryInformations == null) {
                    itineraryMonetaryInformations = new ArrayList<MonetaryInformation1689S>();
                }
                return this.itineraryMonetaryInformations;
            }

            /**
             * Gets the value of the taxInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taxInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTaxInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TaxDetails }
             * 
             * 
             */
            public List<TaxDetails> getTaxInformation() {
                if (taxInformation == null) {
                    taxInformation = new ArrayList<TaxDetails>();
                }
                return this.taxInformation;
            }

            /**
             * Gets the value of the customerTransactionData property.
             * 
             * @return
             *     possible object is
             *     {@link CustomerTransactionData }
             *     
             */
            public CustomerTransactionData getCustomerTransactionData() {
                return customerTransactionData;
            }

            /**
             * Sets the value of the customerTransactionData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustomerTransactionData }
             *     
             */
            public void setCustomerTransactionData(CustomerTransactionData value) {
                this.customerTransactionData = value;
            }

            /**
             * Gets the value of the yieldGroup property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup getYieldGroup() {
                return yieldGroup;
            }

            /**
             * Sets the value of the yieldGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup }
             *     
             */
            public void setYieldGroup(PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup value) {
                this.yieldGroup = value;
            }

            /**
             * Gets the value of the legInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the legInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLegInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.LegInfo }
             * 
             * 
             */
            public List<PNRReply.OriginDestinationDetails.ItineraryInfo.LegInfo> getLegInfo() {
                if (legInfo == null) {
                    legInfo = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.LegInfo>();
                }
                return this.legInfo;
            }

            /**
             * Gets the value of the dateTimeDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformation }
             *     
             */
            public DateAndTimeInformation getDateTimeDetails() {
                return dateTimeDetails;
            }

            /**
             * Sets the value of the dateTimeDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformation }
             *     
             */
            public void setDateTimeDetails(DateAndTimeInformation value) {
                this.dateTimeDetails = value;
            }

            /**
             * Gets the value of the lccTypicalData property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData getLccTypicalData() {
                return lccTypicalData;
            }

            /**
             * Sets the value of the lccTypicalData property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData }
             *     
             */
            public void setLccTypicalData(PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData value) {
                this.lccTypicalData = value;
            }

            /**
             * Gets the value of the insuranceInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the insuranceInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInsuranceInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.InsuranceInformation }
             * 
             * 
             */
            public List<PNRReply.OriginDestinationDetails.ItineraryInfo.InsuranceInformation> getInsuranceInformation() {
                if (insuranceInformation == null) {
                    insuranceInformation = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.InsuranceInformation>();
                }
                return this.insuranceInformation;
            }

            /**
             * Gets the value of the insuranceDetails property.
             * 
             * @return
             *     possible object is
             *     {@link InsuranceBusinessDataType }
             *     
             */
            public InsuranceBusinessDataType getInsuranceDetails() {
                return insuranceDetails;
            }

            /**
             * Sets the value of the insuranceDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link InsuranceBusinessDataType }
             *     
             */
            public void setInsuranceDetails(InsuranceBusinessDataType value) {
                this.insuranceDetails = value;
            }

            /**
             * Gets the value of the hotelReservationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo getHotelReservationInfo() {
                return hotelReservationInfo;
            }

            /**
             * Sets the value of the hotelReservationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo }
             *     
             */
            public void setHotelReservationInfo(PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo value) {
                this.hotelReservationInfo = value;
            }

            /**
             * Gets the value of the typicalCarData property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData getTypicalCarData() {
                return typicalCarData;
            }

            /**
             * Sets the value of the typicalCarData property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData }
             *     
             */
            public void setTypicalCarData(PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData value) {
                this.typicalCarData = value;
            }

            /**
             * Gets the value of the typicalCruiseData property.
             * 
             * @return
             *     possible object is
             *     {@link CruiseBusinessDataType }
             *     
             */
            public CruiseBusinessDataType getTypicalCruiseData() {
                return typicalCruiseData;
            }

            /**
             * Sets the value of the typicalCruiseData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CruiseBusinessDataType }
             *     
             */
            public void setTypicalCruiseData(CruiseBusinessDataType value) {
                this.typicalCruiseData = value;
            }

            /**
             * Gets the value of the railInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TrainInformationType }
             *     
             */
            public TrainInformationType getRailInfo() {
                return railInfo;
            }

            /**
             * Sets the value of the railInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TrainInformationType }
             *     
             */
            public void setRailInfo(TrainInformationType value) {
                this.railInfo = value;
            }

            /**
             * Gets the value of the markerRailTour property.
             * 
             * @return
             *     possible object is
             *     {@link DummySegment }
             *     
             */
            public DummySegment getMarkerRailTour() {
                return markerRailTour;
            }

            /**
             * Sets the value of the markerRailTour property.
             * 
             * @param value
             *     allowed object is
             *     {@link DummySegment }
             *     
             */
            public void setMarkerRailTour(DummySegment value) {
                this.markerRailTour = value;
            }

            /**
             * Gets the value of the tourInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TourInformationType }
             *     
             */
            public TourInformationType getTourInfo() {
                return tourInfo;
            }

            /**
             * Sets the value of the tourInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TourInformationType }
             *     
             */
            public void setTourInfo(TourInformationType value) {
                this.tourInfo = value;
            }

            /**
             * Gets the value of the ferryLegInformation property.
             * 
             * @return
             *     possible object is
             *     {@link FerryBookingDescriptionType }
             *     
             */
            public FerryBookingDescriptionType getFerryLegInformation() {
                return ferryLegInformation;
            }

            /**
             * Sets the value of the ferryLegInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link FerryBookingDescriptionType }
             *     
             */
            public void setFerryLegInformation(FerryBookingDescriptionType value) {
                this.ferryLegInformation = value;
            }

            /**
             * Gets the value of the errorInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.ErrorInfo }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.ErrorInfo getErrorInfo() {
                return errorInfo;
            }

            /**
             * Sets the value of the errorInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.ErrorInfo }
             *     
             */
            public void setErrorInfo(PNRReply.OriginDestinationDetails.ItineraryInfo.ErrorInfo value) {
                this.errorInfo = value;
            }

            /**
             * Gets the value of the referenceForSegment property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInformation }
             *     
             */
            public ReferenceInformation getReferenceForSegment() {
                return referenceForSegment;
            }

            /**
             * Sets the value of the referenceForSegment property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInformation }
             *     
             */
            public void setReferenceForSegment(ReferenceInformation value) {
                this.referenceForSegment = value;
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
             *         &lt;element name="errorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
             *         &lt;element name="errorfreeFormText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
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
                "errorInformation",
                "errorfreeFormText"
            })
            public static class ErrorInfo {

                @XmlElement(required = true)
                protected ApplicationErrorInformation errorInformation;
                protected InteractiveFreeText errorfreeFormText;

                /**
                 * Gets the value of the errorInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ApplicationErrorInformation }
                 *     
                 */
                public ApplicationErrorInformation getErrorInformation() {
                    return errorInformation;
                }

                /**
                 * Sets the value of the errorInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ApplicationErrorInformation }
                 *     
                 */
                public void setErrorInformation(ApplicationErrorInformation value) {
                    this.errorInformation = value;
                }

                /**
                 * Gets the value of the errorfreeFormText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InteractiveFreeText }
                 *     
                 */
                public InteractiveFreeText getErrorfreeFormText() {
                    return errorfreeFormText;
                }

                /**
                 * Sets the value of the errorfreeFormText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InteractiveFreeText }
                 *     
                 */
                public void setErrorfreeFormText(InteractiveFreeText value) {
                    this.errorfreeFormText = value;
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
             *         &lt;element name="hotelPropertyInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelProperty"/>
             *         &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation"/>
             *         &lt;element name="requestedDates" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_11026S"/>
             *         &lt;element name="roomRateDetails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom"/>
             *                   &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
             *                   &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation"/>
             *                   &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_21000S" maxOccurs="3"/>
             *         &lt;element name="roomstayIndex" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemNumber_33258S" minOccurs="0"/>
             *         &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_21014S"/>
             *         &lt;element name="billableInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}BillableInformation" minOccurs="0"/>
             *         &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ConsumerReferenceInformation" minOccurs="0"/>
             *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationCode" minOccurs="0"/>
             *         &lt;element name="guaranteeOrDeposit" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PaymentInformation_99388S"/>
             *                   &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_29553S" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="textOptions" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_664S" maxOccurs="5" minOccurs="0"/>
             *         &lt;element name="savingAmountInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" minOccurs="0"/>
             *         &lt;element name="writtenConfirmationContact" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ContactInformation" minOccurs="0"/>
             *         &lt;element name="writtenConfirmationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NameAndAddress" minOccurs="0"/>
             *         &lt;element name="documentInformationDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DocumentInformationDetails_9936S" minOccurs="0"/>
             *         &lt;element name="arrivalFlightDetails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_26981S"/>
             *                   &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalTransportDetails"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="bookingIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_99582S" minOccurs="0"/>
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
                "hotelPropertyInfo",
                "companyIdentification",
                "requestedDates",
                "roomRateDetails",
                "cancelOrConfirmNbr",
                "roomstayIndex",
                "bookingSource",
                "billableInfo",
                "customerInfo",
                "frequentTravellerInfo",
                "guaranteeOrDeposit",
                "textOptions",
                "savingAmountInfo",
                "writtenConfirmationContact",
                "writtenConfirmationInfo",
                "documentInformationDetails",
                "arrivalFlightDetails",
                "bookingIndicator"
            })
            public static class HotelReservationInfo {

                @XmlElement(required = true)
                protected HotelProperty hotelPropertyInfo;
                @XmlElement(required = true)
                protected NonAirCompanyInformation companyIdentification;
                @XmlElement(required = true)
                protected StructuredPeriodInformation11026S requestedDates;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails roomRateDetails;
                @XmlElement(required = true)
                protected List<ReservationControlInformation21000S> cancelOrConfirmNbr;
                protected ItemNumber33258S roomstayIndex;
                @XmlElement(required = true)
                protected UserIdentification21014S bookingSource;
                protected BillableInformation billableInfo;
                protected ConsumerReferenceInformation customerInfo;
                protected FrequentTravellerIdentificationCode frequentTravellerInfo;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit guaranteeOrDeposit;
                protected List<MiscellaneousRemarks664S> textOptions;
                protected MonetaryInformation1689S savingAmountInfo;
                protected ContactInformation writtenConfirmationContact;
                protected NameAndAddress writtenConfirmationInfo;
                protected DocumentInformationDetails9936S documentInformationDetails;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails arrivalFlightDetails;
                protected StatusDetails99582S bookingIndicator;

                /**
                 * Gets the value of the hotelPropertyInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link HotelProperty }
                 *     
                 */
                public HotelProperty getHotelPropertyInfo() {
                    return hotelPropertyInfo;
                }

                /**
                 * Sets the value of the hotelPropertyInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link HotelProperty }
                 *     
                 */
                public void setHotelPropertyInfo(HotelProperty value) {
                    this.hotelPropertyInfo = value;
                }

                /**
                 * Gets the value of the companyIdentification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NonAirCompanyInformation }
                 *     
                 */
                public NonAirCompanyInformation getCompanyIdentification() {
                    return companyIdentification;
                }

                /**
                 * Sets the value of the companyIdentification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NonAirCompanyInformation }
                 *     
                 */
                public void setCompanyIdentification(NonAirCompanyInformation value) {
                    this.companyIdentification = value;
                }

                /**
                 * Gets the value of the requestedDates property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StructuredPeriodInformation11026S }
                 *     
                 */
                public StructuredPeriodInformation11026S getRequestedDates() {
                    return requestedDates;
                }

                /**
                 * Sets the value of the requestedDates property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StructuredPeriodInformation11026S }
                 *     
                 */
                public void setRequestedDates(StructuredPeriodInformation11026S value) {
                    this.requestedDates = value;
                }

                /**
                 * Gets the value of the roomRateDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails getRoomRateDetails() {
                    return roomRateDetails;
                }

                /**
                 * Sets the value of the roomRateDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails }
                 *     
                 */
                public void setRoomRateDetails(PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails value) {
                    this.roomRateDetails = value;
                }

                /**
                 * Gets the value of the cancelOrConfirmNbr property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cancelOrConfirmNbr property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCancelOrConfirmNbr().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReservationControlInformation21000S }
                 * 
                 * 
                 */
                public List<ReservationControlInformation21000S> getCancelOrConfirmNbr() {
                    if (cancelOrConfirmNbr == null) {
                        cancelOrConfirmNbr = new ArrayList<ReservationControlInformation21000S>();
                    }
                    return this.cancelOrConfirmNbr;
                }

                /**
                 * Gets the value of the roomstayIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemNumber33258S }
                 *     
                 */
                public ItemNumber33258S getRoomstayIndex() {
                    return roomstayIndex;
                }

                /**
                 * Sets the value of the roomstayIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemNumber33258S }
                 *     
                 */
                public void setRoomstayIndex(ItemNumber33258S value) {
                    this.roomstayIndex = value;
                }

                /**
                 * Gets the value of the bookingSource property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserIdentification21014S }
                 *     
                 */
                public UserIdentification21014S getBookingSource() {
                    return bookingSource;
                }

                /**
                 * Sets the value of the bookingSource property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserIdentification21014S }
                 *     
                 */
                public void setBookingSource(UserIdentification21014S value) {
                    this.bookingSource = value;
                }

                /**
                 * Gets the value of the billableInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BillableInformation }
                 *     
                 */
                public BillableInformation getBillableInfo() {
                    return billableInfo;
                }

                /**
                 * Sets the value of the billableInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BillableInformation }
                 *     
                 */
                public void setBillableInfo(BillableInformation value) {
                    this.billableInfo = value;
                }

                /**
                 * Gets the value of the customerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsumerReferenceInformation }
                 *     
                 */
                public ConsumerReferenceInformation getCustomerInfo() {
                    return customerInfo;
                }

                /**
                 * Sets the value of the customerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsumerReferenceInformation }
                 *     
                 */
                public void setCustomerInfo(ConsumerReferenceInformation value) {
                    this.customerInfo = value;
                }

                /**
                 * Gets the value of the frequentTravellerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FrequentTravellerIdentificationCode }
                 *     
                 */
                public FrequentTravellerIdentificationCode getFrequentTravellerInfo() {
                    return frequentTravellerInfo;
                }

                /**
                 * Sets the value of the frequentTravellerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FrequentTravellerIdentificationCode }
                 *     
                 */
                public void setFrequentTravellerInfo(FrequentTravellerIdentificationCode value) {
                    this.frequentTravellerInfo = value;
                }

                /**
                 * Gets the value of the guaranteeOrDeposit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit getGuaranteeOrDeposit() {
                    return guaranteeOrDeposit;
                }

                /**
                 * Sets the value of the guaranteeOrDeposit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit }
                 *     
                 */
                public void setGuaranteeOrDeposit(PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit value) {
                    this.guaranteeOrDeposit = value;
                }

                /**
                 * Gets the value of the textOptions property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the textOptions property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTextOptions().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MiscellaneousRemarks664S }
                 * 
                 * 
                 */
                public List<MiscellaneousRemarks664S> getTextOptions() {
                    if (textOptions == null) {
                        textOptions = new ArrayList<MiscellaneousRemarks664S>();
                    }
                    return this.textOptions;
                }

                /**
                 * Gets the value of the savingAmountInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformation1689S }
                 *     
                 */
                public MonetaryInformation1689S getSavingAmountInfo() {
                    return savingAmountInfo;
                }

                /**
                 * Sets the value of the savingAmountInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformation1689S }
                 *     
                 */
                public void setSavingAmountInfo(MonetaryInformation1689S value) {
                    this.savingAmountInfo = value;
                }

                /**
                 * Gets the value of the writtenConfirmationContact property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ContactInformation }
                 *     
                 */
                public ContactInformation getWrittenConfirmationContact() {
                    return writtenConfirmationContact;
                }

                /**
                 * Sets the value of the writtenConfirmationContact property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ContactInformation }
                 *     
                 */
                public void setWrittenConfirmationContact(ContactInformation value) {
                    this.writtenConfirmationContact = value;
                }

                /**
                 * Gets the value of the writtenConfirmationInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NameAndAddress }
                 *     
                 */
                public NameAndAddress getWrittenConfirmationInfo() {
                    return writtenConfirmationInfo;
                }

                /**
                 * Sets the value of the writtenConfirmationInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NameAndAddress }
                 *     
                 */
                public void setWrittenConfirmationInfo(NameAndAddress value) {
                    this.writtenConfirmationInfo = value;
                }

                /**
                 * Gets the value of the documentInformationDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DocumentInformationDetails9936S }
                 *     
                 */
                public DocumentInformationDetails9936S getDocumentInformationDetails() {
                    return documentInformationDetails;
                }

                /**
                 * Sets the value of the documentInformationDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DocumentInformationDetails9936S }
                 *     
                 */
                public void setDocumentInformationDetails(DocumentInformationDetails9936S value) {
                    this.documentInformationDetails = value;
                }

                /**
                 * Gets the value of the arrivalFlightDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails getArrivalFlightDetails() {
                    return arrivalFlightDetails;
                }

                /**
                 * Sets the value of the arrivalFlightDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails }
                 *     
                 */
                public void setArrivalFlightDetails(PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails value) {
                    this.arrivalFlightDetails = value;
                }

                /**
                 * Gets the value of the bookingIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusDetails99582S }
                 *     
                 */
                public StatusDetails99582S getBookingIndicator() {
                    return bookingIndicator;
                }

                /**
                 * Sets the value of the bookingIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusDetails99582S }
                 *     
                 */
                public void setBookingIndicator(StatusDetails99582S value) {
                    this.bookingIndicator = value;
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
                 *         &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_26981S"/>
                 *         &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalTransportDetails"/>
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
                    "travelProductInformation",
                    "additionalTransportDetails"
                })
                public static class ArrivalFlightDetails {

                    @XmlElement(required = true)
                    protected TravelProductInformation26981S travelProductInformation;
                    @XmlElement(required = true)
                    protected AdditionalTransportDetails additionalTransportDetails;

                    /**
                     * Gets the value of the travelProductInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TravelProductInformation26981S }
                     *     
                     */
                    public TravelProductInformation26981S getTravelProductInformation() {
                        return travelProductInformation;
                    }

                    /**
                     * Sets the value of the travelProductInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TravelProductInformation26981S }
                     *     
                     */
                    public void setTravelProductInformation(TravelProductInformation26981S value) {
                        this.travelProductInformation = value;
                    }

                    /**
                     * Gets the value of the additionalTransportDetails property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AdditionalTransportDetails }
                     *     
                     */
                    public AdditionalTransportDetails getAdditionalTransportDetails() {
                        return additionalTransportDetails;
                    }

                    /**
                     * Sets the value of the additionalTransportDetails property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AdditionalTransportDetails }
                     *     
                     */
                    public void setAdditionalTransportDetails(AdditionalTransportDetails value) {
                        this.additionalTransportDetails = value;
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
                 *         &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PaymentInformation_99388S"/>
                 *         &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_29553S" minOccurs="0"/>
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
                    "paymentInfo",
                    "creditCardInfo"
                })
                public static class GuaranteeOrDeposit {

                    @XmlElement(required = true)
                    protected PaymentInformation99388S paymentInfo;
                    protected FormOfPayment29553S creditCardInfo;

                    /**
                     * Gets the value of the paymentInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PaymentInformation99388S }
                     *     
                     */
                    public PaymentInformation99388S getPaymentInfo() {
                        return paymentInfo;
                    }

                    /**
                     * Sets the value of the paymentInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PaymentInformation99388S }
                     *     
                     */
                    public void setPaymentInfo(PaymentInformation99388S value) {
                        this.paymentInfo = value;
                    }

                    /**
                     * Gets the value of the creditCardInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FormOfPayment29553S }
                     *     
                     */
                    public FormOfPayment29553S getCreditCardInfo() {
                        return creditCardInfo;
                    }

                    /**
                     * Sets the value of the creditCardInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FormOfPayment29553S }
                     *     
                     */
                    public void setCreditCardInfo(FormOfPayment29553S value) {
                        this.creditCardInfo = value;
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
                 *         &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom"/>
                 *         &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
                 *         &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation"/>
                 *         &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation" minOccurs="0"/>
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
                    "roomInformation",
                    "children",
                    "tariffDetails",
                    "rateCodeIndicator"
                })
                public static class RoomRateDetails {

                    @XmlElement(required = true)
                    protected HotelRoom roomInformation;
                    protected List<ChildrenGroupType> children;
                    @XmlElement(required = true)
                    protected TariffInformation tariffDetails;
                    protected RuleInformation rateCodeIndicator;

                    /**
                     * Gets the value of the roomInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link HotelRoom }
                     *     
                     */
                    public HotelRoom getRoomInformation() {
                        return roomInformation;
                    }

                    /**
                     * Sets the value of the roomInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link HotelRoom }
                     *     
                     */
                    public void setRoomInformation(HotelRoom value) {
                        this.roomInformation = value;
                    }

                    /**
                     * Gets the value of the children property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the children property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getChildren().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ChildrenGroupType }
                     * 
                     * 
                     */
                    public List<ChildrenGroupType> getChildren() {
                        if (children == null) {
                            children = new ArrayList<ChildrenGroupType>();
                        }
                        return this.children;
                    }

                    /**
                     * Gets the value of the tariffDetails property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TariffInformation }
                     *     
                     */
                    public TariffInformation getTariffDetails() {
                        return tariffDetails;
                    }

                    /**
                     * Sets the value of the tariffDetails property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TariffInformation }
                     *     
                     */
                    public void setTariffDetails(TariffInformation value) {
                        this.tariffDetails = value;
                    }

                    /**
                     * Gets the value of the rateCodeIndicator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RuleInformation }
                     *     
                     */
                    public RuleInformation getRateCodeIndicator() {
                        return rateCodeIndicator;
                    }

                    /**
                     * Sets the value of the rateCodeIndicator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RuleInformation }
                     *     
                     */
                    public void setRateCodeIndicator(RuleInformation value) {
                        this.rateCodeIndicator = value;
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
             *         &lt;element name="insuranceName" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceName"/>
             *         &lt;element name="insuranceMonetaryInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_1689S" minOccurs="0"/>
             *         &lt;element name="insurancePremiumInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInsuranceInformation" minOccurs="0"/>
             *         &lt;element name="insuranceDocInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerDocumentInformation" minOccurs="0"/>
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
                "insuranceName",
                "insuranceMonetaryInformation",
                "insurancePremiumInfo",
                "insuranceDocInfo"
            })
            public static class InsuranceInformation {

                @XmlElement(required = true)
                protected InsuranceName insuranceName;
                protected MonetaryInformation1689S insuranceMonetaryInformation;
                protected TravellerInsuranceInformation insurancePremiumInfo;
                protected TravellerDocumentInformation insuranceDocInfo;

                /**
                 * Gets the value of the insuranceName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InsuranceName }
                 *     
                 */
                public InsuranceName getInsuranceName() {
                    return insuranceName;
                }

                /**
                 * Sets the value of the insuranceName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InsuranceName }
                 *     
                 */
                public void setInsuranceName(InsuranceName value) {
                    this.insuranceName = value;
                }

                /**
                 * Gets the value of the insuranceMonetaryInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformation1689S }
                 *     
                 */
                public MonetaryInformation1689S getInsuranceMonetaryInformation() {
                    return insuranceMonetaryInformation;
                }

                /**
                 * Sets the value of the insuranceMonetaryInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformation1689S }
                 *     
                 */
                public void setInsuranceMonetaryInformation(MonetaryInformation1689S value) {
                    this.insuranceMonetaryInformation = value;
                }

                /**
                 * Gets the value of the insurancePremiumInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravellerInsuranceInformation }
                 *     
                 */
                public TravellerInsuranceInformation getInsurancePremiumInfo() {
                    return insurancePremiumInfo;
                }

                /**
                 * Sets the value of the insurancePremiumInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravellerInsuranceInformation }
                 *     
                 */
                public void setInsurancePremiumInfo(TravellerInsuranceInformation value) {
                    this.insurancePremiumInfo = value;
                }

                /**
                 * Gets the value of the insuranceDocInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravellerDocumentInformation }
                 *     
                 */
                public TravellerDocumentInformation getInsuranceDocInfo() {
                    return insuranceDocInfo;
                }

                /**
                 * Sets the value of the insuranceDocInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravellerDocumentInformation }
                 *     
                 */
                public void setInsuranceDocInfo(TravellerDocumentInformation value) {
                    this.insuranceDocInfo = value;
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
             *         &lt;element name="lccFareData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_28460S"/>
             *         &lt;element name="lccConnectionData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemReferencesAndVersions_6550S" minOccurs="0"/>
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
                "lccFareData",
                "lccConnectionData"
            })
            public static class LccTypicalData {

                @XmlElement(required = true)
                protected TariffInformation28460S lccFareData;
                protected ItemReferencesAndVersions6550S lccConnectionData;

                /**
                 * Gets the value of the lccFareData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TariffInformation28460S }
                 *     
                 */
                public TariffInformation28460S getLccFareData() {
                    return lccFareData;
                }

                /**
                 * Sets the value of the lccFareData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TariffInformation28460S }
                 *     
                 */
                public void setLccFareData(TariffInformation28460S value) {
                    this.lccFareData = value;
                }

                /**
                 * Gets the value of the lccConnectionData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemReferencesAndVersions6550S }
                 *     
                 */
                public ItemReferencesAndVersions6550S getLccConnectionData() {
                    return lccConnectionData;
                }

                /**
                 * Sets the value of the lccConnectionData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemReferencesAndVersions6550S }
                 *     
                 */
                public void setLccConnectionData(ItemReferencesAndVersions6550S value) {
                    this.lccConnectionData = value;
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
             *         &lt;element name="markerLegInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FlightSegmentDetails"/>
             *         &lt;element name="legTravelProduct" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_99362S"/>
             *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText_99363S" maxOccurs="2" minOccurs="0"/>
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
                "markerLegInfo",
                "legTravelProduct",
                "interactiveFreeText"
            })
            public static class LegInfo {

                @XmlElement(required = true)
                protected FlightSegmentDetails markerLegInfo;
                @XmlElement(required = true)
                protected TravelProductInformation99362S legTravelProduct;
                protected List<InteractiveFreeText99363S> interactiveFreeText;

                /**
                 * Gets the value of the markerLegInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightSegmentDetails }
                 *     
                 */
                public FlightSegmentDetails getMarkerLegInfo() {
                    return markerLegInfo;
                }

                /**
                 * Sets the value of the markerLegInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightSegmentDetails }
                 *     
                 */
                public void setMarkerLegInfo(FlightSegmentDetails value) {
                    this.markerLegInfo = value;
                }

                /**
                 * Gets the value of the legTravelProduct property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductInformation99362S }
                 *     
                 */
                public TravelProductInformation99362S getLegTravelProduct() {
                    return legTravelProduct;
                }

                /**
                 * Sets the value of the legTravelProduct property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductInformation99362S }
                 *     
                 */
                public void setLegTravelProduct(TravelProductInformation99362S value) {
                    this.legTravelProduct = value;
                }

                /**
                 * Gets the value of the interactiveFreeText property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the interactiveFreeText property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInteractiveFreeText().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InteractiveFreeText99363S }
                 * 
                 * 
                 */
                public List<InteractiveFreeText99363S> getInteractiveFreeText() {
                    if (interactiveFreeText == null) {
                        interactiveFreeText = new ArrayList<InteractiveFreeText99363S>();
                    }
                    return this.interactiveFreeText;
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
             *         &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}VehicleInformation"/>
             *         &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
             *         &lt;element name="voucherPrintAck" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_84639S" minOccurs="0"/>
             *         &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NonAirCompanyInformation"/>
             *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84634S" maxOccurs="6"/>
             *         &lt;element name="deliveryAndCollection" maxOccurs="2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_31454S"/>
             *                   &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84645S"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="pickupDropoffTimes" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S"/>
             *         &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_84638S" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="rateCodeGroup" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FareQualifierDetails"/>
             *                   &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="fFlyerNbr" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationCode_84632S" minOccurs="0"/>
             *         &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ConsumerReferenceInformation" minOccurs="0"/>
             *         &lt;element name="rateInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84641S" maxOccurs="10" minOccurs="0"/>
             *         &lt;element name="errorWarning" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation_84657S"/>
             *                   &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="rulesPoliciesGroup" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
             *                   &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails_84647S" minOccurs="0"/>
             *                   &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
             *                   &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S"/>
             *                             &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
             *                             &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
             *                                       &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84654S"/>
             *                                       &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
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
             *                   &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation_84655S"/>
             *                             &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S" maxOccurs="2" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84651S"/>
             *                             &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_84650S" minOccurs="0"/>
             *                             &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84653S" maxOccurs="10" minOccurs="0"/>
             *                             &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84652S" maxOccurs="2" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
             *                             &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
             *                                       &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84649S" minOccurs="0"/>
             *                             &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S" maxOccurs="6"/>
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
             *         &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_84631S" minOccurs="0"/>
             *         &lt;element name="billingData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}BillableInformation" minOccurs="0"/>
             *         &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalBusinessSourceInformation" minOccurs="0"/>
             *         &lt;element name="inclusiveTour" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TourInformation" minOccurs="0"/>
             *         &lt;element name="marketingInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="supleInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_84635S" maxOccurs="6" minOccurs="0"/>
             *         &lt;element name="estimatedDistance" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity_84637S" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="agentInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Name_84636S" minOccurs="0"/>
             *         &lt;element name="trackingOpt" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AgreementIdentification" minOccurs="0"/>
             *         &lt;element name="electronicVoucherNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TicketNumberDetails" minOccurs="0"/>
             *         &lt;element name="customerEmail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CommunicationContact" minOccurs="0"/>
             *         &lt;element name="attribute" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Attribute_84627S"/>
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
                "vehicleInformation",
                "additionalInfo",
                "voucherPrintAck",
                "companyIdentification",
                "locationInfo",
                "deliveryAndCollection",
                "pickupDropoffTimes",
                "cancelOrConfirmNbr",
                "rateCodeGroup",
                "fFlyerNbr",
                "customerInfo",
                "rateInfo",
                "errorWarning",
                "rulesPoliciesGroup",
                "payment",
                "billingData",
                "bookingSource",
                "inclusiveTour",
                "marketingInfo",
                "supleInfo",
                "estimatedDistance",
                "agentInformation",
                "trackingOpt",
                "electronicVoucherNumber",
                "customerEmail",
                "attribute"
            })
            public static class TypicalCarData {

                @XmlElement(required = true)
                protected VehicleInformation vehicleInformation;
                protected FreeTextInformation84643S additionalInfo;
                protected ReferenceInformation84639S voucherPrintAck;
                @XmlElement(required = true)
                protected NonAirCompanyInformation companyIdentification;
                @XmlElement(required = true)
                protected List<PlaceLocationIdentification84634S> locationInfo;
                protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.DeliveryAndCollection> deliveryAndCollection;
                @XmlElement(required = true)
                protected StructuredPeriodInformation84640S pickupDropoffTimes;
                protected List<ReservationControlInformation84638S> cancelOrConfirmNbr;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup rateCodeGroup;
                protected FrequentTravellerIdentificationCode84632S fFlyerNbr;
                protected ConsumerReferenceInformation customerInfo;
                protected List<TariffInformation84641S> rateInfo;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning errorWarning;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup rulesPoliciesGroup;
                protected FormOfPayment84631S payment;
                protected BillableInformation billingData;
                protected AdditionalBusinessSourceInformation bookingSource;
                protected TourInformation inclusiveTour;
                protected List<InteractiveFreeText> marketingInfo;
                protected List<MiscellaneousRemarks84635S> supleInfo;
                protected List<Quantity84637S> estimatedDistance;
                protected Name84636S agentInformation;
                protected AgreementIdentification trackingOpt;
                protected TicketNumberDetails electronicVoucherNumber;
                protected CommunicationContact customerEmail;
                @XmlElement(required = true)
                protected Attribute84627S attribute;

                /**
                 * Gets the value of the vehicleInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VehicleInformation }
                 *     
                 */
                public VehicleInformation getVehicleInformation() {
                    return vehicleInformation;
                }

                /**
                 * Sets the value of the vehicleInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VehicleInformation }
                 *     
                 */
                public void setVehicleInformation(VehicleInformation value) {
                    this.vehicleInformation = value;
                }

                /**
                 * Gets the value of the additionalInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformation84643S }
                 *     
                 */
                public FreeTextInformation84643S getAdditionalInfo() {
                    return additionalInfo;
                }

                /**
                 * Sets the value of the additionalInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformation84643S }
                 *     
                 */
                public void setAdditionalInfo(FreeTextInformation84643S value) {
                    this.additionalInfo = value;
                }

                /**
                 * Gets the value of the voucherPrintAck property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInformation84639S }
                 *     
                 */
                public ReferenceInformation84639S getVoucherPrintAck() {
                    return voucherPrintAck;
                }

                /**
                 * Sets the value of the voucherPrintAck property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInformation84639S }
                 *     
                 */
                public void setVoucherPrintAck(ReferenceInformation84639S value) {
                    this.voucherPrintAck = value;
                }

                /**
                 * Gets the value of the companyIdentification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NonAirCompanyInformation }
                 *     
                 */
                public NonAirCompanyInformation getCompanyIdentification() {
                    return companyIdentification;
                }

                /**
                 * Sets the value of the companyIdentification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NonAirCompanyInformation }
                 *     
                 */
                public void setCompanyIdentification(NonAirCompanyInformation value) {
                    this.companyIdentification = value;
                }

                /**
                 * Gets the value of the locationInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the locationInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLocationInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PlaceLocationIdentification84634S }
                 * 
                 * 
                 */
                public List<PlaceLocationIdentification84634S> getLocationInfo() {
                    if (locationInfo == null) {
                        locationInfo = new ArrayList<PlaceLocationIdentification84634S>();
                    }
                    return this.locationInfo;
                }

                /**
                 * Gets the value of the deliveryAndCollection property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the deliveryAndCollection property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDeliveryAndCollection().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.DeliveryAndCollection }
                 * 
                 * 
                 */
                public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.DeliveryAndCollection> getDeliveryAndCollection() {
                    if (deliveryAndCollection == null) {
                        deliveryAndCollection = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.DeliveryAndCollection>();
                    }
                    return this.deliveryAndCollection;
                }

                /**
                 * Gets the value of the pickupDropoffTimes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StructuredPeriodInformation84640S }
                 *     
                 */
                public StructuredPeriodInformation84640S getPickupDropoffTimes() {
                    return pickupDropoffTimes;
                }

                /**
                 * Sets the value of the pickupDropoffTimes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StructuredPeriodInformation84640S }
                 *     
                 */
                public void setPickupDropoffTimes(StructuredPeriodInformation84640S value) {
                    this.pickupDropoffTimes = value;
                }

                /**
                 * Gets the value of the cancelOrConfirmNbr property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cancelOrConfirmNbr property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCancelOrConfirmNbr().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReservationControlInformation84638S }
                 * 
                 * 
                 */
                public List<ReservationControlInformation84638S> getCancelOrConfirmNbr() {
                    if (cancelOrConfirmNbr == null) {
                        cancelOrConfirmNbr = new ArrayList<ReservationControlInformation84638S>();
                    }
                    return this.cancelOrConfirmNbr;
                }

                /**
                 * Gets the value of the rateCodeGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup getRateCodeGroup() {
                    return rateCodeGroup;
                }

                /**
                 * Sets the value of the rateCodeGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup }
                 *     
                 */
                public void setRateCodeGroup(PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup value) {
                    this.rateCodeGroup = value;
                }

                /**
                 * Gets the value of the fFlyerNbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FrequentTravellerIdentificationCode84632S }
                 *     
                 */
                public FrequentTravellerIdentificationCode84632S getFFlyerNbr() {
                    return fFlyerNbr;
                }

                /**
                 * Sets the value of the fFlyerNbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FrequentTravellerIdentificationCode84632S }
                 *     
                 */
                public void setFFlyerNbr(FrequentTravellerIdentificationCode84632S value) {
                    this.fFlyerNbr = value;
                }

                /**
                 * Gets the value of the customerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsumerReferenceInformation }
                 *     
                 */
                public ConsumerReferenceInformation getCustomerInfo() {
                    return customerInfo;
                }

                /**
                 * Sets the value of the customerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsumerReferenceInformation }
                 *     
                 */
                public void setCustomerInfo(ConsumerReferenceInformation value) {
                    this.customerInfo = value;
                }

                /**
                 * Gets the value of the rateInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the rateInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRateInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TariffInformation84641S }
                 * 
                 * 
                 */
                public List<TariffInformation84641S> getRateInfo() {
                    if (rateInfo == null) {
                        rateInfo = new ArrayList<TariffInformation84641S>();
                    }
                    return this.rateInfo;
                }

                /**
                 * Gets the value of the errorWarning property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning getErrorWarning() {
                    return errorWarning;
                }

                /**
                 * Sets the value of the errorWarning property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning }
                 *     
                 */
                public void setErrorWarning(PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning value) {
                    this.errorWarning = value;
                }

                /**
                 * Gets the value of the rulesPoliciesGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup getRulesPoliciesGroup() {
                    return rulesPoliciesGroup;
                }

                /**
                 * Sets the value of the rulesPoliciesGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup }
                 *     
                 */
                public void setRulesPoliciesGroup(PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup value) {
                    this.rulesPoliciesGroup = value;
                }

                /**
                 * Gets the value of the payment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FormOfPayment84631S }
                 *     
                 */
                public FormOfPayment84631S getPayment() {
                    return payment;
                }

                /**
                 * Sets the value of the payment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FormOfPayment84631S }
                 *     
                 */
                public void setPayment(FormOfPayment84631S value) {
                    this.payment = value;
                }

                /**
                 * Gets the value of the billingData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BillableInformation }
                 *     
                 */
                public BillableInformation getBillingData() {
                    return billingData;
                }

                /**
                 * Sets the value of the billingData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BillableInformation }
                 *     
                 */
                public void setBillingData(BillableInformation value) {
                    this.billingData = value;
                }

                /**
                 * Gets the value of the bookingSource property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalBusinessSourceInformation }
                 *     
                 */
                public AdditionalBusinessSourceInformation getBookingSource() {
                    return bookingSource;
                }

                /**
                 * Sets the value of the bookingSource property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalBusinessSourceInformation }
                 *     
                 */
                public void setBookingSource(AdditionalBusinessSourceInformation value) {
                    this.bookingSource = value;
                }

                /**
                 * Gets the value of the inclusiveTour property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TourInformation }
                 *     
                 */
                public TourInformation getInclusiveTour() {
                    return inclusiveTour;
                }

                /**
                 * Sets the value of the inclusiveTour property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TourInformation }
                 *     
                 */
                public void setInclusiveTour(TourInformation value) {
                    this.inclusiveTour = value;
                }

                /**
                 * Gets the value of the marketingInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the marketingInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMarketingInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InteractiveFreeText }
                 * 
                 * 
                 */
                public List<InteractiveFreeText> getMarketingInfo() {
                    if (marketingInfo == null) {
                        marketingInfo = new ArrayList<InteractiveFreeText>();
                    }
                    return this.marketingInfo;
                }

                /**
                 * Gets the value of the supleInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the supleInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSupleInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MiscellaneousRemarks84635S }
                 * 
                 * 
                 */
                public List<MiscellaneousRemarks84635S> getSupleInfo() {
                    if (supleInfo == null) {
                        supleInfo = new ArrayList<MiscellaneousRemarks84635S>();
                    }
                    return this.supleInfo;
                }

                /**
                 * Gets the value of the estimatedDistance property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the estimatedDistance property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEstimatedDistance().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Quantity84637S }
                 * 
                 * 
                 */
                public List<Quantity84637S> getEstimatedDistance() {
                    if (estimatedDistance == null) {
                        estimatedDistance = new ArrayList<Quantity84637S>();
                    }
                    return this.estimatedDistance;
                }

                /**
                 * Gets the value of the agentInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Name84636S }
                 *     
                 */
                public Name84636S getAgentInformation() {
                    return agentInformation;
                }

                /**
                 * Sets the value of the agentInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Name84636S }
                 *     
                 */
                public void setAgentInformation(Name84636S value) {
                    this.agentInformation = value;
                }

                /**
                 * Gets the value of the trackingOpt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AgreementIdentification }
                 *     
                 */
                public AgreementIdentification getTrackingOpt() {
                    return trackingOpt;
                }

                /**
                 * Sets the value of the trackingOpt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AgreementIdentification }
                 *     
                 */
                public void setTrackingOpt(AgreementIdentification value) {
                    this.trackingOpt = value;
                }

                /**
                 * Gets the value of the electronicVoucherNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TicketNumberDetails }
                 *     
                 */
                public TicketNumberDetails getElectronicVoucherNumber() {
                    return electronicVoucherNumber;
                }

                /**
                 * Sets the value of the electronicVoucherNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TicketNumberDetails }
                 *     
                 */
                public void setElectronicVoucherNumber(TicketNumberDetails value) {
                    this.electronicVoucherNumber = value;
                }

                /**
                 * Gets the value of the customerEmail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommunicationContact }
                 *     
                 */
                public CommunicationContact getCustomerEmail() {
                    return customerEmail;
                }

                /**
                 * Sets the value of the customerEmail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommunicationContact }
                 *     
                 */
                public void setCustomerEmail(CommunicationContact value) {
                    this.customerEmail = value;
                }

                /**
                 * Gets the value of the attribute property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Attribute84627S }
                 *     
                 */
                public Attribute84627S getAttribute() {
                    return attribute;
                }

                /**
                 * Sets the value of the attribute property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Attribute84627S }
                 *     
                 */
                public void setAttribute(Attribute84627S value) {
                    this.attribute = value;
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
                 *         &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_31454S"/>
                 *         &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84645S"/>
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
                    "addressDeliveryCollection",
                    "phoneNumber"
                })
                public static class DeliveryAndCollection {

                    @XmlElement(required = true)
                    protected Address31454S addressDeliveryCollection;
                    @XmlElement(required = true)
                    protected PhoneAndEmailAddress84645S phoneNumber;

                    /**
                     * Gets the value of the addressDeliveryCollection property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Address31454S }
                     *     
                     */
                    public Address31454S getAddressDeliveryCollection() {
                        return addressDeliveryCollection;
                    }

                    /**
                     * Sets the value of the addressDeliveryCollection property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Address31454S }
                     *     
                     */
                    public void setAddressDeliveryCollection(Address31454S value) {
                        this.addressDeliveryCollection = value;
                    }

                    /**
                     * Gets the value of the phoneNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PhoneAndEmailAddress84645S }
                     *     
                     */
                    public PhoneAndEmailAddress84645S getPhoneNumber() {
                        return phoneNumber;
                    }

                    /**
                     * Sets the value of the phoneNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PhoneAndEmailAddress84645S }
                     *     
                     */
                    public void setPhoneNumber(PhoneAndEmailAddress84645S value) {
                        this.phoneNumber = value;
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
                 *         &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation_84657S"/>
                 *         &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
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
                    "errorFreeText"
                })
                public static class ErrorWarning {

                    @XmlElement(required = true)
                    protected ApplicationErrorInformation84657S applicationError;
                    protected FreeTextInformation84643S errorFreeText;

                    /**
                     * Gets the value of the applicationError property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ApplicationErrorInformation84657S }
                     *     
                     */
                    public ApplicationErrorInformation84657S getApplicationError() {
                        return applicationError;
                    }

                    /**
                     * Sets the value of the applicationError property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ApplicationErrorInformation84657S }
                     *     
                     */
                    public void setApplicationError(ApplicationErrorInformation84657S value) {
                        this.applicationError = value;
                    }

                    /**
                     * Gets the value of the errorFreeText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FreeTextInformation84643S }
                     *     
                     */
                    public FreeTextInformation84643S getErrorFreeText() {
                        return errorFreeText;
                    }

                    /**
                     * Sets the value of the errorFreeText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FreeTextInformation84643S }
                     *     
                     */
                    public void setErrorFreeText(FreeTextInformation84643S value) {
                        this.errorFreeText = value;
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
                 *         &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FareQualifierDetails"/>
                 *         &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
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
                    "rateCodeInfo",
                    "additionalInfo"
                })
                public static class RateCodeGroup {

                    @XmlElement(required = true)
                    protected FareQualifierDetails rateCodeInfo;
                    protected FreeTextInformation84643S additionalInfo;

                    /**
                     * Gets the value of the rateCodeInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareQualifierDetails }
                     *     
                     */
                    public FareQualifierDetails getRateCodeInfo() {
                        return rateCodeInfo;
                    }

                    /**
                     * Sets the value of the rateCodeInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareQualifierDetails }
                     *     
                     */
                    public void setRateCodeInfo(FareQualifierDetails value) {
                        this.rateCodeInfo = value;
                    }

                    /**
                     * Gets the value of the additionalInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FreeTextInformation84643S }
                     *     
                     */
                    public FreeTextInformation84643S getAdditionalInfo() {
                        return additionalInfo;
                    }

                    /**
                     * Sets the value of the additionalInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FreeTextInformation84643S }
                     *     
                     */
                    public void setAdditionalInfo(FreeTextInformation84643S value) {
                        this.additionalInfo = value;
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
                 *         &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
                 *         &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails_84647S" minOccurs="0"/>
                 *         &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
                 *         &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S"/>
                 *                   &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
                 *                   &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
                 *                             &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84654S"/>
                 *                             &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
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
                 *         &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation_84655S"/>
                 *                   &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S" maxOccurs="2" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84651S"/>
                 *                   &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_84650S" minOccurs="0"/>
                 *                   &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84653S" maxOccurs="10" minOccurs="0"/>
                 *                   &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84652S" maxOccurs="2" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
                 *                   &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
                 *                             &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84649S" minOccurs="0"/>
                 *                   &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S" maxOccurs="6"/>
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
                    "dummy1",
                    "sourceLevel",
                    "remarks",
                    "taxCovSurchargeGroup",
                    "otherRulesGroup",
                    "pickupDropoffLocation",
                    "specialEquipmentDetails"
                })
                public static class RulesPoliciesGroup {

                    @XmlElement(required = true)
                    protected DummySegment dummy1;
                    protected SelectionDetails84647S sourceLevel;
                    protected FreeTextInformation84643S remarks;
                    protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup> taxCovSurchargeGroup;
                    protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.OtherRulesGroup> otherRulesGroup;
                    protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.PickupDropoffLocation> pickupDropoffLocation;
                    protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails> specialEquipmentDetails;

                    /**
                     * Gets the value of the dummy1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DummySegment }
                     *     
                     */
                    public DummySegment getDummy1() {
                        return dummy1;
                    }

                    /**
                     * Sets the value of the dummy1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DummySegment }
                     *     
                     */
                    public void setDummy1(DummySegment value) {
                        this.dummy1 = value;
                    }

                    /**
                     * Gets the value of the sourceLevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SelectionDetails84647S }
                     *     
                     */
                    public SelectionDetails84647S getSourceLevel() {
                        return sourceLevel;
                    }

                    /**
                     * Sets the value of the sourceLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SelectionDetails84647S }
                     *     
                     */
                    public void setSourceLevel(SelectionDetails84647S value) {
                        this.sourceLevel = value;
                    }

                    /**
                     * Gets the value of the remarks property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FreeTextInformation84643S }
                     *     
                     */
                    public FreeTextInformation84643S getRemarks() {
                        return remarks;
                    }

                    /**
                     * Sets the value of the remarks property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FreeTextInformation84643S }
                     *     
                     */
                    public void setRemarks(FreeTextInformation84643S value) {
                        this.remarks = value;
                    }

                    /**
                     * Gets the value of the taxCovSurchargeGroup property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the taxCovSurchargeGroup property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTaxCovSurchargeGroup().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup }
                     * 
                     * 
                     */
                    public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup> getTaxCovSurchargeGroup() {
                        if (taxCovSurchargeGroup == null) {
                            taxCovSurchargeGroup = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup>();
                        }
                        return this.taxCovSurchargeGroup;
                    }

                    /**
                     * Gets the value of the otherRulesGroup property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the otherRulesGroup property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOtherRulesGroup().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.OtherRulesGroup }
                     * 
                     * 
                     */
                    public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.OtherRulesGroup> getOtherRulesGroup() {
                        if (otherRulesGroup == null) {
                            otherRulesGroup = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.OtherRulesGroup>();
                        }
                        return this.otherRulesGroup;
                    }

                    /**
                     * Gets the value of the pickupDropoffLocation property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the pickupDropoffLocation property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPickupDropoffLocation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.PickupDropoffLocation }
                     * 
                     * 
                     */
                    public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.PickupDropoffLocation> getPickupDropoffLocation() {
                        if (pickupDropoffLocation == null) {
                            pickupDropoffLocation = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.PickupDropoffLocation>();
                        }
                        return this.pickupDropoffLocation;
                    }

                    /**
                     * Gets the value of the specialEquipmentDetails property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the specialEquipmentDetails property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSpecialEquipmentDetails().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails }
                     * 
                     * 
                     */
                    public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails> getSpecialEquipmentDetails() {
                        if (specialEquipmentDetails == null) {
                            specialEquipmentDetails = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails>();
                        }
                        return this.specialEquipmentDetails;
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
                     *         &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleInformation_84655S"/>
                     *         &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84640S" maxOccurs="2" minOccurs="0"/>
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
                        "otherRules",
                        "dateTimeInfo"
                    })
                    public static class OtherRulesGroup {

                        @XmlElement(required = true)
                        protected RuleInformation84655S otherRules;
                        protected List<StructuredPeriodInformation84640S> dateTimeInfo;

                        /**
                         * Gets the value of the otherRules property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link RuleInformation84655S }
                         *     
                         */
                        public RuleInformation84655S getOtherRules() {
                            return otherRules;
                        }

                        /**
                         * Sets the value of the otherRules property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link RuleInformation84655S }
                         *     
                         */
                        public void setOtherRules(RuleInformation84655S value) {
                            this.otherRules = value;
                        }

                        /**
                         * Gets the value of the dateTimeInfo property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the dateTimeInfo property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getDateTimeInfo().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link StructuredPeriodInformation84640S }
                         * 
                         * 
                         */
                        public List<StructuredPeriodInformation84640S> getDateTimeInfo() {
                            if (dateTimeInfo == null) {
                                dateTimeInfo = new ArrayList<StructuredPeriodInformation84640S>();
                            }
                            return this.dateTimeInfo;
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
                     *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_84651S"/>
                     *         &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_84650S" minOccurs="0"/>
                     *         &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation_84653S" maxOccurs="10" minOccurs="0"/>
                     *         &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_84652S" maxOccurs="2" minOccurs="0"/>
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
                        "locationInfo",
                        "address",
                        "openingHours",
                        "phone"
                    })
                    public static class PickupDropoffLocation {

                        @XmlElement(required = true)
                        protected PlaceLocationIdentification84651S locationInfo;
                        protected Address84650S address;
                        protected List<StructuredPeriodInformation84653S> openingHours;
                        protected List<PhoneAndEmailAddress84652S> phone;

                        /**
                         * Gets the value of the locationInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link PlaceLocationIdentification84651S }
                         *     
                         */
                        public PlaceLocationIdentification84651S getLocationInfo() {
                            return locationInfo;
                        }

                        /**
                         * Sets the value of the locationInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PlaceLocationIdentification84651S }
                         *     
                         */
                        public void setLocationInfo(PlaceLocationIdentification84651S value) {
                            this.locationInfo = value;
                        }

                        /**
                         * Gets the value of the address property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Address84650S }
                         *     
                         */
                        public Address84650S getAddress() {
                            return address;
                        }

                        /**
                         * Sets the value of the address property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Address84650S }
                         *     
                         */
                        public void setAddress(Address84650S value) {
                            this.address = value;
                        }

                        /**
                         * Gets the value of the openingHours property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the openingHours property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getOpeningHours().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link StructuredPeriodInformation84653S }
                         * 
                         * 
                         */
                        public List<StructuredPeriodInformation84653S> getOpeningHours() {
                            if (openingHours == null) {
                                openingHours = new ArrayList<StructuredPeriodInformation84653S>();
                            }
                            return this.openingHours;
                        }

                        /**
                         * Gets the value of the phone property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the phone property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPhone().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PhoneAndEmailAddress84652S }
                         * 
                         * 
                         */
                        public List<PhoneAndEmailAddress84652S> getPhone() {
                            if (phone == null) {
                                phone = new ArrayList<PhoneAndEmailAddress84652S>();
                            }
                            return this.phone;
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
                     *         &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
                     *         &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
                     *                   &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84649S" minOccurs="0"/>
                     *         &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S" maxOccurs="6"/>
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
                        "dummy2",
                        "rangePeriod",
                        "additionalInfo",
                        "specialEquipmentTariff"
                    })
                    public static class SpecialEquipmentDetails {

                        @XmlElement(required = true)
                        protected DummySegment dummy2;
                        protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails.RangePeriod> rangePeriod;
                        protected FreeTextInformation84649S additionalInfo;
                        @XmlElement(required = true)
                        protected List<TariffInformation84648S> specialEquipmentTariff;

                        /**
                         * Gets the value of the dummy2 property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DummySegment }
                         *     
                         */
                        public DummySegment getDummy2() {
                            return dummy2;
                        }

                        /**
                         * Sets the value of the dummy2 property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DummySegment }
                         *     
                         */
                        public void setDummy2(DummySegment value) {
                            this.dummy2 = value;
                        }

                        /**
                         * Gets the value of the rangePeriod property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the rangePeriod property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRangePeriod().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails.RangePeriod }
                         * 
                         * 
                         */
                        public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails.RangePeriod> getRangePeriod() {
                            if (rangePeriod == null) {
                                rangePeriod = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails.RangePeriod>();
                            }
                            return this.rangePeriod;
                        }

                        /**
                         * Gets the value of the additionalInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FreeTextInformation84649S }
                         *     
                         */
                        public FreeTextInformation84649S getAdditionalInfo() {
                            return additionalInfo;
                        }

                        /**
                         * Sets the value of the additionalInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FreeTextInformation84649S }
                         *     
                         */
                        public void setAdditionalInfo(FreeTextInformation84649S value) {
                            this.additionalInfo = value;
                        }

                        /**
                         * Gets the value of the specialEquipmentTariff property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the specialEquipmentTariff property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getSpecialEquipmentTariff().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TariffInformation84648S }
                         * 
                         * 
                         */
                        public List<TariffInformation84648S> getSpecialEquipmentTariff() {
                            if (specialEquipmentTariff == null) {
                                specialEquipmentTariff = new ArrayList<TariffInformation84648S>();
                            }
                            return this.specialEquipmentTariff;
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
                         *         &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
                         *         &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
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
                            "agePeriod",
                            "maximumUnitQualifier"
                        })
                        public static class RangePeriod {

                            @XmlElement(required = true)
                            protected RangeDetails agePeriod;
                            protected Measurements maximumUnitQualifier;

                            /**
                             * Gets the value of the agePeriod property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link RangeDetails }
                             *     
                             */
                            public RangeDetails getAgePeriod() {
                                return agePeriod;
                            }

                            /**
                             * Sets the value of the agePeriod property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link RangeDetails }
                             *     
                             */
                            public void setAgePeriod(RangeDetails value) {
                                this.agePeriod = value;
                            }

                            /**
                             * Gets the value of the maximumUnitQualifier property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Measurements }
                             *     
                             */
                            public Measurements getMaximumUnitQualifier() {
                                return maximumUnitQualifier;
                            }

                            /**
                             * Sets the value of the maximumUnitQualifier property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Measurements }
                             *     
                             */
                            public void setMaximumUnitQualifier(Measurements value) {
                                this.maximumUnitQualifier = value;
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
                     *         &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84648S"/>
                     *         &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_84643S" minOccurs="0"/>
                     *         &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
                     *                   &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84654S"/>
                     *                   &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
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
                        "taxSurchargeCoverageInfo",
                        "additionalInfo",
                        "surchargePeriods"
                    })
                    public static class TaxCovSurchargeGroup {

                        @XmlElement(required = true)
                        protected TariffInformation84648S taxSurchargeCoverageInfo;
                        protected FreeTextInformation84643S additionalInfo;
                        protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup.SurchargePeriods> surchargePeriods;

                        /**
                         * Gets the value of the taxSurchargeCoverageInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TariffInformation84648S }
                         *     
                         */
                        public TariffInformation84648S getTaxSurchargeCoverageInfo() {
                            return taxSurchargeCoverageInfo;
                        }

                        /**
                         * Sets the value of the taxSurchargeCoverageInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TariffInformation84648S }
                         *     
                         */
                        public void setTaxSurchargeCoverageInfo(TariffInformation84648S value) {
                            this.taxSurchargeCoverageInfo = value;
                        }

                        /**
                         * Gets the value of the additionalInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FreeTextInformation84643S }
                         *     
                         */
                        public FreeTextInformation84643S getAdditionalInfo() {
                            return additionalInfo;
                        }

                        /**
                         * Sets the value of the additionalInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FreeTextInformation84643S }
                         *     
                         */
                        public void setAdditionalInfo(FreeTextInformation84643S value) {
                            this.additionalInfo = value;
                        }

                        /**
                         * Gets the value of the surchargePeriods property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the surchargePeriods property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getSurchargePeriods().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup.SurchargePeriods }
                         * 
                         * 
                         */
                        public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup.SurchargePeriods> getSurchargePeriods() {
                            if (surchargePeriods == null) {
                                surchargePeriods = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup.SurchargePeriods>();
                            }
                            return this.surchargePeriods;
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
                         *         &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails"/>
                         *         &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_84654S"/>
                         *         &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Measurements" minOccurs="0"/>
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
                            "period",
                            "surchargePeriodTariff",
                            "maximumUnitQualifier"
                        })
                        public static class SurchargePeriods {

                            @XmlElement(required = true)
                            protected RangeDetails period;
                            @XmlElement(required = true)
                            protected TariffInformation84654S surchargePeriodTariff;
                            protected Measurements maximumUnitQualifier;

                            /**
                             * Gets the value of the period property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link RangeDetails }
                             *     
                             */
                            public RangeDetails getPeriod() {
                                return period;
                            }

                            /**
                             * Sets the value of the period property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link RangeDetails }
                             *     
                             */
                            public void setPeriod(RangeDetails value) {
                                this.period = value;
                            }

                            /**
                             * Gets the value of the surchargePeriodTariff property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link TariffInformation84654S }
                             *     
                             */
                            public TariffInformation84654S getSurchargePeriodTariff() {
                                return surchargePeriodTariff;
                            }

                            /**
                             * Sets the value of the surchargePeriodTariff property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link TariffInformation84654S }
                             *     
                             */
                            public void setSurchargePeriodTariff(TariffInformation84654S value) {
                                this.surchargePeriodTariff = value;
                            }

                            /**
                             * Gets the value of the maximumUnitQualifier property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Measurements }
                             *     
                             */
                            public Measurements getMaximumUnitQualifier() {
                                return maximumUnitQualifier;
                            }

                            /**
                             * Sets the value of the maximumUnitQualifier property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Measurements }
                             *     
                             */
                            public void setMaximumUnitQualifier(Measurements value) {
                                this.maximumUnitQualifier = value;
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
             *         &lt;element name="yieldData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ODKeyPerformanceData"/>
             *         &lt;element name="yieldDataGroup" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ONDType" minOccurs="0"/>
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
                "yieldData",
                "yieldDataGroup"
            })
            public static class YieldGroup {

                @XmlElement(required = true)
                protected ODKeyPerformanceData yieldData;
                protected ONDType yieldDataGroup;

                /**
                 * Gets the value of the yieldData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ODKeyPerformanceData }
                 *     
                 */
                public ODKeyPerformanceData getYieldData() {
                    return yieldData;
                }

                /**
                 * Sets the value of the yieldData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ODKeyPerformanceData }
                 *     
                 */
                public void setYieldData(ODKeyPerformanceData value) {
                    this.yieldData = value;
                }

                /**
                 * Gets the value of the yieldDataGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ONDType }
                 *     
                 */
                public ONDType getYieldDataGroup() {
                    return yieldDataGroup;
                }

                /**
                 * Sets the value of the yieldDataGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ONDType }
                 *     
                 */
                public void setYieldDataGroup(ONDType value) {
                    this.yieldDataGroup = value;
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
     *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_87792S"/>
     *         &lt;element name="referenceForRecordLocator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
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
        "reservationInfo",
        "referenceForRecordLocator"
    })
    public static class PnrHeader {

        @XmlElement(required = true)
        protected ReservationControlInformation87792S reservationInfo;
        protected ReferenceInformation referenceForRecordLocator;

        /**
         * Gets the value of the reservationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformation87792S }
         *     
         */
        public ReservationControlInformation87792S getReservationInfo() {
            return reservationInfo;
        }

        /**
         * Sets the value of the reservationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformation87792S }
         *     
         */
        public void setReservationInfo(ReservationControlInformation87792S value) {
            this.reservationInfo = value;
        }

        /**
         * Gets the value of the referenceForRecordLocator property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformation }
         *     
         */
        public ReferenceInformation getReferenceForRecordLocator() {
            return referenceForRecordLocator;
        }

        /**
         * Sets the value of the referenceForRecordLocator property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformation }
         *     
         */
        public void setReferenceForRecordLocator(ReferenceInformation value) {
            this.referenceForRecordLocator = value;
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
     *         &lt;element name="enveloppeNumberData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SequenceDetails"/>
     *         &lt;element name="lastTransmittedEnvelopeNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PnrHistoryData" minOccurs="0"/>
     *         &lt;element name="purgeDateData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_27086S" minOccurs="0"/>
     *         &lt;element name="generalPNRInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_32775S" minOccurs="0"/>
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
        "enveloppeNumberData",
        "lastTransmittedEnvelopeNumber",
        "purgeDateData",
        "generalPNRInformation"
    })
    public static class TechnicalData {

        @XmlElement(required = true)
        protected SequenceDetails enveloppeNumberData;
        protected PnrHistoryData lastTransmittedEnvelopeNumber;
        protected StructuredDateTimeInformation27086S purgeDateData;
        protected StatusDetails32775S generalPNRInformation;

        /**
         * Gets the value of the enveloppeNumberData property.
         * 
         * @return
         *     possible object is
         *     {@link SequenceDetails }
         *     
         */
        public SequenceDetails getEnveloppeNumberData() {
            return enveloppeNumberData;
        }

        /**
         * Sets the value of the enveloppeNumberData property.
         * 
         * @param value
         *     allowed object is
         *     {@link SequenceDetails }
         *     
         */
        public void setEnveloppeNumberData(SequenceDetails value) {
            this.enveloppeNumberData = value;
        }

        /**
         * Gets the value of the lastTransmittedEnvelopeNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PnrHistoryData }
         *     
         */
        public PnrHistoryData getLastTransmittedEnvelopeNumber() {
            return lastTransmittedEnvelopeNumber;
        }

        /**
         * Sets the value of the lastTransmittedEnvelopeNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PnrHistoryData }
         *     
         */
        public void setLastTransmittedEnvelopeNumber(PnrHistoryData value) {
            this.lastTransmittedEnvelopeNumber = value;
        }

        /**
         * Gets the value of the purgeDateData property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformation27086S }
         *     
         */
        public StructuredDateTimeInformation27086S getPurgeDateData() {
            return purgeDateData;
        }

        /**
         * Sets the value of the purgeDateData property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformation27086S }
         *     
         */
        public void setPurgeDateData(StructuredDateTimeInformation27086S value) {
            this.purgeDateData = value;
        }

        /**
         * Gets the value of the generalPNRInformation property.
         * 
         * @return
         *     possible object is
         *     {@link StatusDetails32775S }
         *     
         */
        public StatusDetails32775S getGeneralPNRInformation() {
            return generalPNRInformation;
        }

        /**
         * Sets the value of the generalPNRInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusDetails32775S }
         *     
         */
        public void setGeneralPNRInformation(StatusDetails32775S value) {
            this.generalPNRInformation = value;
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
     *         &lt;element name="elementManagementPassenger" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment"/>
     *         &lt;element name="passengerData" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_6097S"/>
     *                   &lt;element name="groupCounters" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits_76106S" minOccurs="0"/>
     *                   &lt;element name="dateOfBirth" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DateAndTimeInformation_32722S" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="nameError" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nameErrorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
     *                   &lt;element name="nameErrorFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
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
        "elementManagementPassenger",
        "passengerData",
        "nameError"
    })
    public static class TravellerInfo {

        @XmlElement(required = true)
        protected ElementManagementSegment elementManagementPassenger;
        protected List<PNRReply.TravellerInfo.PassengerData> passengerData;
        protected PNRReply.TravellerInfo.NameError nameError;

        /**
         * Gets the value of the elementManagementPassenger property.
         * 
         * @return
         *     possible object is
         *     {@link ElementManagementSegment }
         *     
         */
        public ElementManagementSegment getElementManagementPassenger() {
            return elementManagementPassenger;
        }

        /**
         * Sets the value of the elementManagementPassenger property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementManagementSegment }
         *     
         */
        public void setElementManagementPassenger(ElementManagementSegment value) {
            this.elementManagementPassenger = value;
        }

        /**
         * Gets the value of the passengerData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRReply.TravellerInfo.PassengerData }
         * 
         * 
         */
        public List<PNRReply.TravellerInfo.PassengerData> getPassengerData() {
            if (passengerData == null) {
                passengerData = new ArrayList<PNRReply.TravellerInfo.PassengerData>();
            }
            return this.passengerData;
        }

        /**
         * Gets the value of the nameError property.
         * 
         * @return
         *     possible object is
         *     {@link PNRReply.TravellerInfo.NameError }
         *     
         */
        public PNRReply.TravellerInfo.NameError getNameError() {
            return nameError;
        }

        /**
         * Sets the value of the nameError property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRReply.TravellerInfo.NameError }
         *     
         */
        public void setNameError(PNRReply.TravellerInfo.NameError value) {
            this.nameError = value;
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
         *         &lt;element name="nameErrorInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorInformation"/>
         *         &lt;element name="nameErrorFreeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InteractiveFreeText" minOccurs="0"/>
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
            "nameErrorInformation",
            "nameErrorFreeText"
        })
        public static class NameError {

            @XmlElement(required = true)
            protected ApplicationErrorInformation nameErrorInformation;
            protected InteractiveFreeText nameErrorFreeText;

            /**
             * Gets the value of the nameErrorInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ApplicationErrorInformation }
             *     
             */
            public ApplicationErrorInformation getNameErrorInformation() {
                return nameErrorInformation;
            }

            /**
             * Sets the value of the nameErrorInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ApplicationErrorInformation }
             *     
             */
            public void setNameErrorInformation(ApplicationErrorInformation value) {
                this.nameErrorInformation = value;
            }

            /**
             * Gets the value of the nameErrorFreeText property.
             * 
             * @return
             *     possible object is
             *     {@link InteractiveFreeText }
             *     
             */
            public InteractiveFreeText getNameErrorFreeText() {
                return nameErrorFreeText;
            }

            /**
             * Sets the value of the nameErrorFreeText property.
             * 
             * @param value
             *     allowed object is
             *     {@link InteractiveFreeText }
             *     
             */
            public void setNameErrorFreeText(InteractiveFreeText value) {
                this.nameErrorFreeText = value;
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
         *         &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_6097S"/>
         *         &lt;element name="groupCounters" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits_76106S" minOccurs="0"/>
         *         &lt;element name="dateOfBirth" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DateAndTimeInformation_32722S" minOccurs="0"/>
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
            "travellerInformation",
            "groupCounters",
            "dateOfBirth"
        })
        public static class PassengerData {

            @XmlElement(required = true)
            protected TravellerInformation6097S travellerInformation;
            protected NumberOfUnits76106S groupCounters;
            protected DateAndTimeInformation32722S dateOfBirth;

            /**
             * Gets the value of the travellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerInformation6097S }
             *     
             */
            public TravellerInformation6097S getTravellerInformation() {
                return travellerInformation;
            }

            /**
             * Sets the value of the travellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerInformation6097S }
             *     
             */
            public void setTravellerInformation(TravellerInformation6097S value) {
                this.travellerInformation = value;
            }

            /**
             * Gets the value of the groupCounters property.
             * 
             * @return
             *     possible object is
             *     {@link NumberOfUnits76106S }
             *     
             */
            public NumberOfUnits76106S getGroupCounters() {
                return groupCounters;
            }

            /**
             * Sets the value of the groupCounters property.
             * 
             * @param value
             *     allowed object is
             *     {@link NumberOfUnits76106S }
             *     
             */
            public void setGroupCounters(NumberOfUnits76106S value) {
                this.groupCounters = value;
            }

            /**
             * Gets the value of the dateOfBirth property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformation32722S }
             *     
             */
            public DateAndTimeInformation32722S getDateOfBirth() {
                return dateOfBirth;
            }

            /**
             * Sets the value of the dateOfBirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformation32722S }
             *     
             */
            public void setDateOfBirth(DateAndTimeInformation32722S value) {
                this.dateOfBirth = value;
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
     *         &lt;element name="tstGeneralInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TstGeneralInformation"/>
     *         &lt;element name="tstFreetext" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LongFreeText" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="fareBasisInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FareBasisCodesLine" minOccurs="0"/>
     *         &lt;element name="fareData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FareData" minOccurs="0"/>
     *         &lt;element name="segmentAssociation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetails" minOccurs="0"/>
     *         &lt;element name="referenceForTstData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation" minOccurs="0"/>
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
        "tstGeneralInformation",
        "tstFreetext",
        "fareBasisInfo",
        "fareData",
        "segmentAssociation",
        "referenceForTstData"
    })
    public static class TstData {

        @XmlElement(required = true)
        protected TstGeneralInformation tstGeneralInformation;
        protected List<LongFreeText> tstFreetext;
        protected FareBasisCodesLine fareBasisInfo;
        protected FareData fareData;
        protected SelectionDetails segmentAssociation;
        protected ReferenceInformation referenceForTstData;

        /**
         * Gets the value of the tstGeneralInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TstGeneralInformation }
         *     
         */
        public TstGeneralInformation getTstGeneralInformation() {
            return tstGeneralInformation;
        }

        /**
         * Sets the value of the tstGeneralInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TstGeneralInformation }
         *     
         */
        public void setTstGeneralInformation(TstGeneralInformation value) {
            this.tstGeneralInformation = value;
        }

        /**
         * Gets the value of the tstFreetext property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tstFreetext property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTstFreetext().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LongFreeText }
         * 
         * 
         */
        public List<LongFreeText> getTstFreetext() {
            if (tstFreetext == null) {
                tstFreetext = new ArrayList<LongFreeText>();
            }
            return this.tstFreetext;
        }

        /**
         * Gets the value of the fareBasisInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FareBasisCodesLine }
         *     
         */
        public FareBasisCodesLine getFareBasisInfo() {
            return fareBasisInfo;
        }

        /**
         * Sets the value of the fareBasisInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareBasisCodesLine }
         *     
         */
        public void setFareBasisInfo(FareBasisCodesLine value) {
            this.fareBasisInfo = value;
        }

        /**
         * Gets the value of the fareData property.
         * 
         * @return
         *     possible object is
         *     {@link FareData }
         *     
         */
        public FareData getFareData() {
            return fareData;
        }

        /**
         * Sets the value of the fareData property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareData }
         *     
         */
        public void setFareData(FareData value) {
            this.fareData = value;
        }

        /**
         * Gets the value of the segmentAssociation property.
         * 
         * @return
         *     possible object is
         *     {@link SelectionDetails }
         *     
         */
        public SelectionDetails getSegmentAssociation() {
            return segmentAssociation;
        }

        /**
         * Sets the value of the segmentAssociation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectionDetails }
         *     
         */
        public void setSegmentAssociation(SelectionDetails value) {
            this.segmentAssociation = value;
        }

        /**
         * Gets the value of the referenceForTstData property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformation }
         *     
         */
        public ReferenceInformation getReferenceForTstData() {
            return referenceForTstData;
        }

        /**
         * Sets the value of the referenceForTstData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformation }
         *     
         */
        public void setReferenceForTstData(ReferenceInformation value) {
            this.referenceForTstData = value;
        }

    }

}
