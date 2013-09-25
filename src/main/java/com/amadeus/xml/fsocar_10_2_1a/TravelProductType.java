
package com.amadeus.xml.fsocar_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains flight travel (date, time, flight number,...) and posting avaibility information
 * 
 * <p>Java class for TravelProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productDateTime" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ProductDateTimeType"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}LocationIdentificationDetailsType" maxOccurs="2"/>
 *         &lt;element name="companyId" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}CompanyIdentificationType"/>
 *         &lt;element name="flightNumber" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="productDetail" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}AdditionalProductDetailsType" minOccurs="0"/>
 *         &lt;element name="addProductDetail" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ProductFacilitiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductType", propOrder = {
    "productDateTime",
    "location",
    "companyId",
    "flightNumber",
    "productDetail",
    "addProductDetail"
})
public class TravelProductType {

    @XmlElement(required = true)
    protected ProductDateTimeType productDateTime;
    @XmlElement(required = true)
    protected List<LocationIdentificationDetailsType> location;
    @XmlElement(required = true)
    protected CompanyIdentificationType companyId;
    @XmlElement(required = true)
    protected String flightNumber;
    protected AdditionalProductDetailsType productDetail;
    protected ProductFacilitiesType addProductDetail;

    /**
     * Gets the value of the productDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeType }
     *     
     */
    public ProductDateTimeType getProductDateTime() {
        return productDateTime;
    }

    /**
     * Sets the value of the productDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeType }
     *     
     */
    public void setProductDateTime(ProductDateTimeType value) {
        this.productDateTime = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationIdentificationDetailsType }
     * 
     * 
     */
    public List<LocationIdentificationDetailsType> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationIdentificationDetailsType>();
        }
        return this.location;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public CompanyIdentificationType getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public void setCompanyId(CompanyIdentificationType value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the productDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductDetailsType }
     *     
     */
    public AdditionalProductDetailsType getProductDetail() {
        return productDetail;
    }

    /**
     * Sets the value of the productDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductDetailsType }
     *     
     */
    public void setProductDetail(AdditionalProductDetailsType value) {
        this.productDetail = value;
    }

    /**
     * Gets the value of the addProductDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFacilitiesType }
     *     
     */
    public ProductFacilitiesType getAddProductDetail() {
        return addProductDetail;
    }

    /**
     * Sets the value of the addProductDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFacilitiesType }
     *     
     */
    public void setAddProductDetail(ProductFacilitiesType value) {
        this.addProductDetail = value;
    }

}
