// Gerber Gonzalez  ggonzalez332@toromail.csudh.org
public class BankAccount {
    // Instance fields
    private String firstName;
    private String lastName;
    private double balance;
    private boolean isOpen;

    // Constructor
    public BankAccount(String firstName, String lastName, double initialDepositAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = initialDepositAmount;
        this.isOpen = true;
    }

    public boolean deposit(double amount) {
        if (isOpen && amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            return false; 
        }
        if (isOpen || amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void close() {
        isOpen = false;
    }

    public String getOwnerFullName() {
        return firstName + " " + lastName;
    }

    public double getBalance() {
        return balance;
    }
}