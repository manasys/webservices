
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous, confidential, quality control and invoice remarks.
 * 
 * <p>Java class for MiscellaneousRemarks_211S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousRemarks_211S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_11_1_1A}MiscellaneousRemarkType_151C" minOccurs="0"/>
 *         &lt;element name="individualSecurity" type="{http://xml.amadeus.com/PNRACC_11_1_1A}IndividualSecurityType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousRemarks_211S", propOrder = {
    "remarks",
    "individualSecurity"
})
public class MiscellaneousRemarks211S {

    protected MiscellaneousRemarkType151C remarks;
    protected List<IndividualSecurityType> individualSecurity;

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarkType151C }
     *     
     */
    public MiscellaneousRemarkType151C getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarkType151C }
     *     
     */
    public void setRemarks(MiscellaneousRemarkType151C value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the individualSecurity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualSecurity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualSecurityType }
     * 
     * 
     */
    public List<IndividualSecurityType> getIndividualSecurity() {
        if (individualSecurity == null) {
            individualSecurity = new ArrayList<IndividualSecurityType>();
        }
        return this.individualSecurity;
    }

}
