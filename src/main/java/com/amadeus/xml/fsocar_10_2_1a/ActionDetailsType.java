
package com.amadeus.xml.fsocar_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the action that should be taken on a selected reference number.
 * 
 * <p>Java class for ActionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfItemsDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ProcessingInformationType" minOccurs="0"/>
 *         &lt;element name="lastItemsDetails" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferenceType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionDetailsType", propOrder = {
    "numberOfItemsDetails",
    "lastItemsDetails"
})
public class ActionDetailsType {

    protected ProcessingInformationType numberOfItemsDetails;
    protected List<ReferenceType> lastItemsDetails;

    /**
     * Gets the value of the numberOfItemsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingInformationType }
     *     
     */
    public ProcessingInformationType getNumberOfItemsDetails() {
        return numberOfItemsDetails;
    }

    /**
     * Sets the value of the numberOfItemsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingInformationType }
     *     
     */
    public void setNumberOfItemsDetails(ProcessingInformationType value) {
        this.numberOfItemsDetails = value;
    }

    /**
     * Gets the value of the lastItemsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastItemsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastItemsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getLastItemsDetails() {
        if (lastItemsDetails == null) {
            lastItemsDetails = new ArrayList<ReferenceType>();
        }
        return this.lastItemsDetails;
    }

}
