interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int quantity) {
        this.itemName = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " | " + price + " | Qty: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }
    double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount() { return getPrice() * 0.05; }
    public String getDiscountDetails() { return "5% Veg Discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }
    double calculateTotalPrice() { return getPrice() * getQuantity() + 30; }
    public double applyDiscount() { return 0; }
    public String getDiscountDetails() { return "No discount"; }
}

public class Main6 {
    public static void main(String[] args) {
        FoodItem[] items = {
            new VegItem("Paneer", 200, 2),
            new NonVegItem("Chicken", 300, 1)
        };

        for (FoodItem f : items) {
            f.getItemDetails();
            System.out.println("Total Price: " + f.calculateTotalPrice());
            System.out.println("---------------------------");
        }
    }
}
