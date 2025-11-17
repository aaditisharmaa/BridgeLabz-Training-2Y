class Customer {
    String name;
    double balance = 0;

    Customer(String name){
        this.name = name;
    }

    void viewBalance(){
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName){
        this.bankName = bankName;
    }

    void openAccount(Customer c, double amount){
        System.out.println("Account opened for " + c.name + " in " + bankName);
        c.balance = amount;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Bank b = new Bank("SBI");
        Customer c1 = new Customer("Lavanya");

        b.openAccount(c1, 2000);
        c1.viewBalance();
    }
}
