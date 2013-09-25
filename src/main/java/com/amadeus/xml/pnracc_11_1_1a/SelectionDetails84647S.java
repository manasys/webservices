
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details for making a selection.
 * 
 * <p>Java class for SelectionDetails_84647S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetails_84647S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectionDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SelectionDetailsInformationTypeI_128976C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetails_84647S", propOrder = {
    "selectionDetails"
})
public class SelectionDetails84647S {

    @XmlElement(required = true)
    protected SelectionDetailsInformationTypeI128976C selectionDetails;

    /**
     * Gets the value of the selectionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsInformationTypeI128976C }
     *     
     */
    public SelectionDetailsInformationTypeI128976C getSelectionDetails() {
        return selectionDetails;
    }

    /**
     * Sets the value of the selectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsInformationTypeI128976C }
     *     
     */
    public void setSelectionDetails(SelectionDetailsInformationTypeI128976C value) {
        this.selectionDetails = value;
    }

}
