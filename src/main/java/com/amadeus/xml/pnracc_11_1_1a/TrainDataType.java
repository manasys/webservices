
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group together train business data
 * 
 * <p>Java class for TrainDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrainDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trainProductInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TrainProductInformation"/>
 *         &lt;element name="tripDateTime" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_32362S" maxOccurs="2"/>
 *         &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_32347S"/>
 *         &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_32347S"/>
 *         &lt;element name="railLeg" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RailLegDataType" maxOccurs="6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainDataType", propOrder = {
    "trainProductInfo",
    "tripDateTime",
    "depLocation",
    "arrLocation",
    "railLeg"
})
public class TrainDataType {

    @XmlElement(required = true)
    protected TrainProductInformation trainProductInfo;
    @XmlElement(required = true)
    protected List<StructuredDateTimeInformation32362S> tripDateTime;
    @XmlElement(required = true)
    protected PlaceLocationIdentification32347S depLocation;
    @XmlElement(required = true)
    protected PlaceLocationIdentification32347S arrLocation;
    protected List<RailLegDataType> railLeg;

    /**
     * Gets the value of the trainProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrainProductInformation }
     *     
     */
    public TrainProductInformation getTrainProductInfo() {
        return trainProductInfo;
    }

    /**
     * Sets the value of the trainProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainProductInformation }
     *     
     */
    public void setTrainProductInfo(TrainProductInformation value) {
        this.trainProductInfo = value;
    }

    /**
     * Gets the value of the tripDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tripDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredDateTimeInformation32362S }
     * 
     * 
     */
    public List<StructuredDateTimeInformation32362S> getTripDateTime() {
        if (tripDateTime == null) {
            tripDateTime = new ArrayList<StructuredDateTimeInformation32362S>();
        }
        return this.tripDateTime;
    }

    /**
     * Gets the value of the depLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentification32347S }
     *     
     */
    public PlaceLocationIdentification32347S getDepLocation() {
        return depLocation;
    }

    /**
     * Sets the value of the depLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentification32347S }
     *     
     */
    public void setDepLocation(PlaceLocationIdentification32347S value) {
        this.depLocation = value;
    }

    /**
     * Gets the value of the arrLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentification32347S }
     *     
     */
    public PlaceLocationIdentification32347S getArrLocation() {
        return arrLocation;
    }

    /**
     * Sets the value of the arrLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentification32347S }
     *     
     */
    public void setArrLocation(PlaceLocationIdentification32347S value) {
        this.arrLocation = value;
    }

    /**
     * Gets the value of the railLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailLegDataType }
     * 
     * 
     */
    public List<RailLegDataType> getRailLeg() {
        if (railLeg == null) {
            railLeg = new ArrayList<RailLegDataType>();
        }
        return this.railLeg;
    }

}
