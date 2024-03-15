import java.text.ParseException;

public class PersonDobTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person jim = new Person("Jim","Harper","04/01/2010");
		
		System.out.println(jim.getFullName());
		try {
		System.out.println(jim.getAge());
		}
		catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

}
