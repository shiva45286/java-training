class ATM {
    double currentBalance;

    // Constructor
    ATM(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    // Deposit Method
    void deposit(double amount) {
        currentBalance = currentBalance + amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount <= currentBalance) {
            currentBalance = currentBalance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Display Balance
    void displayBalance() {
        System.out.println("Current Balance: " + currentBalance);
    }
}

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM(10000); // Initial balance

        atm.displayBalance();

        atm.deposit(2000);

        atm.withdraw(5000);

        atm.displayBalance();
    }
}