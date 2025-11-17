interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println(itemId + " | " + title + " | " + author);
    }

    abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    public Book(String id, String title, String author) {
        super(id, title, author);
    }
    int getLoanDuration() { return 14; }
    public void reserveItem() { System.out.println("Book reserved"); }
    public boolean checkAvailability() { return true; }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }
    int getLoanDuration() { return 7; }
    public void reserveItem() { System.out.println("Magazine reserved"); }
    public boolean checkAvailability() { return true; }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(String id, String title, String author) {
        super(id, title, author);
    }
    int getLoanDuration() { return 3; }
    public void reserveItem() { System.out.println("DVD reserved"); }
    public boolean checkAvailability() { return true; }
}

public class Main5 {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("B1", "Java", "Author A"),
            new Magazine("M1", "Tech Today", "Editor X"),
            new DVD("D1", "Movie", "Director Y")
        };

        for (LibraryItem l : items) {
            l.getItemDetails();
            System.out.println("Loan Days: " + l.getLoanDuration());
            System.out.println("------------------------------");
        }
    }
}
