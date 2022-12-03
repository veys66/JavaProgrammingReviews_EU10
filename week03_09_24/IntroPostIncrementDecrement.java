package week03_09_24;

public class IntroPostIncrementDecrement {
    /*
    Task 1 : Create a class which is "IntroPostIncrementDecrement" define a variable,
          int a=5;
          print a;
          print the a++;
          print the a--;
     */
    public static void main(String[] args) {
        int a= 5;
        System.out.println(a);
        System.out.println("a = " + a);// variable name and value at the same time
        System.out.println("==increment end==");
        System.out.println(a++);
        System.out.println(a);//my action is printing first do your action
        System.out.println(a);// a will be 6
        System.out.println("==decrement end==");
        System.out.println(a--);// do your action printing

        System.out.println(a);
        System.out.println("==decrement end==");


        int b =10;

        System.out.println(b--);//first do action (print) we will print 10 and the second change value 9
        System.out.println(b--);// I wil print 9 and decrement it will be 8 for next statement
        System.out.println(b);



        long c= 30L;
        long d= (short)a;


        long x= 3_000L;
        double y=(float)x;
        int z= (short)x;
        System.out.println(z%100);
        System.out.println((int) (10.0/3) );

    }
}
