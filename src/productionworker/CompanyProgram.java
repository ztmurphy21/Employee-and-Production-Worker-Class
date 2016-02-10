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
    public static void main(String[] args) {
        String empName, empNum, hireDate;
        int shift;
        double rateOfPay;
        
        Scanner input = new Scanner (System.in);
        
        
        System.out.println("Please enter your name.");
        empName = input.nextLine();
        
        System.out.println("Please enter employee number.");
        empNum = input.nextLine();
        
        System.out.println("Please enter your start date.");
        hireDate = input.nextLine();
        
        System.out.println("Please enter shift working.");
        shift = input.nextInt();
        
        System.out.println("Please enter your rate of pay.");
        rateOfPay = input.nextDouble();
        
        ProductionWorker worker = new ProductionWorker(empName, empNum, hireDate, shift, rateOfPay);
        
        System.out.println();
        System.out.println("Name: " + worker.getName());
        System.out.println("Employee Number: " + worker.getEmployeeNumber());
        System.out.println("Hire Date: " + worker.getHireDate());
        System.out.println("Rate of Pay: " + worker.getRateOfPay());
        System.out.println("Shift: " + worker.getShift());
        
    }
    
}
