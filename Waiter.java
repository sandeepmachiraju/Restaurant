import java.util.Date;

/* Name: Srinivasa Sai Sandeep Machiraju
   Date: Nov 5, 2016 
   Description:(This class is of abstract form)
   It extends Employee class which has all the common details of employee like name, address. 
   It is main super class where any kind(full time/part time) of waiter has the same functionality like weekly schedule, tip total. He orders the food which was taken from customer to chef.
   Finally he do the pickup from chef and serves the food to customer
 */

public class Waiter extends Employee{
String weekelySchedule;
String tipTotal;
Chef cf1;
public Waiter(String sSN, String firstName, String lastName, String eStreet,
		String eCity, String eState, String eZip, Date startDate,
		int yearsOfExperience, String weekelySchedule, String tipTotal) {
	super(sSN, firstName, lastName, eStreet, eCity, eState, eZip, startDate,
			yearsOfExperience);
	this.weekelySchedule = weekelySchedule;
	this.tipTotal = tipTotal;
}


public void order(String Items)
{
	// taken order and given it to chef
	System.out.println("Ordered Items are:: "+Items);
	this.cf1=new Chef("","Swriss","","","","","",new Date(),10,"",100000);
	this.cf1.orderfood();
	this.cf1.pickup();
}
public void servefood()
{
	//serves the food to customer
	System.out.println("Ordered Items are ready to serve");
}

}
