// Gerber Gonzalez ggonzalez332@toromail.csudh.org
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class NetHook extends AbstractCurrencyLoader {

    private static final String EXCHANGE_RATE_URL = "http://www.usman.cloud/banking/exchange-rate.csv";

    @Override
    public InputStream getStream() {
    	try {
        URL url = new URL(EXCHANGE_RATE_URL);
        URLConnection connection = url.openConnection();
        return connection.getInputStream();
    	}
    	catch(Exception e) {
    		System.out.println(e.getStackTrace());
    	}
    	return null;
    }

    @Override
    public Map<String, MyCurrency> loadCurrencies() throws Exception  {
        Map<String, MyCurrency> currencyMap = new HashMap<>();
        try (InputStream inputStream = getStream()) {
            System.out.println("The data has been retrieved successfully from the network.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) { 
                    String currencyName = parts[0].trim(); 
                    double exchangeRate = Double.parseDouble(parts[2].trim()); 
                    currencyMap.put(currencyName,new MyCurrency(currencyName, exchangeRate));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from network: " + e.getMessage());
            throw e;
        }
        return currencyMap;
    }
}