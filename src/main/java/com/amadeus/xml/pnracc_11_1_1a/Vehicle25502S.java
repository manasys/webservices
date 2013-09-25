
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information about a vehicle.
 * 
 * <p>Java class for Vehicle_25502S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Vehicle_25502S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehiculeDescription" type="{http://xml.amadeus.com/PNRACC_11_1_1A}VehicleInformationTypeU_46439C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle_25502S", propOrder = {
    "vehiculeDescription"
})
public class Vehicle25502S {

    @XmlElement(required = true)
    protected VehicleInformationTypeU46439C vehiculeDescription;

    /**
     * Gets the value of the vehiculeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleInformationTypeU46439C }
     *     
     */
    public VehicleInformationTypeU46439C getVehiculeDescription() {
        return vehiculeDescription;
    }

    /**
     * Sets the value of the vehiculeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInformationTypeU46439C }
     *     
     */
    public void setVehiculeDescription(VehicleInformationTypeU46439C value) {
        this.vehiculeDescription = value;
    }

}
