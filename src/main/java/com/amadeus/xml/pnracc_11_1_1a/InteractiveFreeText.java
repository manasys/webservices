
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide free form or coded text information
 * 
 * <p>Java class for InteractiveFreeText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractiveFreeText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freetextDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FreeTextQualificationTypeI" minOccurs="0"/>
 *         &lt;element name="text" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To70" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractiveFreeText", propOrder = {
    "freetextDetail",
    "text"
})
public class InteractiveFreeText {

    protected FreeTextQualificationTypeI freetextDetail;
    protected List<String> text;

    /**
     * Gets the value of the freetextDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationTypeI }
     *     
     */
    public FreeTextQualificationTypeI getFreetextDetail() {
        return freetextDetail;
    }

    /**
     * Sets the value of the freetextDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationTypeI }
     *     
     */
    public void setFreetextDetail(FreeTextQualificationTypeI value) {
        this.freetextDetail = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getText() {
        if (text == null) {
            text = new ArrayList<String>();
        }
        return this.text;
    }

}
