
public class Lion extends Animal{

	boolean mane;
	public Lion(String name, int age, double weight, boolean mane) {
		super(name,age,weight);
		this.mane = mane;
	}
	@Override
	public String makeSound() {
		return "Roar";
	}
	
	public boolean hasMane() {
		return mane;
	}
}
