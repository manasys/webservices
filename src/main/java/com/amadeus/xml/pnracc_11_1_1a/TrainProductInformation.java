
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Train Product Information
 * 
 * <p>Java class for TrainProductInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainProductInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trainDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TrainDetailsType" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainProductInformation", propOrder = {
    "trainDetails",
    "type"
})
public class TrainProductInformation {

    protected TrainDetailsType trainDetails;
    protected String type;

    /**
     * Gets the value of the trainDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TrainDetailsType }
     *     
     */
    public TrainDetailsType getTrainDetails() {
        return trainDetails;
    }

    /**
     * Sets the value of the trainDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainDetailsType }
     *     
     */
    public void setTrainDetails(TrainDetailsType value) {
        this.trainDetails = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
