import java.util.*;

class SavingAccount extends Exception {
    double balance = 0.0;

    public SavingAccount() {
        super("Withdrawal amount is greater than balance");
    }

    public SavingAccount(double initialbalance) {
        balance = initialbalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) throws SavingAccount {
        if (balance < amount)
            throw new SavingAccount();
        balance = balance - amount;
    }

    public void getbalance() {
        System.out.println("balance:" + balance);
    }
}

public class Account extends SavingAccount {
    public static void main(String args[]) {
        SavingAccount s = new SavingAccount();
        Scanner sc = new Scanner(System.in);
        double x,y;
        int ch;
        char c;
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Balance");

        do {
            

            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    x = sc.nextDouble();
                    s.deposit(x);
                    break;
                case 2:
                   
                        System.out.print("Enter amount to withdraw: ");
                        y = sc.nextDouble();
                        try {
                            s.withdraw(y);
                        } catch (SavingAccount e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    break;
                case 3:
                    s.getbalance();
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }

            System.out.print("Do you want to continue? (Y/N) ");
            c = sc.next().charAt(0);

        } while (c == 'Y' || c == 'y');
    }
}
