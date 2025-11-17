import java.util.Scanner;

class KmToMilesUserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        // Conversion
        double miles = kilometers / 1.6;

        // Output
        System.out.println("The total miles is " + miles +
                           " mile for the given " + kilometers + " km");

        input.close();
    }
}
