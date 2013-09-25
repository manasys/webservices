
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the Detailed Payment Data associated to a MOP
 * 
 * <p>Java class for DetailedPaymentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetailedPaymentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}FormOfPayment_94499S"/>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
 *         &lt;element name="creditCardDetailedData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CreditCardStatusGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedPaymentDataType", propOrder = {
    "fopInformation",
    "dummy",
    "creditCardDetailedData"
})
public class DetailedPaymentDataType {

    @XmlElement(required = true)
    protected FormOfPayment94499S fopInformation;
    @XmlElement(required = true)
    protected DummySegment dummy;
    protected CreditCardStatusGroupType creditCardDetailedData;

    /**
     * Gets the value of the fopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment94499S }
     *     
     */
    public FormOfPayment94499S getFopInformation() {
        return fopInformation;
    }

    /**
     * Sets the value of the fopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment94499S }
     *     
     */
    public void setFopInformation(FormOfPayment94499S value) {
        this.fopInformation = value;
    }

    /**
     * Gets the value of the dummy property.
     * 
     * @return
     *     possible object is
     *     {@link DummySegment }
     *     
     */
    public DummySegment getDummy() {
        return dummy;
    }

    /**
     * Sets the value of the dummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DummySegment }
     *     
     */
    public void setDummy(DummySegment value) {
        this.dummy = value;
    }

    /**
     * Gets the value of the creditCardDetailedData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardStatusGroupType }
     *     
     */
    public CreditCardStatusGroupType getCreditCardDetailedData() {
        return creditCardDetailedData;
    }

    /**
     * Sets the value of the creditCardDetailedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardStatusGroupType }
     *     
     */
    public void setCreditCardDetailedData(CreditCardStatusGroupType value) {
        this.creditCardDetailedData = value;
    }

}
