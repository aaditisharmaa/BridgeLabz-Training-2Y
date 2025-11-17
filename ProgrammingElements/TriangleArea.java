
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inputs
        System.out.print("Enter base in cm: ");
        double baseInCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightInCm = input.nextDouble();

        // Area in cm²
        double areaInSqCm = 0.5 * baseInCm * heightInCm;

        // Conversion: 1 inch = 2.54 cm
        double areaInSqIn = areaInSqCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaInSqIn +
                           " and in sq cm is " + areaInSqCm);

        input.close();
    }
}
