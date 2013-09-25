
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys TP (Total Price) information
 * 
 * <p>Java class for TotalPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="providerCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyInformation_83550S"/>
 *         &lt;element name="externalRef" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_83551S" minOccurs="0"/>
 *         &lt;element name="methodOfDelivery" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="elementManagement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment_83559S"/>
 *                   &lt;element name="deliveryDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PackageDescription"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mainPrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_83557S"/>
 *         &lt;element name="otherPrices" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_83558S" maxOccurs="12" minOccurs="0"/>
 *         &lt;element name="productDescription" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="product" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductIdentification"/>
 *                   &lt;element name="productRestriction" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TrafficRestrictionDetails" maxOccurs="10" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="additionnalChargeInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Taxes" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="rateCodeInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RateTypes" minOccurs="0"/>
 *         &lt;element name="optionalBooking" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_83553S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalPriceType", propOrder = {
    "providerCode",
    "externalRef",
    "methodOfDelivery",
    "mainPrice",
    "otherPrices",
    "productDescription",
    "additionnalChargeInformation",
    "rateCodeInformation",
    "optionalBooking"
})
public class TotalPriceType {

    @XmlElement(required = true)
    protected CompanyInformation83550S providerCode;
    protected ReferenceInformation83551S externalRef;
    protected TotalPriceType.MethodOfDelivery methodOfDelivery;
    @XmlElement(required = true)
    protected TariffInformation83557S mainPrice;
    protected List<TariffInformation83558S> otherPrices;
    protected TotalPriceType.ProductDescription productDescription;
    protected List<Taxes> additionnalChargeInformation;
    protected RateTypes rateCodeInformation;
    protected StructuredDateTimeInformation83553S optionalBooking;

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformation83550S }
     *     
     */
    public CompanyInformation83550S getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformation83550S }
     *     
     */
    public void setProviderCode(CompanyInformation83550S value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the externalRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformation83551S }
     *     
     */
    public ReferenceInformation83551S getExternalRef() {
        return externalRef;
    }

    /**
     * Sets the value of the externalRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformation83551S }
     *     
     */
    public void setExternalRef(ReferenceInformation83551S value) {
        this.externalRef = value;
    }

    /**
     * Gets the value of the methodOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPriceType.MethodOfDelivery }
     *     
     */
    public TotalPriceType.MethodOfDelivery getMethodOfDelivery() {
        return methodOfDelivery;
    }

    /**
     * Sets the value of the methodOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPriceType.MethodOfDelivery }
     *     
     */
    public void setMethodOfDelivery(TotalPriceType.MethodOfDelivery value) {
        this.methodOfDelivery = value;
    }

    /**
     * Gets the value of the mainPrice property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformation83557S }
     *     
     */
    public TariffInformation83557S getMainPrice() {
        return mainPrice;
    }

    /**
     * Sets the value of the mainPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformation83557S }
     *     
     */
    public void setMainPrice(TariffInformation83557S value) {
        this.mainPrice = value;
    }

    /**
     * Gets the value of the otherPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffInformation83558S }
     * 
     * 
     */
    public List<TariffInformation83558S> getOtherPrices() {
        if (otherPrices == null) {
            otherPrices = new ArrayList<TariffInformation83558S>();
        }
        return this.otherPrices;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPriceType.ProductDescription }
     *     
     */
    public TotalPriceType.ProductDescription getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPriceType.ProductDescription }
     *     
     */
    public void setProductDescription(TotalPriceType.ProductDescription value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the additionnalChargeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionnalChargeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionnalChargeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Taxes }
     * 
     * 
     */
    public List<Taxes> getAdditionnalChargeInformation() {
        if (additionnalChargeInformation == null) {
            additionnalChargeInformation = new ArrayList<Taxes>();
        }
        return this.additionnalChargeInformation;
    }

    /**
     * Gets the value of the rateCodeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypes }
     *     
     */
    public RateTypes getRateCodeInformation() {
        return rateCodeInformation;
    }

    /**
     * Sets the value of the rateCodeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypes }
     *     
     */
    public void setRateCodeInformation(RateTypes value) {
        this.rateCodeInformation = value;
    }

    /**
     * Gets the value of the optionalBooking property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformation83553S }
     *     
     */
    public StructuredDateTimeInformation83553S getOptionalBooking() {
        return optionalBooking;
    }

    /**
     * Sets the value of the optionalBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformation83553S }
     *     
     */
    public void setOptionalBooking(StructuredDateTimeInformation83553S value) {
        this.optionalBooking = value;
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
     *         &lt;element name="elementManagement" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ElementManagementSegment_83559S"/>
     *         &lt;element name="deliveryDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PackageDescription"/>
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
        "elementManagement",
        "deliveryDetails"
    })
    public static class MethodOfDelivery {

        @XmlElement(required = true)
        protected ElementManagementSegment83559S elementManagement;
        @XmlElement(required = true)
        protected PackageDescription deliveryDetails;

        /**
         * Gets the value of the elementManagement property.
         * 
         * @return
         *     possible object is
         *     {@link ElementManagementSegment83559S }
         *     
         */
        public ElementManagementSegment83559S getElementManagement() {
            return elementManagement;
        }

        /**
         * Sets the value of the elementManagement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementManagementSegment83559S }
         *     
         */
        public void setElementManagement(ElementManagementSegment83559S value) {
            this.elementManagement = value;
        }

        /**
         * Gets the value of the deliveryDetails property.
         * 
         * @return
         *     possible object is
         *     {@link PackageDescription }
         *     
         */
        public PackageDescription getDeliveryDetails() {
            return deliveryDetails;
        }

        /**
         * Sets the value of the deliveryDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link PackageDescription }
         *     
         */
        public void setDeliveryDetails(PackageDescription value) {
            this.deliveryDetails = value;
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
     *         &lt;element name="product" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductIdentification"/>
     *         &lt;element name="productRestriction" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TrafficRestrictionDetails" maxOccurs="10" minOccurs="0"/>
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
        "product",
        "productRestriction"
    })
    public static class ProductDescription {

        @XmlElement(required = true)
        protected ProductIdentification product;
        protected List<TrafficRestrictionDetails> productRestriction;

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link ProductIdentification }
         *     
         */
        public ProductIdentification getProduct() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductIdentification }
         *     
         */
        public void setProduct(ProductIdentification value) {
            this.product = value;
        }

        /**
         * Gets the value of the productRestriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productRestriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrafficRestrictionDetails }
         * 
         * 
         */
        public List<TrafficRestrictionDetails> getProductRestriction() {
            if (productRestriction == null) {
                productRestriction = new ArrayList<TrafficRestrictionDetails>();
            }
            return this.productRestriction;
        }

    }

}
