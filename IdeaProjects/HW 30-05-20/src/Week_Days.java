import java.util.Scanner;//import scanner class

public class Week_Days //define the class
{
    public static void main(String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println("Enter DAY No. ");//output

        int Day = scanner.nextInt();//read user input
        if (Day == 1)//day 1
        {
            System.out.println( " Monday ");//output
        }
        else if (Day ==2)//day 2
        {
        System.out.println( " Tuesday ");//output
        }
        else if (Day==3)//day 3
        {
            System.out.println( "Wednusday");//output
        }
        else if (Day==4)//day 4
        {
            System.out.println( "Thursday");//output
        }
        else if (Day==5)//day 5
        {
            System.out.println( "Friday");//output
        }
        else if (Day==6)//day 6
        {
            System.out.println( "Saturday");//output
        }
        else if (Day ==7)//day 7
        {
            System.out.println( "Sunday");//output
        }


    }



    }


