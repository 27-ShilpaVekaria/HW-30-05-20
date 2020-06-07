import java.util.Scanner;//import scanner object

public class Symbole//define the class
{
    public static void main(String[]args)//main method
    {
      Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println(" Enter first value");//output
        int a = scanner.nextInt();//read user input
        System.out.println(" Enter second value");//output
        int b = scanner.nextInt();//read user input
        System.out.println(" Enter Symbol ");//output
        char Symbol = scanner.next().charAt(0);//read user input

        if (Symbol=='+'){//  symbol is addition
            System.out.println("a+b =" +(a + b));//output
        }
        else if (Symbol=='-'){//  symbol is subtraction
            System.out.println("a-b =" +(a - b));//output
        }
        else if (Symbol=='/'){//  symbol is quotient
            System.out.println("a/b =" +(a / b));//output
        }
        else if (Symbol=='*'){//  symbol is multiply
            System.out.println("a*b =" +(a * b));//output
        }
    }
}
