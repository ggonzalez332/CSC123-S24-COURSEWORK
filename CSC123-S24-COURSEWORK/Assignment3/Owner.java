// Gerber Gonzalez ggonzalez332@toromail.csudh.org
public class Owner {
	
	 
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	public Owner(String firstName, String lastName, String address, String city, String state, String zip) throws DMVException {
		if(firstName == null|| firstName.isEmpty() ) {
			throw new DMVException("First Name is mising");
		}
		if(lastName == null|| lastName.isEmpty() ) {
			throw new DMVException("Last Name is mising");
		}
		if(address == null|| address.isEmpty() ) {
			throw new DMVException("Addresss is mising");
		}
		if(city == null|| city.isEmpty() ) {
			throw new DMVException("City is mising");
		}
		if(state == null|| state.isEmpty() ) {
			throw new DMVException("State is mising");
		}
		if(zip == null|| zip.isEmpty() ) {
			throw new DMVException("Zip is mising");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "First Name:" + getFirstName() + ", Last Name:" + getLastName() + ", Address:" + getAddress() 
				+ ", City:" + getCity() + ", State:" + getState() + ", Zip:" + getZip() ;
	}
	
}
