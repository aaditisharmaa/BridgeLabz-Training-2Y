class HotelBooking{
    String guestName;
    String roomType;
    int nights;
HotelBooking(){
    guestName="no one";
   roomType="NA";
    nights=0;
}
HotelBooking(String g, String r,int n){
    this.guestName= g;
    this.roomType=r;
    this.nights=n;

}
HotelBooking(HotelBooking h){
    this.guestName= h.guestName;
    this.roomType=h.roomType;
    this.nights=h.nights;
}
public void display(){
    System.out.println("guest is "+guestName+ " ,staying in "+roomType+ " type room, for "+nights+ " nights.");

}
public static void main(String[] args){
    HotelBooking h1 = new HotelBooking();
    HotelBooking h2 = new HotelBooking("aditi","2 bed", 2);
    HotelBooking h3 = new HotelBooking("uchusd", "queen bed", 6);
    HotelBooking h4 = new HotelBooking(h1);
    HotelBooking h5 = new HotelBooking(h3);
   // HotelBooking h4 = new HotelBooking(h1);
    //HotelBooking h4 = new HotelBooking(h4);

h1.display();
h2.display();
h3.display();
h4.display();
h3.display();
h5.display();


}
}