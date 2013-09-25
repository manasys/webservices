
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify one option
 * 
 * <p>Java class for GeneralOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralOption">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="optionDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}GeneralOptionInformationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralOption", propOrder = {
    "optionDetail"
})
public class GeneralOption {

    @XmlElement(required = true)
    protected GeneralOptionInformationType optionDetail;

    /**
     * Gets the value of the optionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralOptionInformationType }
     *     
     */
    public GeneralOptionInformationType getOptionDetail() {
        return optionDetail;
    }

    /**
     * Sets the value of the optionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralOptionInformationType }
     *     
     */
    public void setOptionDetail(GeneralOptionInformationType value) {
        this.optionDetail = value;
    }

}
