import java.util.*;

class Customer {
    String account;
    double balance;

    Customer(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }
}

public class BankingCustomerBalanceTracker {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC1001", 5000.0);
        accounts.put("ACC1002", 12000.0);
        accounts.put("ACC1003", 7500.0);
        accounts.put("ACC1004", 15000.0);
        accounts.put("ACC1005", 3000.0);

        // Deposit
        accounts.put("ACC1003", accounts.get("ACC1003") + 2000);

        // Withdrawal
        String acc = "ACC1002";
        double withdraw = 5000;
        if (accounts.get(acc) >= withdraw) accounts.put(acc, accounts.get(acc) - withdraw);
        else System.out.println("Insufficient balance for " + acc);

        // Sorted by descending balance
        accounts.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));

        // Top 3 customers
        System.out.println("Top 3 customers:");
        accounts.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
