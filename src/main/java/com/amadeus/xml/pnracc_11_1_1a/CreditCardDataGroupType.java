
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all credit card data needed for payment
 * 
 * <p>Java class for CreditCardDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardDataGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditCardDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}CreditCardData"/>
 *         &lt;element name="fortknoxIds" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferenceInformation_94503S" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="cardHolderAddress" type="{http://xml.amadeus.com/PNRACC_11_1_1A}Address_94501S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardDataGroupType", propOrder = {
    "creditCardDetails",
    "fortknoxIds",
    "cardHolderAddress"
})
public class CreditCardDataGroupType {

    @XmlElement(required = true)
    protected CreditCardData creditCardDetails;
    protected List<ReferenceInformation94503S> fortknoxIds;
    protected Address94501S cardHolderAddress;

    /**
     * Gets the value of the creditCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardData }
     *     
     */
    public CreditCardData getCreditCardDetails() {
        return creditCardDetails;
    }

    /**
     * Sets the value of the creditCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardData }
     *     
     */
    public void setCreditCardDetails(CreditCardData value) {
        this.creditCardDetails = value;
    }

    /**
     * Gets the value of the fortknoxIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fortknoxIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFortknoxIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformation94503S }
     * 
     * 
     */
    public List<ReferenceInformation94503S> getFortknoxIds() {
        if (fortknoxIds == null) {
            fortknoxIds = new ArrayList<ReferenceInformation94503S>();
        }
        return this.fortknoxIds;
    }

    /**
     * Gets the value of the cardHolderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address94501S }
     *     
     */
    public Address94501S getCardHolderAddress() {
        return cardHolderAddress;
    }

    /**
     * Sets the value of the cardHolderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address94501S }
     *     
     */
    public void setCardHolderAddress(Address94501S value) {
        this.cardHolderAddress = value;
    }

}
