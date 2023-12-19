 import java.util.Scanner;

  public class AtmInt {
    private static double balance = 1000;  // Initial account balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }

    private static void withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Transaction successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds. Please try again.");
        }
    }

    private static void depositMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }
    private static void transferMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance -= amount;
            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }
}
 
    