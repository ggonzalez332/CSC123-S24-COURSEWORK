
public class Crocodile extends Animal {
	
	double tailLength;
	public Crocodile(String name, int age, double weight, double tailLength) {
		super(name,age,weight);
		this.tailLength = tailLength;
	}
	@Override
	public String makeSound() {
		return "RRRRRRRRR";
	}
	
	public double getTailLength() {
		return tailLength;
	}
}
