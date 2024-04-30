import java.time.LocalDate;



public class Magazine extends Item {
	    private LocalDate publicationDate;
	    private int issueNumber;

	    public Magazine(String referenceNumber, String title, boolean suitableForChildren, double replacementValue, String location, LocalDate publicationDate, int issueNumber) {
	        super(referenceNumber, title, suitableForChildren, replacementValue, location);
	        this.publicationDate = publicationDate;
	        this.issueNumber = issueNumber;
	        this.type = "Magazine";
	    }

		public LocalDate getPublicationDate() {
			return publicationDate;
		}

		public void setPublicationDate(LocalDate publicationDate) {
			this.publicationDate = publicationDate;
		}

		public int getIssueNumber() {
			return issueNumber;
		}

		public void setIssueNumber(int issueNumber) {
			this.issueNumber = issueNumber;
		}
}	    