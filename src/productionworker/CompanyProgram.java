/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productionworker;

import java.util.Scanner;

/**
 *
 * @author Zachary Murphy
 */
public class CompanyProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        //valid 
       createWorker("John Smith" , " 123-A", "11-15-2005", ProductionWorker.DAY_SHIFT, 16.50);
        
        //invalid emp number
        System.out.println("Attemping to make invalid employee number...");
        createWorker("John Smith", "1000001", "11-15-2008", ProductionWorker.DAY_SHIFT, 16.50);
        
        
        //invalid shift
       System.out.println("Attemping to make invalid shift number...");
        createWorker("Bob King", "456", "1-31-1996", 66, 16.50);
        
        
        //invalid pay rate
        System.out.println("Attempting to make a negative pay rate...");
        createWorker("Courtney King", "777", "12-5-1995",ProductionWorker.NIGHT_SHIFT, -15.05);
       
        
     
        
        
    }
    
    public static void createWorker( String x,String  numb, String day,int sh, double r){
        try{
            ProductionWorker pw = new ProductionWorker (x, numb, day, sh, r);
            System.out.println("Object created");
            System.out.println(pw);
        }
        catch (InvalidEmployeeNumber e){
            System.out.println(e.getMessage());
        }
        catch(InvalidShift e){
            System.out.println(e.getMessage());
        }
        catch(InvalidPayRate e){
            System.out.println(e.getMessage());
        }
    }
    
}
