
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * contains the data of a rail leg
 * 
 * <p>Java class for RailLegDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailLegDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trainProductInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TrainProductInformation_32331S"/>
 *         &lt;element name="reservableStatus" type="{http://xml.amadeus.com/PNRACC_11_1_1A}QuantityAndActionDetails_32609S" minOccurs="0"/>
 *         &lt;element name="legDateTime" type="{http://xml.amadeus.com/PNRACC_11_1_1A}StructuredDateTimeInformation_32362S" maxOccurs="2"/>
 *         &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_32347S"/>
 *         &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PlaceLocationIdentification_32347S"/>
 *         &lt;element name="legReference" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ItemNumber_33258S"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailLegDataType", propOrder = {
    "trainProductInfo",
    "reservableStatus",
    "legDateTime",
    "depLocation",
    "arrLocation",
    "legReference"
})
public class RailLegDataType {

    @XmlElement(required = true)
    protected TrainProductInformation32331S trainProductInfo;
    protected QuantityAndActionDetails32609S reservableStatus;
    @XmlElement(required = true)
    protected List<StructuredDateTimeInformation32362S> legDateTime;
    @XmlElement(required = true)
    protected PlaceLocationIdentification32347S depLocation;
    @XmlElement(required = true)
    protected PlaceLocationIdentification32347S arrLocation;
    @XmlElement(required = true)
    protected ItemNumber33258S legReference;

    /**
     * Gets the value of the trainProductInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TrainProductInformation32331S }
     *     
     */
    public TrainProductInformation32331S getTrainProductInfo() {
        return trainProductInfo;
    }

    /**
     * Sets the value of the trainProductInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainProductInformation32331S }
     *     
     */
    public void setTrainProductInfo(TrainProductInformation32331S value) {
        this.trainProductInfo = value;
    }

    /**
     * Gets the value of the reservableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionDetails32609S }
     *     
     */
    public QuantityAndActionDetails32609S getReservableStatus() {
        return reservableStatus;
    }

    /**
     * Sets the value of the reservableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionDetails32609S }
     *     
     */
    public void setReservableStatus(QuantityAndActionDetails32609S value) {
        this.reservableStatus = value;
    }

    /**
     * Gets the value of the legDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredDateTimeInformation32362S }
     * 
     * 
     */
    public List<StructuredDateTimeInformation32362S> getLegDateTime() {
        if (legDateTime == null) {
            legDateTime = new ArrayList<StructuredDateTimeInformation32362S>();
        }
        return this.legDateTime;
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
     * Gets the value of the legReference property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumber33258S }
     *     
     */
    public ItemNumber33258S getLegReference() {
        return legReference;
    }

    /**
     * Sets the value of the legReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumber33258S }
     *     
     */
    public void setLegReference(ItemNumber33258S value) {
        this.legReference = value;
    }

}
