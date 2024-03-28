import java.util.Scanner;
import java.util.Stack;
public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Choose a number");
//		int n = in.nextInt();
//		int holder = 0;
//		
//		Stack<Integer> binaryNumber = new Stack<Integer>();
//		
//		while(n >= 1) {
//			holder = n%2;
//			n = n/2;
//			binaryNumber.push(holder);
//		}
//		for(int i = binaryNumber.size(); i > 0 ; i--) {
//			System.out.print(binaryNumber.pop());
//			  }
		
//		int test = 5;
//		System.out.println(test%2);
//		System.out.println(test);
		decimalToBinary(0);
	}
	public static void decimalToBinary(Integer n) {
		
		if(n<0)return;
		
		Stack<Integer> binaryNumber = new Stack<Integer>();
	
		while(n >1) {
			int rem = n%2;
			n = n/2;
			binaryNumber.push(rem);
		}
		binaryNumber.push(n);
		
		while(!binaryNumber.isEmpty()) {
			System.out.print(binaryNumber.pop());
			  
		}
		
		
	}

}
