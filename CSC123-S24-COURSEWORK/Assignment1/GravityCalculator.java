// Gerber Gonzalez ggonzalez332@toromail.csudh.org
import java.util.*;
public class GravityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 double acceleration = -9.81; 
	     double initialVelocity = 0; 
	     
		 System.out.print("Enter the initial position (height) in meters from where the object was dropped: ");
	     double initialPosition = scanner.nextDouble();

	     System.out.print("Enter the observation time in seconds: ");
	     double observationTime = scanner.nextDouble();

	     double distanceFallen = 0.5 * (acceleration * (observationTime*observationTime)) + initialVelocity * observationTime + initialPosition;

	     double distanceFromGround = initialPosition - distanceFallen;

	     System.out.printf("The object was dropped from %.2f meters and has fallen %.2f meters in %.2f seconds.",initialPosition, distanceFromGround,observationTime);
	        
	     System.out.println();
	     
	     System.out.println("The distance of the object from the ground now is " +   distanceFallen + " meters.");

	        // Close the scanner
	        scanner.close();
	}

}
