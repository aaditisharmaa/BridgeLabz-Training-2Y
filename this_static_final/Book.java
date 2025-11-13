class Book{
    static String librabyname ="central library";
    String title;
    String author;
    final String isbn;
Book(String t, String a,String i){
    this.title=t;
    this.author = a;
    this.isbn=i;
}
public static void displaylibrabyname(){        
    System.out.println("library name : "+librabyname);

}
public String getIsbn(){
    if(this instanceof Book){
        return isbn;


    }
    else{
       return "NOT VALID ISBN";

    }


}
public void display(){
    System.out.println(" title : "+title+ "\n author : "+author+ " \nisbn : "+getIsbn());
}

    public static void main (String[]args){
        Book.displaylibrabyname();
        Book b1 = new Book("one of us","david","122-484-2");
        Book b2 = new Book("mind ","boodh","1226-482-w822");
        Book b3 = new Book("ramio","david","122-484-2");
       // b1.displaylibrabyname();
        b1.display();
        b2.display();
        b3.display();

    }
}