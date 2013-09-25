
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the references, the type and the characteristic of accommodations allocated as a result of a reservation request.
 * 
 * <p>Java class for AccommodationAllocationInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccommodationAllocationInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accommAllocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AccommodationAllocationInformationDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationAllocationInformation", propOrder = {
    "accommAllocation"
})
public class AccommodationAllocationInformation {

    @XmlElement(required = true)
    protected AccommodationAllocationInformationDetailsTypeU accommAllocation;

    /**
     * Gets the value of the accommAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationAllocationInformationDetailsTypeU }
     *     
     */
    public AccommodationAllocationInformationDetailsTypeU getAccommAllocation() {
        return accommAllocation;
    }

    /**
     * Sets the value of the accommAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationAllocationInformationDetailsTypeU }
     *     
     */
    public void setAccommAllocation(AccommodationAllocationInformationDetailsTypeU value) {
        this.accommAllocation = value;
    }

}
