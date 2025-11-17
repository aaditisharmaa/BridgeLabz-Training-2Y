import java.util.*;

public class GenericCart {
    static class Cart<T> {
        private final List<T> items = new ArrayList<>();
        public void addItem(T item) { items.add(item); }
        public void removeItem(T item) { items.remove(item); }
        public void displayItems() {
            for (T it : items) System.out.println(it);
        }
    }

    // Example product classes
    static class Electronics { String name; Electronics(String n){name=n;} public String toString(){return "Electronics: "+name;} }
    static class Clothing { String name; Clothing(String n){name=n;} public String toString(){return "Clothing: "+name;} }

    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        eCart.addItem(new Electronics("Phone"));
        eCart.addItem(new Electronics("Laptop"));
        eCart.displayItems();

        Cart<Clothing> cCart = new Cart<>();
        cCart.addItem(new Clothing("T-Shirt"));
        cCart.displayItems();
    }
}
