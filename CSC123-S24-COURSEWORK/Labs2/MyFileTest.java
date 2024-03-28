import java.io.*;
public class MyFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		try {
//		MyFile f = new MyFile();
//		System.out.println(f);
//		}
//		catch(IOException e){
//			System.out.println(e.getMessage());
//		}
		File f = new File("C:\\Users\\rtaka\\hello.txt");
		MyFile mf=new MyFile("C:\\Users\\rtaka\\hello.txt");
		
		//System.out.println(mf);
		
		MyScanner s = new MyScanner(f);
		s.nextLine();
		
		
	}

}
