
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the vehicle information
 * 
 * <p>Java class for VehicleInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleCharacteristic" type="{http://xml.amadeus.com/PNRACC_11_1_1A}VehicleTypeOptionType"/>
 *         &lt;element name="vehSpecialEquipment" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="vehicleInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}QuantityDetailsTypeI_128974C" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="freeTextDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextDetailsType" minOccurs="0"/>
 *         &lt;element name="carModel" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To55" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleInformation", propOrder = {
    "vehicleCharacteristic",
    "vehSpecialEquipment",
    "vehicleInfo",
    "freeTextDetails",
    "carModel"
})
public class VehicleInformation {

    @XmlElement(required = true)
    protected VehicleTypeOptionType vehicleCharacteristic;
    protected List<String> vehSpecialEquipment;
    protected List<QuantityDetailsTypeI128974C> vehicleInfo;
    protected FreeTextDetailsType freeTextDetails;
    protected String carModel;

    /**
     * Gets the value of the vehicleCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleTypeOptionType }
     *     
     */
    public VehicleTypeOptionType getVehicleCharacteristic() {
        return vehicleCharacteristic;
    }

    /**
     * Sets the value of the vehicleCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleTypeOptionType }
     *     
     */
    public void setVehicleCharacteristic(VehicleTypeOptionType value) {
        this.vehicleCharacteristic = value;
    }

    /**
     * Gets the value of the vehSpecialEquipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehSpecialEquipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehSpecialEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehSpecialEquipment() {
        if (vehSpecialEquipment == null) {
            vehSpecialEquipment = new ArrayList<String>();
        }
        return this.vehSpecialEquipment;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityDetailsTypeI128974C }
     * 
     * 
     */
    public List<QuantityDetailsTypeI128974C> getVehicleInfo() {
        if (vehicleInfo == null) {
            vehicleInfo = new ArrayList<QuantityDetailsTypeI128974C>();
        }
        return this.vehicleInfo;
    }

    /**
     * Gets the value of the freeTextDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextDetailsType }
     *     
     */
    public FreeTextDetailsType getFreeTextDetails() {
        return freeTextDetails;
    }

    /**
     * Sets the value of the freeTextDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextDetailsType }
     *     
     */
    public void setFreeTextDetails(FreeTextDetailsType value) {
        this.freeTextDetails = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

}
