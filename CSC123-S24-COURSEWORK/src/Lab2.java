
public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//exercise 1 
		System.out.println("exercise 1:");
		byte b = 5;
		short s = 200;
		int i = 4789;
		long l = 56723;
		
		System.out.println(" byte: "+ b +"\n short :"+ s + "\n int: "+ i +" \n long:"+ l);
		
		float fl = 25.3357896789F;
		double d = 25.3357896789;
		
		System.out.println(" float: "+ fl + "\n double: "+d);
		
		boolean b2 = true;
		char c2 = 't';
		
		System.out.println("boolean: "+ b2 + "\n char: "+ c2);
		
	// exercise 2	
		System.out.println();
		System.out.println("exercise 2:");
		// int takes on byte value and long takes on short value
		i = b;
		l = s;
		
		System.out.println(" int: "+i);
		System.out.println(" long: "+ l);
		
		d = (int)d;
		fl = (short)fl;
		
		System.out.println(" float: "+ fl + "\n double: "+d);
		
		int i2 = 35;
		int i3 = 36;
		
		//error
		//i2 = (boolean)i2;
		i3 = (char)i3;
		System.out.println(i3);
		
	//exercise 3 
		
	int i4 = Integer.MAX_VALUE;
	int i5 = Integer.MIN_VALUE;
	
	byte b4 = Byte.MAX_VALUE;
	byte b5 = Byte.MIN_VALUE;
	
	short s4 = Short.MAX_VALUE;
	short s5 = Short.MIN_VALUE;
	
	long l4 = Long.MAX_VALUE;
	long l5 = Long.MIN_VALUE;
	
	float f4 = Float.MAX_VALUE;
	float f5 = Float.MIN_VALUE;
	
	double d4 = Double.MAX_VALUE;
	double d5 = Double.MIN_VALUE;
	
	
	System.out.println("byte max value: "+b4 + " byte min value: " +b5);
	System.out.println("short max value: "+s4 + " short min value: " +s5);
	System.out.println("int max value: "+i4 + " int min value: " +i5);
	System.out.println("long max value: "+l4 + " long min value: " +l5);
	System.out.println("float max value: "+f4 + " float min value: " +f5);
	System.out.println("double max value: "+d4 + " double min value " +d5);
	
	System.out.println(++i4 +" "+ --i5);
	// wraps around to the opposite end of the spectrum
	
	//exercise 4
	
	double test1 = 25.5;
	int test3 = 10;
	
	System.out.println(test1+test3);
	
	//comes out double ^and is an addition of the two
	}

}
