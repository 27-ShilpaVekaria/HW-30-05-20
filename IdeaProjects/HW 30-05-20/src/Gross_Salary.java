import java.util.Scanner;//import scanner class

public class Gross_Salary //define the class
{
    public static void main(String[]args)//main method
    {
        int HRA,TA,DA,PF; //giving variables with data type
        Scanner scanner= new Scanner(System.in);//created scanner object
        System.out.println("ID");//output
        int ID = scanner.nextInt();//read user input
        System.out.println("Name");//output
        String Name = scanner.next();//read user input
        System.out.println("Basic Salary");//output
        int Basic_Salary = scanner.nextInt();//read user input

        System.out.println("HRA :" +( HRA = ( Basic_Salary * 10)/100));//read user input of HRA
        System.out.println("TA :" +( TA = (Basic_Salary * 8)/100));//read user input of TA
        System.out.println("DA :" +( DA = (Basic_Salary * 9)/100));//read user input of DA
        System.out.println("PF :" +( PF = (Basic_Salary * 20)/100));//read user input of PF

        int Gross_Salary = (Basic_Salary + HRA + TA + DA) - PF;//read user input of Gross salary
        System.out.println("Gross Salary = " + Gross_Salary);//output

    }
}
