import java.text.*;
import java.util.*;
public class DMVTest {

	public static void main(String[] args) throws ParseException, DMVException {
		// TODO Auto-generated method stub
		DMV dmv = new DMV("CA");
		Scanner in = new Scanner(System.in);
		
		while (true) {
            System.out.println("\n1. Register Vehicle");
            System.out.println("2. Register Citation");
            System.out.println("3. List all Registrations");
            System.out.println("4. List all Citations");
            System.out.println("5. List all Registrations for a vehicle");
            System.out.println("6. List all Registrations for a person");
            System.out.println("7. List all Citations for a vehicle");
            System.out.println("8. List all Citations for a person");
            System.out.println("9. Exit");

            System.out.println("Enter your choice: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                	System.out.println("Enter your first name");
                	 String fName = in.nextLine(); // Consume the newline character
                	    fName = in.nextLine();
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
            		Owner owner1 = new Owner(fName,lName,address,city,state,zip);
            		
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
            		 in.nextLine();
            		
            		Vehicle vehicle1 = new Vehicle(vin,dateOfMfg,make,model,color,numOfDoors);
            		System.out.println("Enter your unique ID:");
            		int uniqueId = in.nextInt();
            		 in.nextLine();
            		
            		System.out.println("Enter your license plate:");
            		String plate = in.nextLine();
                    
            		
                    dmv.registerVehicle(uniqueId,"01/01/2000","01/01/2001",vehicle1,plate,owner1);
                    break;
                case 2:
                	System.out.println("What is the date?(MM/dd/yyyy");
                	
                	String cDate =  in.nextLine(); // Consume the newline character
                    
                    cDate =  in.nextLine(); // Read the actual input
                	System.out.println("What is the Offence Code?");
                	int offenceCode =  in.nextInt();
                	
                	System.out.println("What is the amount?");
                	double amount =  in.nextDouble();
                	
                    //dmv.registerCitation(cDate,offenceCode,amount, );
                    break;
                case 3:
                    dmv.listRegistrations();
                    break;
                case 4:
                    dmv.listCitations();
                    break;
                case 5:
                	in.nextLine();
                	System.out.println("Enter your license plate:");
            		 plate = in.nextLine();
                    dmv.listRegistrations(plate);
                    break;
                case 6: 
                    //dmv.listRegistrations(dmv, scanner);
                    break;
                case 7: 
                	System.out.println("Enter your license plate:");
                	plate = in.nextLine();
                   dmv.listCitations(plate);
                    break;
                case 8: 
                   // listCitationsForPerson(dmv, scanner);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
	}

