import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyTest {

	public static void main(String[] args) {

		CurrenciesLab currencyBank = new CurrenciesLab(new FileCurrencyLoader());
		String filePath ="C:\\\\Users\\\\rtaka\\\\Downloads\\\\currencies.csv";
		
		
		//Map <String,Double> curr = new HashMap<String,Double>();
		
//		try {
//		File f = new File(filePath);
//		Scanner sc = new Scanner(f);
//		
//
//		while (sc.hasNextLine()) {
//		    String line = sc.nextLine();
//		    String[] pieces = line.split(",");
//
//	        // Extract the first and third elements
//	        String firstValue = pieces[0];
//	        String thirdValueString = pieces[2]; 
//	        double thirdValue = Double.parseDouble(thirdValueString); 
//		    curr.put(firstValue,thirdValue);
//		    
//		}
//		sc.close();
//		System.out.println(curr);
//		}
//		catch(FileNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("\n\nEnter the currency you are selling: ");
			String currency1 = scanner.nextLine();
			System.out.print("Enter the amount of currency you are selling: ");
			double amount = scanner.nextDouble();

			if (!currencyBank.existsCurrency(currency1)) {
				System.out.println("Currency does not exist");
				continue;
			}

		    System.out.print("You will get USD :"+currencyBank.getCurrency(currency1).convertToUSD(amount));
		}

	}

}