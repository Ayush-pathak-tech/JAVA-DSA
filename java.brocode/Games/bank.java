import java.util.Scanner;

public class bank {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean isRunning = true;
        double balance = 333.33;

        while (isRunning) { 
            System.out.println("---------------");
            System.out.println("BANKING PROGRAM");  // Fixed typo: PTOGRAM -> PROGRAM
            System.out.println("---------------");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.println("*****************");

            System.out.println("Choose number B/W 1-4");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();  // Fixed method name: deposite -> deposit
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE!");
            }
        }
        System.out.println("THANK YOU! HAVE A NICE DAY!");
        sc.close();  // Close scanner to prevent resource leak
    }

    static void showBalance(double balance) {  // Fixed method name: showbalance -> showBalance
        System.out.printf("Your current balance: $%.2f%n", balance);
    }

    static double deposit() {  // Fixed method name: deposite -> deposit
        System.out.println("Enter an amount to deposit:");
        double amount = sc.nextDouble();
        
        if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;  // Return 0 so no amount is added to balance
        } else {
            System.out.printf("Successfully deposited: $%.2f%n", amount);
            return amount;
        }
    }

    static double withdraw(double balance) {
        System.out.println("Enter amount to withdraw from account:");
        double amount = sc.nextDouble();
        
        if (amount > balance) {
            System.out.println("INSUFFICIENT BALANCE!");
            return 0;  // Return 0 so no amount is deducted from balance
        } else if (amount < 0) {
            System.out.println("Amount can't be negative!");
            return 0;  // Return 0 so no amount is deducted from balance
        } else {
            System.out.printf("Successfully withdrew: $%.2f%n", amount);
            return amount;  // Return the amount to be deducted from balance
        }
    }
}