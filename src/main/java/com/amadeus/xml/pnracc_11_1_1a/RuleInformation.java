
package com.amadeus.xml.pnracc_11_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify rule information and rule status.
 * 
 * <p>Java class for RuleInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleDetailsTypeU_18683C"/>
 *         &lt;element name="ruleStatusDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleStatusTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInformation", propOrder = {
    "ruleDetails",
    "ruleStatusDetails"
})
public class RuleInformation {

    @XmlElement(required = true)
    protected RuleDetailsTypeU18683C ruleDetails;
    protected RuleStatusTypeU ruleStatusDetails;

    /**
     * Gets the value of the ruleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RuleDetailsTypeU18683C }
     *     
     */
    public RuleDetailsTypeU18683C getRuleDetails() {
        return ruleDetails;
    }

    /**
     * Sets the value of the ruleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleDetailsTypeU18683C }
     *     
     */
    public void setRuleDetails(RuleDetailsTypeU18683C value) {
        this.ruleDetails = value;
    }

    /**
     * Gets the value of the ruleStatusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RuleStatusTypeU }
     *     
     */
    public RuleStatusTypeU getRuleStatusDetails() {
        return ruleStatusDetails;
    }

    /**
     * Sets the value of the ruleStatusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleStatusTypeU }
     *     
     */
    public void setRuleStatusDetails(RuleStatusTypeU value) {
        this.ruleStatusDetails = value;
    }

}
