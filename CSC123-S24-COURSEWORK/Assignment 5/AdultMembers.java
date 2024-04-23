import java.text.ParseException;

public class AdultMembers extends Members {
		
		ChildMembers child;
	public AdultMembers(String firstName, String lastName, String dateOfBirth, String city, int zipCode) throws ParseException {
		super(firstName,lastName,dateOfBirth,city,zipCode);
	}
	
	public ChildMembers getChild() {
		return child;
	}
	public void setChildMember(ChildMembers child) {
		this.child = child;
	}
}
