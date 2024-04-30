import java.time.LocalDate;
public class Item {
	
	    public String referenceNumber;
	    public String title;
	    public boolean suitableForChildren;
	    public double replacementValue;
	    public String location;
	    public boolean isAvailable;
	    public String loanedToMembershipNumber;
	    public LocalDate dueDate;
		public String type;

	    public Item(String referenceNumber, String title, boolean suitableForChildren, double replacementValue, String location) {
	        this.referenceNumber = referenceNumber;
	        this.title = title;
	        this.suitableForChildren = suitableForChildren;
	        this.replacementValue = replacementValue;
	        this.location = location;
	        this.isAvailable = true;
	        this.type = "";
	    }
	}

