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
    
public ProductionWorker(String x, String numb, String day, int sh, double pay){
    super(x, numb, day);
    shift = sh;
    rateOfPay = pay;
    
}


    
public ProductionWorker(){
    super();
    shift = DAY_SHIFT;
    rateOfPay = 0;
    
    
}

public void setRateOfPay (double r){
    rateOfPay=r;
}

public void setShift(int s){
    shift = s;
}

public double getRateOfPay(){
    return rateOfPay;
   
}

public int getShift(){
    return shift;
}

public String goString(){
    DecimalFormat money = new DecimalFormat ("#,##0.00");
    
    String info = super.toString();
    
    
    info +="\nShift: ";
    if (shift == DAY_SHIFT){
        info += "Day";
    }else if (shift ==NIGHT_SHIFT){
        info +="Night";
        
    }else{
        info += "INVALID SHIFT NUMBER";
        info +=("\nHourly Pay $ "+ money.format(rateOfPay));
        return 
    }
}

