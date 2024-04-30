import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner in = new Scanner(System.in);
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        boolean running = true;
        while (running) {
            System.out.println("\n1 – New Membership");
            System.out.println("2 – Add Material");
            System.out.println("3 – Issue(Rent) Item");
            System.out.println("4 – Return Item");
            System.out.println("5 – Report Inventory");
            System.out.println("6 – Report Loans");
            System.out.println("7 – Lookup Membership");
            System.out.println("8 – Exit");
            System.out.print("Please enter your choice: ");

            int choice = in.nextInt();
         // Consume newline left-over
            in.nextLine();  
            
           
            switch (choice) {
            
            		// New Membership
                	case 1: 
                    System.out.print("Enter First Name: ");
                    String firstName = in.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = in.nextLine();
                    System.out.print("Enter Date of Birth (MM/dd/yyyy): ");
                    LocalDate dateOfBirth = LocalDate.parse(in.nextLine(), dtFormatter);
                    System.out.print("Enter City: ");
                    String city = in.nextLine();
                    System.out.print("Enter Zip Code: ");
                    String zipCode = in.nextLine();

                    String guardian = null;
                    if (dateOfBirth.plusYears(18).isAfter(LocalDate.now())) {
                        System.out.print("Enter Guardian's Name: ");
                        guardian = in.nextLine();
                    }

                    library.newMembership(firstName, lastName, dateOfBirth, city, zipCode, guardian);
                    break;

                    // Add Material
                	case 2:  
                    library.additem(in);
                    break;

                    // Issue Item
                	case 3:  
                    System.out.print("Enter Item Reference Number: ");
                    String itemReference = in.nextLine();
                    System.out.print("Enter Membership Number: ");
                    String membershipNumber = in.nextLine();
                    library.issueItem(itemReference, membershipNumber);
                    break;
                    
                    // Return Item
                	case 4:  
                    library.returnItem(in);
                    break;
                    
                    // Report Inventory
                	case 5:  
                    library.reportInventory();
                    break;

                    // Report Loans
                	case 6:
                    library.reportLoans();
                    break;
                    
                    //Looks up membership
                	case 7: 
                    library.lookupMembership(in);
                    break;
                    
                    // Exit
                	case 8:  
            	   System.out.println("Exiting...");
                    in.close();
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            }
            
        }
    }
