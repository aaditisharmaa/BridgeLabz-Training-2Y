class KmToMilesFixed {
    public static void main(String[] args) {

        // Fixed values
        double kilometers = 10.8;
        double kmToMileConversion = 1.6;

        // Compute miles
        double miles = kilometers / kmToMileConversion;

        // Output
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
