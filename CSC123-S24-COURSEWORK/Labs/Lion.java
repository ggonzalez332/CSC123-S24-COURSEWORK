
public class Lion extends Animal{

	
	public Lion(String name, int age, int weight) {
		super(name,age,weight);
	}
	@Override
	public String makeSound() {
		return "Roar";
	}
}
