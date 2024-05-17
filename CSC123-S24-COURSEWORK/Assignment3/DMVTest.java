import java.text.*;
import java.util.*;

public class DMVTest {

    public static void main(String[] args) throws ParseException, DMVException {
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
                    in.nextLine(); // consume the newline character
                    System.out.println("Enter owner's first name:");
                    String fName = in.nextLine();
                    System.out.println("Enter owner's last name:");
                    String lName = in.nextLine();
                    System.out.println("Enter owner's address:");
                    String address = in.nextLine();
                    System.out.println("Enter owner's city:");
                    String city = in.nextLine();
                    System.out.println("Enter owner's state:");
                    String state = in.nextLine();
                    System.out.println("Enter owner's zip:");
                    String zip = in.nextLine();
                    Owner owner1 = new Owner(fName, lName, address, city, state, zip);
                    
                    System.out.println("Enter vehicle VIN:");
                    String vin = in.nextLine();
                    System.out.println("Enter vehicle date of manufacture (MM/dd/yyyy):");
                    String dateOfMfg = in.nextLine();
                    System.out.println("Enter vehicle make:");
                    String make = in.nextLine();
                    System.out.println("Enter vehicle model:");
                    String model = in.nextLine();
                    System.out.println("Enter vehicle color:");
                    String color = in.nextLine();
                    System.out.println("Enter number of doors:");
                    int numOfDoors = in.nextInt();
                    in.nextLine(); // consume the newline character
                    
                    Vehicle vehicle1 = new Vehicle(vin, dateOfMfg, make, model, color, numOfDoors);
                    
                    System.out.println("Enter registration unique ID:");
                    int uniqueId = in.nextInt();
                    in.nextLine(); // consume the newline character
                    System.out.println("Enter registration start date (MM/dd/yyyy):");
                    String startDate = in.nextLine();
                    System.out.println("Enter registration end date (MM/dd/yyyy):");
                    String endDate = in.nextLine();
                    System.out.println("Enter license plate:");
                    String plate = in.nextLine();
                    
                    dmv.registerVehicle(uniqueId, startDate, endDate, vehicle1, plate, owner1);
                    break;

                case 2:
                    in.nextLine(); // consume the newline character
                    System.out.println("Enter citation date (MM/dd/yyyy):");
                    String cDate = in.nextLine();
                    System.out.println("Enter offence code:");
                    int offenceCode = in.nextInt();
                    System.out.println("Enter amount:");
                    double amount = in.nextDouble();
                    in.nextLine(); // consume the newline character
                    System.out.println("Enter status:");
                    String status = in.nextLine();
                    System.out.println("Enter registration unique ID for citation:");
                    int regId = in.nextInt();
                    in.nextLine(); // consume the newline character
                    Registration regForCitation = dmv.searchRegistrationByID(regId);
                    
                    dmv.registerCitation(cDate, offenceCode, amount, status, regForCitation);
                    break;

                case 3:
                    dmv.listRegistrations();
                    break;

                case 4:
                    dmv.listCitations();
                    break;

                case 5:
                    in.nextLine(); // consume the newline character
                    System.out.println("Enter vehicle license plate:");
                    String plateForReg = in.nextLine();
                    dmv.listRegistrations(plateForReg);
                    break;

                case 6:
                    in.nextLine(); // consume the newline character
                    System.out.println("Enter owner's first name:");
                    String ownerFirstName = in.nextLine();
                    System.out.println("Enter owner's last name:");
                    String ownerLastName = in.nextLine();
                    try {
                        Registration regForOwner = dmv.searchRegistrationByOwner(ownerFirstName, ownerLastName);
                        System.out.println(regForOwner);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    in.nextLine(); // consume the newline character
                    System.out.println("Enter vehicle license plate:");
                    String plateForCitation = in.nextLine();
                    dmv.listCitations(plateForCitation);
                    break;

                case 8:
                    in.nextLine(); // consume the newline character
                    System.out.println("Enter owner's first name:");
                    String citOwnerFirstName = in.nextLine();
                    System.out.println("Enter owner's last name:");
                    String citOwnerLastName = in.nextLine();
                    try {
                        Registration regForCitOwner = dmv.searchRegistrationByOwner(citOwnerFirstName, citOwnerLastName);
                        Citation citation = dmv.searchCitationbyRegistration(regForCitOwner);
                        System.out.println(citation);
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 9:
                    System.out.println("Exiting...");
                    in.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}