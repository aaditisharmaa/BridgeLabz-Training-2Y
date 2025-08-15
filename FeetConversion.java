import java.util.Scanner;

class FeetConversion {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        double yardsPerMile = 1760;
        double feetPerYard = 3;

        double distanceYards = distanceFeet / feetPerYard;
        double distanceMiles = distanceYards / yardsPerMile;

        System.out.println("The distance in yards is " + distanceYards 
            + " while the distance in miles is " + distanceMiles);

        input.close();
    }
}
