import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
}

public class ECommerceSorting {
    public static void main(String[] args) {

        List<Product> list = Arrays.asList(
                new Product("Shoes", 1200, 4.5, 10),
                new Product("Watch", 2500, 4.8, 20),
                new Product("Bag", 900, 4.1, 15)
        );

        System.out.println("Sort by Price:");
        list.sort((a,b) -> Double.compare(a.price, b.price));
        list.forEach(p -> System.out.println(p.name + " - " + p.price));

        System.out.println("\nSort by Rating:");
        list.sort((a,b) -> Double.compare(b.rating, a.rating));
        list.forEach(p -> System.out.println(p.name + " - " + p.rating));

        System.out.println("\nSort by Discount:");
        list.sort((a,b) -> Double.compare(b.discount, a.discount));
        list.forEach(p -> System.out.println(p.name + " - " + p.discount));
    }
}
