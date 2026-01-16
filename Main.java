package bankaccount.java;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Elisha Benson", "12345", 500);

        // While loop: deposit until balance reaches 1000
        while (account1.getBalance() < 1000) {
            account1.deposit(50);
        }

        // Do-while loop: withdraw until balance goes below 500
        do {
            account1.withdraw(100);
        } while (account1.getBalance() >= 500);

        // Freeze account
        account1.freezeAccount();

        account1.printAccountDetails();
    }
}
