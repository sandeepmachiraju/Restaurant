import java.util.Date;
import java.util.Scanner;

/* Name: Srinivasa Sai Sandeep Machiraju
   Date: Nov 5, 2016
   Description:(This class is of abstract form)
    This class stores all the details about the customer that includes firstname,lastname, address and card details.
    It has orderFood() and pickup() functions called by waiters in waiter class
    This class ask the waiter for food() and waiter will orderFood to chef. Then waiter serves the food to customer. Finally customer pays the amount
 */

public class Customer {
 String cFirstName;
 String cLastName;
 String cStreet;
 String cCity;
 String cState;
 String cZip;
 String ccreditCardType;
 String ccreditCardNumber;
 String cnameOnCreditCard;
 Date expirationDate;
 Waiter w1;
 
public Customer(String cFirstName, String cLastName, String cStreet,
		String cCity, String cState, String cZip, String ccreditCardType,
		String ccreditCardNumber, String cnameOnCreditCard, Date expirationDate) {
	super();
	this.cFirstName = cFirstName;
	this.cLastName = cLastName;
	this.cStreet = cStreet;
	this.cCity = cCity;
	this.cState = cState;
	this.cZip = cZip;
	this.ccreditCardType = ccreditCardType;
	this.ccreditCardNumber = ccreditCardNumber;
	this.cnameOnCreditCard = cnameOnCreditCard;
	this.expirationDate = expirationDate;
}

 

public static void main(String[] args)
{
	System.out.println("Welcome to MYHotel");
	System.out.println("Enter your Name as (first name and last name)");
	Scanner sc = new Scanner(System.in);
	String name[] = sc.nextLine().split(" ");
	Customer c1 = new Customer(name[0],name[1],"300 cyberonics blvd","Houston","US","77058","","","",new Date());
	System.out.println("Welcome "+c1.cFirstName);
	c1.w1 = new Waiter("","Kriss","","","","","",new Date(),10,"","");
	c1.w1.order("Chicken Noodles, chicken soup and coke");
	c1.w1.servefood();
	c1.pay();
	sc.close();

}

public void pay()
{
	// pays the amount
	System.out.println("Done");
	System.out.println("Please pay the amount");
}
}
