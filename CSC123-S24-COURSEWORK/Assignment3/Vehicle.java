// Gerber Gonzalez ggonzalez332@toromail.csudh.org
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
	
	public Vehicle(String vin, String dateOfMfg, String make, String model, String color, int numberOfDoors) throws ParseException, DMVException {
		if(vin == null|| vin.isEmpty() ) {
			throw new DMVException("Vin is mising");
		}
		if(dateOfMfg == null|| dateOfMfg.isEmpty() ) {
			throw new DMVException("Date of manufacturing is mising");
		}
		if(make == null|| make.isEmpty() ) {
			throw new DMVException("Make is mising");
		}
		if(model == null|| model.isEmpty() ) {
			throw new DMVException("Model is mising");
		}
		if(color == null|| color.isEmpty() ) {
			throw new DMVException("Color is mising");
		}
		if(numberOfDoors == 0 ) {
			throw new DMVException("Number of doors is mising");
		}
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
	public boolean equals(Vehicle v) {
        if (this == v) {
            return true;
        }
        if (v == null || getClass() != v.getClass()) {
            return false;
        }
        Vehicle other = (Vehicle)v;
        return model.equals(other.model) &&
                make.equals(other.make) &&
                vin.equals(other.vin);
    }
	public String toString() {
		return "Vin: "+ getVin()+ ", Date of Mfg: "+ getDateOfMfg()+", Make:"+ getMake() + ", Model:"+ getModel()
		+ ", Number of Doors: "+ getNumberOfDoors();
	}
	
}
