
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * theFerryLeg
 * 
 * <p>Java class for FerryBookingDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerryBookingDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ferryProviderInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyInformation_20151S"/>
 *         &lt;element name="itineraryInfoGroup" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FerryLegDescriptionType"/>
 *         &lt;element name="accomodationPackageInfoGroup" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FerryAccomodationPackageDescriptionType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="bookingNumberInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_20153S"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryBookingDescriptionType", propOrder = {
    "ferryProviderInformation",
    "itineraryInfoGroup",
    "accomodationPackageInfoGroup",
    "bookingNumberInformation"
})
public class FerryBookingDescriptionType {

    @XmlElement(required = true)
    protected CompanyInformation20151S ferryProviderInformation;
    @XmlElement(required = true)
    protected FerryLegDescriptionType itineraryInfoGroup;
    protected List<FerryAccomodationPackageDescriptionType> accomodationPackageInfoGroup;
    @XmlElement(required = true)
    protected ReservationControlInformation20153S bookingNumberInformation;

    /**
     * Gets the value of the ferryProviderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformation20151S }
     *     
     */
    public CompanyInformation20151S getFerryProviderInformation() {
        return ferryProviderInformation;
    }

    /**
     * Sets the value of the ferryProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformation20151S }
     *     
     */
    public void setFerryProviderInformation(CompanyInformation20151S value) {
        this.ferryProviderInformation = value;
    }

    /**
     * Gets the value of the itineraryInfoGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FerryLegDescriptionType }
     *     
     */
    public FerryLegDescriptionType getItineraryInfoGroup() {
        return itineraryInfoGroup;
    }

    /**
     * Sets the value of the itineraryInfoGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FerryLegDescriptionType }
     *     
     */
    public void setItineraryInfoGroup(FerryLegDescriptionType value) {
        this.itineraryInfoGroup = value;
    }

    /**
     * Gets the value of the accomodationPackageInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accomodationPackageInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccomodationPackageInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryAccomodationPackageDescriptionType }
     * 
     * 
     */
    public List<FerryAccomodationPackageDescriptionType> getAccomodationPackageInfoGroup() {
        if (accomodationPackageInfoGroup == null) {
            accomodationPackageInfoGroup = new ArrayList<FerryAccomodationPackageDescriptionType>();
        }
        return this.accomodationPackageInfoGroup;
    }

    /**
     * Gets the value of the bookingNumberInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformation20153S }
     *     
     */
    public ReservationControlInformation20153S getBookingNumberInformation() {
        return bookingNumberInformation;
    }

    /**
     * Sets the value of the bookingNumberInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformation20153S }
     *     
     */
    public void setBookingNumberInformation(ReservationControlInformation20153S value) {
        this.bookingNumberInformation = value;
    }

}
