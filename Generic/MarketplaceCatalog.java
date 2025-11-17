import java.util.*;

public class MarketplaceCatalog {
    // categories (marker / enum could be used; simple classes for demo)
    static class Category {}
    static class BookCategory extends Category {}
    static class ClothingCategory extends Category {}
    static class GadgetCategory extends Category {}

    static class Product<C extends Category> {
        String name; double price; C category;
        Product(String name, double price, C category){this.name=name;this.price=price;this.category=category;}
        public double getPrice(){return price;}
        public String toString(){return name+"("+category.getClass().getSimpleName()+"):"+price;}
    }

    public static <P extends Product<?>> void applyDiscount(P product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage/100.0);
        System.out.println("Discounted price for " + product.name + ": " + newPrice);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory());
        Product<ClothingCategory> tee = new Product<>("T-Shirt", 800, new ClothingCategory());
        applyDiscount(book, 10);
        applyDiscount(tee, 25);
    }
}
