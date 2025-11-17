import java.util.ArrayList;
import java.util.List;

public class FruitBoxDemo {
    static class Fruit { public String name; Fruit(String n){name=n;} }
    static class Apple extends Fruit { Apple(){super("Apple");} }
    static class Mango extends Fruit { Mango(){super("Mango");} }
    static class Car { String model = "Car"; } // non-fruit

    static class FruitBox<T extends Fruit> {
        private final List<T> list = new ArrayList<>();
        public void add(T item) { list.add(item); }
        public void display() {
            for(T f : list) System.out.println("Fruit: " + f.name);
        }
    }

    public static void main(String[] args) {
        FruitBox<Apple> apples = new FruitBox<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.display();

        FruitBox<Mango> mangos = new FruitBox<>();
        mangos.add(new Mango());
        mangos.display();

        // The following won't compile (uncomment to try):
        // FruitBox<Car> cars = new FruitBox<>(); // compile error: Car is not a Fruit
    }
}
