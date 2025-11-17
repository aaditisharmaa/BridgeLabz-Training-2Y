interface Vehicle {
    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery display not supported.");
    }
}

class NormalCar implements Vehicle {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() { System.out.println("Speed: 60 km/h"); }

    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

public class SmartVehicleDashboard {
    public static void main(String[] args) {
        Vehicle v1 = new NormalCar();
        v1.displaySpeed();
        v1.displayBattery();

        Vehicle v2 = new ElectricCar();
        v2.displaySpeed();
        v2.displayBattery();
    }
}
