
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR Individual Security element
 * 
 * <p>Java class for IndividualPnrSecurityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualPnrSecurityInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="security" type="{http://xml.amadeus.com/PNRACC_11_1_1A}IndividualSecurityType_3194C" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="securityInfo" type="{http://xml.amadeus.com/PNRACC_11_1_1A}SecurityInformationType" minOccurs="0"/>
 *         &lt;element name="indicator" type="{http://xml.amadeus.com/PNRACC_11_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualPnrSecurityInformation", propOrder = {
    "security",
    "securityInfo",
    "indicator"
})
public class IndividualPnrSecurityInformation {

    protected List<IndividualSecurityType3194C> security;
    protected SecurityInformationType securityInfo;
    protected String indicator;

    /**
     * Gets the value of the security property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the security property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualSecurityType3194C }
     * 
     * 
     */
    public List<IndividualSecurityType3194C> getSecurity() {
        if (security == null) {
            security = new ArrayList<IndividualSecurityType3194C>();
        }
        return this.security;
    }

    /**
     * Gets the value of the securityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInformationType }
     *     
     */
    public SecurityInformationType getSecurityInfo() {
        return securityInfo;
    }

    /**
     * Sets the value of the securityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInformationType }
     *     
     */
    public void setSecurityInfo(SecurityInformationType value) {
        this.securityInfo = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

}
