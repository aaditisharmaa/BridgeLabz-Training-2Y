
import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

        // Conversion
        double totalInches = heightInCm / 2.54;
        int feetPart = (int)(totalInches / 12);
        double inchesPart = totalInches % 12;

        // Output
        System.out.println("Your Height in cm is " + heightInCm +
                           " while in feet is " + feetPart +
                           " and inches is " + inchesPart);

        input.close();
    }
}
