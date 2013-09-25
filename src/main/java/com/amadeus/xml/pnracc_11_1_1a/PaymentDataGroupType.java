
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * it will conveys all payment data
 * 
 * <p>Java class for PaymentDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDataGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="merchantInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyInformation_94554S"/>
 *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_94557S" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="paymentId" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemReferencesAndVersions_94556S" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="extendedPaymentInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Frequency" minOccurs="0"/>
 *         &lt;element name="transactionDateTime" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_94559S" minOccurs="0"/>
 *         &lt;element name="expirationPeriod" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity_94558S" minOccurs="0"/>
 *         &lt;element name="distributionChannelInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TerminalIdentificationDescription" minOccurs="0"/>
 *         &lt;element name="purchaseDescription" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextInformation_94561S" minOccurs="0"/>
 *         &lt;element name="fraudScreeningData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FraudScreeningGroupType" minOccurs="0"/>
 *         &lt;element name="paymentDataMap" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Attribute_94553S" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDataGroupType", propOrder = {
    "merchantInformation",
    "monetaryInformation",
    "paymentId",
    "extendedPaymentInfo",
    "transactionDateTime",
    "expirationPeriod",
    "distributionChannelInformation",
    "purchaseDescription",
    "fraudScreeningData",
    "paymentDataMap"
})
public class PaymentDataGroupType {

    @XmlElement(required = true)
    protected CompanyInformation94554S merchantInformation;
    protected List<MonetaryInformation94557S> monetaryInformation;
    protected List<ItemReferencesAndVersions94556S> paymentId;
    protected Frequency extendedPaymentInfo;
    protected StructuredDateTimeInformation94559S transactionDateTime;
    protected Quantity94558S expirationPeriod;
    protected TerminalIdentificationDescription distributionChannelInformation;
    protected FreeTextInformation94561S purchaseDescription;
    protected FraudScreeningGroupType fraudScreeningData;
    protected List<Attribute94553S> paymentDataMap;

    /**
     * Gets the value of the merchantInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformation94554S }
     *     
     */
    public CompanyInformation94554S getMerchantInformation() {
        return merchantInformation;
    }

    /**
     * Sets the value of the merchantInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformation94554S }
     *     
     */
    public void setMerchantInformation(CompanyInformation94554S value) {
        this.merchantInformation = value;
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
     * {@link MonetaryInformation94557S }
     * 
     * 
     */
    public List<MonetaryInformation94557S> getMonetaryInformation() {
        if (monetaryInformation == null) {
            monetaryInformation = new ArrayList<MonetaryInformation94557S>();
        }
        return this.monetaryInformation;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemReferencesAndVersions94556S }
     * 
     * 
     */
    public List<ItemReferencesAndVersions94556S> getPaymentId() {
        if (paymentId == null) {
            paymentId = new ArrayList<ItemReferencesAndVersions94556S>();
        }
        return this.paymentId;
    }

    /**
     * Gets the value of the extendedPaymentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency }
     *     
     */
    public Frequency getExtendedPaymentInfo() {
        return extendedPaymentInfo;
    }

    /**
     * Sets the value of the extendedPaymentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency }
     *     
     */
    public void setExtendedPaymentInfo(Frequency value) {
        this.extendedPaymentInfo = value;
    }

    /**
     * Gets the value of the transactionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformation94559S }
     *     
     */
    public StructuredDateTimeInformation94559S getTransactionDateTime() {
        return transactionDateTime;
    }

    /**
     * Sets the value of the transactionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformation94559S }
     *     
     */
    public void setTransactionDateTime(StructuredDateTimeInformation94559S value) {
        this.transactionDateTime = value;
    }

    /**
     * Gets the value of the expirationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity94558S }
     *     
     */
    public Quantity94558S getExpirationPeriod() {
        return expirationPeriod;
    }

    /**
     * Sets the value of the expirationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity94558S }
     *     
     */
    public void setExpirationPeriod(Quantity94558S value) {
        this.expirationPeriod = value;
    }

    /**
     * Gets the value of the distributionChannelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIdentificationDescription }
     *     
     */
    public TerminalIdentificationDescription getDistributionChannelInformation() {
        return distributionChannelInformation;
    }

    /**
     * Sets the value of the distributionChannelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIdentificationDescription }
     *     
     */
    public void setDistributionChannelInformation(TerminalIdentificationDescription value) {
        this.distributionChannelInformation = value;
    }

    /**
     * Gets the value of the purchaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformation94561S }
     *     
     */
    public FreeTextInformation94561S getPurchaseDescription() {
        return purchaseDescription;
    }

    /**
     * Sets the value of the purchaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformation94561S }
     *     
     */
    public void setPurchaseDescription(FreeTextInformation94561S value) {
        this.purchaseDescription = value;
    }

    /**
     * Gets the value of the fraudScreeningData property.
     * 
     * @return
     *     possible object is
     *     {@link FraudScreeningGroupType }
     *     
     */
    public FraudScreeningGroupType getFraudScreeningData() {
        return fraudScreeningData;
    }

    /**
     * Sets the value of the fraudScreeningData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudScreeningGroupType }
     *     
     */
    public void setFraudScreeningData(FraudScreeningGroupType value) {
        this.fraudScreeningData = value;
    }

    /**
     * Gets the value of the paymentDataMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDataMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDataMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute94553S }
     * 
     * 
     */
    public List<Attribute94553S> getPaymentDataMap() {
        if (paymentDataMap == null) {
            paymentDataMap = new ArrayList<Attribute94553S>();
        }
        return this.paymentDataMap;
    }

}
