package ie.atu.oop.week1;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public static void desplayDetails() {

        System.out.println(" book title: " + title);
        System.out.println(" book author: " + author);
        System.out.println(" book page count: " + pageCount);
        System.out.println(" book avalable: " + available);
        System.out.println("/n");

    }
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " Avalable");
        }
        else{
            System.out.println("Book Not Available");
        }
    }
}
