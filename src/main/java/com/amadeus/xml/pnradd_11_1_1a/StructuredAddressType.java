
package com.amadeus.xml.pnradd_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the way data are mapped for structured AB//, AM//, AM/H//, AM/D//AM/M//.
 * 
 * <p>Java class for StructuredAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="informationType" type="{http://xml.amadeus.com/PNRADD_11_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="address" type="{http://xml.amadeus.com/PNRADD_11_1_1A}StructuredAddressInformationType"/>
 *         &lt;element name="optionalData" type="{http://xml.amadeus.com/PNRADD_11_1_1A}StructuredAddressInformationType_5063C" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredAddressType", propOrder = {
    "informationType",
    "address",
    "optionalData"
})
public class StructuredAddressType {

    protected String informationType;
    @XmlElement(required = true)
    protected StructuredAddressInformationType address;
    protected List<StructuredAddressInformationType5063C> optionalData;

    /**
     * Gets the value of the informationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationType() {
        return informationType;
    }

    /**
     * Sets the value of the informationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationType(String value) {
        this.informationType = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredAddressInformationType }
     *     
     */
    public StructuredAddressInformationType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredAddressInformationType }
     *     
     */
    public void setAddress(StructuredAddressInformationType value) {
        this.address = value;
    }

    /**
     * Gets the value of the optionalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredAddressInformationType5063C }
     * 
     * 
     */
    public List<StructuredAddressInformationType5063C> getOptionalData() {
        if (optionalData == null) {
            optionalData = new ArrayList<StructuredAddressInformationType5063C>();
        }
        return this.optionalData;
    }

}
