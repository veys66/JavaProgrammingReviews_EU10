package week05_10_08_2022;

import java.util.Scanner;

public class RedOrBlue {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a word: ");

        String word = scanner.next();


        if (word.startsWith("red")) {
            System.out.println("red");
        }
        else if(word.startsWith("blue")){
            System.out.println("blue");
        } else {
            System.out.println(" ");
        }


        String str="redxx";
    if(str.startsWith("red")){
        System.out.println("red");
    }else if(str.startsWith("blue")){
        System.out.println("blue");

    }else{
        System.out.println(" ");
    }


    }
}
/*
 Task 4: Given a string, if the string begins with "red" or "blue" print that color string, otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
 */