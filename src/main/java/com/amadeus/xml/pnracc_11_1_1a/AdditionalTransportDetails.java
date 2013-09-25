
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning a means of transport.
 * 
 * <p>Java class for AdditionalTransportDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalTransportDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="terminalInformation" type="{http://xml.amadeus.com/PNRACC_11_1_1A}TerminalInformationTypeU" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalTransportDetails", propOrder = {
    "terminalInformation"
})
public class AdditionalTransportDetails {

    @XmlElement(required = true)
    protected List<TerminalInformationTypeU> terminalInformation;

    /**
     * Gets the value of the terminalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminalInformationTypeU }
     * 
     * 
     */
    public List<TerminalInformationTypeU> getTerminalInformation() {
        if (terminalInformation == null) {
            terminalInformation = new ArrayList<TerminalInformationTypeU>();
        }
        return this.terminalInformation;
    }

}
