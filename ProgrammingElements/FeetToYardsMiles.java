import java.util.Scanner;

class FeetToYardsMiles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        // Output
        System.out.println("The distance in yards is " + yards +
                           " while the distance in miles is " + miles);

        input.close();
    }
}
