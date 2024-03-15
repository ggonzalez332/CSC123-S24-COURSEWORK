import java.text.ParseException;
import java.util.ArrayList;
public class DMVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Owner tom = new Owner("Tom","Hanks","1000 FarWay St","Tokyo","Arizona","90100");
		Owner steve = new Owner("Steve","Jobs","1000 FarWay St","Tokyo","Arizona","90100");
		//System.out.println(tom);
		try {
		Vehicle ford = new Vehicle("30911 etc", "12/1/14","Ford","F150","Gray",4);
		//System.out.println(ford);
		//System.out.println(ford.getDateOfMfg());
		//ArrayList<Owner> owner = new ArrayList<>();
		
		Registration r = new Registration(23424,"12/30/1975","09/12/1980",ford,"2ERT4VB");
		r.addOwner(tom);
		r.addOwner(steve);
		//System.out.println(r);
		
		Citation c = new Citation("11/21/2015",14235,300.00,"Unpaid",r);
		System.out.println(c);
		//System.out.println(r.getStartDate());
		}
		catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
