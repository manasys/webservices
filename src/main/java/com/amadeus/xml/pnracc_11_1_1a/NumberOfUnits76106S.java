
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Group PNR counters
 * 
 * <p>Java class for NumberOfUnits_76106S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnits_76106S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}NumberOfUnitDetailsTypeI" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnits_76106S", propOrder = {
    "quantityDetails"
})
public class NumberOfUnits76106S {

    @XmlElement(required = true)
    protected List<NumberOfUnitDetailsTypeI> quantityDetails;

    /**
     * Gets the value of the quantityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfUnitDetailsTypeI }
     * 
     * 
     */
    public List<NumberOfUnitDetailsTypeI> getQuantityDetails() {
        if (quantityDetails == null) {
            quantityDetails = new ArrayList<NumberOfUnitDetailsTypeI>();
        }
        return this.quantityDetails;
    }

}
