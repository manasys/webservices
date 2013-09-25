
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product
 * 
 * <p>Java class for TravelProductInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="product" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductDateTimeTypeI_171479C" minOccurs="0"/>
 *         &lt;element name="boardpointDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LocationTypeI_2784C" minOccurs="0"/>
 *         &lt;element name="offpointDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}LocationTypeI_2784C" minOccurs="0"/>
 *         &lt;element name="companyDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CompanyIdentificationTypeI_2785C" minOccurs="0"/>
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductIdentificationDetailsTypeI_2786C" minOccurs="0"/>
 *         &lt;element name="typeDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductTypeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="processingIndicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformation", propOrder = {
    "product",
    "boardpointDetail",
    "offpointDetail",
    "companyDetail",
    "productDetails",
    "typeDetail",
    "processingIndicator"
})
public class TravelProductInformation {

    protected ProductDateTimeTypeI171479C product;
    protected LocationTypeI2784C boardpointDetail;
    protected LocationTypeI2784C offpointDetail;
    protected CompanyIdentificationTypeI2785C companyDetail;
    protected ProductIdentificationDetailsTypeI2786C productDetails;
    protected ProductTypeDetailsTypeI typeDetail;
    protected String processingIndicator;

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI171479C }
     *     
     */
    public ProductDateTimeTypeI171479C getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI171479C }
     *     
     */
    public void setProduct(ProductDateTimeTypeI171479C value) {
        this.product = value;
    }

    /**
     * Gets the value of the boardpointDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI2784C }
     *     
     */
    public LocationTypeI2784C getBoardpointDetail() {
        return boardpointDetail;
    }

    /**
     * Sets the value of the boardpointDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI2784C }
     *     
     */
    public void setBoardpointDetail(LocationTypeI2784C value) {
        this.boardpointDetail = value;
    }

    /**
     * Gets the value of the offpointDetail property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI2784C }
     *     
     */
    public LocationTypeI2784C getOffpointDetail() {
        return offpointDetail;
    }

    /**
     * Sets the value of the offpointDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI2784C }
     *     
     */
    public void setOffpointDetail(LocationTypeI2784C value) {
        this.offpointDetail = value;
    }

    /**
     * Gets the value of the companyDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI2785C }
     *     
     */
    public CompanyIdentificationTypeI2785C getCompanyDetail() {
        return companyDetail;
    }

    /**
     * Sets the value of the companyDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI2785C }
     *     
     */
    public void setCompanyDetail(CompanyIdentificationTypeI2785C value) {
        this.companyDetail = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI2786C }
     *     
     */
    public ProductIdentificationDetailsTypeI2786C getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI2786C }
     *     
     */
    public void setProductDetails(ProductIdentificationDetailsTypeI2786C value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the typeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public ProductTypeDetailsTypeI getTypeDetail() {
        return typeDetail;
    }

    /**
     * Sets the value of the typeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public void setTypeDetail(ProductTypeDetailsTypeI value) {
        this.typeDetail = value;
    }

    /**
     * Gets the value of the processingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingIndicator() {
        return processingIndicator;
    }

    /**
     * Sets the value of the processingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingIndicator(String value) {
        this.processingIndicator = value;
    }

}
