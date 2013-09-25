
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
 * <p>Java class for TariffInformation_84654S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformation_84654S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tariffInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TariffInformationDetailsTypeI_128977C" minOccurs="0"/>
 *         &lt;element name="chargeDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AssociatedChargesInformationTypeI_128979C" maxOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformation_84654S", propOrder = {
    "tariffInfo",
    "chargeDetails"
})
public class TariffInformation84654S {

    protected TariffInformationDetailsTypeI128977C tariffInfo;
    @XmlElement(required = true)
    protected List<AssociatedChargesInformationTypeI128979C> chargeDetails;

    /**
     * Gets the value of the tariffInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationDetailsTypeI128977C }
     *     
     */
    public TariffInformationDetailsTypeI128977C getTariffInfo() {
        return tariffInfo;
    }

    /**
     * Sets the value of the tariffInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationDetailsTypeI128977C }
     *     
     */
    public void setTariffInfo(TariffInformationDetailsTypeI128977C value) {
        this.tariffInfo = value;
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
     * {@link AssociatedChargesInformationTypeI128979C }
     * 
     * 
     */
    public List<AssociatedChargesInformationTypeI128979C> getChargeDetails() {
        if (chargeDetails == null) {
            chargeDetails = new ArrayList<AssociatedChargesInformationTypeI128979C>();
        }
        return this.chargeDetails;
    }

}
