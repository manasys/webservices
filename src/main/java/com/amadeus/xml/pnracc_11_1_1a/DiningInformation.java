
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify dining preferences
 * 
 * <p>Java class for DiningInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiningInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diningIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DiningIdentificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiningInformation", propOrder = {
    "diningIdentification"
})
public class DiningInformation {

    @XmlElement(required = true)
    protected DiningIdentificationType diningIdentification;

    /**
     * Gets the value of the diningIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DiningIdentificationType }
     *     
     */
    public DiningIdentificationType getDiningIdentification() {
        return diningIdentification;
    }

    /**
     * Sets the value of the diningIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiningIdentificationType }
     *     
     */
    public void setDiningIdentification(DiningIdentificationType value) {
        this.diningIdentification = value;
    }

}
