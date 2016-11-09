import java.util.Date;

/* Name: Srinivasa Sai Sandeep Machiraju
   Date: Nov 5, 2016
    Description: (This class is of abstract form)
    This class stores all the details about the chef that includes firstname,lastname, address details.
    It has orderFood() and pickup() functions called by waiters in waiter class
    
    
 */

public class Chef extends Employee{

String culinaryInstituteDegree;
double cannualSallary;

public Chef(String sSN, String firstName, String lastName, String eStreet,
		String eCity, String eState, String eZip, Date startDate,
		int yearsOfExperience, String culinaryInstituteDegree,
		double cannualSallary) {
	super(sSN, firstName, lastName, eStreet, eCity, eState, eZip, startDate,
			yearsOfExperience);
	this.culinaryInstituteDegree = culinaryInstituteDegree;
	this.cannualSallary = cannualSallary;
}
public void orderfood()
{
	
}
public void pickup()
{
	
}

}
