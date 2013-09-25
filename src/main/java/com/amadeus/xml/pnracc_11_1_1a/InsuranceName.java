
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This segments contains data related to each of the passengers.
 * 
 * <p>Java class for InsuranceName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="insuranceTravelerDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SpecificTravellerDetailsType" minOccurs="0"/>
 *         &lt;element name="travelerPerpaxDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TravelerPerpaxDetailsType" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceName", propOrder = {
    "insuranceTravelerDetails",
    "travelerPerpaxDetails"
})
public class InsuranceName {

    protected SpecificTravellerDetailsType insuranceTravelerDetails;
    protected List<TravelerPerpaxDetailsType> travelerPerpaxDetails;

    /**
     * Gets the value of the insuranceTravelerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTravellerDetailsType }
     *     
     */
    public SpecificTravellerDetailsType getInsuranceTravelerDetails() {
        return insuranceTravelerDetails;
    }

    /**
     * Sets the value of the insuranceTravelerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTravellerDetailsType }
     *     
     */
    public void setInsuranceTravelerDetails(SpecificTravellerDetailsType value) {
        this.insuranceTravelerDetails = value;
    }

    /**
     * Gets the value of the travelerPerpaxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerPerpaxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerPerpaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerPerpaxDetailsType }
     * 
     * 
     */
    public List<TravelerPerpaxDetailsType> getTravelerPerpaxDetails() {
        if (travelerPerpaxDetails == null) {
            travelerPerpaxDetails = new ArrayList<TravelerPerpaxDetailsType>();
        }
        return this.travelerPerpaxDetails;
    }

}
