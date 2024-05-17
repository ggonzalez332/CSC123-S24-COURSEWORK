// Gerber Gonzalez ggonzalez332@toromail.csudh.org
import java.text.*;
import java.util.*;
public class Citation {

	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	private Date date = new Date();
	private int offenceCode;
	private double amount;
	private String status;
	private Registration registration;
	
	public Citation(String date, int offenceCode, double amount, String status, Registration registration) throws ParseException {
		this.date = sdf.parse(date);
		this.offenceCode = offenceCode;
		this.amount = amount;
		this.status = status;
		this.registration = registration;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public int getOffenceCode() {
		return offenceCode;
	}

	public double getAmount() {
		return amount;
	}
	
	
	public String toString(){
		return "Date: " + getDate()+ " ,Offence Code: " + getOffenceCode()+ " ,Amount : "+ getAmount() + " ,Status: "+ getStatus()
		+ " ,Registration: " + getRegistration();
	}
}
