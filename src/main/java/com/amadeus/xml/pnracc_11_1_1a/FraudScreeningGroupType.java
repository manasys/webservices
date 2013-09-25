
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all data needed to prevent the fraud on the payment
 * 
 * <p>Java class for FraudScreeningGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FraudScreeningGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fraudScreening" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StatusDetails_94568S"/>
 *         &lt;element name="ipAdress" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DeviceControlDetails" minOccurs="0"/>
 *         &lt;element name="merchantURL" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CommunicationContact_94522S" minOccurs="0"/>
 *         &lt;element name="payerPhoneOrEmail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PhoneAndEmailAddress_94565S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="shopperSession" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SystemDetailsInfo_94569S" minOccurs="0"/>
 *         &lt;element name="payerName" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerInformation_94570S" minOccurs="0"/>
 *         &lt;element name="payerDateOfBirth" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_94567S" minOccurs="0"/>
 *         &lt;element name="billingAddress" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_94501S" minOccurs="0"/>
 *         &lt;element name="formOfIdDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_94566S" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudScreeningGroupType", propOrder = {
    "fraudScreening",
    "ipAdress",
    "merchantURL",
    "payerPhoneOrEmail",
    "shopperSession",
    "payerName",
    "payerDateOfBirth",
    "billingAddress",
    "formOfIdDetails"
})
public class FraudScreeningGroupType {

    @XmlElement(required = true)
    protected StatusDetails94568S fraudScreening;
    protected DeviceControlDetails ipAdress;
    protected CommunicationContact94522S merchantURL;
    protected List<PhoneAndEmailAddress94565S> payerPhoneOrEmail;
    protected SystemDetailsInfo94569S shopperSession;
    protected TravellerInformation94570S payerName;
    protected StructuredDateTimeInformation94567S payerDateOfBirth;
    protected Address94501S billingAddress;
    protected List<ReferenceInformation94566S> formOfIdDetails;

    /**
     * Gets the value of the fraudScreening property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetails94568S }
     *     
     */
    public StatusDetails94568S getFraudScreening() {
        return fraudScreening;
    }

    /**
     * Sets the value of the fraudScreening property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetails94568S }
     *     
     */
    public void setFraudScreening(StatusDetails94568S value) {
        this.fraudScreening = value;
    }

    /**
     * Gets the value of the ipAdress property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceControlDetails }
     *     
     */
    public DeviceControlDetails getIpAdress() {
        return ipAdress;
    }

    /**
     * Sets the value of the ipAdress property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceControlDetails }
     *     
     */
    public void setIpAdress(DeviceControlDetails value) {
        this.ipAdress = value;
    }

    /**
     * Gets the value of the merchantURL property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationContact94522S }
     *     
     */
    public CommunicationContact94522S getMerchantURL() {
        return merchantURL;
    }

    /**
     * Sets the value of the merchantURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationContact94522S }
     *     
     */
    public void setMerchantURL(CommunicationContact94522S value) {
        this.merchantURL = value;
    }

    /**
     * Gets the value of the payerPhoneOrEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payerPhoneOrEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayerPhoneOrEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneAndEmailAddress94565S }
     * 
     * 
     */
    public List<PhoneAndEmailAddress94565S> getPayerPhoneOrEmail() {
        if (payerPhoneOrEmail == null) {
            payerPhoneOrEmail = new ArrayList<PhoneAndEmailAddress94565S>();
        }
        return this.payerPhoneOrEmail;
    }

    /**
     * Gets the value of the shopperSession property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfo94569S }
     *     
     */
    public SystemDetailsInfo94569S getShopperSession() {
        return shopperSession;
    }

    /**
     * Sets the value of the shopperSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfo94569S }
     *     
     */
    public void setShopperSession(SystemDetailsInfo94569S value) {
        this.shopperSession = value;
    }

    /**
     * Gets the value of the payerName property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInformation94570S }
     *     
     */
    public TravellerInformation94570S getPayerName() {
        return payerName;
    }

    /**
     * Sets the value of the payerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInformation94570S }
     *     
     */
    public void setPayerName(TravellerInformation94570S value) {
        this.payerName = value;
    }

    /**
     * Gets the value of the payerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformation94567S }
     *     
     */
    public StructuredDateTimeInformation94567S getPayerDateOfBirth() {
        return payerDateOfBirth;
    }

    /**
     * Sets the value of the payerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformation94567S }
     *     
     */
    public void setPayerDateOfBirth(StructuredDateTimeInformation94567S value) {
        this.payerDateOfBirth = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address94501S }
     *     
     */
    public Address94501S getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address94501S }
     *     
     */
    public void setBillingAddress(Address94501S value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the formOfIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformation94566S }
     * 
     * 
     */
    public List<ReferenceInformation94566S> getFormOfIdDetails() {
        if (formOfIdDetails == null) {
            formOfIdDetails = new ArrayList<ReferenceInformation94566S>();
        }
        return this.formOfIdDetails;
    }

}
