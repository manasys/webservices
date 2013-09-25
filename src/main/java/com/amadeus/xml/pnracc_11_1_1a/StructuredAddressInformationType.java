
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredAddressInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredAddressInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="option" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To2"/>
 *         &lt;element name="optionText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To50"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredAddressInformationType", propOrder = {
    "option",
    "optionText"
})
public class StructuredAddressInformationType {

    @XmlElement(required = true)
    protected String option;
    @XmlElement(required = true)
    protected String optionText;

    /**
     * Gets the value of the option property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOption() {
        return option;
    }

    /**
     * Sets the value of the option property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOption(String value) {
        this.option = value;
    }

    /**
     * Gets the value of the optionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionText() {
        return optionText;
    }

    /**
     * Sets the value of the optionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionText(String value) {
        this.optionText = value;
    }

}
