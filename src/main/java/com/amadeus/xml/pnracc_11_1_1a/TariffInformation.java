
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify tariff details relating to a service or product.
 * 
 * <p>Java class for TariffInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tariffInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformationDetailsTypeI_18728C"/>
 *         &lt;element name="rateInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RateInformationTypeI_18729C" minOccurs="0"/>
 *         &lt;element name="chargeDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AssociatedChargesInformationTypeI_18730C" maxOccurs="30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformation", propOrder = {
    "tariffInfo",
    "rateInformation",
    "chargeDetails"
})
public class TariffInformation {

    @XmlElement(required = true)
    protected TariffInformationDetailsTypeI18728C tariffInfo;
    protected RateInformationTypeI18729C rateInformation;
    protected List<AssociatedChargesInformationTypeI18730C> chargeDetails;

    /**
     * Gets the value of the tariffInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationDetailsTypeI18728C }
     *     
     */
    public TariffInformationDetailsTypeI18728C getTariffInfo() {
        return tariffInfo;
    }

    /**
     * Sets the value of the tariffInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationDetailsTypeI18728C }
     *     
     */
    public void setTariffInfo(TariffInformationDetailsTypeI18728C value) {
        this.tariffInfo = value;
    }

    /**
     * Gets the value of the rateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RateInformationTypeI18729C }
     *     
     */
    public RateInformationTypeI18729C getRateInformation() {
        return rateInformation;
    }

    /**
     * Sets the value of the rateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInformationTypeI18729C }
     *     
     */
    public void setRateInformation(RateInformationTypeI18729C value) {
        this.rateInformation = value;
    }

    /**
     * Gets the value of the chargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedChargesInformationTypeI18730C }
     * 
     * 
     */
    public List<AssociatedChargesInformationTypeI18730C> getChargeDetails() {
        if (chargeDetails == null) {
            chargeDetails = new ArrayList<AssociatedChargesInformationTypeI18730C>();
        }
        return this.chargeDetails;
    }

}
