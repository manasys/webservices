
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a vehicle by make or model and vehicle identification number.
 * 
 * <p>Java class for VehicleInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleInformationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="makeAndModel" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleInformationTypeU", propOrder = {
    "makeAndModel"
})
public class VehicleInformationTypeU {

    protected String makeAndModel;

    /**
     * Gets the value of the makeAndModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeAndModel() {
        return makeAndModel;
    }

    /**
     * Sets the value of the makeAndModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeAndModel(String value) {
        this.makeAndModel = value;
    }

}
