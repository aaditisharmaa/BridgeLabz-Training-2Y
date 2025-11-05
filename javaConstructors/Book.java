public class Book{
    String title;
    String author;
    double price;

Book(){
    title ="unknown";
    author="unknown";
    price =0.0;
}
Book(String t , String a , double p){
    title = t;
    author =a;
    price =p;
}

//class Main {
    public static void main(String[]args){
        Book b1 = new Book();
        Book b2 = new Book("java","amol",100.78);
        System.out.println(b1.title + b1.author + b1.price);
        System.out.println(b2.title + b2.author + b2.price);
    }
}


