
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning an airline flight.
 * 
 * <p>Java class for AdditionalProductDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditionalProductTypeI" minOccurs="0"/>
 *         &lt;element name="departureInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StationInformationTypeI" minOccurs="0"/>
 *         &lt;element name="arrivalStationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StationInformationTypeI_119771C" minOccurs="0"/>
 *         &lt;element name="mileageTimeDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MileageTimeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="timeDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravellerTimeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="facilities" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductFacilitiesTypeI" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetails", propOrder = {
    "productDetails",
    "departureInformation",
    "arrivalStationInfo",
    "mileageTimeDetails",
    "timeDetail",
    "facilities"
})
public class AdditionalProductDetails {

    protected AdditionalProductTypeI productDetails;
    protected StationInformationTypeI departureInformation;
    protected StationInformationTypeI119771C arrivalStationInfo;
    protected MileageTimeDetailsTypeI mileageTimeDetails;
    protected TravellerTimeDetailsTypeI timeDetail;
    protected List<ProductFacilitiesTypeI> facilities;

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public AdditionalProductTypeI getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public void setProductDetails(AdditionalProductTypeI value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the departureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI }
     *     
     */
    public StationInformationTypeI getDepartureInformation() {
        return departureInformation;
    }

    /**
     * Sets the value of the departureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI }
     *     
     */
    public void setDepartureInformation(StationInformationTypeI value) {
        this.departureInformation = value;
    }

    /**
     * Gets the value of the arrivalStationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link StationInformationTypeI119771C }
     *     
     */
    public StationInformationTypeI119771C getArrivalStationInfo() {
        return arrivalStationInfo;
    }

    /**
     * Sets the value of the arrivalStationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationInformationTypeI119771C }
     *     
     */
    public void setArrivalStationInfo(StationInformationTypeI119771C value) {
        this.arrivalStationInfo = value;
    }

    /**
     * Gets the value of the mileageTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public MileageTimeDetailsTypeI getMileageTimeDetails() {
        return mileageTimeDetails;
    }

    /**
     * Sets the value of the mileageTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MileageTimeDetailsTypeI }
     *     
     */
    public void setMileageTimeDetails(MileageTimeDetailsTypeI value) {
        this.mileageTimeDetails = value;
    }

    /**
     * Gets the value of the timeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerTimeDetailsTypeI }
     *     
     */
    public TravellerTimeDetailsTypeI getTimeDetail() {
        return timeDetail;
    }

    /**
     * Sets the value of the timeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerTimeDetailsTypeI }
     *     
     */
    public void setTimeDetail(TravellerTimeDetailsTypeI value) {
        this.timeDetail = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductFacilitiesTypeI }
     * 
     * 
     */
    public List<ProductFacilitiesTypeI> getFacilities() {
        if (facilities == null) {
            facilities = new ArrayList<ProductFacilitiesTypeI>();
        }
        return this.facilities;
    }

}
