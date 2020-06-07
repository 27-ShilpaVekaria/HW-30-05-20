import java.util.Scanner;//import scanner class

public class City//Define the class
{
    public static void main(String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//creat scanner object
        System.out.println("Enter an alphabet in Upper case");//
        char City = scanner.next().charAt(0);//read user input
        if ( City =='A')//if city is starting with 'A'
        {
            System.out.println("Ahemdabad");//output
        }
        else if (City=='B')// city is starting with B
        {
            System.out.println("Bhuj");//output
        }
        else if (City=='C')// city is starting with
        {
            System.out.println("Champaner");//output
        }
        else if (City=='D')// city is starting with
        {
            System.out.println("Dwarka");//output
        }
        else if (City=='E')// city is starting with
        {
            System.out.println("Ellenabad");//output
        }
        else if (City=='F')// city is starting with
        {
            System.out.println("Faridabad");//output
        }
        else//
        {
            System.out.println("INVALID ENTRY");//output
        }

    }

}
