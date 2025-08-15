class EarthVolume {
    public static void main(String[] args) {

        // Fixed values
        double radiusInKm = 6378;
        double kmToMileConversion = 1.6;
        double pi = 3.141592653589793;

        // Computations
        double volumeInKm3 = (4.0 / 3.0) * pi * Math.pow(radiusInKm, 3);
        double radiusInMiles = radiusInKm / kmToMileConversion;
        double volumeInMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusInMiles, 3);

        // Output
        System.out.println("The volume of earth in cubic kilometers is " + volumeInKm3 +
                           " and cubic miles is " + volumeInMiles3);
    }
}
