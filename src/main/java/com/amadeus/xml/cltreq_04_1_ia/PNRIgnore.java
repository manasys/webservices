
package com.amadeus.xml.cltreq_04_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clearInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="actionRequest">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clearInformation"
})
@XmlRootElement(name = "PNR_Ignore")
public class PNRIgnore {

    @XmlElement(required = true)
    protected PNRIgnore.ClearInformation clearInformation;

    /**
     * Gets the value of the clearInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PNRIgnore.ClearInformation }
     *     
     */
    public PNRIgnore.ClearInformation getClearInformation() {
        return clearInformation;
    }

    /**
     * Sets the value of the clearInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRIgnore.ClearInformation }
     *     
     */
    public void setClearInformation(PNRIgnore.ClearInformation value) {
        this.clearInformation = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="actionRequest">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "actionRequest"
    })
    public static class ClearInformation {

        @XmlElement(required = true)
        protected String actionRequest;

        /**
         * Gets the value of the actionRequest property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionRequest() {
            return actionRequest;
        }

        /**
         * Sets the value of the actionRequest property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionRequest(String value) {
            this.actionRequest = value;
        }

    }

}
