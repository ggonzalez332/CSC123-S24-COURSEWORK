
public class Llama extends Animal{

	double neckLength;
	
	public Llama(String name, int age, double weight, double neckLength) {
		super(name,age,weight);
		this.neckLength = neckLength;
	}
	@Override
	public String makeSound() {
		return "Baaaaaaaaah";
	}
	public double getNeckLength() {
		return neckLength;
	}
}
