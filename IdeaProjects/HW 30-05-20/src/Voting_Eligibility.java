import java.util.Scanner;//import scanner class

public class Voting_Eligibility //define the class
{
    public static void main(String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println("Enter Age");//output
        int Age = scanner.nextInt();//read user input
        if (Age >= 18)// age should be equal or highr than 18
        {
            System.out.println("Eligible to Vote");//output
        }
        else
        System.out.println("Not Eligible to vote");//output
    }
}
