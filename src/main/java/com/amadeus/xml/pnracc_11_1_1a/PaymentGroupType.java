
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic group to convey payment related data
 * 
 * <p>Java class for PaymentGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupUsage" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CodedAttribute"/>
 *         &lt;element name="paymentData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}PaymentDataGroupType" minOccurs="0"/>
 *         &lt;element name="paymentSupplementaryData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CodedAttribute_94497S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="mopInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MeanOfPaymentDataType" minOccurs="0"/>
 *         &lt;element name="dummy" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DummySegment"/>
 *         &lt;element name="mopDetailedData" type="{http://xml.amadeus.com/PNRACC_11_1_1A}DetailedPaymentDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentGroupType", propOrder = {
    "groupUsage",
    "paymentData",
    "paymentSupplementaryData",
    "mopInformation",
    "dummy",
    "mopDetailedData"
})
public class PaymentGroupType {

    @XmlElement(required = true)
    protected CodedAttribute groupUsage;
    protected PaymentDataGroupType paymentData;
    protected List<CodedAttribute94497S> paymentSupplementaryData;
    protected MeanOfPaymentDataType mopInformation;
    @XmlElement(required = true)
    protected DummySegment dummy;
    protected DetailedPaymentDataType mopDetailedData;

    /**
     * Gets the value of the groupUsage property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttribute }
     *     
     */
    public CodedAttribute getGroupUsage() {
        return groupUsage;
    }

    /**
     * Sets the value of the groupUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttribute }
     *     
     */
    public void setGroupUsage(CodedAttribute value) {
        this.groupUsage = value;
    }

    /**
     * Gets the value of the paymentData property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDataGroupType }
     *     
     */
    public PaymentDataGroupType getPaymentData() {
        return paymentData;
    }

    /**
     * Sets the value of the paymentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDataGroupType }
     *     
     */
    public void setPaymentData(PaymentDataGroupType value) {
        this.paymentData = value;
    }

    /**
     * Gets the value of the paymentSupplementaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentSupplementaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentSupplementaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttribute94497S }
     * 
     * 
     */
    public List<CodedAttribute94497S> getPaymentSupplementaryData() {
        if (paymentSupplementaryData == null) {
            paymentSupplementaryData = new ArrayList<CodedAttribute94497S>();
        }
        return this.paymentSupplementaryData;
    }

    /**
     * Gets the value of the mopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MeanOfPaymentDataType }
     *     
     */
    public MeanOfPaymentDataType getMopInformation() {
        return mopInformation;
    }

    /**
     * Sets the value of the mopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeanOfPaymentDataType }
     *     
     */
    public void setMopInformation(MeanOfPaymentDataType value) {
        this.mopInformation = value;
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
     * Gets the value of the mopDetailedData property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedPaymentDataType }
     *     
     */
    public DetailedPaymentDataType getMopDetailedData() {
        return mopDetailedData;
    }

    /**
     * Sets the value of the mopDetailedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedPaymentDataType }
     *     
     */
    public void setMopDetailedData(DetailedPaymentDataType value) {
        this.mopDetailedData = value;
    }

}
