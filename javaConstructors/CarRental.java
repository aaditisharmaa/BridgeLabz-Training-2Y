class CarRental{
    String customerName;
    String carModel;
    int rentalDays;
CarRental(String n, String m , int d){
    this.customerName=n;
    this.carModel= m;
    this.rentalDays = d;
}
public int TotalCost(){
    int s = rentalDays* 100;
    return s;

}
public void display(){
    System.out.println("customer name :"+customerName+ "\n rentedcar : "+carModel+ "\n for "+rentalDays+" days"  );
    System.out.println("total cost : "+ TotalCost());   
}
public static void main(String[]args){
CarRental c1 = new CarRental("aditi", "audi" , 10);
CarRental c2 = new CarRental("nand", "bullero" , 5);
CarRental c3 = new CarRental("seema", "neno" , 2);

c1.display();
//c1.TotalCost();
c2.display();
//c2.TotalCost();
c3.display();
//c3.TotalCost();

}
}