package idlestudio.emicalculator.common;

import java.math.BigDecimal;

/**
 * Created by ujain on 2/21/15.
 */
public  class EMIHelper {

    public static void calculateEMI(BigDecimal principalAmount, float rateOfInterest, BigDecimal downPayment, int tenure) {
        //Double emi=(principalAmount * (rateOfInterest/(12*100)))*((Math.pow((1+(rateOfInterest/(12*100))),tenure)))/((Math.pow((1+(rateOfInterest/(12*100))),tenure)-1));
    }
}
