
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To transport Tour account details
 * 
 * <p>Java class for TourAccountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourAccountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tourTotalPrices" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_25419S" maxOccurs="20"/>
 *         &lt;element name="remainingAmountsDetails" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="providerCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyInformation_25420S"/>
 *                   &lt;element name="remainingAmount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_25419S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tourDetailedPriceInfo" maxOccurs="101" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="markerSpecificRead" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
 *                   &lt;element name="productId" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_25422S" minOccurs="0"/>
 *                   &lt;element name="productPrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_25419S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="paymentInformation" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PaymentInformation"/>
 *                   &lt;element name="operatorCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyInformation_25420S" minOccurs="0"/>
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
@XmlType(name = "TourAccountDetailsType", propOrder = {
    "tourTotalPrices",
    "remainingAmountsDetails",
    "tourDetailedPriceInfo",
    "paymentInformation"
})
public class TourAccountDetailsType {

    @XmlElement(required = true)
    protected List<TariffInformation25419S> tourTotalPrices;
    protected List<TourAccountDetailsType.RemainingAmountsDetails> remainingAmountsDetails;
    protected List<TourAccountDetailsType.TourDetailedPriceInfo> tourDetailedPriceInfo;
    protected List<TourAccountDetailsType.PaymentInformation> paymentInformation;

    /**
     * Gets the value of the tourTotalPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourTotalPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourTotalPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffInformation25419S }
     * 
     * 
     */
    public List<TariffInformation25419S> getTourTotalPrices() {
        if (tourTotalPrices == null) {
            tourTotalPrices = new ArrayList<TariffInformation25419S>();
        }
        return this.tourTotalPrices;
    }

    /**
     * Gets the value of the remainingAmountsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remainingAmountsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemainingAmountsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourAccountDetailsType.RemainingAmountsDetails }
     * 
     * 
     */
    public List<TourAccountDetailsType.RemainingAmountsDetails> getRemainingAmountsDetails() {
        if (remainingAmountsDetails == null) {
            remainingAmountsDetails = new ArrayList<TourAccountDetailsType.RemainingAmountsDetails>();
        }
        return this.remainingAmountsDetails;
    }

    /**
     * Gets the value of the tourDetailedPriceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourDetailedPriceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourDetailedPriceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourAccountDetailsType.TourDetailedPriceInfo }
     * 
     * 
     */
    public List<TourAccountDetailsType.TourDetailedPriceInfo> getTourDetailedPriceInfo() {
        if (tourDetailedPriceInfo == null) {
            tourDetailedPriceInfo = new ArrayList<TourAccountDetailsType.TourDetailedPriceInfo>();
        }
        return this.tourDetailedPriceInfo;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourAccountDetailsType.PaymentInformation }
     * 
     * 
     */
    public List<TourAccountDetailsType.PaymentInformation> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<TourAccountDetailsType.PaymentInformation>();
        }
        return this.paymentInformation;
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
     *         &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PaymentInformation"/>
     *         &lt;element name="operatorCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyInformation_25420S" minOccurs="0"/>
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
        "payment",
        "operatorCode"
    })
    public static class PaymentInformation {

        @XmlElement(required = true)
        protected com.amadeus.xml.pnracc_11_1_1a.PaymentInformation payment;
        protected CompanyInformation25420S operatorCode;

        /**
         * Gets the value of the payment property.
         * 
         * @return
         *     possible object is
         *     {@link com.amadeus.xml.pnracc_11_1_1a.PaymentInformation }
         *     
         */
        public com.amadeus.xml.pnracc_11_1_1a.PaymentInformation getPayment() {
            return payment;
        }

        /**
         * Sets the value of the payment property.
         * 
         * @param value
         *     allowed object is
         *     {@link com.amadeus.xml.pnracc_11_1_1a.PaymentInformation }
         *     
         */
        public void setPayment(com.amadeus.xml.pnracc_11_1_1a.PaymentInformation value) {
            this.payment = value;
        }

        /**
         * Gets the value of the operatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyInformation25420S }
         *     
         */
        public CompanyInformation25420S getOperatorCode() {
            return operatorCode;
        }

        /**
         * Sets the value of the operatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyInformation25420S }
         *     
         */
        public void setOperatorCode(CompanyInformation25420S value) {
            this.operatorCode = value;
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
     *         &lt;element name="providerCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyInformation_25420S"/>
     *         &lt;element name="remainingAmount" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_25419S"/>
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
        "providerCode",
        "remainingAmount"
    })
    public static class RemainingAmountsDetails {

        @XmlElement(required = true)
        protected CompanyInformation25420S providerCode;
        @XmlElement(required = true)
        protected TariffInformation25419S remainingAmount;

        /**
         * Gets the value of the providerCode property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyInformation25420S }
         *     
         */
        public CompanyInformation25420S getProviderCode() {
            return providerCode;
        }

        /**
         * Sets the value of the providerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyInformation25420S }
         *     
         */
        public void setProviderCode(CompanyInformation25420S value) {
            this.providerCode = value;
        }

        /**
         * Gets the value of the remainingAmount property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformation25419S }
         *     
         */
        public TariffInformation25419S getRemainingAmount() {
            return remainingAmount;
        }

        /**
         * Sets the value of the remainingAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformation25419S }
         *     
         */
        public void setRemainingAmount(TariffInformation25419S value) {
            this.remainingAmount = value;
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
     *         &lt;element name="markerSpecificRead" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
     *         &lt;element name="productId" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_25422S" minOccurs="0"/>
     *         &lt;element name="productPrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_25419S"/>
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
        "markerSpecificRead",
        "productId",
        "productPrice"
    })
    public static class TourDetailedPriceInfo {

        @XmlElement(required = true)
        protected DummySegment markerSpecificRead;
        protected ReferenceInformation25422S productId;
        @XmlElement(required = true)
        protected TariffInformation25419S productPrice;

        /**
         * Gets the value of the markerSpecificRead property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegment }
         *     
         */
        public DummySegment getMarkerSpecificRead() {
            return markerSpecificRead;
        }

        /**
         * Sets the value of the markerSpecificRead property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegment }
         *     
         */
        public void setMarkerSpecificRead(DummySegment value) {
            this.markerSpecificRead = value;
        }

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformation25422S }
         *     
         */
        public ReferenceInformation25422S getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformation25422S }
         *     
         */
        public void setProductId(ReferenceInformation25422S value) {
            this.productId = value;
        }

        /**
         * Gets the value of the productPrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformation25419S }
         *     
         */
        public TariffInformation25419S getProductPrice() {
            return productPrice;
        }

        /**
         * Sets the value of the productPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformation25419S }
         *     
         */
        public void setProductPrice(TariffInformation25419S value) {
            this.productPrice = value;
        }

    }

}
