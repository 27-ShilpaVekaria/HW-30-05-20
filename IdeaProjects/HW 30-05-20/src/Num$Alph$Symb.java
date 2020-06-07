import java.util.Scanner;//import scanner class

public class Num$Alph$Symb//define the class
{
    public static void main(String[]args)//main method
    {
       Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println("Enter Value: ");//output
        char Char = scanner.next().charAt(0);//read user input

        if (Char>='0' && Char<='9'){//number should be in between 0 to 9
            System.out.println(Char +" It is a number");//output
        }
        else if((Char>='a' && Char<='z' ) || (Char>= 'A' && Char<='Z')){//character should be in between a-z and A-Z
            System.out.println(Char +" It is an Alphabet");//output
        }
        else
        {
            System.out.println(Char +" It is a Symbol");//output
        }
    }
}
