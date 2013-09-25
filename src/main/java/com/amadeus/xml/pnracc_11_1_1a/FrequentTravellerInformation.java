
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information
 * 
 * <p>Java class for FrequentTravellerInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTraveler" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FrequentTravellerIdentificationTypeI"/>
 *         &lt;element name="priorityDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PriorityDetailsType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="redemptionInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductAccountDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerInformation", propOrder = {
    "frequentTraveler",
    "priorityDetails",
    "redemptionInformation"
})
public class FrequentTravellerInformation {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationTypeI frequentTraveler;
    protected List<PriorityDetailsType> priorityDetails;
    protected ProductAccountDetailsTypeI redemptionInformation;

    /**
     * Gets the value of the frequentTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public FrequentTravellerIdentificationTypeI getFrequentTraveler() {
        return frequentTraveler;
    }

    /**
     * Sets the value of the frequentTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public void setFrequentTraveler(FrequentTravellerIdentificationTypeI value) {
        this.frequentTraveler = value;
    }

    /**
     * Gets the value of the priorityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityDetailsType }
     * 
     * 
     */
    public List<PriorityDetailsType> getPriorityDetails() {
        if (priorityDetails == null) {
            priorityDetails = new ArrayList<PriorityDetailsType>();
        }
        return this.priorityDetails;
    }

    /**
     * Gets the value of the redemptionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAccountDetailsTypeI }
     *     
     */
    public ProductAccountDetailsTypeI getRedemptionInformation() {
        return redemptionInformation;
    }

    /**
     * Sets the value of the redemptionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAccountDetailsTypeI }
     *     
     */
    public void setRedemptionInformation(ProductAccountDetailsTypeI value) {
        this.redemptionInformation = value;
    }

}
