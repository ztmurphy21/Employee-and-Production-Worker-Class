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
public class InvalidPayRate extends Exception {
    /** Constructor
     * 
     */
    
    public InvalidPayRate(){
        super("Error: Negative pay rate");
    }
}
