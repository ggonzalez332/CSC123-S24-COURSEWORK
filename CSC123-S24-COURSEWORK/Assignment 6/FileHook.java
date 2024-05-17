// Gerber Gonzalez ggonzalez332@toromail.csudh.org
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FileHook extends AbstractCurrencyLoader {

	private static final String FILE_PATH = "C:\\Users\\rtaka\\Downloads\\currencies.csv"; 

    @Override
    public InputStream getStream() {
        try {
            return new FileInputStream(new File(FILE_PATH)); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<String, MyCurrency> loadCurrencies() throws Exception {
        Map<String, MyCurrency> currencyMap = new HashMap<>();
        try (InputStream inputStream = getStream()) {
            if (inputStream == null) {
                throw new IOException("Failed to open the file.");
            }
            System.out.println("The data has been retrieved successfully from the file.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) { 
                    String currencyName = parts[0].trim(); 
                    double exchangeRate = Double.parseDouble(parts[2].trim()); 
                    currencyMap.put(currencyName, new MyCurrency(currencyName, exchangeRate));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
            throw e;
        }
        return currencyMap;
    }
}