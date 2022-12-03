package week02_09_17_2022;

public class SumTwoNumber {
    public static void main(String[] args) {
        /*
        1. Create a class named SumTwoNumber, write a Java program to print the sum of two
         */

        //declare first variable
        int firstNumber =10;


        //declare the second variable
        int secondNumber=20;

        //adding two variable and assign in another variable
        int sum= firstNumber + secondNumber;


        //print the result
        System.out.println(sum);
        System.out.println("sum=" +sum);
// firstNumber + secondNumber = sum (value)

        System.out.println(firstNumber +"+" +secondNumber+"="+ sum);

        System.out.println(firstNumber+ "+"+secondNumber+"="+firstNumber+secondNumber);

        int a= 30;
        String s="30";
                        //string+int   concatenation
        System.out.println(s + a);
                            //3030
        String res= s+a;
        String res2 = s + a;
   // automatically assign for mac option+enter
        System.out.println(s+a);
    }
}
