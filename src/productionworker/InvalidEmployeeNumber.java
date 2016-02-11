/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productionworker;

/**
 *
 * @author Zachary Murphy
 */
public class InvalidEmployeeNumber extends Exception {
    /**
     * Constructor 
     */
    
    public InvalidEmployeeNumber(){
        super("Error: Invalid employee number.");
    }
}
