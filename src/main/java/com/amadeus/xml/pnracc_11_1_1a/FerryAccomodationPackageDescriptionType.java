
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FerryAccomodationPackageDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerryAccomodationPackageDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductInformation"/>
 *         &lt;element name="hotelInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelProperty_26378S" minOccurs="0"/>
 *         &lt;element name="hotelCheckInInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_24436S" minOccurs="0"/>
 *         &lt;element name="areaCodeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification" minOccurs="0"/>
 *         &lt;element name="numberOfNights" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits" minOccurs="0"/>
 *         &lt;element name="hotelItemPrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_24843S" minOccurs="0"/>
 *         &lt;element name="roomInfoGroup" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="roomDetailsInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom_20177S"/>
 *                   &lt;element name="numberOfRooms" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits" minOccurs="0"/>
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
@XmlType(name = "FerryAccomodationPackageDescriptionType", propOrder = {
    "packageCode",
    "hotelInformation",
    "hotelCheckInInformation",
    "areaCodeInfo",
    "numberOfNights",
    "hotelItemPrice",
    "roomInfoGroup"
})
public class FerryAccomodationPackageDescriptionType {

    @XmlElement(required = true)
    protected ProductInformation packageCode;
    protected HotelProperty26378S hotelInformation;
    protected StructuredDateTimeInformation24436S hotelCheckInInformation;
    protected PlaceLocationIdentification areaCodeInfo;
    protected NumberOfUnits numberOfNights;
    protected TariffInformation24843S hotelItemPrice;
    protected List<FerryAccomodationPackageDescriptionType.RoomInfoGroup> roomInfoGroup;

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformation }
     *     
     */
    public ProductInformation getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformation }
     *     
     */
    public void setPackageCode(ProductInformation value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the hotelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelProperty26378S }
     *     
     */
    public HotelProperty26378S getHotelInformation() {
        return hotelInformation;
    }

    /**
     * Sets the value of the hotelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelProperty26378S }
     *     
     */
    public void setHotelInformation(HotelProperty26378S value) {
        this.hotelInformation = value;
    }

    /**
     * Gets the value of the hotelCheckInInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformation24436S }
     *     
     */
    public StructuredDateTimeInformation24436S getHotelCheckInInformation() {
        return hotelCheckInInformation;
    }

    /**
     * Sets the value of the hotelCheckInInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformation24436S }
     *     
     */
    public void setHotelCheckInInformation(StructuredDateTimeInformation24436S value) {
        this.hotelCheckInInformation = value;
    }

    /**
     * Gets the value of the areaCodeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentification }
     *     
     */
    public PlaceLocationIdentification getAreaCodeInfo() {
        return areaCodeInfo;
    }

    /**
     * Sets the value of the areaCodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentification }
     *     
     */
    public void setAreaCodeInfo(PlaceLocationIdentification value) {
        this.areaCodeInfo = value;
    }

    /**
     * Gets the value of the numberOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnits }
     *     
     */
    public NumberOfUnits getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnits }
     *     
     */
    public void setNumberOfNights(NumberOfUnits value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the hotelItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformation24843S }
     *     
     */
    public TariffInformation24843S getHotelItemPrice() {
        return hotelItemPrice;
    }

    /**
     * Sets the value of the hotelItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformation24843S }
     *     
     */
    public void setHotelItemPrice(TariffInformation24843S value) {
        this.hotelItemPrice = value;
    }

    /**
     * Gets the value of the roomInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryAccomodationPackageDescriptionType.RoomInfoGroup }
     * 
     * 
     */
    public List<FerryAccomodationPackageDescriptionType.RoomInfoGroup> getRoomInfoGroup() {
        if (roomInfoGroup == null) {
            roomInfoGroup = new ArrayList<FerryAccomodationPackageDescriptionType.RoomInfoGroup>();
        }
        return this.roomInfoGroup;
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
     *         &lt;element name="roomDetailsInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom_20177S"/>
     *         &lt;element name="numberOfRooms" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits" minOccurs="0"/>
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
        "roomDetailsInformation",
        "numberOfRooms"
    })
    public static class RoomInfoGroup {

        @XmlElement(required = true)
        protected HotelRoom20177S roomDetailsInformation;
        protected NumberOfUnits numberOfRooms;

        /**
         * Gets the value of the roomDetailsInformation property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRoom20177S }
         *     
         */
        public HotelRoom20177S getRoomDetailsInformation() {
            return roomDetailsInformation;
        }

        /**
         * Sets the value of the roomDetailsInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRoom20177S }
         *     
         */
        public void setRoomDetailsInformation(HotelRoom20177S value) {
            this.roomDetailsInformation = value;
        }

        /**
         * Gets the value of the numberOfRooms property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnits }
         *     
         */
        public NumberOfUnits getNumberOfRooms() {
            return numberOfRooms;
        }

        /**
         * Sets the value of the numberOfRooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnits }
         *     
         */
        public void setNumberOfRooms(NumberOfUnits value) {
            this.numberOfRooms = value;
        }

    }

}
