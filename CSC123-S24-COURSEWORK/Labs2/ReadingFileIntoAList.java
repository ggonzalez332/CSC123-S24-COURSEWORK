import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingFileIntoAList {

	public static void main(String[] args)throws FileNotFoundException {
		
		
		String filePath ="C:\\\\Users\\\\rtaka\\\\Downloads\\\\currencies.csv";
		ArrayList<String> str = new ArrayList<String>();
		
		try {
		File f = new File(filePath);
		Scanner sc = new Scanner(f);
		

		while (sc.hasNextLine()) {
		    String line = sc.nextLine();
		    str.add(line); // Process the line as needed	
		}
		sc.close();
		
		for(String s : str) {
			System.out.println(s);
		}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
