
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the segment marriages and connections
 * 
 * <p>Java class for SegmentGroupingInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentGroupingInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupingCode" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="marriageDetail" type="{http://xml.amadeus.com/PNRACC_11_1_1A}ReferencingDetailsType_2780C" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentGroupingInformation", propOrder = {
    "groupingCode",
    "marriageDetail"
})
public class SegmentGroupingInformation {

    @XmlElement(required = true)
    protected String groupingCode;
    protected List<ReferencingDetailsType2780C> marriageDetail;

    /**
     * Gets the value of the groupingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    /**
     * Sets the value of the groupingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupingCode(String value) {
        this.groupingCode = value;
    }

    /**
     * Gets the value of the marriageDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marriageDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarriageDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencingDetailsType2780C }
     * 
     * 
     */
    public List<ReferencingDetailsType2780C> getMarriageDetail() {
        if (marriageDetail == null) {
            marriageDetail = new ArrayList<ReferencingDetailsType2780C>();
        }
        return this.marriageDetail;
    }

}
