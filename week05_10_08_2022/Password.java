package week05_10_08_2022;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        /*
        Task 9: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
         */
/*
        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + "x");
*/
            String password="Cydeo";
            char encryptWith= 'X';
            String encryptedPassword= "";


            for (int i =0 ; i < password.length(); i++) {
                //encryptedPassword= encryptedPassword + password.charAt(i) + encryptWith;
                encryptedPassword += "" + password.charAt(i) + encryptWith;
            }
            System.out.println(encryptedPassword);
        }
    }

