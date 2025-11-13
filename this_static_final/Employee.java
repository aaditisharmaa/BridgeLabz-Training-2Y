public class Employee{
    static String commpanyname = "SpaceX";
    String name;
    final int id;
    String designation;
    static int totalemployee =0;
    Employee(int i ,String n,String d){
        this.name =n;
        this.id=i;
        this.designation=d;
        totalemployee++;
        }
 public static void displaytotalemployee(){
    System.out.println("TOTAL EMPLOYEE : "+totalemployee);
 }
public void display(){
    if (this instanceof Employee){
        System.out.println("id :"+id+ "\nname : "+name+ "\ndesignation :"+designation );

    }
}
public static void main(String[]args){
    Employee e1=new Employee(1,"aditi","CEO");
    Employee e2=new Employee(2,"NANDINI","OWNER");
    Employee e3=new Employee(3,"RIDHI","servent");

 e1.display();
 e2.display();
 e3.display();
 Employee.displaytotalemployee();
 

}
}