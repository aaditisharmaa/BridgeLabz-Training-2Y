interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rate;

    public Vehicle(String vehicleNumber, String type, double rate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rate = rate;
    }

    public double getRate() { return rate; }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) {
        super(num, "Car", rate);
    }

    double calculateRentalCost(int days) { return days * getRate(); }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Car Insurance: ₹2000"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) {
        super(num, "Bike", rate);
    }

    double calculateRentalCost(int days) { return days * getRate(); }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Bike Insurance: ₹500"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) {
        super(num, "Truck", rate);
    }

    double calculateRentalCost(int days) { return days * getRate() * 1.5; }
    public double calculateInsurance() { return 5000; }
    public String getInsuranceDetails() { return "Truck Insurance: ₹5000"; }
}

public class Main3 {
    public static void main(String[] args) {
        Vehicle[] v = {
            new Car("C101", 1000),
            new Bike("B202", 300),
            new Truck("T303", 2000)
        };

        for (Vehicle x : v) {
            Insurable i = (Insurable)x;
            System.out.println("Rental: " + x.calculateRentalCost(5));
            System.out.println("Insurance: " + i.calculateInsurance());
            System.out.println("----------------------------");
        }
    }
}
