class Vehicle {
    int maxSpeed;
    String model;

    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " (Electric) is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " (Petrol) is refueling.");
    }
}

public class HybridVehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle e = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle p = new PetrolVehicle(180, "Honda City");

        e.charge();
        p.refuel();
    }
}
