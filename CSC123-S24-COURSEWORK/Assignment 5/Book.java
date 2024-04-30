

class Book extends Item {
	    public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

		private String author;
	    private String ISBN;
	    private int numberOfPages;

	    public Book(String referenceNumber, String title, boolean suitableForChildren, double replacementValue, String location, String author, String ISBN, int numberOfPages) {
	        super(referenceNumber, title, suitableForChildren, replacementValue, location);
	        this.author = author;
	        this.ISBN = ISBN;
	        this.numberOfPages = numberOfPages;
	        this.type = "Book";
	    }
	}