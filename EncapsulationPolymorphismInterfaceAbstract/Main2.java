interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product implements Taxable {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }

    abstract double calculateDiscount();
}

class Electronics extends Product {
    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }
    double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST on Electronics"; }
}

class Clothing extends Product {
    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }
    double calculateDiscount() { return getPrice() * 0.20; }
    public double calculateTax() { return getPrice() * 0.05; }
    public String getTaxDetails() { return "5% GST on Clothing"; }
}

class Groceries extends Product {
    public Groceries(String id, String name, double price) {
        super(id, name, price);
    }
    double calculateDiscount() { return 0; }
    public double calculateTax() { return 0; }
    public String getTaxDetails() { return "No GST on Groceries"; }
}

public class Main2 {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics("P1", "Laptop", 50000),
                new Clothing("P2", "Shirt", 1500),
                new Groceries("P3", "Rice", 800)
        };

        for (Product p : products) {
            double finalPrice = p.getPrice() + p.calculateTax() - p.calculateDiscount();
            System.out.println("Final Price: " + finalPrice + " | " + p.getTaxDetails());
        }
    }
}
