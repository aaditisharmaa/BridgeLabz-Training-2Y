class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasABS;

    Motorcycle(int maxSpeed, String fuelType, boolean hasABS) {
        super(maxSpeed, fuelType);
        this.hasABS = hasABS;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("ABS: " + (hasABS ? "Yes" : "No"));
    }
}

public class VehicleSystem {
    public static void main(String[] args) {

        Vehicle[] arr = new Vehicle[3];
        arr[0] = new Car(180, "Petrol", 5);
        arr[1] = new Truck(120, "Diesel", 10);
        arr[2] = new Motorcycle(140, "Petrol", true);

        for (Vehicle v : arr) {
            System.out.println("---- Vehicle Info ----");
            v.displayInfo();
        }
    }
}
