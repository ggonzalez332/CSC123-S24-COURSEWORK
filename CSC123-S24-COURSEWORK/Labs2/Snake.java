
public class Snake extends Animal{
	
	boolean venomous;
	public Snake(String name, int age, double weight, boolean venomous) {
		super(name,age,weight);
		this.venomous = venomous;
	}
	@Override
	public String makeSound() {
		return "Hissssssss";
	}
	
	public boolean isVenomous() {
		return venomous;
	}
	
}
