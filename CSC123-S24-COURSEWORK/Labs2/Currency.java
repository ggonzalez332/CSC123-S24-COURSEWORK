import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Currency {

	String currencyCode;
	String currencyName;
	String currencyRate;
	
	public Currency(String currencyCode, String currencyName, String currencyRate) {
		this.currencyCode = currencyCode;
		this.currencyName = currencyName;
		this.currencyRate = currencyRate;
		
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencyRate() {
		return currencyRate;
	}

	public void setCurrencyRate(String currencyRate) {
		this.currencyRate = currencyRate;
	}
	
}
