
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to specify a system
 * 
 * <p>Java class for SystemDetailsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemDetailsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cascadingSystem" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SystemDetailsTypeI_46415C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemDetailsInfo", propOrder = {
    "cascadingSystem"
})
public class SystemDetailsInfo {

    @XmlElement(required = true)
    protected SystemDetailsTypeI46415C cascadingSystem;

    /**
     * Gets the value of the cascadingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsTypeI46415C }
     *     
     */
    public SystemDetailsTypeI46415C getCascadingSystem() {
        return cascadingSystem;
    }

    /**
     * Sets the value of the cascadingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI46415C }
     *     
     */
    public void setCascadingSystem(SystemDetailsTypeI46415C value) {
        this.cascadingSystem = value;
    }

}
