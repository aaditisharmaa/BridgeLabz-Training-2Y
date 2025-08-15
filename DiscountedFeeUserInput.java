import java.util.Scanner;

class DiscountedFeeUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter fee amount: ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        // Computations
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;

        // Output
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
