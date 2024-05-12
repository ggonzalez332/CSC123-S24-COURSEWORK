
public class CoinCounter2 {
		
		//Instance Fields
	 	private int quarters;
	    private int dimes;
	    private int nickels;
	    private int pennies;

	   //Constructor
	    public CoinCounter2(int quarters, int dimes, int nickels, int pennies) {
	        this.quarters = quarters;
	        this.dimes = dimes;
	        this.nickels = nickels;
	        this.pennies = pennies;
	    }
	    
	    public int getDollarAmount() {
	        int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
	        return totalCents / 100; 
	    }
	    
	    public int getCentsAmount() {
	        int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
	        return totalCents % 100; 
	    }
	    
     }

