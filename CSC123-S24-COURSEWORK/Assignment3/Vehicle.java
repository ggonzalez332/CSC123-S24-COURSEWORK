import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;

public class Vehicle {

	private String vin;
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	private Date dateOfMfg;
	private String make;
	private String model;
	private String color;
	private int numberOfDoors;
	
	public Vehicle(String vin, String dateOfMfg, String make, String model, String color, int numberOfDoors) throws ParseException {
	
		this.vin = vin;
		this.dateOfMfg = sdf.parse(dateOfMfg);
		this.make = make;
		this.model = model;
		this.color = color;
		this.numberOfDoors = numberOfDoors;
	}

	public Date getDateOfMfg() {
		return dateOfMfg;
	}

	public void setDateOfMfg(Date dateOfMfg) {
		this.dateOfMfg = dateOfMfg;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVin() {
		return vin;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	
	public String toString() {
		return "Vin: "+ getVin()+ ", Date of Mfg: "+ getDateOfMfg()+", Make:"+ getMake() + ", Model:"+ getModel()
		+ ", Number of Doors: "+ getNumberOfDoors();
	}
	
}
