public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int q) {
        quantity += q;
    }

    public void removeItem(int q) {
        if (q <= quantity) {
            quantity -= q;
        }
    }

    public void displayTotalCost() {
        System.out.println("Item: " + itemName);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Shoes", 1500.0, 2);
        cart.addItem(1);
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}
