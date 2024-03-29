
package com.amadeus.xml.pnrxcl_11_1_1a;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amadeus.xml.pnrxcl_11_1_1a package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amadeus.xml.pnrxcl_11_1_1a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PNRCancel }
     * 
     */
    public PNRCancel createPNRCancel() {
        return new PNRCancel();
    }

    /**
     * Create an instance of {@link ReservationControlInformationType }
     * 
     */
    public ReservationControlInformationType createReservationControlInformationType() {
        return new ReservationControlInformationType();
    }

    /**
     * Create an instance of {@link OptionalPNRActionsType }
     * 
     */
    public OptionalPNRActionsType createOptionalPNRActionsType() {
        return new OptionalPNRActionsType();
    }

    /**
     * Create an instance of {@link CancelPNRElementType }
     * 
     */
    public CancelPNRElementType createCancelPNRElementType() {
        return new CancelPNRElementType();
    }

    /**
     * Create an instance of {@link ElementIdentificationType }
     * 
     */
    public ElementIdentificationType createElementIdentificationType() {
        return new ElementIdentificationType();
    }

    /**
     * Create an instance of {@link ReservationControlInformationDetailsTypeI }
     * 
     */
    public ReservationControlInformationDetailsTypeI createReservationControlInformationDetailsTypeI() {
        return new ReservationControlInformationDetailsTypeI();
    }

}
