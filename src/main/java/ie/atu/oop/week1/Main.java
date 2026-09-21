package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello OOP");//print

        Book firstbook =new Book();

        firstbook.title = "Doom";
        firstbook.author = "Daniel";
        firstbook.pageCount = 304;
        firstbook.available = true;

        firstbook.desplayDetails();
        firstbook.borrowBook();
        firstbook.desplayDetails();


        System.out.println("/n");

        Book secondbook =new Book();
        secondbook.title = "Star Trek";
        secondbook.author = "Dave";
        secondbook.pageCount = 135;
        secondbook.available = true;

        secondbook.desplayDetails();



    }
}