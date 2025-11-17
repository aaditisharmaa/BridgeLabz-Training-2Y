import java.util.Scanner;

class TotalPurchasePrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Computation
        double totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice +
                           " if the quantity is " + quantity +
                           " and unit price is INR " + unitPrice);

        input.close();
    }
}
