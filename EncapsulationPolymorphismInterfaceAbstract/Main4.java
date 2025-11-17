interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String number, String name, double balance) {
        this.accountNumber = number;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { if (amt <= balance) balance -= amt; }

    public double getBalance() { return balance; }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String num, String name, double bal) {
        super(num, name, bal);
    }

    double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan() { System.out.println("Savings Loan Applied"); }
    public boolean calculateLoanEligibility() { return getBalance() >= 5000; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String num, String name, double bal) {
        super(num, name, bal);
    }

    double calculateInterest() { return 0; }
    public void applyForLoan() { System.out.println("Current Loan Applied"); }
    public boolean calculateLoanEligibility() { return getBalance() >= 20000; }
}

public class Main4 {
    public static void main(String[] args) {
        BankAccount[] acc = {
                new SavingsAccount("S101", "Lavanya", 8000),
                new CurrentAccount("C202", "Meera", 30000)
        };

        for (BankAccount b : acc) {
            System.out.println("Interest: " + b.calculateInterest());
        }
    }
}
