
package com.amadeus.xml.pnracc_11_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify rule information and rule status.
 * 
 * <p>Java class for RuleInformation_84655S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInformation_84655S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleDetails" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleDetailsTypeU" maxOccurs="5"/>
 *         &lt;element name="ruleText" type="{http://xml.amadeus.com/PNRACC_11_1_1A}RuleTextTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInformation_84655S", propOrder = {
    "ruleDetails",
    "ruleText"
})
public class RuleInformation84655S {

    @XmlElement(required = true)
    protected List<RuleDetailsTypeU> ruleDetails;
    protected RuleTextTypeU ruleText;

    /**
     * Gets the value of the ruleDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleDetailsTypeU }
     * 
     * 
     */
    public List<RuleDetailsTypeU> getRuleDetails() {
        if (ruleDetails == null) {
            ruleDetails = new ArrayList<RuleDetailsTypeU>();
        }
        return this.ruleDetails;
    }

    /**
     * Gets the value of the ruleText property.
     * 
     * @return
     *     possible object is
     *     {@link RuleTextTypeU }
     *     
     */
    public RuleTextTypeU getRuleText() {
        return ruleText;
    }

    /**
     * Sets the value of the ruleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleTextTypeU }
     *     
     */
    public void setRuleText(RuleTextTypeU value) {
        this.ruleText = value;
    }

}
