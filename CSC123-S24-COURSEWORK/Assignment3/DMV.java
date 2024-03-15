import java.util.*;
import java.text.*;

public class DMV {
	
	static String state;
	static ArrayList <Registration> registration; 
	static ArrayList <Citation> citation;
	static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	
	public DMV(String state) {
		this.state = state;
		registration = new ArrayList<>();
		citation = new ArrayList<>();
	}
	//add more parameters
	public static void registerVehicle(Vehicle v,Owner o)throws ParseException, NoSuchElementException{
		
		Registration r = new Registration(0,null,null,v,null);
		r.addOwner(o);
		registration.add(r);
	}
	// add parameters
	public void registerCitation(String plate, double amount) throws ParseException 
	{
		if(r.getVehicle().getMake() == null ||  r.getVehicle().getModel() == null || r.getVehicle().getVin() == null 
				||r.getVehicle().getMake().isEmpty() || r.getVehicle().getModel().isEmpty()|| r.getVehicle().getVin().isEmpty()) {
			
			throw new  NoSuchElementException("No Vehicle found  " + r.getVehicle());
		}
		Citation c = new Citation(null,0,0.0,null,r);
		citation.add(c);
	}
	public void listRegistrations() {
		for(Registration r : registration) {
			System.out.println(r);
		}
	}
	// only list registration for a certain car one owner can have multiple regostrations
	public void listRegistrations(String plate) {
		for(Registration r : registration) {
			System.out.println(r);
		}
	}
	public void listCitations() {
		for(Citation c : citation) {
			System.out.println(c);
		}
	}
	public Registration searchRegistrationByPlate(String p) throws NoSuchElementException {
		for(Registration r : registration) {
			if(r.getPlate().equals(p)) {
				return r;
			}
		}
		 throw new NoSuchElementException("No registration found with plate number: " + p);
	}
	public Registration searchRegistrationByID(int id) throws NoSuchElementException {
		for(Registration r : registration) {
			if(r.getUniqueId()==id) {
				return r;
			}
		}
		 throw new NoSuchElementException("No registration found with unique id: " + id);
	}
	
	public Registration searchRegistrationByOwner(Owner o) throws NoSuchElementException {
		 for (Registration r : registration) {
		        ArrayList<Owner> owners = r.getOwner();
		        for (Owner owner : owners) {
		            if (owner.getAddress().equals(o.getAddress()) && owner.getFirstName().equals(o.getFirstName())
		            		&& owner.getLastName().equals(o.getLastName()) ) {
		                return r;
		            }
		        }
		    }
		 throw new NoSuchElementException("No registration found with given owner: " + o);
	}
	public Citation searchCitationbyRegistration(Registration r) throws NoSuchElementException {
		 for (Citation c : citation) {
		        if(c.getRegistration().getUniqueId() == r.getUniqueId() && c.getRegistration().getPlate() == r.getPlate()) {
		        	return c;
		      
		        }
		    }
		 throw new NoSuchElementException("No citation found with given registration: " + r);
	}
}
