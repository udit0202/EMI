package idlestudio.emicalculator.common;

/**
 * Created by ujain on 2/21/15.
 */
public  class EMIHelper {

    public static Double calculateEMI(Long principalAmount, float rateOfInterest, Long downPayment, int tenureInMonths) {
        Double emi=(principalAmount * (rateOfInterest/(12*100)))*((Math.pow((1+(rateOfInterest/(12*100))),tenureInMonths)))/((Math.pow((1+(rateOfInterest/(12*100))),tenureInMonths)-1));
        return emi;
    }
}
