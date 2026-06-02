// class Bank {
//     int balance;

//     Bank(int balance) {
//         this.balance = balance;
//     }

//     void display() {
//         System.out.println("Balance = " + balance);
//     }
// }

// public class Encapsulation {
//     public static void main(String[] args) {
//         Bank user1 = new Bank(10000);

//         user1.balance = 5000;   // changing balance directly
//         user1.display();
//     }
// }


class Bank {
    private int balance;

    void setBalance(int amount) {
        this.balance = amount;
    }

    int getBalance() {
        return this.balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bank user1 = new Bank();

        user1.setBalance(10000);

        System.out.println(user1.getBalance());
    }
}