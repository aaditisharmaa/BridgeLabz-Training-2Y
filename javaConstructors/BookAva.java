public class BookAva{
    String title;
    String author;
    double price;

BookAva(){
    title ="unknown";
    author="unknown";
    price =0.0;
}
BookAva(String t , String a , double p){
    title = t;
    author =a;
    price =p;
}

//class Main {
    public static void main(String[]args){
        BookAva b1 = new BookAva();
        BookAva b2 = new BookAva("java","amol",100.78);
        System.out.println(b1.title + b1.author + b1.price);
        System.out.println(b2.title + b2.author + b2.price);
    }
}


