
package com.amadeus.xml.smpreq_97_1_ia;

import java.math.BigDecimal;
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
 *         &lt;element name="travelProductIdent">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="productDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="departureDate">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="6"/>
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="departureTime" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="4"/>
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="arrivalDate" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="6"/>
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="arrivalTime" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="4"/>
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="dateVariation" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="boardpointDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="departureCityCode">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="3"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="offPointDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="arrivalCityCode">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="3"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="companyIdentification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="marketingAirlineCode">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="operatingAirlineCode" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="flightIdentification">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="flightNumber">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="classOfService" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="alphaSuffix" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="itemDescription" maxOccurs="3" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="7"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
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
 *         &lt;element name="seatRequestParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="genericDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cabinClassDesignator" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="noSmokingIndicator" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cabinClassOfService" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="compartmentDesignator" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="seatCharacteristic" maxOccurs="5" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="rangeOfRowsDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="seatRowNumber" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="numberOfRows" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="seatColumn" maxOccurs="20" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="actionRequired" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="freeSeatingReference" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="35"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="infoRelatedToCabinClass" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="seatsInformations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numberOfSeats" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="statusCodeRequested" maxOccurs="10" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="frequentTravelerSpecif" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="frequentTravelerInfo" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="frequentTravelerCompany">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="frequentTravelerIdentCode">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="25"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="frequentTravelerRefNumber" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="membershipLevel" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="4"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Dummy.NET" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reservationInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reservation" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="resaCRScode">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="resaRecordLocator">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="resaControlType" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="resaFirstDate" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="6"/>
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="resaTime" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="6"/>
 *                                   &lt;maxLength value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
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
 *         &lt;element name="travelers" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="travelerInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="paxSurnameDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="paxSurname">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="paxType" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="paxNumber" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="paxStatus" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="individualPaxDetails" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="individualPaxGivenName" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="individualPaxType" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="3"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="paxReferenceNumber" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="paxInfantIndicator" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="identificationCode" maxOccurs="2" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="70"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
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
 *                   &lt;element name="frequentTraveler" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;sequence>
 *                               &lt;element name="frequentTravelerInfo" maxOccurs="9" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="frequentTravelerCompany">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="3"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="frequentTravelerIdentCode">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="25"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="frequentTravelerRefNumber" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="2"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="membershipLevel" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="4"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
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
    "travelProductIdent",
    "seatRequestParameters",
    "seatsInformations",
    "frequentTravelerSpecif",
    "reservationInfo",
    "travelers"
})
@XmlRootElement(name = "Air_RetrieveSeatMap")
public class AirRetrieveSeatMap {

    @XmlElement(required = true)
    protected AirRetrieveSeatMap.TravelProductIdent travelProductIdent;
    protected AirRetrieveSeatMap.SeatRequestParameters seatRequestParameters;
    protected AirRetrieveSeatMap.SeatsInformations seatsInformations;
    protected AirRetrieveSeatMap.FrequentTravelerSpecif frequentTravelerSpecif;
    protected AirRetrieveSeatMap.ReservationInfo reservationInfo;
    protected List<AirRetrieveSeatMap.Travelers> travelers;

    /**
     * Gets the value of the travelProductIdent property.
     * 
     * @return
     *     possible object is
     *     {@link AirRetrieveSeatMap.TravelProductIdent }
     *     
     */
    public AirRetrieveSeatMap.TravelProductIdent getTravelProductIdent() {
        return travelProductIdent;
    }

    /**
     * Sets the value of the travelProductIdent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRetrieveSeatMap.TravelProductIdent }
     *     
     */
    public void setTravelProductIdent(AirRetrieveSeatMap.TravelProductIdent value) {
        this.travelProductIdent = value;
    }

    /**
     * Gets the value of the seatRequestParameters property.
     * 
     * @return
     *     possible object is
     *     {@link AirRetrieveSeatMap.SeatRequestParameters }
     *     
     */
    public AirRetrieveSeatMap.SeatRequestParameters getSeatRequestParameters() {
        return seatRequestParameters;
    }

    /**
     * Sets the value of the seatRequestParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRetrieveSeatMap.SeatRequestParameters }
     *     
     */
    public void setSeatRequestParameters(AirRetrieveSeatMap.SeatRequestParameters value) {
        this.seatRequestParameters = value;
    }

    /**
     * Gets the value of the seatsInformations property.
     * 
     * @return
     *     possible object is
     *     {@link AirRetrieveSeatMap.SeatsInformations }
     *     
     */
    public AirRetrieveSeatMap.SeatsInformations getSeatsInformations() {
        return seatsInformations;
    }

