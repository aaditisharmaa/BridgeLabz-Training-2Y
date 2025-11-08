public class Person{
	String name;
	int age;

Person(){
this.name="unknown";
this.age=0;
}
Person(String name,int age){
	this.name=name;
	this.age=age;
}
Person(Person p){
	this.name =p.name;
	this.age=p.age;
}
public void display(){
System.out.println("the name is " + name + " and age is "+age);
}
public static void main(String[] args){
	Person p1 = new Person();
	Person p2 = new Person("aditi ", 18);
	Person p3 = new Person(p1);
	Person p4 = new Person(p2);	


p1.display();
p2.display();
p3.display();
p4.display();
}
}
