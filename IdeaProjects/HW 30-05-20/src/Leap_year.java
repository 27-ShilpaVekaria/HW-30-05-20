import java.util.Scanner;//import scanner class

public class Leap_year //define the class
{
    public static void main (String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//created Scanner object
        System.out.println("Please enter the year");//output
        int year = scanner.nextInt();//read user input

        if (year%4==0) //if year divided by 4 and remainder is 0
        {
            System.out.println("year " + year + " is a Leap year");//output
        }
        else
            {
               System.out.println("year " + year + " is a Common year");//output
           }
    }
}
