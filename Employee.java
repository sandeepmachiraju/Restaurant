import java.util.Date;

/* Name: Srinivasa Sai Sandeep Machiraju
   Date: Nov 8, 2016 
   Description:(This class is of abstract form)
   It is the super class of waiter and chef. Where all the common details like name,address are saved here
 */

public class Employee {
String SSN;
String firstName;
String lastName;
String eStreet;
String eCity;
String eState;
String eZip;
Date startDate;
int yearsOfExperience;
<<<<<<< HEAD
int salary;  // to calculate salary
=======
float salary;  // to calculate salary
>>>>>>> 68403f96d069671d3d8261d2728936d5052e719c

public Employee(String sSN, String firstName, String lastName, String eStreet,
		String eCity, String eState, String eZip, Date startDate,
		int yearsOfExperience) {
	super();
	SSN = sSN;
	this.firstName = firstName;
	this.lastName = lastName;
	this.eStreet = eStreet;
	this.eCity = eCity;
	this.eState = eState;
	this.eZip = eZip;
	this.startDate = startDate;
	this.yearsOfExperience = yearsOfExperience;
}

	
}
