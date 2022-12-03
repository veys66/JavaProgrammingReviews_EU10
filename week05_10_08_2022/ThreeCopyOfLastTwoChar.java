package week05_10_08_2022;

import java.util.Scanner;

public class ThreeCopyOfLastTwoChar {
    public static void main(String[] args) {
        /*
        Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.

      Hint: The string length will be at least 2.
         */
        Scanner scanner=new Scanner(System.in);
        String str1 = scanner.next();
        String threeCopies = ""+ str1.charAt(str1.length()-2)+str1.charAt(str1.length()-1)+ str1.charAt(str1.length()-2)+str1.charAt(str1.length()-1)+ str1.charAt(str1.length()-2)+str1.charAt(str1.length()-1);
        System.out.println(threeCopies);

        String word= "Hello";
        int indexOflastChar= word.length()-1; //o
        int indexOfSecondFromLast=word.length()-2; // l

        char last=word.charAt(indexOflastChar);
        char beforelast= word.charAt(indexOfSecondFromLast);
        String lastTwo=""+beforelast+last;
        System.out.println(lastTwo+lastTwo+lastTwo);


    }
}
