import java.time.LocalDate;

public class Members {
	    private String membershipNumber;
	    private String firstName;
	    private String lastName;
	    private LocalDate dateOfBirth;
	    private String city;
	    private String zipCode;
	    private boolean isChild;
	    private String guardian;

	    public Members(String membershipNumber, String firstName, String lastName, LocalDate dateOfBirth, String city, String zipCode, boolean isChild, String guardian) {
	        this.setMembershipNumber(membershipNumber);
	        this.setFirstName(firstName);
	        this.setLastName(lastName);
	        this.dateOfBirth = dateOfBirth;
	        this.city = city;
	        this.zipCode = zipCode;
	        this.setChild(isChild);
	        this.guardian = guardian;
	    }

		public String getMembershipNumber() {
			return membershipNumber;
		}

		public void setMembershipNumber(String membershipNumber) {
			this.membershipNumber = membershipNumber;
		}

		public boolean isChild() {
			return isChild;
		}

		public void setChild(boolean isChild) {
			this.isChild = isChild;
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

		public String getGuardian() {
			return guardian;
		}

		public void setGuardian(String guardian) {
			this.guardian = guardian;
		}

		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getZipCode() {
			return zipCode;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

		@Override
		public String toString() {
			return "Members [membershipNumber=" + membershipNumber + ", firstName=" + firstName + ", lastName="
					+ lastName + ", dateOfBirth=" + dateOfBirth + ", city=" + city + ", zipCode=" + zipCode
					+ ", isChild=" + isChild + ", guardian=" + guardian + "]";
		}
		
}