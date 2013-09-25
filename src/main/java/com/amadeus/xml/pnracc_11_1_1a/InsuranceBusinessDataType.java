
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * insurance booked data
 * 
 * <p>Java class for InsuranceBusinessDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceBusinessDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerProductDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceProductDetails"/>
 *         &lt;element name="substiteName" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="extraPremium" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
 *         &lt;element name="productSection" maxOccurs="48" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="productCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceProductDetails_20774S"/>
 *                   &lt;element name="informationLines" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_6235S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="planCostInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_22057S" minOccurs="0"/>
 *         &lt;element name="planTypeDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="planType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceProviderAndProducts"/>
 *                   &lt;element name="travelValue" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contactDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="miscelaneous" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_12240S"/>
 *                   &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress" minOccurs="0"/>
 *                   &lt;element name="contactName" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subscriberAddressSection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nameDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Name"/>
 *                   &lt;element name="addressInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address" minOccurs="0"/>
 *                   &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="coverageDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="policyDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsurancePolicy"/>
 *                   &lt;element name="coverageInfo" maxOccurs="3" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="coverage" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceCoverage"/>
 *                             &lt;element name="coverageValues" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="coveredPassenger" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_15923S" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="coverageDates" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation" minOccurs="0"/>
 *                   &lt;element name="subscriptionDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_20644S" minOccurs="0"/>
 *                   &lt;element name="agentReferenceDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_9456S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comissionAmount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CommissionInformation" minOccurs="0"/>
 *         &lt;element name="insuranceFopSection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="formOfPaymentSection" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment"/>
 *                   &lt;element name="fopExtendedData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails" maxOccurs="3" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="confirmationNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation" minOccurs="0"/>
 *         &lt;element name="productKnowledge" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ActionDetails" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="passengerDetails" maxOccurs="198" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_32300S"/>
 *                   &lt;element name="perPaxProdKnowledge" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ActionDetails" maxOccurs="9" minOccurs="0"/>
 *                   &lt;element name="dateOfBirthInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation" minOccurs="0"/>
 *                   &lt;element name="passengerFeatures" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_10089S" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="insureeRemark" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks" minOccurs="0"/>
 *                   &lt;element name="travelerDocInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PassengerDocumentDetails" minOccurs="0"/>
 *                   &lt;element name="policyDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsurancePolicy" minOccurs="0"/>
 *                   &lt;element name="travelerValueDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="travelCost" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceCoverage"/>
 *                             &lt;element name="travelAmount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="premiumPerTariffPerPax" maxOccurs="4" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tariffCodeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceProductDetails_20775S"/>
 *                             &lt;element name="tariffCodePerPaxAmount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="premiumPerpaxInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_22057S" minOccurs="0"/>
 *                   &lt;element name="voucherNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_31804S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="printInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DocumentInformationDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceBusinessDataType", propOrder = {
    "providerProductDetails",
    "substiteName",
    "extraPremium",
    "productSection",
    "planCostInfo",
    "planTypeDetails",
    "contactDetails",
    "subscriberAddressSection",
    "coverageDetails",
    "comissionAmount",
    "insuranceFopSection",
    "confirmationNumber",
    "productKnowledge",
    "passengerDetails",
    "printInformation"
})
public class InsuranceBusinessDataType {

    @XmlElement(required = true)
    protected InsuranceProductDetails providerProductDetails;
    protected List<TravellerInformation> substiteName;
    protected MonetaryInformation extraPremium;
    protected List<InsuranceBusinessDataType.ProductSection> productSection;
    protected TariffInformation22057S planCostInfo;
    protected InsuranceBusinessDataType.PlanTypeDetails planTypeDetails;
    protected InsuranceBusinessDataType.ContactDetails contactDetails;
    protected InsuranceBusinessDataType.SubscriberAddressSection subscriberAddressSection;
    protected InsuranceBusinessDataType.CoverageDetails coverageDetails;
    protected CommissionInformation comissionAmount;
    protected InsuranceBusinessDataType.InsuranceFopSection insuranceFopSection;
    protected ReservationControlInformation confirmationNumber;
    protected List<ActionDetails> productKnowledge;
    protected List<InsuranceBusinessDataType.PassengerDetails> passengerDetails;
    protected DocumentInformationDetails printInformation;

