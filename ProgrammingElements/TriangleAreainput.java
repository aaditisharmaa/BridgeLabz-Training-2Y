import java.util.Scanner;

class TriangleAreainput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take base and height in cm
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Conversion constant
        double cmPerInch = 2.54;

        // Area in cm²
        double areaCm2 = 0.5 * baseCm * heightCm;

        // area in in²			
        double baseInches = baseCm / cmPerInch;
        double heightInches = heightCm / cmPerInch;
        double areaInches2 = 0.5 * baseInches * heightInches;

        // Display results
        System.out.println("The Area of the triangle in sq cm is " + areaCm2 
            + " and in sq inches is " + areaInches2);

        input.close();
    }
}
