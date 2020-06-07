import java.util.Scanner;//import scanner class

public class Sales_Commission //define the class
{
    public static void main(String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println("ID");//output
        int ID = scanner.nextInt();//read user input
        System.out.println("Seller's Name");//output
        String S_name = scanner.next();//read user input
        System.out.println("Sales Amount");//output
        double Sales_Amount = scanner.nextDouble();//read user input
        System.out.println("Basic Salary");//output
        double Basic_Salary = scanner.nextDouble();//read user input

        if (Sales_Amount>= 50000){// Sales commission is equal and above 50000
            System.out.println("Sales Commission = " +(Sales_Amount*35) /100);//output
        }
        else if (Sales_Amount>= 30000){// Sales commission is equal and above 30000
            System.out.println("Sales Commission = " +(Sales_Amount*20)/100);//output
        }
        else if (Sales_Amount>= 20000){// Sales commission is equal and above 20000
            System.out.println("Sales Commission = " +(Sales_Amount*10)/100);//output
        }
        else if (Sales_Amount>= 10000){// Sales commission is equal and above 10000
            System.out.println("Sales Commission = " +(Sales_Amount*5)/100);//output
        }
        else if (Sales_Amount<= 10000){// Sales commission is equal and less than 10000
            System.out.println("Sales Commission = " +(Sales_Amount*2)/100);//output
        }


    }
}
