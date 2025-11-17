interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLoc);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double rate;

    public Vehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.rate = rate;
    }

    public double getRate() { return rate; }

    abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println(vehicleId + " | " + driverName);
    }
}

class Car extends Vehicle implements GPS {
    private String loc = "Unknown";

    public Car(String id, String name, double rate) { super(id, name, rate); }

    double calculateFare(double distance) { return distance * getRate(); }

    public String getCurrentLocation() { return loc; }
    public void updateLocation(String l) { loc = l; }
}

class Bike extends Vehicle implements GPS {
    private String loc = "Unknown";

    public Bike(String id, String name, double rate) { super(id, name, rate); }

    double calculateFare(double distance) { return distance * getRate(); }

    public String getCurrentLocation() { return loc; }
    public void updateLocation(String l) { loc = l; }
}

class Auto extends Vehicle implements GPS {
    private String loc = "Unknown";

    public Auto(String id, String name, double rate) { super(id, name, rate); }

    double calculateFare(double distance) { return distance * getRate() + 10; }

    public String getCurrentLocation() { return loc; }
    public void updateLocation(String l) { loc = l; }
}

public class Main8 {
    public static void main(String[] args) {
        Vehicle[] rides = {
          new Car("CAR101", "Arun", 12),
          new Bike("BIKE202", "Kavi", 6),
          new Auto("AUTO303", "Hari", 10)
        };

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for 10km: " + v.calculateFare(10));
            System.out.println("------------------------------");
        }
    }
}