    /**
     * Sets the value of the seatsInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRetrieveSeatMap.SeatsInformations }
     *     
     */
    public void setSeatsInformations(AirRetrieveSeatMap.SeatsInformations value) {
        this.seatsInformations = value;
    }

    /**
     * Gets the value of the frequentTravelerSpecif property.
     * 
     * @return
     *     possible object is
     *     {@link AirRetrieveSeatMap.FrequentTravelerSpecif }
     *     
     */
    public AirRetrieveSeatMap.FrequentTravelerSpecif getFrequentTravelerSpecif() {
        return frequentTravelerSpecif;
    }

    /**
     * Sets the value of the frequentTravelerSpecif property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRetrieveSeatMap.FrequentTravelerSpecif }
     *     
     */
    public void setFrequentTravelerSpecif(AirRetrieveSeatMap.FrequentTravelerSpecif value) {
        this.frequentTravelerSpecif = value;
    }

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AirRetrieveSeatMap.ReservationInfo }
     *     
     */
    public AirRetrieveSeatMap.ReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirRetrieveSeatMap.ReservationInfo }
     *     
     */
    public void setReservationInfo(AirRetrieveSeatMap.ReservationInfo value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the travelers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirRetrieveSeatMap.Travelers }
     * 
     * 
     */
    public List<AirRetrieveSeatMap.Travelers> getTravelers() {
        if (travelers == null) {
            travelers = new ArrayList<AirRetrieveSeatMap.Travelers>();
        }
        return this.travelers;
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
     *         &lt;element name="frequentTravelerInfo" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="frequentTravelerCompany">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="frequentTravelerIdentCode">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="25"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="frequentTravelerRefNumber" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="membershipLevel" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Dummy.NET" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="0" minOccurs="0"/>
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
        "frequentTravelerInfo"
    })
    public static class FrequentTravelerSpecif {

        protected List<AirRetrieveSeatMap.FrequentTravelerSpecif.FrequentTravelerInfo> frequentTravelerInfo;

        /**
         * Gets the value of the frequentTravelerInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the frequentTravelerInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFrequentTravelerInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirRetrieveSeatMap.FrequentTravelerSpecif.FrequentTravelerInfo }
         * 
         * 
         */
        public List<AirRetrieveSeatMap.FrequentTravelerSpecif.FrequentTravelerInfo> getFrequentTravelerInfo() {
            if (frequentTravelerInfo == null) {
                frequentTravelerInfo = new ArrayList<AirRetrieveSeatMap.FrequentTravelerSpecif.FrequentTravelerInfo>();
            }
            return this.frequentTravelerInfo;
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
         *         &lt;element name="frequentTravelerCompany">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="frequentTravelerIdentCode">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="25"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="frequentTravelerRefNumber" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="membershipLevel" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "frequentTravelerCompany",
            "frequentTravelerIdentCode",
            "frequentTravelerRefNumber",
            "membershipLevel"
        })
        public static class FrequentTravelerInfo {

            @XmlElement(required = true)
            protected String frequentTravelerCompany;
            @XmlElement(required = true)
            protected String frequentTravelerIdentCode;
            protected String frequentTravelerRefNumber;
            protected String membershipLevel;

            /**
             * Gets the value of the frequentTravelerCompany property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequentTravelerCompany() {
                return frequentTravelerCompany;
            }

            /**
             * Sets the value of the frequentTravelerCompany property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequentTravelerCompany(String value) {
                this.frequentTravelerCompany = value;
            }

            /**
             * Gets the value of the frequentTravelerIdentCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequentTravelerIdentCode() {
                return frequentTravelerIdentCode;
            }

            /**
             * Sets the value of the frequentTravelerIdentCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequentTravelerIdentCode(String value) {
                this.frequentTravelerIdentCode = value;
            }

            /**
             * Gets the value of the frequentTravelerRefNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequentTravelerRefNumber() {
                return frequentTravelerRefNumber;
            }

            /**
             * Sets the value of the frequentTravelerRefNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequentTravelerRefNumber(String value) {
                this.frequentTravelerRefNumber = value;
            }

            /**
             * Gets the value of the membershipLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMembershipLevel() {
                return membershipLevel;
            }

            /**
             * Sets the value of the membershipLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMembershipLevel(String value) {
                this.membershipLevel = value;
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
     *         &lt;element name="reservation" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="resaCRScode">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="resaRecordLocator">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="resaControlType" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="resaFirstDate" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="6"/>
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="resaTime" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="6"/>
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
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
        "reservation"
    })
    public static class ReservationInfo {

        @XmlElement(required = true)
        protected List<AirRetrieveSeatMap.ReservationInfo.Reservation> reservation;

        /**
         * Gets the value of the reservation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the reservation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReservation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirRetrieveSeatMap.ReservationInfo.Reservation }
         * 
         * 
         */
        public List<AirRetrieveSeatMap.ReservationInfo.Reservation> getReservation() {
            if (reservation == null) {
                reservation = new ArrayList<AirRetrieveSeatMap.ReservationInfo.Reservation>();
            }
            return this.reservation;
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
         *         &lt;element name="resaCRScode">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="resaRecordLocator">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="resaControlType" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="resaFirstDate" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="6"/>
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="resaTime" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="6"/>
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "resaCRScode",
            "resaRecordLocator",
            "resaControlType",
            "resaFirstDate",
            "resaTime"
        })
        public static class Reservation {

            @XmlElement(required = true)
            protected String resaCRScode;
            @XmlElement(required = true)
            protected String resaRecordLocator;
            protected String resaControlType;
            protected String resaFirstDate;
            protected String resaTime;

            /**
             * Gets the value of the resaCRScode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResaCRScode() {
                return resaCRScode;
            }

            /**
             * Sets the value of the resaCRScode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResaCRScode(String value) {
                this.resaCRScode = value;
            }

            /**
             * Gets the value of the resaRecordLocator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResaRecordLocator() {
                return resaRecordLocator;
            }

            /**
             * Sets the value of the resaRecordLocator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResaRecordLocator(String value) {
                this.resaRecordLocator = value;
            }

            /**
             * Gets the value of the resaControlType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResaControlType() {
                return resaControlType;
            }

            /**
             * Sets the value of the resaControlType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResaControlType(String value) {
                this.resaControlType = value;
            }

            /**
             * Gets the value of the resaFirstDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResaFirstDate() {
                return resaFirstDate;
            }

            /**
             * Sets the value of the resaFirstDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResaFirstDate(String value) {
                this.resaFirstDate = value;
            }

            /**
             * Gets the value of the resaTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResaTime() {
                return resaTime;
            }

            /**
             * Sets the value of the resaTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResaTime(String value) {
                this.resaTime = value;
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
     *         &lt;element name="genericDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cabinClassDesignator" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="noSmokingIndicator" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cabinClassOfService" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="compartmentDesignator" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="seatCharacteristic" maxOccurs="5" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="rangeOfRowsDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="seatRowNumber" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="numberOfRows" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="seatColumn" maxOccurs="20" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="actionRequired" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="freeSeatingReference" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="35"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="infoRelatedToCabinClass" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "genericDetails",
        "rangeOfRowsDetails",
        "actionRequired",
        "freeSeatingReference",
        "infoRelatedToCabinClass"
    })
    public static class SeatRequestParameters {

        protected AirRetrieveSeatMap.SeatRequestParameters.GenericDetails genericDetails;
        protected AirRetrieveSeatMap.SeatRequestParameters.RangeOfRowsDetails rangeOfRowsDetails;
        protected String actionRequired;
        protected String freeSeatingReference;
        protected String infoRelatedToCabinClass;

        /**
         * Gets the value of the genericDetails property.
         * 
         * @return
         *     possible object is
         *     {@link AirRetrieveSeatMap.SeatRequestParameters.GenericDetails }
         *     
         */
        public AirRetrieveSeatMap.SeatRequestParameters.GenericDetails getGenericDetails() {
            return genericDetails;
        }

        /**
         * Sets the value of the genericDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirRetrieveSeatMap.SeatRequestParameters.GenericDetails }
         *     
         */
        public void setGenericDetails(AirRetrieveSeatMap.SeatRequestParameters.GenericDetails value) {
            this.genericDetails = value;
        }

        /**
         * Gets the value of the rangeOfRowsDetails property.
         * 
         * @return
         *     possible object is
         *     {@link AirRetrieveSeatMap.SeatRequestParameters.RangeOfRowsDetails }
         *     
         */
        public AirRetrieveSeatMap.SeatRequestParameters.RangeOfRowsDetails getRangeOfRowsDetails() {
            return rangeOfRowsDetails;
        }

        /**
         * Sets the value of the rangeOfRowsDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirRetrieveSeatMap.SeatRequestParameters.RangeOfRowsDetails }
         *     
         */
        public void setRangeOfRowsDetails(AirRetrieveSeatMap.SeatRequestParameters.RangeOfRowsDetails value) {
            this.rangeOfRowsDetails = value;
        }

        /**
         * Gets the value of the actionRequired property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionRequired() {
            return actionRequired;
        }

        /**
         * Sets the value of the actionRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionRequired(String value) {
            this.actionRequired = value;
        }

        /**
         * Gets the value of the freeSeatingReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFreeSeatingReference() {
            return freeSeatingReference;
        }

        /**
         * Sets the value of the freeSeatingReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFreeSeatingReference(String value) {
            this.freeSeatingReference = value;
        }

        /**
         * Gets the value of the infoRelatedToCabinClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoRelatedToCabinClass() {
            return infoRelatedToCabinClass;
        }

        /**
         * Sets the value of the infoRelatedToCabinClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoRelatedToCabinClass(String value) {
            this.infoRelatedToCabinClass = value;
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
         *         &lt;element name="cabinClassDesignator" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="noSmokingIndicator" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cabinClassOfService" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="compartmentDesignator" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="seatCharacteristic" maxOccurs="5" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "cabinClassDesignator",
            "noSmokingIndicator",
            "cabinClassOfService",
            "compartmentDesignator",
            "seatCharacteristic"
        })
        public static class GenericDetails {

            protected String cabinClassDesignator;
            protected String noSmokingIndicator;
            protected String cabinClassOfService;
            protected String compartmentDesignator;
            protected List<String> seatCharacteristic;

            /**
             * Gets the value of the cabinClassDesignator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCabinClassDesignator() {
                return cabinClassDesignator;
            }

            /**
             * Sets the value of the cabinClassDesignator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCabinClassDesignator(String value) {
                this.cabinClassDesignator = value;
            }

            /**
             * Gets the value of the noSmokingIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoSmokingIndicator() {
                return noSmokingIndicator;
            }

            /**
             * Sets the value of the noSmokingIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoSmokingIndicator(String value) {
                this.noSmokingIndicator = value;
            }

            /**
             * Gets the value of the cabinClassOfService property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCabinClassOfService() {
                return cabinClassOfService;
            }

            /**
             * Sets the value of the cabinClassOfService property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCabinClassOfService(String value) {
                this.cabinClassOfService = value;
            }

            /**
             * Gets the value of the compartmentDesignator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompartmentDesignator() {
                return compartmentDesignator;
            }

            /**
             * Sets the value of the compartmentDesignator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompartmentDesignator(String value) {
                this.compartmentDesignator = value;
            }

            /**
             * Gets the value of the seatCharacteristic property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatCharacteristic property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatCharacteristic().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSeatCharacteristic() {
                if (seatCharacteristic == null) {
                    seatCharacteristic = new ArrayList<String>();
                }
                return this.seatCharacteristic;
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
         *         &lt;element name="seatRowNumber" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="numberOfRows" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="seatColumn" maxOccurs="20" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "seatRowNumber",
            "numberOfRows",
            "seatColumn"
        })
        public static class RangeOfRowsDetails {

            protected BigDecimal seatRowNumber;
            protected BigDecimal numberOfRows;
            protected List<String> seatColumn;

            /**
             * Gets the value of the seatRowNumber property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getSeatRowNumber() {
                return seatRowNumber;
            }

            /**
             * Sets the value of the seatRowNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setSeatRowNumber(BigDecimal value) {
                this.seatRowNumber = value;
            }

            /**
             * Gets the value of the numberOfRows property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getNumberOfRows() {
                return numberOfRows;
            }

            /**
             * Sets the value of the numberOfRows property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setNumberOfRows(BigDecimal value) {
                this.numberOfRows = value;
            }

            /**
             * Gets the value of the seatColumn property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatColumn property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatColumn().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSeatColumn() {
                if (seatColumn == null) {
                    seatColumn = new ArrayList<String>();
                }
                return this.seatColumn;
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
     *         &lt;element name="numberOfSeats" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="statusCodeRequested" maxOccurs="10" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="2"/>
     *               &lt;maxLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "numberOfSeats",
        "statusCodeRequested"
    })
    public static class SeatsInformations {

        protected BigDecimal numberOfSeats;
        protected List<String> statusCodeRequested;

        /**
         * Gets the value of the numberOfSeats property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNumberOfSeats() {
            return numberOfSeats;
        }

        /**
         * Sets the value of the numberOfSeats property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNumberOfSeats(BigDecimal value) {
            this.numberOfSeats = value;
        }

        /**
         * Gets the value of the statusCodeRequested property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statusCodeRequested property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatusCodeRequested().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatusCodeRequested() {
            if (statusCodeRequested == null) {
                statusCodeRequested = new ArrayList<String>();
            }
            return this.statusCodeRequested;
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
     *         &lt;element name="travelerInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="paxSurnameDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="paxSurname">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="paxType" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="paxNumber" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="paxStatus" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="individualPaxDetails" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="individualPaxGivenName" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="individualPaxType" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="3"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="paxReferenceNumber" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="paxInfantIndicator" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="identificationCode" maxOccurs="2" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="70"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
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
     *         &lt;element name="frequentTraveler" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;sequence>
     *                     &lt;element name="frequentTravelerInfo" maxOccurs="9" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="frequentTravelerCompany">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="3"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="frequentTravelerIdentCode">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="25"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="frequentTravelerRefNumber" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="2"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="membershipLevel" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="4"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
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
        "travelerInformation",
        "frequentTraveler"
    })
    public static class Travelers {

        @XmlElement(required = true)
        protected AirRetrieveSeatMap.Travelers.TravelerInformation travelerInformation;
        protected List<AirRetrieveSeatMap.Travelers.FrequentTraveler> frequentTraveler;

        /**
         * Gets the value of the travelerInformation property.
         * 
         * @return
         *     possible object is
         *     {@link AirRetrieveSeatMap.Travelers.TravelerInformation }
         *     
         */
        public AirRetrieveSeatMap.Travelers.TravelerInformation getTravelerInformation() {
            return travelerInformation;
        }

        /**
         * Sets the value of the travelerInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirRetrieveSeatMap.Travelers.TravelerInformation }
         *     
         */
        public void setTravelerInformation(AirRetrieveSeatMap.Travelers.TravelerInformation value) {
            this.travelerInformation = value;
        }

        /**
         * Gets the value of the frequentTraveler property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the frequentTraveler property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFrequentTraveler().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirRetrieveSeatMap.Travelers.FrequentTraveler }
         * 
         * 
         */
        public List<AirRetrieveSeatMap.Travelers.FrequentTraveler> getFrequentTraveler() {
            if (frequentTraveler == null) {
                frequentTraveler = new ArrayList<AirRetrieveSeatMap.Travelers.FrequentTraveler>();
            }
            return this.frequentTraveler;
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
         *         &lt;sequence>
         *           &lt;element name="frequentTravelerInfo" maxOccurs="9" minOccurs="0">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="frequentTravelerCompany">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="3"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="frequentTravelerIdentCode">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="25"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="frequentTravelerRefNumber" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="2"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="membershipLevel" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="4"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/sequence>
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
            "frequentTravelerInfo"
        })
        public static class FrequentTraveler {

            protected List<AirRetrieveSeatMap.Travelers.FrequentTraveler.FrequentTravelerInfo> frequentTravelerInfo;

            /**
             * Gets the value of the frequentTravelerInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the frequentTravelerInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFrequentTravelerInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirRetrieveSeatMap.Travelers.FrequentTraveler.FrequentTravelerInfo }
             * 
             * 
             */
            public List<AirRetrieveSeatMap.Travelers.FrequentTraveler.FrequentTravelerInfo> getFrequentTravelerInfo() {
                if (frequentTravelerInfo == null) {
                    frequentTravelerInfo = new ArrayList<AirRetrieveSeatMap.Travelers.FrequentTraveler.FrequentTravelerInfo>();
                }
                return this.frequentTravelerInfo;
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
             *         &lt;element name="frequentTravelerCompany">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="frequentTravelerIdentCode">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="25"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="frequentTravelerRefNumber" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="2"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="membershipLevel" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "frequentTravelerCompany",
                "frequentTravelerIdentCode",
                "frequentTravelerRefNumber",
                "membershipLevel"
            })
            public static class FrequentTravelerInfo {

                @XmlElement(required = true)
                protected String frequentTravelerCompany;
                @XmlElement(required = true)
                protected String frequentTravelerIdentCode;
                protected String frequentTravelerRefNumber;
                protected String membershipLevel;

                /**
                 * Gets the value of the frequentTravelerCompany property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrequentTravelerCompany() {
                    return frequentTravelerCompany;
                }

                /**
                 * Sets the value of the frequentTravelerCompany property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrequentTravelerCompany(String value) {
                    this.frequentTravelerCompany = value;
                }

                /**
                 * Gets the value of the frequentTravelerIdentCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrequentTravelerIdentCode() {
                    return frequentTravelerIdentCode;
                }

                /**
                 * Sets the value of the frequentTravelerIdentCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrequentTravelerIdentCode(String value) {
                    this.frequentTravelerIdentCode = value;
                }

                /**
                 * Gets the value of the frequentTravelerRefNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrequentTravelerRefNumber() {
                    return frequentTravelerRefNumber;
                }

                /**
                 * Sets the value of the frequentTravelerRefNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrequentTravelerRefNumber(String value) {
                    this.frequentTravelerRefNumber = value;
                }

                /**
                 * Gets the value of the membershipLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMembershipLevel() {
                    return membershipLevel;
                }

                /**
                 * Sets the value of the membershipLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMembershipLevel(String value) {
                    this.membershipLevel = value;
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
         *         &lt;element name="paxSurnameDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="paxSurname">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="paxType" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="paxNumber" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="paxStatus" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="individualPaxDetails" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="individualPaxGivenName" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="individualPaxType" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="3"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="paxReferenceNumber" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="paxInfantIndicator" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="identificationCode" maxOccurs="2" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="70"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
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
            "paxSurnameDetails",
            "individualPaxDetails"
        })
        public static class TravelerInformation {

            @XmlElement(required = true)
            protected AirRetrieveSeatMap.Travelers.TravelerInformation.PaxSurnameDetails paxSurnameDetails;
            protected List<AirRetrieveSeatMap.Travelers.TravelerInformation.IndividualPaxDetails> individualPaxDetails;

            /**
             * Gets the value of the paxSurnameDetails property.
             * 
             * @return
             *     possible object is
             *     {@link AirRetrieveSeatMap.Travelers.TravelerInformation.PaxSurnameDetails }
             *     
             */
            public AirRetrieveSeatMap.Travelers.TravelerInformation.PaxSurnameDetails getPaxSurnameDetails() {
                return paxSurnameDetails;
            }

            /**
             * Sets the value of the paxSurnameDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirRetrieveSeatMap.Travelers.TravelerInformation.PaxSurnameDetails }
             *     
             */
            public void setPaxSurnameDetails(AirRetrieveSeatMap.Travelers.TravelerInformation.PaxSurnameDetails value) {
                this.paxSurnameDetails = value;
            }

            /**
             * Gets the value of the individualPaxDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the individualPaxDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIndividualPaxDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirRetrieveSeatMap.Travelers.TravelerInformation.IndividualPaxDetails }
             * 
             * 
             */
            public List<AirRetrieveSeatMap.Travelers.TravelerInformation.IndividualPaxDetails> getIndividualPaxDetails() {
                if (individualPaxDetails == null) {
                    individualPaxDetails = new ArrayList<AirRetrieveSeatMap.Travelers.TravelerInformation.IndividualPaxDetails>();
                }
                return this.individualPaxDetails;
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
             *         &lt;element name="individualPaxGivenName" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="70"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="individualPaxType" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="paxReferenceNumber" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="paxInfantIndicator" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="identificationCode" maxOccurs="2" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="70"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "individualPaxGivenName",
                "individualPaxType",
                "paxReferenceNumber",
                "paxInfantIndicator",
                "identificationCode"
            })
            public static class IndividualPaxDetails {

                protected String individualPaxGivenName;
                protected String individualPaxType;
                protected BigDecimal paxReferenceNumber;
                protected String paxInfantIndicator;
                protected List<String> identificationCode;

                /**
                 * Gets the value of the individualPaxGivenName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndividualPaxGivenName() {
                    return individualPaxGivenName;
                }

                /**
                 * Sets the value of the individualPaxGivenName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndividualPaxGivenName(String value) {
                    this.individualPaxGivenName = value;
                }

                /**
                 * Gets the value of the individualPaxType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndividualPaxType() {
                    return individualPaxType;
                }

                /**
                 * Sets the value of the individualPaxType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndividualPaxType(String value) {
                    this.individualPaxType = value;
                }

                /**
                 * Gets the value of the paxReferenceNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPaxReferenceNumber() {
                    return paxReferenceNumber;
                }

                /**
                 * Sets the value of the paxReferenceNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPaxReferenceNumber(BigDecimal value) {
                    this.paxReferenceNumber = value;
                }

                /**
                 * Gets the value of the paxInfantIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaxInfantIndicator() {
                    return paxInfantIndicator;
                }

                /**
                 * Sets the value of the paxInfantIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaxInfantIndicator(String value) {
                    this.paxInfantIndicator = value;
                }

                /**
                 * Gets the value of the identificationCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the identificationCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIdentificationCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getIdentificationCode() {
                    if (identificationCode == null) {
                        identificationCode = new ArrayList<String>();
                    }
                    return this.identificationCode;
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
             *         &lt;element name="paxSurname">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="70"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="paxType" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="paxNumber" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="paxStatus" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "paxSurname",
                "paxType",
                "paxNumber",
                "paxStatus"
            })
            public static class PaxSurnameDetails {

                @XmlElement(required = true)
                protected String paxSurname;
                protected String paxType;
                protected BigDecimal paxNumber;
                protected String paxStatus;

                /**
                 * Gets the value of the paxSurname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaxSurname() {
                    return paxSurname;
                }

                /**
                 * Sets the value of the paxSurname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaxSurname(String value) {
                    this.paxSurname = value;
                }

                /**
                 * Gets the value of the paxType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaxType() {
                    return paxType;
                }

                /**
                 * Sets the value of the paxType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaxType(String value) {
                    this.paxType = value;
                }

                /**
                 * Gets the value of the paxNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPaxNumber() {
                    return paxNumber;
                }

                /**
                 * Sets the value of the paxNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPaxNumber(BigDecimal value) {
                    this.paxNumber = value;
                }

                /**
                 * Gets the value of the paxStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaxStatus() {
                    return paxStatus;
                }

                /**
                 * Sets the value of the paxStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaxStatus(String value) {
                    this.paxStatus = value;
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
     *         &lt;element name="productDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="departureDate">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="6"/>
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="departureTime" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="4"/>
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="arrivalDate" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="6"/>
     *                         &lt;maxLength value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="arrivalTime" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="4"/>
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="dateVariation" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="boardpointDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="departureCityCode">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="3"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="offPointDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="arrivalCityCode">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="3"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="companyIdentification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="marketingAirlineCode">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="operatingAirlineCode" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="flightIdentification">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="flightNumber">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="4"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="classOfService" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="alphaSuffix" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="itemDescription" maxOccurs="3" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="7"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
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
        "productDetails",
        "boardpointDetail",
        "offPointDetail",
        "companyIdentification",
        "flightIdentification"
    })
    public static class TravelProductIdent {

        protected AirRetrieveSeatMap.TravelProductIdent.ProductDetails productDetails;
        protected AirRetrieveSeatMap.TravelProductIdent.BoardpointDetail boardpointDetail;
        protected AirRetrieveSeatMap.TravelProductIdent.OffPointDetail offPointDetail;
        protected AirRetrieveSeatMap.TravelProductIdent.CompanyIdentification companyIdentification;
        @XmlElement(required = true)
        protected AirRetrieveSeatMap.TravelProductIdent.FlightIdentification flightIdentification;

        /**
         * Gets the value of the productDetails property.
         * 
         * @return
         *     possible object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.ProductDetails }
         *     
         */
        public AirRetrieveSeatMap.TravelProductIdent.ProductDetails getProductDetails() {
            return productDetails;
        }

        /**
         * Sets the value of the productDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.ProductDetails }
         *     
         */
        public void setProductDetails(AirRetrieveSeatMap.TravelProductIdent.ProductDetails value) {
            this.productDetails = value;
        }

        /**
         * Gets the value of the boardpointDetail property.
         * 
         * @return
         *     possible object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.BoardpointDetail }
         *     
         */
        public AirRetrieveSeatMap.TravelProductIdent.BoardpointDetail getBoardpointDetail() {
            return boardpointDetail;
        }

        /**
         * Sets the value of the boardpointDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.BoardpointDetail }
         *     
         */
        public void setBoardpointDetail(AirRetrieveSeatMap.TravelProductIdent.BoardpointDetail value) {
            this.boardpointDetail = value;
        }

        /**
         * Gets the value of the offPointDetail property.
         * 
         * @return
         *     possible object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.OffPointDetail }
         *     
         */
        public AirRetrieveSeatMap.TravelProductIdent.OffPointDetail getOffPointDetail() {
            return offPointDetail;
        }

        /**
         * Sets the value of the offPointDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.OffPointDetail }
         *     
         */
        public void setOffPointDetail(AirRetrieveSeatMap.TravelProductIdent.OffPointDetail value) {
            this.offPointDetail = value;
        }

        /**
         * Gets the value of the companyIdentification property.
         * 
         * @return
         *     possible object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.CompanyIdentification }
         *     
         */
        public AirRetrieveSeatMap.TravelProductIdent.CompanyIdentification getCompanyIdentification() {
            return companyIdentification;
        }

        /**
         * Sets the value of the companyIdentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.CompanyIdentification }
         *     
         */
        public void setCompanyIdentification(AirRetrieveSeatMap.TravelProductIdent.CompanyIdentification value) {
            this.companyIdentification = value;
        }

        /**
         * Gets the value of the flightIdentification property.
         * 
         * @return
         *     possible object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.FlightIdentification }
         *     
         */
        public AirRetrieveSeatMap.TravelProductIdent.FlightIdentification getFlightIdentification() {
            return flightIdentification;
        }

        /**
         * Sets the value of the flightIdentification property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirRetrieveSeatMap.TravelProductIdent.FlightIdentification }
         *     
         */
        public void setFlightIdentification(AirRetrieveSeatMap.TravelProductIdent.FlightIdentification value) {
            this.flightIdentification = value;
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
         *         &lt;element name="departureCityCode">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="3"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "departureCityCode"
        })
        public static class BoardpointDetail {

            @XmlElement(required = true)
            protected String departureCityCode;

            /**
             * Gets the value of the departureCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureCityCode() {
                return departureCityCode;
            }

            /**
             * Sets the value of the departureCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureCityCode(String value) {
                this.departureCityCode = value;
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
         *         &lt;element name="marketingAirlineCode">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="operatingAirlineCode" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "marketingAirlineCode",
            "operatingAirlineCode"
        })
        public static class CompanyIdentification {

            @XmlElement(required = true)
            protected String marketingAirlineCode;
            protected String operatingAirlineCode;

            /**
             * Gets the value of the marketingAirlineCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketingAirlineCode() {
                return marketingAirlineCode;
            }

            /**
             * Sets the value of the marketingAirlineCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketingAirlineCode(String value) {
                this.marketingAirlineCode = value;
            }

            /**
             * Gets the value of the operatingAirlineCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperatingAirlineCode() {
                return operatingAirlineCode;
            }

            /**
             * Sets the value of the operatingAirlineCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperatingAirlineCode(String value) {
                this.operatingAirlineCode = value;
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
         *         &lt;element name="flightNumber">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="classOfService" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="alphaSuffix" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="itemDescription" maxOccurs="3" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="7"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "flightNumber",
            "classOfService",
            "alphaSuffix",
            "itemDescription"
        })
        public static class FlightIdentification {

            @XmlElement(required = true)
            protected String flightNumber;
            protected String classOfService;
            protected String alphaSuffix;
            protected List<String> itemDescription;

            /**
             * Gets the value of the flightNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightNumber() {
                return flightNumber;
            }

            /**
             * Sets the value of the flightNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightNumber(String value) {
                this.flightNumber = value;
            }

            /**
             * Gets the value of the classOfService property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassOfService() {
                return classOfService;
            }

            /**
             * Sets the value of the classOfService property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassOfService(String value) {
                this.classOfService = value;
            }

            /**
             * Gets the value of the alphaSuffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlphaSuffix() {
                return alphaSuffix;
            }

            /**
             * Sets the value of the alphaSuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlphaSuffix(String value) {
                this.alphaSuffix = value;
            }

            /**
             * Gets the value of the itemDescription property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the itemDescription property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItemDescription().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getItemDescription() {
                if (itemDescription == null) {
                    itemDescription = new ArrayList<String>();
                }
                return this.itemDescription;
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
         *         &lt;element name="arrivalCityCode">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="3"/>
         *               &lt;maxLength value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "arrivalCityCode"
        })
        public static class OffPointDetail {

            @XmlElement(required = true)
            protected String arrivalCityCode;

            /**
             * Gets the value of the arrivalCityCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalCityCode() {
                return arrivalCityCode;
            }

            /**
             * Sets the value of the arrivalCityCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalCityCode(String value) {
                this.arrivalCityCode = value;
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
         *         &lt;element name="departureDate">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="6"/>
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="departureTime" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="4"/>
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="arrivalDate" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="6"/>
         *               &lt;maxLength value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="arrivalTime" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="4"/>
         *               &lt;maxLength value="4"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dateVariation" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "departureDate",
            "departureTime",
            "arrivalDate",
            "arrivalTime",
            "dateVariation"
        })
        public static class ProductDetails {

            @XmlElement(required = true)
            protected String departureDate;
            protected String departureTime;
            protected String arrivalDate;
            protected String arrivalTime;
            protected String dateVariation;

            /**
             * Gets the value of the departureDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureDate() {
                return departureDate;
            }

            /**
             * Sets the value of the departureDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureDate(String value) {
                this.departureDate = value;
            }

            /**
             * Gets the value of the departureTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureTime() {
                return departureTime;
            }

            /**
             * Sets the value of the departureTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureTime(String value) {
                this.departureTime = value;
            }

            /**
             * Gets the value of the arrivalDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalDate() {
                return arrivalDate;
            }

            /**
             * Sets the value of the arrivalDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalDate(String value) {
                this.arrivalDate = value;
            }

            /**
             * Gets the value of the arrivalTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalTime() {
                return arrivalTime;
            }

            /**
             * Sets the value of the arrivalTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalTime(String value) {
                this.arrivalTime = value;
            }

            /**
             * Gets the value of the dateVariation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateVariation() {
                return dateVariation;
            }

            /**
             * Sets the value of the dateVariation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateVariation(String value) {
                this.dateVariation = value;
            }

        }

    }

}
