import java.util.Scanner;//import scanner class

public class Marksheet //define the class
{
    public static void main(String[]args)//main method
    {
        Scanner scanner = new Scanner(System.in);//created scanner object
        System.out.println("Enter Student name");//output
        String name = scanner.next();//read user input
        System.out.println("Enter roll no.");//output
        int roll_no = scanner.nextInt();//read user input
        System.out.println("Maths");//output
        int Maths = scanner.nextInt();//read user input
        System.out.println("Science");//output
        int Science = scanner.nextInt();//read user input
        System.out.println("Gujrati");//output
        int Gujrati = scanner.nextInt();//read user input

        int total = Maths + Science + Gujrati;//read user input
        System.out.println("Total Marks=" + total);//output
        double percentage = (total * 3) / 100;//read user input
        System.out.println("Persentage = " + percentage);//output
        if (total >= 105) // total is addition of 3 subjects
        {
            System.out.println("PASS");//output
        }
        else
        {
        System.out.println("FAIL");//output
        if( percentage>=35 && percentage<50){//for grade 'c' percentage should be in between 35 and 50
            System.out.println("Grade C");//output
        }
        else if (percentage>=50 && percentage<60){//for grade 'B' percentage should be in between 50 and 60
            System.out.println("Grade B");//output
        }
        else if (percentage>= 60 && percentage<80){//for grade 'A' percentage should be in between 60 and 80
            System.out.println("Grade A");//output
        }
        else if (percentage>=80 && percentage<100){//for grade 'A+' percentage should be in between 80 and 100
            System.out.println("Grade A+");//output
        }


    }
}
}