    /**
     * Gets the value of the providerProductDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceProductDetails }
     *     
     */
    public InsuranceProductDetails getProviderProductDetails() {
        return providerProductDetails;
    }

    /**
     * Sets the value of the providerProductDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceProductDetails }
     *     
     */
    public void setProviderProductDetails(InsuranceProductDetails value) {
        this.providerProductDetails = value;
    }

    /**
     * Gets the value of the substiteName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substiteName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstiteName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerInformation }
     * 
     * 
     */
    public List<TravellerInformation> getSubstiteName() {
        if (substiteName == null) {
            substiteName = new ArrayList<TravellerInformation>();
        }
        return this.substiteName;
    }

    /**
     * Gets the value of the extraPremium property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformation }
     *     
     */
    public MonetaryInformation getExtraPremium() {
        return extraPremium;
    }

    /**
     * Sets the value of the extraPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformation }
     *     
     */
    public void setExtraPremium(MonetaryInformation value) {
        this.extraPremium = value;
    }

    /**
     * Gets the value of the productSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceBusinessDataType.ProductSection }
     * 
     * 
     */
    public List<InsuranceBusinessDataType.ProductSection> getProductSection() {
        if (productSection == null) {
            productSection = new ArrayList<InsuranceBusinessDataType.ProductSection>();
        }
        return this.productSection;
    }

    /**
     * Gets the value of the planCostInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformation22057S }
     *     
     */
    public TariffInformation22057S getPlanCostInfo() {
        return planCostInfo;
    }

    /**
     * Sets the value of the planCostInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformation22057S }
     *     
     */
    public void setPlanCostInfo(TariffInformation22057S value) {
        this.planCostInfo = value;
    }

    /**
     * Gets the value of the planTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.PlanTypeDetails }
     *     
     */
    public InsuranceBusinessDataType.PlanTypeDetails getPlanTypeDetails() {
        return planTypeDetails;
    }

    /**
     * Sets the value of the planTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.PlanTypeDetails }
     *     
     */
    public void setPlanTypeDetails(InsuranceBusinessDataType.PlanTypeDetails value) {
        this.planTypeDetails = value;
    }

