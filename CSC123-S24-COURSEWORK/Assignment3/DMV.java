import java.util.*;
import java.text.*;

public class DMV {
	
	static String state;
	static ArrayList <Registration> registration; 
	static ArrayList <Citation> citation;
	static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	
	public DMV(String state) {
		DMV.state = state;
		registration = new ArrayList<>();
		citation = new ArrayList<>();
	}
	
	public static void registerVehicle(int uniqueId, String startDate, String endDate, Vehicle v,String plate, Owner o)throws ParseException, DMVException{
		for(Citation c : citation) {
			if(c.getRegistration().getPlate().equals(plate)) {
				if(!c.getStatus().equals("Paid")) {
					throw new DMVException("Citation not paid a new registration cannot be made");
				}
				
			}
			
		}
		
		Registration r = new Registration(uniqueId,startDate,endDate,v,plate);
		r.addOwner(o);
		registration.add(r);
	}
	
	public static void registerCitation(String date, int offenceCode, double amount, String status, Registration registration) throws ParseException 
	{

		Citation c = new Citation(date, offenceCode , amount , status, registration);
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
			if(r.getPlate().equals(plate)) {
				System.out.println(r);
			}
			
		}
	}
		public void listRegistrations(Vehicle v) {
			for(Registration r : registration) {
				if(r.getVehicle().equals(v)) {
					System.out.println(r);
				}
				
			}
	}
	public void listCitations() {
		for(Citation c : citation) {
			System.out.println(c);
		}
	}
		public void listCitations(String plate) {
			for(Citation c : citation) {
				if(c.getRegistration().getPlate().equals(plate)) {
					System.out.println(c);
					}
				}	
			}
		public void listCitations(Vehicle v) {
			for(Citation c : citation) {
				if(c.getRegistration().getVehicle().equals(v)) {
					System.out.println(c);
				}
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
	
	 public Registration searchRegistrationByOwner(String firstName, String lastName) throws NoSuchElementException {
	        for (Registration r : registration) {
	            ArrayList<Owner> owners = r.getOwner();
	            for (Owner owner : owners) {
	                if (owner.getFirstName().equals(firstName) && owner.getLastName().equals(lastName)) {
	                    return r;
	                }
	            }
	        }
	        throw new NoSuchElementException("No registration found with given owner: " + firstName + " " + lastName);
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
