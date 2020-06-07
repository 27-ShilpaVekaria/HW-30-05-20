public class Arithmatic1 {//globle variables- outside method -inside class
   static int a =20;
   static int b =30;
   static int Ans;

   static void calc(){
       Ans= a++;
       System.out.println(Ans);
       Ans= ++a;
       System.out.println(Ans);
       Ans= a--;
       System.out.println(Ans);
       Ans= --a;
       System.out.println(Ans);

   }


    public static void main(String[]args){

        calc();
    }
}
