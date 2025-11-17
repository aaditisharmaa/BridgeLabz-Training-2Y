class Animal{
    String name;
    int age;


    public Animal(String name , int age){
        this.name = name;
        this.age = age;
    
    }
    public void makeSound(){
    System.out.println("sound of Animal");}

    }
class Dog extends Animal{
    public void makeSound(){
    System.out.println("dog says bark bark");




    }

}
class Cat extends Animal{

    public void makeSound(){
        System.out.println("cat says meow meow");
    }




}
class Bird extends Animal{
    public void makeSound(){
    System.out.println("bird says chirp chirp");

}
}
public class Main{
public static void main(String[] args){
    Animal[] animals ={
         new Dog("pucku" , 2),
         new Cat("billu", 1),
         new Bird("cintu",5)
    };
    for(int i= 0 ; i< animals.length ; i++){
        animals[i].makeSound();
    }
}
}









