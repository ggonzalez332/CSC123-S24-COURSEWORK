import java.text.*;
import java.util.*;
public class Registration {
	
	private int uniqueId ;
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	private Date startDate;
	private Date endDate;
	private ArrayList<Owner> owners; 
	private Vehicle vehicle ;
	private String plate;
	
	public Registration(int uniqueId, String startDate, String endDate, Vehicle vehicle, String plate) throws ParseException {
		this.uniqueId = uniqueId;
		this.startDate = sdf.parse(startDate);
		this.endDate = sdf.parse(endDate);
		owners = new ArrayList< Owner>();
		this.vehicle = vehicle;
		this.plate = plate;
	}
	
	public int getUniqueId() {
		return uniqueId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public ArrayList<Owner> getOwner() {
		return owners;
	}
	public void addOwner(Owner o) {
		owners.add(o);
	}
	public void removeOwner(Owner o) {
		owners.remove(o);
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	@Override
	public String toString() {
		return "uniqueId: " + uniqueId + ", startDate: " + startDate + ", endDate: "
				+ endDate + ", owner: " + getOwner() + ", vehicle: " + vehicle + ", plate: " + plate;
	}
	
	
	
}
