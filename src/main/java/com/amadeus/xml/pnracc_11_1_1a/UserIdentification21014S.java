
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to identify a user.
 * 
 * <p>Java class for UserIdentification_21014S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdentification_21014S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originIdentification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}OriginatorIdentificationDetailsTypeI_37406C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentification_21014S", propOrder = {
    "originIdentification"
})
public class UserIdentification21014S {

    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsTypeI37406C originIdentification;

    /**
     * Gets the value of the originIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI37406C }
     *     
     */
    public OriginatorIdentificationDetailsTypeI37406C getOriginIdentification() {
        return originIdentification;
    }

    /**
     * Sets the value of the originIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI37406C }
     *     
     */
    public void setOriginIdentification(OriginatorIdentificationDetailsTypeI37406C value) {
        this.originIdentification = value;
    }

}
