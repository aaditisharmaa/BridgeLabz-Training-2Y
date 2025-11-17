import java.util.*;

public class PriceCalculator {
    static class Product { private double price; Product(double p){price=p;} public double getPrice(){return price;} }
    static class Mobile extends Product { Mobile(double p){super(p);} }
    static class Laptop extends Product { Laptop(double p){super(p);} }

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0.0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(10000), new Mobile(15000));
        List<Laptop> laptops = Arrays.asList(new Laptop(50000));

        System.out.println("Mobiles total: " + calculateTotal(mobiles));
        System.out.println("Laptops total: " + calculateTotal(laptops));
    }
}
