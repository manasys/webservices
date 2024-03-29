
package com.amadeus.xml.fsocar_10_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous data by first identifying the type of data to be sent and then the actual data.
 * 
 * <p>Java class for SpecificDataInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificDataInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataTypeInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DataTypeInformationType"/>
 *         &lt;element name="dataInformation" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}DataInformationType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificDataInformationType", propOrder = {
    "dataTypeInformation",
    "dataInformation"
})
public class SpecificDataInformationType {

    @XmlElement(required = true)
    protected DataTypeInformationType dataTypeInformation;
    protected List<DataInformationType> dataInformation;

    /**
     * Gets the value of the dataTypeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeInformationType }
     *     
     */
    public DataTypeInformationType getDataTypeInformation() {
        return dataTypeInformation;
    }

    /**
     * Sets the value of the dataTypeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeInformationType }
     *     
     */
    public void setDataTypeInformation(DataTypeInformationType value) {
        this.dataTypeInformation = value;
    }

    /**
     * Gets the value of the dataInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataInformationType }
     * 
     * 
     */
    public List<DataInformationType> getDataInformation() {
        if (dataInformation == null) {
            dataInformation = new ArrayList<DataInformationType>();
        }
        return this.dataInformation;
    }

}
