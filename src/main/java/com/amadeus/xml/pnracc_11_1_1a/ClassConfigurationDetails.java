
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment give the class configuration for a train
 * 
 * <p>Java class for ClassConfigurationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassConfigurationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ClassDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassConfigurationDetails", propOrder = {
    "classDetails"
})
public class ClassConfigurationDetails {

    @XmlElement(required = true)
    protected ClassDetailsType classDetails;

    /**
     * Gets the value of the classDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ClassDetailsType }
     *     
     */
    public ClassDetailsType getClassDetails() {
        return classDetails;
    }

    /**
     * Sets the value of the classDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDetailsType }
     *     
     */
    public void setClassDetails(ClassDetailsType value) {
        this.classDetails = value;
    }

}
