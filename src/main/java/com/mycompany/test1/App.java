package com.mycompany.test1;

import com.amadeus.xml.AmadeusWebServices;
import com.amadeus.xml.fmptbq_10_3_1a.FareMasterPricerTravelBoardSearch;
import com.amadeus.xml.pnradd_11_1_1a.PNRAddMultiElements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AmadeusWebServices aws = new AmadeusWebServices();
        aws.getAmadeusWebServicesPort().fareMasterPricerCalendar(null, null);
        
        System.out.println( "Hello World!" );
    }
}
