import java.util.*;

public class AnimalPrint {
    static class Animal { String name; Animal(String n){name=n;} }
    static class Dog extends Animal { Dog(String n){super(n);} }
    static class Cat extends Animal { Cat(String n){super(n);} }

    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) System.out.println(a.name);
    }

    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog("Rex"), new Dog("Buddy"));
        List<Cat> cats = Arrays.asList(new Cat("Misty"), new Cat("Kitty"));

        printAnimals(dogs);
        printAnimals(cats);
    }
}
