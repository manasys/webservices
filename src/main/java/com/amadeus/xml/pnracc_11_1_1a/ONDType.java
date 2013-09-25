
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey OND informations
 * 
 * <p>Java class for ONDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ONDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="yieldInformations" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MonetaryInformation_76537S"/>
 *         &lt;element name="classCombinaison" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ProductInformation_76271S" minOccurs="0"/>
 *         &lt;element name="ondyield" type="{http://xml.amadeus.com/PNRACC_11_1_1A}OriginAndDestinationDetails_76268S"/>
 *         &lt;element name="tripOnD" type="{http://xml.amadeus.com/PNRACC_11_1_1A}OriginAndDestinationDetails_76268S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ONDType", propOrder = {
    "yieldInformations",
    "classCombinaison",
    "ondyield",
    "tripOnD"
})
public class ONDType {

    @XmlElement(required = true)
    protected MonetaryInformation76537S yieldInformations;
    protected ProductInformation76271S classCombinaison;
    @XmlElement(required = true)
    protected OriginAndDestinationDetails76268S ondyield;
    protected OriginAndDestinationDetails76268S tripOnD;

    /**
     * Gets the value of the yieldInformations property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformation76537S }
     *     
     */
    public MonetaryInformation76537S getYieldInformations() {
        return yieldInformations;
    }

    /**
     * Sets the value of the yieldInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformation76537S }
     *     
     */
    public void setYieldInformations(MonetaryInformation76537S value) {
        this.yieldInformations = value;
    }

    /**
     * Gets the value of the classCombinaison property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformation76271S }
     *     
     */
    public ProductInformation76271S getClassCombinaison() {
        return classCombinaison;
    }

    /**
     * Sets the value of the classCombinaison property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformation76271S }
     *     
     */
    public void setClassCombinaison(ProductInformation76271S value) {
        this.classCombinaison = value;
    }

    /**
     * Gets the value of the ondyield property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetails76268S }
     *     
     */
    public OriginAndDestinationDetails76268S getOndyield() {
        return ondyield;
    }

    /**
     * Sets the value of the ondyield property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetails76268S }
     *     
     */
    public void setOndyield(OriginAndDestinationDetails76268S value) {
        this.ondyield = value;
    }

    /**
     * Gets the value of the tripOnD property.
     * 
     * @return
     *     possible object is
     *     {@link OriginAndDestinationDetails76268S }
     *     
     */
    public OriginAndDestinationDetails76268S getTripOnD() {
        return tripOnD;
    }

    /**
     * Sets the value of the tripOnD property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginAndDestinationDetails76268S }
     *     
     */
    public void setTripOnD(OriginAndDestinationDetails76268S value) {
        this.tripOnD = value;
    }

}