    /**
     * Gets the value of the contactDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.ContactDetails }
     *     
     */
    public InsuranceBusinessDataType.ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Sets the value of the contactDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.ContactDetails }
     *     
     */
    public void setContactDetails(InsuranceBusinessDataType.ContactDetails value) {
        this.contactDetails = value;
    }

    /**
     * Gets the value of the subscriberAddressSection property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.SubscriberAddressSection }
     *     
     */
    public InsuranceBusinessDataType.SubscriberAddressSection getSubscriberAddressSection() {
        return subscriberAddressSection;
    }

    /**
     * Sets the value of the subscriberAddressSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.SubscriberAddressSection }
     *     
     */
    public void setSubscriberAddressSection(InsuranceBusinessDataType.SubscriberAddressSection value) {
        this.subscriberAddressSection = value;
    }

    /**
     * Gets the value of the coverageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.CoverageDetails }
     *     
     */
    public InsuranceBusinessDataType.CoverageDetails getCoverageDetails() {
        return coverageDetails;
    }

    /**
     * Sets the value of the coverageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.CoverageDetails }
     *     
     */
    public void setCoverageDetails(InsuranceBusinessDataType.CoverageDetails value) {
        this.coverageDetails = value;
    }

    /**
     * Gets the value of the comissionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionInformation }
     *     
     */
    public CommissionInformation getComissionAmount() {
        return comissionAmount;
    }

    /**
     * Sets the value of the comissionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionInformation }
     *     
     */
    public void setComissionAmount(CommissionInformation value) {
        this.comissionAmount = value;
    }

    /**
     * Gets the value of the insuranceFopSection property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessDataType.InsuranceFopSection }
     *     
     */
    public InsuranceBusinessDataType.InsuranceFopSection getInsuranceFopSection() {
        return insuranceFopSection;
    }

    /**
     * Sets the value of the insuranceFopSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessDataType.InsuranceFopSection }
     *     
     */
    public void setInsuranceFopSection(InsuranceBusinessDataType.InsuranceFopSection value) {
        this.insuranceFopSection = value;
    }

    /**
     * Gets the value of the confirmationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformation }
     *     
     */
    public ReservationControlInformation getConfirmationNumber() {
        return confirmationNumber;
    }

    /**
     * Sets the value of the confirmationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformation }
     *     
     */
    public void setConfirmationNumber(ReservationControlInformation value) {
        this.confirmationNumber = value;
    }

    /**
     * Gets the value of the productKnowledge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productKnowledge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductKnowledge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionDetails }
     * 
     * 
     */
    public List<ActionDetails> getProductKnowledge() {
        if (productKnowledge == null) {
            productKnowledge = new ArrayList<ActionDetails>();
        }
        return this.productKnowledge;
    }

    /**
     * Gets the value of the passengerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceBusinessDataType.PassengerDetails }
     * 
     * 
     */
    public List<InsuranceBusinessDataType.PassengerDetails> getPassengerDetails() {
        if (passengerDetails == null) {
            passengerDetails = new ArrayList<InsuranceBusinessDataType.PassengerDetails>();
        }
        return this.passengerDetails;
    }

    /**
     * Gets the value of the printInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInformationDetails }
     *     
     */
    public DocumentInformationDetails getPrintInformation() {
        return printInformation;
    }

    /**
     * Sets the value of the printInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInformationDetails }
     *     
     */
    public void setPrintInformation(DocumentInformationDetails value) {
        this.printInformation = value;
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
     *         &lt;element name="miscelaneous" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks_12240S"/>
     *         &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress" minOccurs="0"/>
     *         &lt;element name="contactName" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation" minOccurs="0"/>
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
        "miscelaneous",
        "phoneNumber",
        "contactName"
    })
    public static class ContactDetails {

        @XmlElement(required = true)
        protected MiscellaneousRemarks12240S miscelaneous;
        protected PhoneAndEmailAddress phoneNumber;
        protected TravellerInformation contactName;

        /**
         * Gets the value of the miscelaneous property.
         * 
         * @return
         *     possible object is
         *     {@link MiscellaneousRemarks12240S }
         *     
         */
        public MiscellaneousRemarks12240S getMiscelaneous() {
            return miscelaneous;
        }

        /**
         * Sets the value of the miscelaneous property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscellaneousRemarks12240S }
         *     
         */
        public void setMiscelaneous(MiscellaneousRemarks12240S value) {
            this.miscelaneous = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneAndEmailAddress }
         *     
         */
        public PhoneAndEmailAddress getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneAndEmailAddress }
         *     
         */
        public void setPhoneNumber(PhoneAndEmailAddress value) {
            this.phoneNumber = value;
        }

        /**
         * Gets the value of the contactName property.
         * 
         * @return
         *     possible object is
         *     {@link TravellerInformation }
         *     
         */
        public TravellerInformation getContactName() {
            return contactName;
        }

        /**
         * Sets the value of the contactName property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravellerInformation }
         *     
         */
        public void setContactName(TravellerInformation value) {
            this.contactName = value;
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
     *         &lt;element name="policyDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsurancePolicy"/>
     *         &lt;element name="coverageInfo" maxOccurs="3" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="coverage" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceCoverage"/>
     *                   &lt;element name="coverageValues" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="coveredPassenger" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_15923S" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="coverageDates" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredPeriodInformation" minOccurs="0"/>
     *         &lt;element name="subscriptionDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_20644S" minOccurs="0"/>
     *         &lt;element name="agentReferenceDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_9456S" minOccurs="0"/>
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
        "policyDetails",
        "coverageInfo",
        "coveredPassenger",
        "coverageDates",
        "subscriptionDetails",
        "agentReferenceDetails"
    })
    public static class CoverageDetails {

        @XmlElement(required = true)
        protected InsurancePolicy policyDetails;
        protected List<InsuranceBusinessDataType.CoverageDetails.CoverageInfo> coverageInfo;
        protected List<TravellerInformation15923S> coveredPassenger;
        protected StructuredPeriodInformation coverageDates;
        protected StructuredDateTimeInformation20644S subscriptionDetails;
        protected UserIdentification9456S agentReferenceDetails;

        /**
         * Gets the value of the policyDetails property.
         * 
         * @return
         *     possible object is
         *     {@link InsurancePolicy }
         *     
         */
        public InsurancePolicy getPolicyDetails() {
            return policyDetails;
        }

        /**
         * Sets the value of the policyDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsurancePolicy }
         *     
         */
        public void setPolicyDetails(InsurancePolicy value) {
            this.policyDetails = value;
        }

        /**
         * Gets the value of the coverageInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coverageInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoverageInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InsuranceBusinessDataType.CoverageDetails.CoverageInfo }
         * 
         * 
         */
        public List<InsuranceBusinessDataType.CoverageDetails.CoverageInfo> getCoverageInfo() {
            if (coverageInfo == null) {
                coverageInfo = new ArrayList<InsuranceBusinessDataType.CoverageDetails.CoverageInfo>();
            }
            return this.coverageInfo;
        }

        /**
         * Gets the value of the coveredPassenger property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coveredPassenger property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoveredPassenger().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravellerInformation15923S }
         * 
         * 
         */
        public List<TravellerInformation15923S> getCoveredPassenger() {
            if (coveredPassenger == null) {
                coveredPassenger = new ArrayList<TravellerInformation15923S>();
            }
            return this.coveredPassenger;
        }

        /**
         * Gets the value of the coverageDates property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredPeriodInformation }
         *     
         */
        public StructuredPeriodInformation getCoverageDates() {
            return coverageDates;
        }

        /**
         * Sets the value of the coverageDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredPeriodInformation }
         *     
         */
        public void setCoverageDates(StructuredPeriodInformation value) {
            this.coverageDates = value;
        }

        /**
         * Gets the value of the subscriptionDetails property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformation20644S }
         *     
         */
        public StructuredDateTimeInformation20644S getSubscriptionDetails() {
            return subscriptionDetails;
        }

        /**
         * Sets the value of the subscriptionDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformation20644S }
         *     
         */
        public void setSubscriptionDetails(StructuredDateTimeInformation20644S value) {
            this.subscriptionDetails = value;
        }

        /**
         * Gets the value of the agentReferenceDetails property.
         * 
         * @return
         *     possible object is
         *     {@link UserIdentification9456S }
         *     
         */
        public UserIdentification9456S getAgentReferenceDetails() {
            return agentReferenceDetails;
        }

        /**
         * Sets the value of the agentReferenceDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link UserIdentification9456S }
         *     
         */
        public void setAgentReferenceDetails(UserIdentification9456S value) {
            this.agentReferenceDetails = value;
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
         *         &lt;element name="coverage" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceCoverage"/>
         *         &lt;element name="coverageValues" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
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
            "coverage",
            "coverageValues"
        })
        public static class CoverageInfo {

            @XmlElement(required = true)
            protected InsuranceCoverage coverage;
            protected MonetaryInformation coverageValues;

            /**
             * Gets the value of the coverage property.
             * 
             * @return
             *     possible object is
             *     {@link InsuranceCoverage }
             *     
             */
            public InsuranceCoverage getCoverage() {
                return coverage;
            }

            /**
             * Sets the value of the coverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link InsuranceCoverage }
             *     
             */
            public void setCoverage(InsuranceCoverage value) {
                this.coverage = value;
            }

            /**
             * Gets the value of the coverageValues property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformation }
             *     
             */
            public MonetaryInformation getCoverageValues() {
                return coverageValues;
            }

            /**
             * Sets the value of the coverageValues property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformation }
             *     
             */
            public void setCoverageValues(MonetaryInformation value) {
                this.coverageValues = value;
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
     *         &lt;element name="formOfPaymentSection" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment"/>
     *         &lt;element name="fopExtendedData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails" maxOccurs="3" minOccurs="0"/>
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
        "formOfPaymentSection",
        "fopExtendedData"
    })
    public static class InsuranceFopSection {

        @XmlElement(required = true)
        protected FormOfPayment formOfPaymentSection;
        protected List<StatusDetails> fopExtendedData;

        /**
         * Gets the value of the formOfPaymentSection property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPayment }
         *     
         */
        public FormOfPayment getFormOfPaymentSection() {
            return formOfPaymentSection;
        }

        /**
         * Sets the value of the formOfPaymentSection property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPayment }
         *     
         */
        public void setFormOfPaymentSection(FormOfPayment value) {
            this.formOfPaymentSection = value;
        }

        /**
         * Gets the value of the fopExtendedData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fopExtendedData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFopExtendedData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatusDetails }
         * 
         * 
         */
        public List<StatusDetails> getFopExtendedData() {
            if (fopExtendedData == null) {
                fopExtendedData = new ArrayList<StatusDetails>();
            }
            return this.fopExtendedData;
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
     *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_32300S"/>
     *         &lt;element name="perPaxProdKnowledge" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ActionDetails" maxOccurs="9" minOccurs="0"/>
     *         &lt;element name="dateOfBirthInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation" minOccurs="0"/>
     *         &lt;element name="passengerFeatures" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_10089S" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="insureeRemark" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarks" minOccurs="0"/>
     *         &lt;element name="travelerDocInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PassengerDocumentDetails" minOccurs="0"/>
     *         &lt;element name="policyDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsurancePolicy" minOccurs="0"/>
     *         &lt;element name="travelerValueDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="travelCost" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceCoverage"/>
     *                   &lt;element name="travelAmount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="premiumPerTariffPerPax" maxOccurs="4" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tariffCodeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceProductDetails_20775S"/>
     *                   &lt;element name="tariffCodePerPaxAmount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="premiumPerpaxInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_22057S" minOccurs="0"/>
     *         &lt;element name="voucherNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_31804S" minOccurs="0"/>
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
        "passengerAssociation",
        "perPaxProdKnowledge",
        "dateOfBirthInfo",
        "passengerFeatures",
        "insureeRemark",
        "travelerDocInfo",
        "policyDetails",
        "travelerValueDetails",
        "premiumPerTariffPerPax",
        "premiumPerpaxInfo",
        "voucherNumber"
    })
    public static class PassengerDetails {

        @XmlElement(required = true)
        protected ReferenceInformation32300S passengerAssociation;
        protected List<ActionDetails> perPaxProdKnowledge;
        protected StructuredDateTimeInformation dateOfBirthInfo;
        protected List<TravellerInformation10089S> passengerFeatures;
        protected MiscellaneousRemarks insureeRemark;
        protected PassengerDocumentDetails travelerDocInfo;
        protected InsurancePolicy policyDetails;
        protected InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails travelerValueDetails;
        protected List<InsuranceBusinessDataType.PassengerDetails.PremiumPerTariffPerPax> premiumPerTariffPerPax;
        protected TariffInformation22057S premiumPerpaxInfo;
        protected ReservationControlInformation31804S voucherNumber;

        /**
         * Gets the value of the passengerAssociation property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformation32300S }
         *     
         */
        public ReferenceInformation32300S getPassengerAssociation() {
            return passengerAssociation;
        }

        /**
         * Sets the value of the passengerAssociation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformation32300S }
         *     
         */
        public void setPassengerAssociation(ReferenceInformation32300S value) {
            this.passengerAssociation = value;
        }

        /**
         * Gets the value of the perPaxProdKnowledge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the perPaxProdKnowledge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPerPaxProdKnowledge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ActionDetails }
         * 
         * 
         */
        public List<ActionDetails> getPerPaxProdKnowledge() {
            if (perPaxProdKnowledge == null) {
                perPaxProdKnowledge = new ArrayList<ActionDetails>();
            }
            return this.perPaxProdKnowledge;
        }

        /**
         * Gets the value of the dateOfBirthInfo property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformation }
         *     
         */
        public StructuredDateTimeInformation getDateOfBirthInfo() {
            return dateOfBirthInfo;
        }

        /**
         * Sets the value of the dateOfBirthInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformation }
         *     
         */
        public void setDateOfBirthInfo(StructuredDateTimeInformation value) {
            this.dateOfBirthInfo = value;
        }

        /**
         * Gets the value of the passengerFeatures property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerFeatures property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerFeatures().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravellerInformation10089S }
         * 
         * 
         */
        public List<TravellerInformation10089S> getPassengerFeatures() {
            if (passengerFeatures == null) {
                passengerFeatures = new ArrayList<TravellerInformation10089S>();
            }
            return this.passengerFeatures;
        }

        /**
         * Gets the value of the insureeRemark property.
         * 
         * @return
         *     possible object is
         *     {@link MiscellaneousRemarks }
         *     
         */
        public MiscellaneousRemarks getInsureeRemark() {
            return insureeRemark;
        }

        /**
         * Sets the value of the insureeRemark property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscellaneousRemarks }
         *     
         */
        public void setInsureeRemark(MiscellaneousRemarks value) {
            this.insureeRemark = value;
        }

        /**
         * Gets the value of the travelerDocInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerDocumentDetails }
         *     
         */
        public PassengerDocumentDetails getTravelerDocInfo() {
            return travelerDocInfo;
        }

        /**
         * Sets the value of the travelerDocInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerDocumentDetails }
         *     
         */
        public void setTravelerDocInfo(PassengerDocumentDetails value) {
            this.travelerDocInfo = value;
        }

        /**
         * Gets the value of the policyDetails property.
         * 
         * @return
         *     possible object is
         *     {@link InsurancePolicy }
         *     
         */
        public InsurancePolicy getPolicyDetails() {
            return policyDetails;
        }

        /**
         * Sets the value of the policyDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsurancePolicy }
         *     
         */
        public void setPolicyDetails(InsurancePolicy value) {
            this.policyDetails = value;
        }

        /**
         * Gets the value of the travelerValueDetails property.
         * 
         * @return
         *     possible object is
         *     {@link InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails }
         *     
         */
        public InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails getTravelerValueDetails() {
            return travelerValueDetails;
        }

        /**
         * Sets the value of the travelerValueDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails }
         *     
         */
        public void setTravelerValueDetails(InsuranceBusinessDataType.PassengerDetails.TravelerValueDetails value) {
            this.travelerValueDetails = value;
        }

        /**
         * Gets the value of the premiumPerTariffPerPax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the premiumPerTariffPerPax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPremiumPerTariffPerPax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InsuranceBusinessDataType.PassengerDetails.PremiumPerTariffPerPax }
         * 
         * 
         */
        public List<InsuranceBusinessDataType.PassengerDetails.PremiumPerTariffPerPax> getPremiumPerTariffPerPax() {
            if (premiumPerTariffPerPax == null) {
                premiumPerTariffPerPax = new ArrayList<InsuranceBusinessDataType.PassengerDetails.PremiumPerTariffPerPax>();
            }
            return this.premiumPerTariffPerPax;
        }

        /**
         * Gets the value of the premiumPerpaxInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformation22057S }
         *     
         */
        public TariffInformation22057S getPremiumPerpaxInfo() {
            return premiumPerpaxInfo;
        }

        /**
         * Sets the value of the premiumPerpaxInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformation22057S }
         *     
         */
        public void setPremiumPerpaxInfo(TariffInformation22057S value) {
            this.premiumPerpaxInfo = value;
        }

        /**
         * Gets the value of the voucherNumber property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformation31804S }
         *     
         */
        public ReservationControlInformation31804S getVoucherNumber() {
            return voucherNumber;
        }

        /**
         * Sets the value of the voucherNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformation31804S }
         *     
         */
        public void setVoucherNumber(ReservationControlInformation31804S value) {
            this.voucherNumber = value;
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
         *         &lt;element name="tariffCodeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceProductDetails_20775S"/>
         *         &lt;element name="tariffCodePerPaxAmount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
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
            "tariffCodeInfo",
            "tariffCodePerPaxAmount"
        })
        public static class PremiumPerTariffPerPax {

            @XmlElement(required = true)
            protected InsuranceProductDetails20775S tariffCodeInfo;
            protected MonetaryInformation tariffCodePerPaxAmount;

            /**
             * Gets the value of the tariffCodeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link InsuranceProductDetails20775S }
             *     
             */
            public InsuranceProductDetails20775S getTariffCodeInfo() {
                return tariffCodeInfo;
            }

            /**
             * Sets the value of the tariffCodeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link InsuranceProductDetails20775S }
             *     
             */
            public void setTariffCodeInfo(InsuranceProductDetails20775S value) {
                this.tariffCodeInfo = value;
            }

            /**
             * Gets the value of the tariffCodePerPaxAmount property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformation }
             *     
             */
            public MonetaryInformation getTariffCodePerPaxAmount() {
                return tariffCodePerPaxAmount;
            }

            /**
             * Sets the value of the tariffCodePerPaxAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformation }
             *     
             */
            public void setTariffCodePerPaxAmount(MonetaryInformation value) {
                this.tariffCodePerPaxAmount = value;
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
         *         &lt;element name="travelCost" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceCoverage"/>
         *         &lt;element name="travelAmount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
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
            "travelCost",
            "travelAmount"
        })
        public static class TravelerValueDetails {

            @XmlElement(required = true)
            protected InsuranceCoverage travelCost;
            protected MonetaryInformation travelAmount;

            /**
             * Gets the value of the travelCost property.
             * 
             * @return
             *     possible object is
             *     {@link InsuranceCoverage }
             *     
             */
            public InsuranceCoverage getTravelCost() {
                return travelCost;
            }

            /**
             * Sets the value of the travelCost property.
             * 
             * @param value
             *     allowed object is
             *     {@link InsuranceCoverage }
             *     
             */
            public void setTravelCost(InsuranceCoverage value) {
                this.travelCost = value;
            }

            /**
             * Gets the value of the travelAmount property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformation }
             *     
             */
            public MonetaryInformation getTravelAmount() {
                return travelAmount;
            }

            /**
             * Sets the value of the travelAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformation }
             *     
             */
            public void setTravelAmount(MonetaryInformation value) {
                this.travelAmount = value;
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
     *         &lt;element name="planType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceProviderAndProducts"/>
     *         &lt;element name="travelValue" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation" minOccurs="0"/>
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
        "planType",
        "travelValue"
    })
    public static class PlanTypeDetails {

        @XmlElement(required = true)
        protected InsuranceProviderAndProducts planType;
        protected MonetaryInformation travelValue;

        /**
         * Gets the value of the planType property.
         * 
         * @return
         *     possible object is
         *     {@link InsuranceProviderAndProducts }
         *     
         */
        public InsuranceProviderAndProducts getPlanType() {
            return planType;
        }

        /**
         * Sets the value of the planType property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsuranceProviderAndProducts }
         *     
         */
        public void setPlanType(InsuranceProviderAndProducts value) {
            this.planType = value;
        }

        /**
         * Gets the value of the travelValue property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformation }
         *     
         */
        public MonetaryInformation getTravelValue() {
            return travelValue;
        }

        /**
         * Sets the value of the travelValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformation }
         *     
         */
        public void setTravelValue(MonetaryInformation value) {
            this.travelValue = value;
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
     *         &lt;element name="productCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}InsuranceProductDetails_20774S"/>
     *         &lt;element name="informationLines" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_6235S" minOccurs="0"/>
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
        "productCode",
        "informationLines"
    })
    public static class ProductSection {

        @XmlElement(required = true)
        protected InsuranceProductDetails20774S productCode;
        protected FreeTextInformation6235S informationLines;

        /**
         * Gets the value of the productCode property.
         * 
         * @return
         *     possible object is
         *     {@link InsuranceProductDetails20774S }
         *     
         */
        public InsuranceProductDetails20774S getProductCode() {
            return productCode;
        }

        /**
         * Sets the value of the productCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link InsuranceProductDetails20774S }
         *     
         */
        public void setProductCode(InsuranceProductDetails20774S value) {
            this.productCode = value;
        }

        /**
         * Gets the value of the informationLines property.
         * 
         * @return
         *     possible object is
         *     {@link FreeTextInformation6235S }
         *     
         */
        public FreeTextInformation6235S getInformationLines() {
            return informationLines;
        }

        /**
         * Sets the value of the informationLines property.
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextInformation6235S }
         *     
         */
        public void setInformationLines(FreeTextInformation6235S value) {
            this.informationLines = value;
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
     *         &lt;element name="nameDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Name"/>
     *         &lt;element name="addressInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address" minOccurs="0"/>
     *         &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress" minOccurs="0"/>
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
        "nameDetails",
        "addressInfo",
        "phoneNumber"
    })
    public static class SubscriberAddressSection {

        @XmlElement(required = true)
        protected Name nameDetails;
        protected Address addressInfo;
        protected PhoneAndEmailAddress phoneNumber;

        /**
         * Gets the value of the nameDetails property.
         * 
         * @return
         *     possible object is
         *     {@link Name }
         *     
         */
        public Name getNameDetails() {
            return nameDetails;
        }

        /**
         * Sets the value of the nameDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link Name }
         *     
         */
        public void setNameDetails(Name value) {
            this.nameDetails = value;
        }

        /**
         * Gets the value of the addressInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Address }
         *     
         */
        public Address getAddressInfo() {
            return addressInfo;
        }

        /**
         * Sets the value of the addressInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Address }
         *     
         */
        public void setAddressInfo(Address value) {
            this.addressInfo = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneAndEmailAddress }
         *     
         */
        public PhoneAndEmailAddress getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneAndEmailAddress }
         *     
         */
        public void setPhoneNumber(PhoneAndEmailAddress value) {
            this.phoneNumber = value;
        }

    }

}
