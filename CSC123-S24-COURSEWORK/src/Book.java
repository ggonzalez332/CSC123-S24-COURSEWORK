
public class Book {

private static String publishingCompany = "Pearson";
private String ISBN;
private int  pages;
private String author;
private int amazonRank;

public Book(String ISBN, int pages, String author){
	this.ISBN = ISBN;
	this.pages = pages;
	this.author = author;
	publishingCompany = "Pearson";
	
}

public Book(String ISBN, String author){
	this.ISBN = ISBN;
	this.author = author;
	publishingCompany = "Pearson";
	
}
public String getISBN() {
	return ISBN;
}

public int getNumberPages() {
	return pages;
}

public String getAuthor() {
	return author;
}

public int getAmazonRank() {
	return amazonRank;
}

public void setAmazonRank(int amazonRank) {
	this.amazonRank = amazonRank;
}

public Book createClone(Book b) {
	Book b1 = new Book(b.getISBN(), b.getNumberPages(),getAuthor() );
		b1.setAmazonRank(b.getAmazonRank());
		return b1;
}
public boolean equals(Book b) {
	return ((this.pages == b.getNumberPages())&& (author.equals(b.getAuthor())) && (amazonRank == b.getAmazonRank()));
		
}

public String toString() {
	return publishingCompany + ":"+ ISBN + ":"+ getNumberPages()+ ":"+ getAuthor() + ":" + getAmazonRank() ;
}
}
