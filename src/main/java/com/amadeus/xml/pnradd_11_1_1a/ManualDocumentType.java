
package com.amadeus.xml.pnradd_11_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Manual document
 * 
 * <p>Java class for ManualDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManualDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://xml.amadeus.com/PNRADD_11_1_1A}NumericInteger_Length3To3"/>
 *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PNRADD_11_1_1A}NumericInteger_Length10To10"/>
 *         &lt;element name="ticketNumberCd" type="{http://xml.amadeus.com/PNRADD_11_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="lastConjuction" type="{http://xml.amadeus.com/PNRADD_11_1_1A}NumericInteger_Length2To2" minOccurs="0"/>
 *         &lt;element name="lastConjuctionCD" type="{http://xml.amadeus.com/PNRADD_11_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManualDocumentType", propOrder = {
    "companyId",
    "ticketNumber",
    "ticketNumberCd",
    "lastConjuction",
    "lastConjuctionCD"
})
public class ManualDocumentType {

    @XmlElement(required = true)
    protected BigInteger companyId;
    @XmlElement(required = true)
    protected BigInteger ticketNumber;
    protected BigInteger ticketNumberCd;
    protected BigInteger lastConjuction;
    protected BigInteger lastConjuctionCD;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompanyId(BigInteger value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketNumber(BigInteger value) {
        this.ticketNumber = value;
    }

    /**
     * Gets the value of the ticketNumberCd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketNumberCd() {
        return ticketNumberCd;
    }

    /**
     * Sets the value of the ticketNumberCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketNumberCd(BigInteger value) {
        this.ticketNumberCd = value;
    }

    /**
     * Gets the value of the lastConjuction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastConjuction() {
        return lastConjuction;
    }

    /**
     * Sets the value of the lastConjuction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastConjuction(BigInteger value) {
        this.lastConjuction = value;
    }

    /**
     * Gets the value of the lastConjuctionCD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastConjuctionCD() {
        return lastConjuctionCD;
    }

    /**
     * Sets the value of the lastConjuctionCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastConjuctionCD(BigInteger value) {
        this.lastConjuctionCD = value;
    }

}
