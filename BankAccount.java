package bankaccount.java;

	public class BankAccount {

	    private String accountHolder;
	    private double balance;
	    private String accountNumber;

	    protected String accountStatus = "Active";

	    public BankAccount(String accountHolder, String accountNumber, double initialDeposit) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = initialDeposit;
	    }

	    public String getAccountHolder() {
	        return accountHolder;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {

	        if (amount > 1000) {
	            System.out.println("Withdrawal limit exceeded (max $1000).");
	            return;
	        }

	        if (amount > 0) {
	            balance -= amount;
	            System.out.println("Withdrew: $" + amount);

	            if (balance < 0) {
	                balance -= 10;
	                System.out.println("Overdraft fee charged: $10");
	            }
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public void freezeAccount() {
	        accountStatus = "Frozen";
	        System.out.println("Account has been frozen.");
	    }

	    public void printAccountDetails() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: $" + balance);
	        System.out.println("Status: " + accountStatus);
	    }
	}
