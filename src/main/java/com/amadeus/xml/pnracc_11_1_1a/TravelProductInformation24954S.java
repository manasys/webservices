
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a travel product.
 * 
 * <p>Java class for TravelProductInformation_24954S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformation_24954S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itineraryDateTimeInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductDateAndTimeTypeU" minOccurs="0"/>
 *         &lt;element name="boardPortDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LocationTypeU" maxOccurs="2"/>
 *         &lt;element name="lineNumber" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformation_24954S", propOrder = {
    "itineraryDateTimeInfo",
    "boardPortDetails",
    "lineNumber"
})
public class TravelProductInformation24954S {

    protected ProductDateAndTimeTypeU itineraryDateTimeInfo;
    @XmlElement(required = true)
    protected List<LocationTypeU> boardPortDetails;
    @XmlElement(required = true)
    protected String lineNumber;

    /**
     * Gets the value of the itineraryDateTimeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateAndTimeTypeU }
     *     
     */
    public ProductDateAndTimeTypeU getItineraryDateTimeInfo() {
        return itineraryDateTimeInfo;
    }

    /**
     * Sets the value of the itineraryDateTimeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateAndTimeTypeU }
     *     
     */
    public void setItineraryDateTimeInfo(ProductDateAndTimeTypeU value) {
        this.itineraryDateTimeInfo = value;
    }

    /**
     * Gets the value of the boardPortDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardPortDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardPortDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationTypeU }
     * 
     * 
     */
    public List<LocationTypeU> getBoardPortDetails() {
        if (boardPortDetails == null) {
            boardPortDetails = new ArrayList<LocationTypeU>();
        }
        return this.boardPortDetails;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

}
