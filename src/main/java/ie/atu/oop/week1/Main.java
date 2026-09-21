package ie.atu.oop.week1;
//Danish Fernandes
//21/09/26
//Program-Java book tracker
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\t\tWelcome to the Library Inventory system\n\n");//print

        Book firstBook =createBook("Dune","Frank Hebert",412);
        Book secondBook =createBook("Clean code","Robert c. Martin",464);
        Book thirdBook = createBook("The C Programing language","Kernighan and Ritchie ",274);

        firstBook.displayDetails();
        secondBook.displayDetails();
        thirdBook.displayDetails();

        firstBook.borrowBook();
        firstBook.displayDetails();
        firstBook.borrowBook();

    }
    private static Book createBook(String title, String author, int pageCount) {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}