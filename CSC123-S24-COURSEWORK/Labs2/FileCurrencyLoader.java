import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCurrencyLoader implements ICurrencyLoader {

	@Override
	public Map<String, Double> loadCurrencies() {
		String filePath ="C:\\\\Users\\\\rtaka\\\\Downloads\\\\currencies.csv";
		Map <String,Double> curr = new HashMap<String,Double>();
		
		try {
		File f = new File(filePath);
		Scanner sc = new Scanner(f);
		

		while (sc.hasNextLine()) {
		    String line = sc.nextLine();
		    String[] pieces = line.split(",");

	        // Extract the first and third elements
	        String firstValue = pieces[0];
	        String thirdValueString = pieces[2]; 
	        double thirdValue = Double.parseDouble(thirdValueString); 
		    curr.put(firstValue,thirdValue);
		    
		}
		sc.close();
		
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		
		}
		return curr;

}
}
