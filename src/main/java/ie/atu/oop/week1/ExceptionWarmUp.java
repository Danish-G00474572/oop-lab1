package ie.atu.oop.week1;

import java.util.Scanner;

public class ExceptionWarmUp
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        boolean valid = false;
        while(!valid)
        {
            System.out.println("Enter a page count:");
            String text =scan.nextLine();
            try
            {
                int pagecount = Integer.parseInt(text);
                System.out.println("You entered: " + pagecount);
                valid = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input"+ e.getMessage());
            }
        }

    }
}
