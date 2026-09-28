package ie.atu.oop.week1;
//Danish Fernandes
//28/09/26
//Program-Java book tracker

public class Main
{
    public static void main(String[] args)
    {

        Book myBook = new Book("Dune", "Frank", 412);
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
        System.out.println(myBook.getPageCount());
    }

}