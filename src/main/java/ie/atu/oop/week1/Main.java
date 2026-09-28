package ie.atu.oop.week1;
//Danish Fernandes
//28/09/26
//Program-Java book tracker

/* Code retained for Learning purpose
public class Main
{
    public static void main(String[] args)
    {
        try {//if the program tries to execute this block and the block eecutes without a error it lets this block run
            Book myBook = new Book("Dune", "Frank", 0);
            System.out.println(myBook.getTitle());
            System.out.println(myBook.getAuthor());
            System.out.println(myBook.getPageCount());
        }
        catch (IllegalArgumentException ex)//If the try block throws a error it runs this block of code
        {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}

 */
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Dune", "Frank Herbert", 412);//created a book with the specified data
        book.borrowBook();
        try {
            book.borrowBook();
        } catch (IllegalStateException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(book.getStatus());
    }
}