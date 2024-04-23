import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Library {

	ArrayList<Members> MembersList = new ArrayList<Members>();
	
	
	
public void newMembership(String firstName, String lastName, String dob, String city, int zipCode) {
	
	if(Members.getAge(dob) < 18) {
		 Members n = new AdultMember();
		 Members m = new ChildMembers(firstName,lastName,dob,city,zipCode);
	}
	 Members m = new AdultMembers(firstName,lastName,dob,city,zipCode);
	 
	 
	 MembersList.add(m);
	 m.setMembershipNumber(MembersList.indexOf(m));
}
//public int getAge(String dayBorn) throws ParseException{
//	   
//    Date birthDate = sdf.parse(dayBorn);
//    Date currentDate = new Date();
//
//    long diffInMilliseconds = currentDate.getTime() - birthDate.getTime();
//    long ageInYears = diffInMilliseconds / (1000L * 60 * 60 * 24 * 365);
//
//    return (int) ageInYears;
//	
//	
//}
}
