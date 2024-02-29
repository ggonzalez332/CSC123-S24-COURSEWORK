// Gerber Gonzalez ggonzalez332@toromail.csudh.org
import java.util.*;
public class ChangeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your amount in dollars: ");
        int dollars = scanner.nextInt();

        System.out.print("Please enter your amount in cents: ");
        int cents = scanner.nextInt();

        // Convert dollars to cents
        int totalCents = (dollars * 100) + cents;

        // Calculate the number of coins in each denomination
        int quarters = totalCents / 25;
        int remainingCentsAfterQuarters = totalCents % 25;

        int dimes = remainingCentsAfterQuarters / 10;
        int remainingCentsAfterDimes = remainingCentsAfterQuarters % 10;

        int nickels = remainingCentsAfterDimes / 5;
        int pennies = remainingCentsAfterDimes % 5;

        // Display the result
        System.out.println(dollars + " dollars and " + cents + " cents are:");
        System.out.println(quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");

        // Close the scanner
        scanner.close();
	}

}
