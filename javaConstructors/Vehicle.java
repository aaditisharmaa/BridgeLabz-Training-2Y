class Vehicle{
    String ownername ;
    String vehicletype;
    static double registrationfee=100;

    Vehicle(String n, String t){
        this.ownername=n;
        this.vehicletype=t;
      //  double registrationfee = f;
    }
    public void display(){
        System.out.println("OWNER : "+ownername+" VEHICLE TYPE : "+vehicletype+ " REGISTRATION FEE : "+registrationfee);
    }
    public static void updatefee(int newfee){
        registrationfee = newfee;

    }
    public static void main(String[]args){
        Vehicle v1=new Vehicle("aditi","4-wheeler");
        Vehicle v2=new Vehicle("nishi","3-wheeler");
        Vehicle v3=new Vehicle("nandini","2-wheeler");
        v1.display();
        v2.display();
        v3.display();
        updatefee(200);
        v1.display();
        v2.display();
        v3.display();       

    }

}