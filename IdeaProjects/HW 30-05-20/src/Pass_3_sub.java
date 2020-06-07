import java.util.Scanner;//import scanner class

public class Pass_3_sub //define the class
{
    public static void main(String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println("enter maths marks");//output
        int Maths = scanner.nextInt();//read user input
        System.out.println("enter science marks");//output
        int Science = scanner.nextInt();//read user input
        System.out.println("enter Gujrati marks");//output
        int Gujrati = scanner.nextInt();//read user input

        if (Maths >= 35 && Science>= 35 && Gujrati>= 35)// each subject have 35 or above marks to pass
        {
            System.out.println("result = " + "pass");//output
        }
        else
        {
            System.out.println("result = " + "fail");//output
        }
    }

}
