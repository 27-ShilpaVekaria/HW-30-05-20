import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;//import scanner class

public class Odd_Even// define the class
{
    public static void main(String[] args)//main method
    {
        Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println("Enter number: ");//output
        int a = scanner.nextInt();//read user input
        String b = (a % 2 ==0) ? "Even" : " Odd";// if b is true than take Even otherwise Odd
        System.out.println(a + " is " + b);//out put

    }

}
