import java.util.Scanner;//import scanner calss

public class Lowercase //define the class
{
    public static void main(String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println(" Enter UPPER case : ");//output
        String Uppercase = scanner.next();//read user input
       String s = Uppercase;//read user input
       String Lowercase = s.toLowerCase();//read user input
        System.out.println(Lowercase);//output
    }
}
