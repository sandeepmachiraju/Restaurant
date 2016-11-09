import java.util.Date;

/* Name: Srinivasa Sai Sandeep Machiraju
   Date: Nov 5, 2016 
   Description:(This class is of abstract form)
   This class has details about full time waiter which extends the waiter class. 
   The full time will have all qualities/functionalities of waiter and has extended features like annualSalary and union
 */

public class Fulltime extends Waiter{
	
double annualSalary;
boolean union;

public Fulltime(String sSN, String firstName, String lastName, String eStreet,
		String eCity, String eState, String eZip, Date startDate,
		int yearsOfExperience, String weekelySchedule, String tipTotal,
		double annualSalary, boolean union) {
	super(sSN, firstName, lastName, eStreet, eCity, eState, eZip, startDate,
			yearsOfExperience, weekelySchedule, tipTotal);
	this.annualSalary = annualSalary;
	this.union = union;
}


}
