
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
		Car toyota = new Car("Toyata","Camry","Teal",true,false,"R");
		Car ford = new Car("Ford","F150","Gray",false,false,"P");
		Car lamborghini = new Car("Lamborghini",null,null,false,false,"P");
		}
		catch(IncompleteCarConfigurationException e ) {
			System.out.println(e.getMessage());
		}
		
		try {
			Car toyota = new Car("Toyata","Camry","Teal",true,false,"R");
			toyota.start();
		}
		catch (IncompleteCarConfigurationException|BrakesNotAppliedException| CarNotInParkedException|CarAlreadyRunningException e){
			System.out.println(e.getMessage());
		}
		try {
			Car toyota = new Car("Toyata","Camry","Teal",false,false,"R");
			toyota.start();
		}
		catch (IncompleteCarConfigurationException|BrakesNotAppliedException| CarNotInParkedException|CarAlreadyRunningException e){
			System.out.println(e.getMessage());
		}
		try {
			Car toyota = new Car("Toyata","Camry","Teal",false,false,"P");
			toyota.start();
		}
		catch (IncompleteCarConfigurationException|BrakesNotAppliedException| CarNotInParkedException|CarAlreadyRunningException e){
			System.out.println(e.getMessage());
		}
		try {
			Car toyota = new Car("Toyata","Camry","Teal",false,true,"P");
			toyota.start();
			toyota.stop();
			toyota.releaseBrake();
			toyota.applyBrake();
			toyota.setTransmission("R");
		}
		catch (IncompleteCarConfigurationException|BrakesNotAppliedException| CarNotInParkedException|CarAlreadyRunningException e){
			System.out.println(e.getMessage());
		}
	}

}
