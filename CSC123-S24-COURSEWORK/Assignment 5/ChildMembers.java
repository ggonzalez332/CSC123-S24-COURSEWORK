import java.text.ParseException;

public class ChildMembers extends Members{
	AdultMembers adult;
	
	public ChildMembers(String firstName, String lastName, String dateOfBirth, String city, int zipCode) throws ParseException {
		super(firstName,lastName,dateOfBirth,city,zipCode);
		
	}
}
