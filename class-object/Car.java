public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Corolla", 2022);
        Car c2 = new Car("Tesla", "Model 3", 2023);

        c1.displayCar();
        c2.displayCar();
    }
}
