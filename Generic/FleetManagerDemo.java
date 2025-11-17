import java.util.*;

public class FleetManagerDemo {
    static class Vehicle { String id; Vehicle(String id){this.id=id;} public String toString(){return getClass().getSimpleName()+":"+id;} }
    static class Truck extends Vehicle { Truck(String id){super(id);} }
    static class Bike extends Vehicle { Bike(String id){super(id);} }

    static class FleetManager<T extends Vehicle> {
        private final List<T> fleet = new ArrayList<>();
        public void addVehicle(T v){ fleet.add(v); }
        public void showFleet(){ for(T v : fleet) System.out.println(v); }
    }

    public static void main(String[] args) {
        FleetManager<Truck> tm = new FleetManager<>();
        tm.addVehicle(new Truck("T1"));
        tm.addVehicle(new Truck("T2"));
        tm.showFleet();

        FleetManager<Bike> bm = new FleetManager<>();
        bm.addVehicle(new Bike("B1"));
        bm.showFleet();
    }
}
