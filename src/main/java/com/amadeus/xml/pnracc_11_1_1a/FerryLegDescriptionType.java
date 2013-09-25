
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FerryLegDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerryLegDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sailingDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelProductInformation_24954S"/>
 *         &lt;element name="shipDescription" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ShipIdentification" minOccurs="0"/>
 *         &lt;element name="sailingLegCheckInInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_21109S" minOccurs="0"/>
 *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_25132S" minOccurs="0"/>
 *         &lt;element name="priceInfoGroup" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="routePriceInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_24843S"/>
 *                   &lt;element name="passengerCategoryType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Attribute_24552S"/>
 *                   &lt;element name="numberOfPassengers" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="vehicleInfoGroup" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Vehicle"/>
 *                   &lt;element name="numberOfBicycles" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits" minOccurs="0"/>
 *                   &lt;element name="vehicleRoutePrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_24843S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serviceInfoGroup" maxOccurs="18" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serviceInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Attribute"/>
 *                   &lt;element name="numberOfServices" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits" minOccurs="0"/>
 *                   &lt;element name="serviceRoutePrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_24843S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="animalInfoGroup" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="animalInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SpecificDataInformation"/>
 *                   &lt;element name="animalRoutePrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_24843S" minOccurs="0"/>
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
@XmlType(name = "FerryLegDescriptionType", propOrder = {
    "sailingDetails",
    "shipDescription",
    "sailingLegCheckInInformation",
    "passengerAssociation",
    "priceInfoGroup",
    "vehicleInfoGroup",
    "serviceInfoGroup",
    "animalInfoGroup"
})
public class FerryLegDescriptionType {

    @XmlElement(required = true)
    protected TravelProductInformation24954S sailingDetails;
    protected ShipIdentification shipDescription;
    protected StructuredDateTimeInformation21109S sailingLegCheckInInformation;
    protected ReferenceInformation25132S passengerAssociation;
    protected List<FerryLegDescriptionType.PriceInfoGroup> priceInfoGroup;
    protected List<FerryLegDescriptionType.VehicleInfoGroup> vehicleInfoGroup;
    protected List<FerryLegDescriptionType.ServiceInfoGroup> serviceInfoGroup;
    protected List<FerryLegDescriptionType.AnimalInfoGroup> animalInfoGroup;

    /**
     * Gets the value of the sailingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformation24954S }
     *     
     */
    public TravelProductInformation24954S getSailingDetails() {
        return sailingDetails;
    }

    /**
     * Sets the value of the sailingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformation24954S }
     *     
     */
    public void setSailingDetails(TravelProductInformation24954S value) {
        this.sailingDetails = value;
    }

    /**
     * Gets the value of the shipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdentification }
     *     
     */
    public ShipIdentification getShipDescription() {
        return shipDescription;
    }

    /**
     * Sets the value of the shipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdentification }
     *     
     */
    public void setShipDescription(ShipIdentification value) {
        this.shipDescription = value;
    }

    /**
     * Gets the value of the sailingLegCheckInInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformation21109S }
     *     
     */
    public StructuredDateTimeInformation21109S getSailingLegCheckInInformation() {
        return sailingLegCheckInInformation;
    }

    /**
     * Sets the value of the sailingLegCheckInInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformation21109S }
     *     
     */
    public void setSailingLegCheckInInformation(StructuredDateTimeInformation21109S value) {
        this.sailingLegCheckInInformation = value;
    }

    /**
     * Gets the value of the passengerAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformation25132S }
     *     
     */
    public ReferenceInformation25132S getPassengerAssociation() {
        return passengerAssociation;
    }

    /**
     * Sets the value of the passengerAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformation25132S }
     *     
     */
    public void setPassengerAssociation(ReferenceInformation25132S value) {
        this.passengerAssociation = value;
    }

    /**
     * Gets the value of the priceInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType.PriceInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType.PriceInfoGroup> getPriceInfoGroup() {
        if (priceInfoGroup == null) {
            priceInfoGroup = new ArrayList<FerryLegDescriptionType.PriceInfoGroup>();
        }
        return this.priceInfoGroup;
    }

    /**
     * Gets the value of the vehicleInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType.VehicleInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType.VehicleInfoGroup> getVehicleInfoGroup() {
        if (vehicleInfoGroup == null) {
            vehicleInfoGroup = new ArrayList<FerryLegDescriptionType.VehicleInfoGroup>();
        }
        return this.vehicleInfoGroup;
    }

    /**
     * Gets the value of the serviceInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType.ServiceInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType.ServiceInfoGroup> getServiceInfoGroup() {
        if (serviceInfoGroup == null) {
            serviceInfoGroup = new ArrayList<FerryLegDescriptionType.ServiceInfoGroup>();
        }
        return this.serviceInfoGroup;
    }

    /**
     * Gets the value of the animalInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType.AnimalInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType.AnimalInfoGroup> getAnimalInfoGroup() {
        if (animalInfoGroup == null) {
            animalInfoGroup = new ArrayList<FerryLegDescriptionType.AnimalInfoGroup>();
        }
        return this.animalInfoGroup;
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
     *         &lt;element name="animalInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SpecificDataInformation"/>
     *         &lt;element name="animalRoutePrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_24843S" minOccurs="0"/>
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
        "animalInformation",
        "animalRoutePrice"
    })
    public static class AnimalInfoGroup {

        @XmlElement(required = true)
        protected SpecificDataInformation animalInformation;
        protected TariffInformation24843S animalRoutePrice;

        /**
         * Gets the value of the animalInformation property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificDataInformation }
         *     
         */
        public SpecificDataInformation getAnimalInformation() {
            return animalInformation;
        }

