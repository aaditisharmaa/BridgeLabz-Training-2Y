import java.util.*;

public class ShoppingCartPriceSummary {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();
        cart.put("Laptop", 4000.0);
        cart.put("Phone", 3000.0);
        cart.put("Headphones", 500.0);
        cart.put("Monitor", 2000.0);

        System.out.println("Products in order added:");
        cart.forEach((k,v) -> System.out.println(k + " : " + v));

        double total = cart.values().stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Total: " + total);

        if (total > 5000) {
            total *= 0.9; // 10% discount
            System.out.println("After 10% discount: " + total);
        }

        // Remove an item
        cart.remove("Monitor");
        System.out.println("After removing Monitor:");
        cart.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
