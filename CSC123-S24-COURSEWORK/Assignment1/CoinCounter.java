// Gerber Gonzalez ggonzalez332@toromail.csudh.org
import java.util.*;
public class CoinCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.print("Please enter the number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.print("Please enter the number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Please enter the number of quarters: ");
        int quarters = scanner.nextInt();
        
        int totalCents = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);
        
        int dollars = totalCents / 100;
        int cents = totalCents % 100;
        
        System.out.println("You have " + dollars + " dollars and " + cents + " cents.");
        
        scanner.close();
	}
}
