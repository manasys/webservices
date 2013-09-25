
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of application error within a message.
 * 
 * <p>Java class for ApplicationErrorInformation_94519S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationErrorInformation_94519S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ApplicationErrorDetailType_142136C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationErrorInformation_94519S", propOrder = {
    "errorDetails"
})
public class ApplicationErrorInformation94519S {

    @XmlElement(required = true)
    protected ApplicationErrorDetailType142136C errorDetails;

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorDetailType142136C }
     *     
     */
    public ApplicationErrorDetailType142136C getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorDetailType142136C }
     *     
     */
    public void setErrorDetails(ApplicationErrorDetailType142136C value) {
        this.errorDetails = value;
    }

}
