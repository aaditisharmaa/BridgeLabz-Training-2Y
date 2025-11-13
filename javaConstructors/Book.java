class Book{
    String title;
    String author;
    double price;
    boolean availabilty;
    
Book(){

}

Book(String t , String a , double p, boolean z){
    this.title=t;
    this.author=a;
    this.price=p;
    this.availabilty=z;

}
public void BorrowBOOK(){
    if (availabilty){
        System.out.println(" availability : "+(availabilty?  "yes":"no")+"\n title : "+ title + "\n price : "+price+ " author : "+ author);
        System.out.println("YOU HAVE SUCCESSFULLY BORROW THE BOOK!");
        availabilty=false;
    }
    else{
    System.out.println( "availability : "+(availabilty? "yes":"no")+ "\n SORRY THE BOOK IS NOT AVAILABLE!!!");
    }
}
public static void main(String[]args){

    Book b1 = new Book("java", "aditi",1000 ,true);
    Book b2 = new Book("maths", "nanadini",1500 ,true);
    Book b3 = new Book("english", "dipika",1000 , false);

b1.BorrowBOOK();
b2.BorrowBOOK();
b3.BorrowBOOK();
b1.BorrowBOOK();
}
}
