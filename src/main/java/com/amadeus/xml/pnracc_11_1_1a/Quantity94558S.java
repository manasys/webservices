
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a pertinent quantity.
 * 
 * <p>Java class for Quantity_94558S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quantity_94558S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}QuantityDetailsTypeI_128962C" maxOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity_94558S", propOrder = {
    "quantityDetails"
})
public class Quantity94558S {

    @XmlElement(required = true)
    protected List<QuantityDetailsTypeI128962C> quantityDetails;

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
     * {@link QuantityDetailsTypeI128962C }
     * 
     * 
     */
    public List<QuantityDetailsTypeI128962C> getQuantityDetails() {
        if (quantityDetails == null) {
            quantityDetails = new ArrayList<QuantityDetailsTypeI128962C>();
        }
        return this.quantityDetails;
    }

}
