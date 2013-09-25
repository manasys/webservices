
package com.amadeus.xml.fsocaq_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number of Units required
 * 
 * <p>Java class for NumberOfUnitsType_80154S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfUnitsType_80154S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unitNumberDetail" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}NumberOfUnitDetailsType_122739C" maxOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfUnitsType_80154S", propOrder = {
    "unitNumberDetail"
})
public class NumberOfUnitsType80154S {

    @XmlElement(required = true)
    protected List<NumberOfUnitDetailsType122739C> unitNumberDetail;

    /**
     * Gets the value of the unitNumberDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitNumberDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitNumberDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfUnitDetailsType122739C }
     * 
     * 
     */
    public List<NumberOfUnitDetailsType122739C> getUnitNumberDetail() {
        if (unitNumberDetail == null) {
            unitNumberDetail = new ArrayList<NumberOfUnitDetailsType122739C>();
        }
        return this.unitNumberDetail;
    }

}
