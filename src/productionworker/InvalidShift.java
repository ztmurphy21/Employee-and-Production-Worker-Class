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
public class InvalidShift extends Exception {
    /** 
     * Constructor 
     */
    public InvalidShift(){
        super ("Error: Invalid shift number");
    }
}
