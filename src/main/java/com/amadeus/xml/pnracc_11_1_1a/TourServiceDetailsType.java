
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey tour product details
 * 
 * <p>Java class for TourServiceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourServiceDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceNumberInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemNumber"/>
 *         &lt;element name="statusQuantityInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}QuantityAndActionDetails" minOccurs="0"/>
 *         &lt;element name="productInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AdditProdDetails"/>
 *         &lt;element name="confirmationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReservationControlInformation_25427S" minOccurs="0"/>
 *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_25422S" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="serviceDetails" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_25428S"/>
 *                   &lt;element name="serviceDurationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity" minOccurs="0"/>
 *                   &lt;element name="accomodationDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="roomInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom_25429S"/>
 *                             &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_25422S" maxOccurs="9" minOccurs="0"/>
 *                             &lt;element name="roomMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DiningInformation"/>
 *                             &lt;element name="occupancynInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails_25431S" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vehiculeDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vehiculeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Vehicle_25502S"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="transportationDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="departureInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_25436S"/>
 *                             &lt;element name="arrivalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_25436S"/>
 *                             &lt;element name="transportationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_25434S"/>
 *                             &lt;element name="transportationDuration" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity" minOccurs="0"/>
 *                             &lt;element name="equipmentInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}EquipmentDetails" minOccurs="0"/>
 *                             &lt;element name="transportationMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DiningInformation" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="productBCSDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="agentIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_25447S"/>
 *                             &lt;element name="distributionChannelData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SystemDetailsInfo"/>
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
@XmlType(name = "TourServiceDetailsType", propOrder = {
    "sequenceNumberInfo",
    "statusQuantityInfo",
    "productInfo",
    "confirmationInfo",
    "passengerAssociation",
    "serviceDetails"
})
public class TourServiceDetailsType {

    @XmlElement(required = true)
    protected ItemNumber sequenceNumberInfo;
    protected QuantityAndActionDetails statusQuantityInfo;
    @XmlElement(required = true)
    protected AdditProdDetails productInfo;
    protected ReservationControlInformation25427S confirmationInfo;
    protected List<ReferenceInformation25422S> passengerAssociation;
    @XmlElement(required = true)
    protected List<TourServiceDetailsType.ServiceDetails> serviceDetails;

    /**
     * Gets the value of the sequenceNumberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumber }
     *     
     */
    public ItemNumber getSequenceNumberInfo() {
        return sequenceNumberInfo;
    }

    /**
     * Sets the value of the sequenceNumberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumber }
     *     
     */
    public void setSequenceNumberInfo(ItemNumber value) {
        this.sequenceNumberInfo = value;
    }

    /**
     * Gets the value of the statusQuantityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionDetails }
     *     
     */
    public QuantityAndActionDetails getStatusQuantityInfo() {
        return statusQuantityInfo;
    }

    /**
     * Sets the value of the statusQuantityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionDetails }
     *     
     */
    public void setStatusQuantityInfo(QuantityAndActionDetails value) {
        this.statusQuantityInfo = value;
    }

    /**
     * Gets the value of the productInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AdditProdDetails }
     *     
     */
    public AdditProdDetails getProductInfo() {
        return productInfo;
    }

    /**
     * Sets the value of the productInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditProdDetails }
     *     
     */
    public void setProductInfo(AdditProdDetails value) {
        this.productInfo = value;
    }

    /**
     * Gets the value of the confirmationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformation25427S }
     *     
     */
    public ReservationControlInformation25427S getConfirmationInfo() {
        return confirmationInfo;
    }

    /**
     * Sets the value of the confirmationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformation25427S }
     *     
     */
    public void setConfirmationInfo(ReservationControlInformation25427S value) {
        this.confirmationInfo = value;
    }

    /**
     * Gets the value of the passengerAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformation25422S }
     * 
     * 
     */
    public List<ReferenceInformation25422S> getPassengerAssociation() {
        if (passengerAssociation == null) {
            passengerAssociation = new ArrayList<ReferenceInformation25422S>();
        }
        return this.passengerAssociation;
    }

