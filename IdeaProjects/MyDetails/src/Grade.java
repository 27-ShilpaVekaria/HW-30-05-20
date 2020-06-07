import java.util.Scanner;

import static com.oracle.jrockit.jfr.ContentType.Percentage;


public class Grade
{
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your Maths marks:");
        int Maths = scanner.nextInt();
        System.out.println("Please enter your English marks:");
        int English = scanner.nextInt();
        System.out.println("Please enter your Science marks:");
        int Science = scanner.nextInt();

        int total = Maths + English + Science;
        double percentage = total/3;

        System.out.println("Total marks = "+ total);
        System.out.println("Percentage =" + percentage);


        if  (percentage<40)
        {
            System.out.println("Fail");

        }
        else if (percentage >= 40  && percentage < 50)
        {
            System.out.println("C Grade");

        }
        else if ( percentage >= 50 && percentage < 70)
        {
            System.out.println(" B Grade");

        }
        else if ( percentage >= 70 && percentage < 100)
        {
            System.out.println("A Grade");

        }
        else{
            System.out.println(" Invalid entry");

        }


    }


    }

