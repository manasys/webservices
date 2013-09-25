
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a product.
 * 
 * <p>Java class for ProductIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductIdentificationDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentification", propOrder = {
    "productData"
})
public class ProductIdentification {

    @XmlElement(required = true)
    protected ProductIdentificationDetailsTypeU productData;

    /**
     * Gets the value of the productData property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeU }
     *     
     */
    public ProductIdentificationDetailsTypeU getProductData() {
        return productData;
    }

    /**
     * Sets the value of the productData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeU }
     *     
     */
    public void setProductData(ProductIdentificationDetailsTypeU value) {
        this.productData = value;
    }

}
