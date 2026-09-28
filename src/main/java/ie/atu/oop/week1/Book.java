package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails() {

        System.out.println(" book title: " + title);
        System.out.println(" book author: " + author );
        System.out.println(" book page count: " + pageCount );
        System.out.println(" book available: " + available );
        System.out.println("\n");

    }
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " Borrowed!\n");
        }
        else{
            System.out.println(title + " Not Available! (Already Borrowed)\n");
        }
    }
}
