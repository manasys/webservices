
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Chidren group
 * 
 * <p>Java class for ChildrenGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildrenGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Quantity_65488S"/>
 *         &lt;element name="referenceForPassenger" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_65487S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildrenGroupType", propOrder = {
    "age",
    "referenceForPassenger"
})
public class ChildrenGroupType {

    @XmlElement(required = true)
    protected Quantity65488S age;
    protected ReferenceInformation65487S referenceForPassenger;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity65488S }
     *     
     */
    public Quantity65488S getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity65488S }
     *     
     */
    public void setAge(Quantity65488S value) {
        this.age = value;
    }

    /**
     * Gets the value of the referenceForPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformation65487S }
     *     
     */
    public ReferenceInformation65487S getReferenceForPassenger() {
        return referenceForPassenger;
    }

    /**
     * Sets the value of the referenceForPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformation65487S }
     *     
     */
    public void setReferenceForPassenger(ReferenceInformation65487S value) {
        this.referenceForPassenger = value;
    }

}
