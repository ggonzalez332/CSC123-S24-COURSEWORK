import java.util.*;
import java.text.*;

public class Person {

	
String fName;
String lName;
String dateOfBirth;
SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

public Person(String fName, String lName,String dateOfBirth) {
	this.fName = fName;
	this.lName=lName;
	this.dateOfBirth = dateOfBirth;
}

public String getFullName() {
	return fName +" " + lName;
}

public int getAge() throws ParseException{
	   
       Date birthDate = sdf.parse(dateOfBirth);
       Date currentDate = new Date();

       long diffInMilliseconds = currentDate.getTime() - birthDate.getTime();
       long ageInYears = diffInMilliseconds / (1000L * 60 * 60 * 24 * 365);

       return (int) ageInYears;
	
	
}
}
