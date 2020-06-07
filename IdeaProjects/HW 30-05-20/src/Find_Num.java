import java.util.Scanner;//import scanner class

public class Find_Num {//defined the class
    public static void main(String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//created scanner object

        System.out.println("Enter Number");//output
        int Number = scanner.nextInt();//read user input

        if (Number < 0)//number is less than zero
        {
            System.out.println("The Number is Nagative");//output
        }
        else if (Number > 0)//number is greater than zero
        {
            System.out.println("The Number is Positive");//output
        }
        else if (Number==0)//number is zero
        {
            System.out.println("The Number is Zero");//output
        }
    }
}

