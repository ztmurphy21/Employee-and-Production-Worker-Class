/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productionworker;

import java.text.DecimalFormat;

/**
 *
 * @author Zachary Murphy
 */
public class ProductionWorker extends Employee {
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
    private double rateOfPay;
    private int shift;
    
public ProductionWorker(String x, String numb, String day, int sh, double pay) throws IllegalAccessException{
    super(x, numb, day);
    setShift(sh);
   setRateOfPay(pay);
    
}


    
public ProductionWorker(){
    super();
    shift = DAY_SHIFT;
    rateOfPay = 0;
    
    
}

public void setRateOfPay (double r) throws IllegalAccessException{
    if (isValidRateOfPay(r)){
        rateOfPay = r;
    }else{
        throw new IllegalAccessException("Please enter a valid pay rate.");
    }
   
}

public void setShift(int sh) throws isValidShift{
   if( sh < 1 || sh >2){
       throw new InvalidShift();
   }else{
       shift = sh;
   }   

}

private boolean isValidShift(int sh){
    boolean shiftStatus = true;
    if (sh != 1 || sh !=2){
        shiftStatus = false;
}
    return shiftStatus;
}

private boolean isValidRateOfPay(double r){
   
    boolean payStatus = true;
    if(r > 0){
        payStatus = false;
    }
    return payStatus;
}

public double getRateOfPay(){
    return rateOfPay;
   
}

public int getShift(){
    return shift;
}


}

