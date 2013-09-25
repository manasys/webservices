
package com.amadeus.xml.fsocar_10_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information regarding Requested Segments
 * 
 * <p>Java class for OriginAndDestinationRequestType_78552S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginAndDestinationRequestType_78552S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segRef" type="{http://xml.amadeus.com/FSOCAR_10_2_1A}NumericInteger_Length1To2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginAndDestinationRequestType_78552S", propOrder = {
    "segRef"
})
public class OriginAndDestinationRequestType78552S {

    @XmlElement(required = true)
    protected BigInteger segRef;

    /**
     * Gets the value of the segRef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSegRef() {
        return segRef;
    }

    /**
     * Sets the value of the segRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSegRef(BigInteger value) {
        this.segRef = value;
    }

}
