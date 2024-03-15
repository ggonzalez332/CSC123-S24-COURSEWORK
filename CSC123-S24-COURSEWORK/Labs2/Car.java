public class Car {

	String make;
	String model;
	String color;
	boolean isRunning;
	boolean isBrakeApplied;
	String transmission;
	
	public Car(String make, String model,String color, boolean isRunning, boolean isBrakeApplied, String transmission) throws IncompleteCarConfigurationException {
		this.make = make;
		this.model = model;
		this.color= color;
		this.isRunning = isRunning;
		this.isBrakeApplied = isBrakeApplied;
		this.transmission = transmission;
	if(make == null|| make.isEmpty() ) {
		throw new IncompleteCarConfigurationException("Make is mising");
	}
	if( model == null|| model.isEmpty()) {
		throw new IncompleteCarConfigurationException("Model is mising");
	}
	if(color == null || color.isEmpty()) {
		throw new IncompleteCarConfigurationException("Color is mising");
	}
	}
	
	public void start() throws CarAlreadyRunningException,CarNotInParkedException,BrakesNotAppliedException {
		
	if(isRunning == true) {
		throw new CarAlreadyRunningException("Car is already running");
	}
	if(!transmission.equals("P")) {
		throw new CarNotInParkedException("Car is not in Parked");
	}
	if(isBrakeApplied != true) {
		throw new BrakesNotAppliedException("Brakes are not applied");
	}
	isRunning = true;
	}
	public void stop() {
		isRunning =false;
		
		
	}
	
	public void applyBrake(){
		
		isBrakeApplied = true;
	}
	
	public void releaseBrake() {
		isBrakeApplied = false;
	}
	
	public boolean isBrakeApplied() {
		return isBrakeApplied;
	}
	
	public boolean isRunning() {
		return isRunning;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	

	public void setBrakeApplied(boolean isBrakeApplied) {
		this.isBrakeApplied = isBrakeApplied;
	}

	public String getTransmission() {
		return transmission;
	}

	

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}
	
	
}
