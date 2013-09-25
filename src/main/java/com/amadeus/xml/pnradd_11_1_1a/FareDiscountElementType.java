
package com.amadeus.xml.pnradd_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR Fare discount element
 * 
 * <p>Java class for FareDiscountElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDiscountElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="discount" type="{http://xml.amadeus.com/PNRADD_11_1_1A}DiscountInformationType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length6To6" minOccurs="0"/>
 *         &lt;element name="numberDetail" type="{http://xml.amadeus.com/PNRADD_11_1_1A}NumberOfUnitDetailsType" minOccurs="0"/>
 *         &lt;element name="rpInformation" type="{http://xml.amadeus.com/PNRADD_11_1_1A}RpInformationType" minOccurs="0"/>
 *         &lt;element name="customer" type="{http://xml.amadeus.com/PNRADD_11_1_1A}ItemDetailsType" minOccurs="0"/>
 *         &lt;element name="residentDisc" type="{http://xml.amadeus.com/PNRADD_11_1_1A}ItemDetailsType_64822C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDiscountElementType", propOrder = {
    "passengerType",
    "discount",
    "birthDate",
    "numberDetail",
    "rpInformation",
    "customer",
    "residentDisc"
})
public class FareDiscountElementType {

    protected String passengerType;
    protected List<DiscountInformationType> discount;
    protected String birthDate;
    protected NumberOfUnitDetailsType numberDetail;
    protected RpInformationType rpInformation;
    protected ItemDetailsType customer;
    protected ItemDetailsType64822C residentDisc;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountInformationType }
     * 
     * 
     */
    public List<DiscountInformationType> getDiscount() {
        if (discount == null) {
            discount = new ArrayList<DiscountInformationType>();
        }
        return this.discount;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the numberDetail property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitDetailsType }
     *     
     */
    public NumberOfUnitDetailsType getNumberDetail() {
        return numberDetail;
    }

    /**
     * Sets the value of the numberDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitDetailsType }
     *     
     */
    public void setNumberDetail(NumberOfUnitDetailsType value) {
        this.numberDetail = value;
    }

    /**
     * Gets the value of the rpInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RpInformationType }
     *     
     */
    public RpInformationType getRpInformation() {
        return rpInformation;
    }

    /**
     * Sets the value of the rpInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RpInformationType }
     *     
     */
    public void setRpInformation(RpInformationType value) {
        this.rpInformation = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDetailsType }
     *     
     */
    public ItemDetailsType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDetailsType }
     *     
     */
    public void setCustomer(ItemDetailsType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the residentDisc property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDetailsType64822C }
     *     
     */
    public ItemDetailsType64822C getResidentDisc() {
        return residentDisc;
    }

    /**
     * Sets the value of the residentDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDetailsType64822C }
     *     
     */
    public void setResidentDisc(ItemDetailsType64822C value) {
        this.residentDisc = value;
    }

}
