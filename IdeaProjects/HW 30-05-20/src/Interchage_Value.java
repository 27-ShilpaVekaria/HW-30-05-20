import java.util.Scanner;//import scanner class

public class Interchage_Value //define the class
{
    public static void main(String[]args)//main method
    {
        Scanner scanner= new Scanner(System.in);//created scanner object
        int L ;//variables with data type

        System.out.println("Enter 1st number");//output
        int S = scanner.nextInt();//read user input
        System.out.println("Enter 2nd number");//output
        int K = scanner.nextInt();//read user input
        L = S;//L is S
        S = K;//S is K
        K = L;//K is L
        System.out.println("1st number : "+S);//output
        System.out.println("2nd number : "+K);//output
    }
}
