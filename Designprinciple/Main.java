import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name){
        this.name = name;
    }

    void addBook(Book b){
        books.add(b);
    }

    void showBooks(){
        System.out.println("Library: " + name);
        for(Book b : books){
            System.out.println(b.title + " by " + b.author);
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Wings of Fire", "APJ Abdul Kalam");
        Book b2 = new Book("Harry Potter", "J.K. Rowling");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1); // same book used in another library (AGGREGATION)

        lib1.showBooks();
        lib2.showBooks();
    }
}
