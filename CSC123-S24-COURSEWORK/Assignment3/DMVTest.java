import java.text.*;
import java.util.*;
public class DMVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String fName = in.nextLine();
		
		System.out.println("Enter your last name");
		String lName = in.nextLine();
		
		System.out.println("Enter your address");
		String address = in.nextLine();
		
		System.out.println("Enter your city");
		String city = in.nextLine();
		
		System.out.println("Enter your state");
		String state = in.nextLine();
		
		System.out.println("Enter your zip");
		String zip = in.nextLine();
		
		
		
		System.out.println("Enter your vin");
		String vin = in.nextLine();
		
		System.out.println("Enter the date of manufacture in mm/dd/yyyy format");
		String dateOfMfg = in.nextLine();
		
		System.out.println("Enter your make");
		String make = in.nextLine();
		
		System.out.println("Enter your model");
		String model = in.nextLine();
		
		System.out.println("Enter your car color ");
		String color = in.nextLine();
		
		System.out.println("Enter the number of doors on the car");
		int numOfDoors = in.nextInt();
		
		try {
			Owner owner1 = new Owner(fName,lName,address,city,state,zip);
			Owner owner2 = new Owner("Will","ferrel","101 MilkyWay","Houston","texas","90345");
			
		Vehicle vehicle1 = new Vehicle(vin,dateOfMfg,make,model,color,numOfDoors);
		Vehicle vehicle2 = new Vehicle("31324","08/04/1998","ford","f150","gray",4);
		DMV dmv = new DMV("Texas");
		
		
		dmv.registerVehicle(123,"12/08/2004","11/05/2006",vehicle1,"aoidai",owner1);
		dmv.registerVehicle(23154, "01/01/2000", "12/12/2012", vehicle2, "TVE34TR", owner2);
		dmv.registerCitation("12/10/2001",25435,222.34,"Unpaid",dmv.registration.get(1));
		dmv.registerVehicle(23154, "02/02/02", "03/03/03", vehicle2,"TVE34TR", owner2);
		
		dmv.registerCitation("6/20/2002",14414,444.68,"Unpaid",dmv.registration.get(1));
		dmv.listCitations("TVE34TR");
		//dmv.listRegistrations();
		
		}
		catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		catch(DMVException e) {
			System.out.println(e.getMessage());
		}
	}

}
