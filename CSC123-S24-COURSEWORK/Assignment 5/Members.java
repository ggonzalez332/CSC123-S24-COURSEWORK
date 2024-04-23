import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Members {
	String firstName;
	String lastName;
	SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YY");
	Date dateOfBirth;
	String city;
	int zipCode;
	int membershipNumber;
	
	public Members(String firstName, String lastName, String dateOfBirth, String city, int zipCode) throws ParseException {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = sdf.parse(dateOfBirth);
		this.city = city;
		this.zipCode = zipCode;
		membershipNumber = 0;
	}
	
	public void setMembershipNumber(int num) {
		membershipNumber = num;
	}
	
	public static int getAge(String dayBorn) throws ParseException{
		   
	       Date birthDate = sdf.parse(dayBorn);
	       Date currentDate = new Date();

	       long diffInMilliseconds = currentDate.getTime() - birthDate.getTime();
	       long ageInYears = diffInMilliseconds / (1000L * 60 * 60 * 24 * 365);

	       return (int) ageInYears;
		
		
	}

	
}
