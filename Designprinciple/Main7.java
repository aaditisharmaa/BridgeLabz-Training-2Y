import java.util.ArrayList;

class Product {
    String name;
    double price;
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p){
        products.add(p);
    }

    void showOrder(){
        System.out.println("Order contains:");
        for(Product p : products){
            System.out.println(p.name + " - Rs." + p.price);
        }
    }
}

class Customer {
    String name;
    Customer(String name){ this.name = name; }

    Order placeOrder(){
        System.out.println(name + " placed an order.");
        return new Order();
    }
}

public class Main7 {
    public static void main(String[] args) {
        Customer c = new Customer("Lavanya");

        Order o = c.placeOrder();

        o.addProduct(new Product("Shoes", 999));
        o.addProduct(new Product("T-shirt", 499));

        o.showOrder();
    }
}
