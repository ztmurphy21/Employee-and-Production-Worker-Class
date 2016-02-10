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
public class Employee {
    String empName;             
    String empNum;   
    String dateOfHire;         
	   

public Employee(String a, String b, String c){
        empName = a;
	empNum = b;
	 dateOfHire = c;
}


	      
 public Employee(){
        empName = "";
        empNum = "";
         dateOfHire = "";
 }
	   

public void setName(String a){
	empName = a;
        
}


private boolean isValidEmpNum(String b) {
        boolean status = true;
	      
	if (b.length() != 5)
	     status = false;
	         else
	         {
	            if ((!Character.isDigit(b.charAt(0)))  ||
	             	(!Character.isDigit(b.charAt(1)))   ||
	             	(!Character.isDigit(b.charAt(2)))   ||
	             	(b.charAt(3) != '-')                ||
	             	(!Character.isLetter(b.charAt(4)))  ||
	             
	             (!(b.charAt(4)>= 'A' && b.charAt(4)<= 'M')))
	            {
	               status = false;
	            }
	         }
	         return status;
}

 public void setEmployeeNumber(String b){
        if (isValidEmpNum(b))
            
	 {
	  empNum = b;
	  }
	 else
	 {
	 throw new IllegalArgumentException("You must enter a valid employee number."); 
}
}

 public void setHireDate(String c){
	dateOfHire = c;
	      }

 public String getName(){
	 return empName;
}
	
 public String getEmployeeNumber(){
	return empNum;
 }

	   
public String getHireDate(){
	return dateOfHire;
}



public String toString(){
	 String str = "Name: " + empName + "\nEmployee Number: ";
	      
	if (empNum == ""){
             str += "INVALID EMPLOYEE NUMBER";
	         }
	         else
	         {
	            str += empNum;
	         }
	         
	         str += ("\nHire Date: " + dateOfHire);
	         return str;
	      }
}