    /**
     * Gets the value of the serviceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourServiceDetailsType.ServiceDetails }
     * 
     * 
     */
    public List<TourServiceDetailsType.ServiceDetails> getServiceDetails() {
        if (serviceDetails == null) {
            serviceDetails = new ArrayList<TourServiceDetailsType.ServiceDetails>();
        }
        return this.serviceDetails;
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
     *         &lt;element name="serviceInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_25428S"/>
     *         &lt;element name="serviceDurationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity" minOccurs="0"/>
     *         &lt;element name="accomodationDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="roomInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom_25429S"/>
     *                   &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_25422S" maxOccurs="9" minOccurs="0"/>
     *                   &lt;element name="roomMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DiningInformation"/>
     *                   &lt;element name="occupancynInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails_25431S" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vehiculeDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="vehiculeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Vehicle_25502S"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="transportationDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="departureInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_25436S"/>
     *                   &lt;element name="arrivalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_25436S"/>
     *                   &lt;element name="transportationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_25434S"/>
     *                   &lt;element name="transportationDuration" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity" minOccurs="0"/>
     *                   &lt;element name="equipmentInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}EquipmentDetails" minOccurs="0"/>
     *                   &lt;element name="transportationMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DiningInformation" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="productBCSDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="agentIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_25447S"/>
     *                   &lt;element name="distributionChannelData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SystemDetailsInfo"/>
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
        "serviceInfo",
        "serviceDurationInfo",
        "accomodationDetails",
        "vehiculeDetails",
        "transportationDetails",
        "productBCSDetails"
    })
    public static class ServiceDetails {

        @XmlElement(required = true)
        protected TravelProductInformation25428S serviceInfo;
        protected Quantity serviceDurationInfo;
        protected List<TourServiceDetailsType.ServiceDetails.AccomodationDetails> accomodationDetails;
        protected TourServiceDetailsType.ServiceDetails.VehiculeDetails vehiculeDetails;
        protected List<TourServiceDetailsType.ServiceDetails.TransportationDetails> transportationDetails;
        protected TourServiceDetailsType.ServiceDetails.ProductBCSDetails productBCSDetails;

        /**
         * Gets the value of the serviceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link TravelProductInformation25428S }
         *     
         */
        public TravelProductInformation25428S getServiceInfo() {
            return serviceInfo;
        }

        /**
         * Sets the value of the serviceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelProductInformation25428S }
         *     
         */
        public void setServiceInfo(TravelProductInformation25428S value) {
            this.serviceInfo = value;
        }

        /**
         * Gets the value of the serviceDurationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Quantity }
         *     
         */
        public Quantity getServiceDurationInfo() {
            return serviceDurationInfo;
        }

        /**
         * Sets the value of the serviceDurationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Quantity }
         *     
         */
        public void setServiceDurationInfo(Quantity value) {
            this.serviceDurationInfo = value;
        }

        /**
         * Gets the value of the accomodationDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accomodationDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccomodationDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TourServiceDetailsType.ServiceDetails.AccomodationDetails }
         * 
         * 
         */
        public List<TourServiceDetailsType.ServiceDetails.AccomodationDetails> getAccomodationDetails() {
            if (accomodationDetails == null) {
                accomodationDetails = new ArrayList<TourServiceDetailsType.ServiceDetails.AccomodationDetails>();
            }
            return this.accomodationDetails;
        }

        /**
         * Gets the value of the vehiculeDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TourServiceDetailsType.ServiceDetails.VehiculeDetails }
         *     
         */
        public TourServiceDetailsType.ServiceDetails.VehiculeDetails getVehiculeDetails() {
            return vehiculeDetails;
        }

        /**
         * Sets the value of the vehiculeDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TourServiceDetailsType.ServiceDetails.VehiculeDetails }
         *     
         */
        public void setVehiculeDetails(TourServiceDetailsType.ServiceDetails.VehiculeDetails value) {
            this.vehiculeDetails = value;
        }

        /**
         * Gets the value of the transportationDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the transportationDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTransportationDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TourServiceDetailsType.ServiceDetails.TransportationDetails }
         * 
         * 
         */
        public List<TourServiceDetailsType.ServiceDetails.TransportationDetails> getTransportationDetails() {
            if (transportationDetails == null) {
                transportationDetails = new ArrayList<TourServiceDetailsType.ServiceDetails.TransportationDetails>();
            }
            return this.transportationDetails;
        }

        /**
         * Gets the value of the productBCSDetails property.
         * 
         * @return
         *     possible object is
         *     {@link TourServiceDetailsType.ServiceDetails.ProductBCSDetails }
         *     
         */
        public TourServiceDetailsType.ServiceDetails.ProductBCSDetails getProductBCSDetails() {
            return productBCSDetails;
        }

        /**
         * Sets the value of the productBCSDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link TourServiceDetailsType.ServiceDetails.ProductBCSDetails }
         *     
         */
        public void setProductBCSDetails(TourServiceDetailsType.ServiceDetails.ProductBCSDetails value) {
            this.productBCSDetails = value;
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
         *         &lt;element name="roomInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}HotelRoom_25429S"/>
         *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_25422S" maxOccurs="9" minOccurs="0"/>
         *         &lt;element name="roomMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DiningInformation"/>
         *         &lt;element name="occupancynInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RangeDetails_25431S" minOccurs="0"/>
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
            "roomInfo",
            "passengerAssociation",
            "roomMealPlanInfo",
            "occupancynInfo"
        })
        public static class AccomodationDetails {

            @XmlElement(required = true)
            protected HotelRoom25429S roomInfo;
            protected List<ReferenceInformation25422S> passengerAssociation;
            @XmlElement(required = true)
            protected DiningInformation roomMealPlanInfo;
            protected RangeDetails25431S occupancynInfo;

            /**
             * Gets the value of the roomInfo property.
             * 
             * @return
             *     possible object is
             *     {@link HotelRoom25429S }
             *     
             */
            public HotelRoom25429S getRoomInfo() {
                return roomInfo;
            }

            /**
             * Sets the value of the roomInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link HotelRoom25429S }
             *     
             */
            public void setRoomInfo(HotelRoom25429S value) {
                this.roomInfo = value;
            }

            /**
             * Gets the value of the passengerAssociation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passengerAssociation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassengerAssociation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReferenceInformation25422S }
             * 
             * 
             */
            public List<ReferenceInformation25422S> getPassengerAssociation() {
                if (passengerAssociation == null) {
                    passengerAssociation = new ArrayList<ReferenceInformation25422S>();
                }
                return this.passengerAssociation;
            }

            /**
             * Gets the value of the roomMealPlanInfo property.
             * 
             * @return
             *     possible object is
             *     {@link DiningInformation }
             *     
             */
            public DiningInformation getRoomMealPlanInfo() {
                return roomMealPlanInfo;
            }

            /**
             * Sets the value of the roomMealPlanInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiningInformation }
             *     
             */
            public void setRoomMealPlanInfo(DiningInformation value) {
                this.roomMealPlanInfo = value;
            }

            /**
             * Gets the value of the occupancynInfo property.
             * 
             * @return
             *     possible object is
             *     {@link RangeDetails25431S }
             *     
             */
            public RangeDetails25431S getOccupancynInfo() {
                return occupancynInfo;
            }

            /**
             * Sets the value of the occupancynInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link RangeDetails25431S }
             *     
             */
            public void setOccupancynInfo(RangeDetails25431S value) {
                this.occupancynInfo = value;
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
         *         &lt;element name="agentIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}UserIdentification_25447S"/>
         *         &lt;element name="distributionChannelData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SystemDetailsInfo"/>
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
            "agentIdentification",
            "distributionChannelData"
        })
        public static class ProductBCSDetails {

            @XmlElement(required = true)
            protected UserIdentification25447S agentIdentification;
            @XmlElement(required = true)
            protected SystemDetailsInfo distributionChannelData;

            /**
             * Gets the value of the agentIdentification property.
             * 
             * @return
             *     possible object is
             *     {@link UserIdentification25447S }
             *     
             */
            public UserIdentification25447S getAgentIdentification() {
                return agentIdentification;
            }

            /**
             * Sets the value of the agentIdentification property.
             * 
             * @param value
             *     allowed object is
             *     {@link UserIdentification25447S }
             *     
             */
            public void setAgentIdentification(UserIdentification25447S value) {
                this.agentIdentification = value;
            }

            /**
             * Gets the value of the distributionChannelData property.
             * 
             * @return
             *     possible object is
             *     {@link SystemDetailsInfo }
             *     
             */
            public SystemDetailsInfo getDistributionChannelData() {
                return distributionChannelData;
            }

            /**
             * Sets the value of the distributionChannelData property.
             * 
             * @param value
             *     allowed object is
             *     {@link SystemDetailsInfo }
             *     
             */
            public void setDistributionChannelData(SystemDetailsInfo value) {
                this.distributionChannelData = value;
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
         *         &lt;element name="departureInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_25436S"/>
         *         &lt;element name="arrivalInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_25436S"/>
         *         &lt;element name="transportationInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_25434S"/>
         *         &lt;element name="transportationDuration" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity" minOccurs="0"/>
         *         &lt;element name="equipmentInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}EquipmentDetails" minOccurs="0"/>
         *         &lt;element name="transportationMealPlanInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DiningInformation" minOccurs="0"/>
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
            "departureInfo",
            "arrivalInfo",
            "transportationInfo",
            "transportationDuration",
            "equipmentInfo",
            "transportationMealPlanInfo"
        })
        public static class TransportationDetails {

            @XmlElement(required = true)
            protected PlaceLocationIdentification25436S departureInfo;
            @XmlElement(required = true)
            protected PlaceLocationIdentification25436S arrivalInfo;
            @XmlElement(required = true)
            protected TravelProductInformation25434S transportationInfo;
            protected Quantity transportationDuration;
            protected EquipmentDetails equipmentInfo;
            protected DiningInformation transportationMealPlanInfo;

            /**
             * Gets the value of the departureInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PlaceLocationIdentification25436S }
             *     
             */
            public PlaceLocationIdentification25436S getDepartureInfo() {
                return departureInfo;
            }

            /**
             * Sets the value of the departureInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PlaceLocationIdentification25436S }
             *     
             */
            public void setDepartureInfo(PlaceLocationIdentification25436S value) {
                this.departureInfo = value;
            }

            /**
             * Gets the value of the arrivalInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PlaceLocationIdentification25436S }
             *     
             */
            public PlaceLocationIdentification25436S getArrivalInfo() {
                return arrivalInfo;
            }

            /**
             * Sets the value of the arrivalInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PlaceLocationIdentification25436S }
             *     
             */
            public void setArrivalInfo(PlaceLocationIdentification25436S value) {
                this.arrivalInfo = value;
            }

            /**
             * Gets the value of the transportationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformation25434S }
             *     
             */
            public TravelProductInformation25434S getTransportationInfo() {
                return transportationInfo;
            }

            /**
             * Sets the value of the transportationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformation25434S }
             *     
             */
            public void setTransportationInfo(TravelProductInformation25434S value) {
                this.transportationInfo = value;
            }

            /**
             * Gets the value of the transportationDuration property.
             * 
             * @return
             *     possible object is
             *     {@link Quantity }
             *     
             */
            public Quantity getTransportationDuration() {
                return transportationDuration;
            }

            /**
             * Sets the value of the transportationDuration property.
             * 
             * @param value
             *     allowed object is
             *     {@link Quantity }
             *     
             */
            public void setTransportationDuration(Quantity value) {
                this.transportationDuration = value;
            }

            /**
             * Gets the value of the equipmentInfo property.
             * 
             * @return
             *     possible object is
             *     {@link EquipmentDetails }
             *     
             */
            public EquipmentDetails getEquipmentInfo() {
                return equipmentInfo;
            }

            /**
             * Sets the value of the equipmentInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link EquipmentDetails }
             *     
             */
            public void setEquipmentInfo(EquipmentDetails value) {
                this.equipmentInfo = value;
            }

            /**
             * Gets the value of the transportationMealPlanInfo property.
             * 
             * @return
             *     possible object is
             *     {@link DiningInformation }
             *     
             */
            public DiningInformation getTransportationMealPlanInfo() {
                return transportationMealPlanInfo;
            }

            /**
             * Sets the value of the transportationMealPlanInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiningInformation }
             *     
             */
            public void setTransportationMealPlanInfo(DiningInformation value) {
                this.transportationMealPlanInfo = value;
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
         *         &lt;element name="vehiculeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Vehicle_25502S"/>
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
            "vehiculeInfo"
        })
        public static class VehiculeDetails {

            @XmlElement(required = true)
            protected Vehicle25502S vehiculeInfo;

            /**
             * Gets the value of the vehiculeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link Vehicle25502S }
             *     
             */
            public Vehicle25502S getVehiculeInfo() {
                return vehiculeInfo;
            }

            /**
             * Sets the value of the vehiculeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link Vehicle25502S }
             *     
             */
            public void setVehiculeInfo(Vehicle25502S value) {
                this.vehiculeInfo = value;
            }

        }

    }

}
