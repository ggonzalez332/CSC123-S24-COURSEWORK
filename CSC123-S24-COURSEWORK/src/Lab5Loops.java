
public class Lab5Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Task 1
			for(int i = 1;i<11;i++){
				System.out.print(i+" ");
			}
			
			System.out.println();
			for(int i = 2;i<11;i+=2){
				System.out.print(i+" ");
			}
			System.out.println();
			for(int i = 1;i<100;i*=3){
				System.out.print(i+" ");
			}
			
		//Task 2
			int x =0;
			while(x< 15 ) {
				System.out.print(x++ +" ");
			}
			
			System.out.println();
			
			x = 1;
			while(x< 150 ) {
				System.out.print((x=x*5) +" ");
			}
			System.out.println();
			
			// Task 3
			for( int i = 1; i< 51; i++) {
				if(i % 2 != 0) {
				System.out.println(i+ ": is Odd");	
				}
				else if(i % 2 != 1) {
					System.out.println(i+ ": is Even");
				}
			}
			
			
			
		
	}

}
