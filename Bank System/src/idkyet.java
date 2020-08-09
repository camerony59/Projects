import java.util.Scanner;
import java.util.UUID;

class Bank {
    private UUID account;
    private String name;
    private long balance;

    Scanner KB = new Scanner(System.in);

    //method to open an account
    void openAccount() {
        UUID uuid = UUID.randomUUID();
        System.out.println("Enter Account No: ");
        account = uuid;

        System.out.print("Enter Name: ");
        name = KB.next();
        System.out.print("Enter Balance: ");
        balance = KB.nextLong();
    }

    //method to display account details
    void showAccount() {
        System.out.println(account + "," + name + "," + balance);
    }

    //method to deposit money
    void deposit() {
        long amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt = KB.nextLong();
        balance = balance + amt;
    }

    //method to withdraw money
    void withdrawal() {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = KB.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }

    //method to search an account number
    boolean search(String acn) {
        if (account.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}