        /**
         * Sets the value of the animalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificDataInformation }
         *     
         */
        public void setAnimalInformation(SpecificDataInformation value) {
            this.animalInformation = value;
        }

        /**
         * Gets the value of the animalRoutePrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformation24843S }
         *     
         */
        public TariffInformation24843S getAnimalRoutePrice() {
            return animalRoutePrice;
        }

        /**
         * Sets the value of the animalRoutePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformation24843S }
         *     
         */
        public void setAnimalRoutePrice(TariffInformation24843S value) {
            this.animalRoutePrice = value;
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
     *         &lt;element name="routePriceInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_24843S"/>
     *         &lt;element name="passengerCategoryType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Attribute_24552S"/>
     *         &lt;element name="numberOfPassengers" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits"/>
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
        "routePriceInformation",
        "passengerCategoryType",
        "numberOfPassengers"
    })
    public static class PriceInfoGroup {

        @XmlElement(required = true)
        protected TariffInformation24843S routePriceInformation;
        @XmlElement(required = true)
        protected Attribute24552S passengerCategoryType;
        @XmlElement(required = true)
        protected NumberOfUnits numberOfPassengers;

        /**
         * Gets the value of the routePriceInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformation24843S }
         *     
         */
        public TariffInformation24843S getRoutePriceInformation() {
            return routePriceInformation;
        }

        /**
         * Sets the value of the routePriceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformation24843S }
         *     
         */
        public void setRoutePriceInformation(TariffInformation24843S value) {
            this.routePriceInformation = value;
        }

        /**
         * Gets the value of the passengerCategoryType property.
         * 
         * @return
         *     possible object is
         *     {@link Attribute24552S }
         *     
         */
        public Attribute24552S getPassengerCategoryType() {
            return passengerCategoryType;
        }

        /**
         * Sets the value of the passengerCategoryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link Attribute24552S }
         *     
         */
        public void setPassengerCategoryType(Attribute24552S value) {
            this.passengerCategoryType = value;
        }

        /**
         * Gets the value of the numberOfPassengers property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnits }
         *     
         */
        public NumberOfUnits getNumberOfPassengers() {
            return numberOfPassengers;
        }

        /**
         * Sets the value of the numberOfPassengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnits }
         *     
         */
        public void setNumberOfPassengers(NumberOfUnits value) {
            this.numberOfPassengers = value;
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
     *         &lt;element name="serviceInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Attribute"/>
     *         &lt;element name="numberOfServices" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits" minOccurs="0"/>
     *         &lt;element name="serviceRoutePrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_24843S" minOccurs="0"/>
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
        "serviceInformation",
        "numberOfServices",
        "serviceRoutePrice"
    })
    public static class ServiceInfoGroup {

        @XmlElement(required = true)
        protected Attribute serviceInformation;
        protected NumberOfUnits numberOfServices;
        protected TariffInformation24843S serviceRoutePrice;

        /**
         * Gets the value of the serviceInformation property.
         * 
         * @return
         *     possible object is
         *     {@link Attribute }
         *     
         */
        public Attribute getServiceInformation() {
            return serviceInformation;
        }

        /**
         * Sets the value of the serviceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Attribute }
         *     
         */
        public void setServiceInformation(Attribute value) {
            this.serviceInformation = value;
        }

        /**
         * Gets the value of the numberOfServices property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnits }
         *     
         */
        public NumberOfUnits getNumberOfServices() {
            return numberOfServices;
        }

        /**
         * Sets the value of the numberOfServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnits }
         *     
         */
        public void setNumberOfServices(NumberOfUnits value) {
            this.numberOfServices = value;
        }

        /**
         * Gets the value of the serviceRoutePrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformation24843S }
         *     
         */
        public TariffInformation24843S getServiceRoutePrice() {
            return serviceRoutePrice;
        }

        /**
         * Sets the value of the serviceRoutePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformation24843S }
         *     
         */
        public void setServiceRoutePrice(TariffInformation24843S value) {
            this.serviceRoutePrice = value;
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
     *         &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Vehicle"/>
     *         &lt;element name="numberOfBicycles" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnits" minOccurs="0"/>
     *         &lt;element name="vehicleRoutePrice" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformation_24843S" minOccurs="0"/>
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
        "vehicleInformation",
        "numberOfBicycles",
        "vehicleRoutePrice"
    })
    public static class VehicleInfoGroup {

        @XmlElement(required = true)
        protected Vehicle vehicleInformation;
        protected NumberOfUnits numberOfBicycles;
        protected TariffInformation24843S vehicleRoutePrice;

        /**
         * Gets the value of the vehicleInformation property.
         * 
         * @return
         *     possible object is
         *     {@link Vehicle }
         *     
         */
        public Vehicle getVehicleInformation() {
            return vehicleInformation;
        }

        /**
         * Sets the value of the vehicleInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Vehicle }
         *     
         */
        public void setVehicleInformation(Vehicle value) {
            this.vehicleInformation = value;
        }

        /**
         * Gets the value of the numberOfBicycles property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnits }
         *     
         */
        public NumberOfUnits getNumberOfBicycles() {
            return numberOfBicycles;
        }

        /**
         * Sets the value of the numberOfBicycles property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnits }
         *     
         */
        public void setNumberOfBicycles(NumberOfUnits value) {
            this.numberOfBicycles = value;
        }

        /**
         * Gets the value of the vehicleRoutePrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformation24843S }
         *     
         */
        public TariffInformation24843S getVehicleRoutePrice() {
            return vehicleRoutePrice;
        }

        /**
         * Sets the value of the vehicleRoutePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformation24843S }
         *     
         */
        public void setVehicleRoutePrice(TariffInformation24843S value) {
            this.vehicleRoutePrice = value;
        }

    }

}
