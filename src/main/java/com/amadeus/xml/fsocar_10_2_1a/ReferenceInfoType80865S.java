
package com.amadeus.xml.fsocar_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific reference identification for a traveller.
 * 
 * <p>Java class for ReferenceInfoType_80865S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInfoType_80865S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referencingDetail" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}ReferencingDetailsType_120787C" maxOccurs="200" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInfoType_80865S", propOrder = {
    "referencingDetail"
})
public class ReferenceInfoType80865S {

    protected List<ReferencingDetailsType120787C> referencingDetail;

    /**
     * Gets the value of the referencingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferencingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencingDetailsType120787C }
     * 
     * 
     */
    public List<ReferencingDetailsType120787C> getReferencingDetail() {
        if (referencingDetail == null) {
            referencingDetail = new ArrayList<ReferencingDetailsType120787C>();
        }
        return this.referencingDetail;
    }

}
