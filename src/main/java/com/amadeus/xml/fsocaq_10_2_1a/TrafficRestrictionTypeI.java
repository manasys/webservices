
package com.amadeus.xml.fsocaq_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey certain restrictions that apply to a means of transport on all or part of a journey
 * 
 * <p>Java class for TrafficRestrictionTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficRestrictionTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trafficRestrictionDetails" type="{http://xml.amadeus.com/FSOCAQ_10_2_1A}TrafficRestrictionDetailsTypeI" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficRestrictionTypeI", propOrder = {
    "trafficRestrictionDetails"
})
public class TrafficRestrictionTypeI {

    protected List<TrafficRestrictionDetailsTypeI> trafficRestrictionDetails;

    /**
     * Gets the value of the trafficRestrictionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trafficRestrictionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrafficRestrictionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficRestrictionDetailsTypeI }
     * 
     * 
     */
    public List<TrafficRestrictionDetailsTypeI> getTrafficRestrictionDetails() {
        if (trafficRestrictionDetails == null) {
            trafficRestrictionDetails = new ArrayList<TrafficRestrictionDetailsTypeI>();
        }
        return this.trafficRestrictionDetails;
    }

}
