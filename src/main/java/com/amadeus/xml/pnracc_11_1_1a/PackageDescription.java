
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To define the characteristics of a Package (a set of Travel Products sold together).
 * 
 * <p>Java class for PackageDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageType" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="packageDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PackageIdentificationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageDescription", propOrder = {
    "packageType",
    "packageDetails"
})
public class PackageDescription {

    @XmlElement(required = true)
    protected String packageType;
    protected PackageIdentificationType packageDetails;

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the packageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PackageIdentificationType }
     *     
     */
    public PackageIdentificationType getPackageDetails() {
        return packageDetails;
    }

    /**
     * Sets the value of the packageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageIdentificationType }
     *     
     */
    public void setPackageDetails(PackageIdentificationType value) {
        this.packageDetails = value;
    }

}
