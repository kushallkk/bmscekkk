import java.util.Scanner;

// Base class Account
class Account {
    private String customerName;
    private String accountNumber;
    private String accountType;
    protected double balance;

    public Account(String customerName, String accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public String getAccountType() {
        return accountType;
    }
}

// Derived class SavingsAccount
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String customerName, String accountNumber, double interestRate) {
        super(customerName, accountNumber, "Savings");
        this.interestRate = interestRate;
    }

    public void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest deposited: " + interest);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Derived class CurrentAccount
class CurrentAccount extends Account {
    private static final double MINIMUM_BALANCE = 1000.0;
    private static final double SERVICE_CHARGE = 100.0;

    public CurrentAccount(String customerName, String accountNumber) {
        super(customerName, accountNumber, "Current");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void checkMinimumBalance() {
        if (balance < MINIMUM_BALANCE) {
            balance -= SERVICE_CHARGE;
            System.out.println("Service charge imposed: " + SERVICE_CHARGE);
        }
    }
}

// Main class to test the program
public class bank162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter account type (savings/current): ");
        String accountType = scanner.nextLine().toLowerCase();

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();

        Account account;

        if (accountType.equals("savings")) {
            System.out.println("Enter interest rate: ");
            double interestRate = scanner.nextDouble();
            account = new SavingsAccount(name, accountNumber, interestRate);
        } else if (accountType.equals("current")) {
            account = new CurrentAccount(name, accountNumber);
        } else {
            System.out.println("Invalid account type!");
            scanner.close();
            return;
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Compute Interest (Savings only)");
            System.out.println("5. Check Minimum Balance (Current only)");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).withdraw(withdrawAmount);
                    } else if (account instanceof CurrentAccount) {
                        ((CurrentAccount) account).withdraw(withdrawAmount);
                    }
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    if (account instanceof SavingsAccount) {
                        ((SavingsAccount) account).computeAndDepositInterest();
                    } else {
                        System.out.println("Interest can only be computed for savings accounts.");
                    }
                    break;
                case 5:
                    if (account instanceof CurrentAccount) {
                        ((CurrentAccount) account).checkMinimumBalance();
                    } else {
                        System.out.println("Minimum balance check is only for current accounts.");
                    }
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}