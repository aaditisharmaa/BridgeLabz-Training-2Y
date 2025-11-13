class Product {
    // Static variable shared by all products
    static double discount = 10.0;  // in percentage

    // Instance variables
    String productName;
    double price;
    int quantity;
    final String productID;  // unique and unchangeable

    // Constructor using 'this'
    Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated discount for all products: " + discount + "%");
    }

    // Method to calculate total price after discount
    public double calculateTotalPrice() {
        if (this instanceof Product) {
            double total = price * quantity;
            double finalPrice = total - (total * discount / 100);
            return finalPrice;
        } else {
            System.out.println("Invalid product!");
            return 0.0;
        }
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Total: ₹" + calculateTotalPrice());
        System.out.println("-----------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Update discount for all products
        Product.updateDiscount(15);

        // Create product objects
        Product p1 = new Product("P101", "Laptop", 55000, 1);
        Product p2 = new Product("P102", "Headphones", 2000, 2);
        Product p3 = new Product("P103", "Keyboard", 1500, 3);

        // Display all product details
        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();
    }
}
