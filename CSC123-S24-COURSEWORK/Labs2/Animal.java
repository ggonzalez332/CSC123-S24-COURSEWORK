
public class Animal {
	String name;
	int age;
	double weight;
	
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String makeSound() {
		return "Some generic sound";
	}
	
	public String toString() {
		return "Name:" + getName() +" Age:"+ getAge()+ " Weight:"+ getWeight();
	}
}
