
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide free text information.
 * 
 * <p>Java class for InteractiveFreeText_99363S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractiveFreeText_99363S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeTextQualification" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextQualificationTypeI_148295C" minOccurs="0"/>
 *         &lt;element name="freeText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractiveFreeText_99363S", propOrder = {
    "freeTextQualification",
    "freeText"
})
public class InteractiveFreeText99363S {

    protected FreeTextQualificationTypeI148295C freeTextQualification;
    protected String freeText;

    /**
     * Gets the value of the freeTextQualification property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationTypeI148295C }
     *     
     */
    public FreeTextQualificationTypeI148295C getFreeTextQualification() {
        return freeTextQualification;
    }

    /**
     * Sets the value of the freeTextQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationTypeI148295C }
     *     
     */
    public void setFreeTextQualification(FreeTextQualificationTypeI148295C value) {
        this.freeTextQualification = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

}
