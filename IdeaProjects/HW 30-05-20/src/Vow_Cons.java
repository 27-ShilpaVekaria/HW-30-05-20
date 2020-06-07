import java.util.Scanner;//import scanner class

public class Vow_Cons//define the class
{
    public static void main(String[]args)//min method
    {
        Scanner scanner= new Scanner(System.in);//created scanner object
        System.out.println("Enter an Alphabet");//output
        char Char = scanner.next().charAt(0);//read user input

        if ((Char=='a')||(Char=='e')||(Char=='i')||(Char=='o')||(Char=='u')||(Char=='A')||(Char=='E')||(Char=='I')||(Char=='O')||(Char=='U'))
        {//the character shoud be from one of the letter A,E,I,O,U(vowels)
            System.out.println("The letter is Vowel");//output
        }
        else
        {
            System.out.println("The letter is Consonant");//output
        }
    }
}
