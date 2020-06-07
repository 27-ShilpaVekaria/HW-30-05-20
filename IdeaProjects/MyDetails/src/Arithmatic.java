public class Arithmatic {
    public static void main( String[] args){
        int x = 5; // given value of variable x
        int y = 10; // given value of variable y

        System.out.println("x + 1 ="+(x++)); // addition will be after print so it prints x and adds 1 after print.
        System.out.println("x + 1 ="+(++x)); // addition will be before print so it is x+1.
        System.out.println("x - 1 ="+(--x)); // subtraction will be before print so it is x-1.
        System.out.println("x - 1 ="+(x--)); // subtraction will be after print so it shows previous x value and subtracts 1 after print.
        System.out.println("x * 2 =" +(x*2)); // multiply 2 with x.
        System.out.println("x + y =" +(x+y)); //it will show = addition of two variables x and y.
        System.out.println("(x+y)/5 = " + (x+y)/5); // divide (x+y) with 5.
        System.out.println("((x-1)+y)%3 = " +((x-1)+ y)%3); // when (x-1)+y is divided by 3 the remainder will be 2.

    }
}
