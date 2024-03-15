public class ZooKeeper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal fish = new Animal("Koi",3,4.3);
		Lion lion1 = new Lion("Blue Lion",5,56,false);
		Crocodile crocodile1 = new Crocodile("Green Crocodile", 11,180.4,30);
		Llama llama1 = new Llama("Pink Llama", 8,240,32);
		Snake snake1 = new Snake ("Red Snake", 7,38,false);
		
		System.out.println(fish.getWeight());
		System.out.println(lion1.hasMane());
		System.out.println(crocodile1.getTailLength());
		System.out.println(llama1.getNeckLength());
		System.out.println(snake1.isVenomous());
		
		System.out.println(fish);
		System.out.println(lion1);
		System.out.println(crocodile1);
		System.out.println(llama1);
		System.out.println(snake1);
		
		Animal newSnake = new Snake("Steve the Snake",6,45,false);
		
		System.out.println(snake1.makeSound());
		System.out.println(newSnake.makeSound());
	}

}
