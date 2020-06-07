import java.util.Scanner;//import java class

public class Average //Define the claSS
{
    public static void main(String[]args)//main method
    {

        Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println("N1");// output N1
        int num1 = scanner.nextInt();//read user input
        System.out.println("N2");//output N2
        int num2 = scanner.nextInt();//read user input
        System.out.println("N3");//output N3
        int num3 = scanner.nextInt();//read user input
        System.out.println("N4");//output N4
        int num4 = scanner.nextInt();//read user input
        System.out.println("N5");//output N5
        int num5 = scanner.nextInt();//read user input
        int Average = (num1+num2+num3+num4+num5)/5;//Average = All 5 numbers addition devided by 5
        System.out.println("AVERAGE : " +(Average = (num1+ num2+ num3+ num4+ num5)/5));//output result
    }
}

