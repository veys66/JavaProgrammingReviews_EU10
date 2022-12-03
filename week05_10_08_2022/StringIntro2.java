package week05_10_08_2022;

public class StringIntro2 {
    public static void main(String[] args) {
        String str1= "     Adam    ";
        System.out.println(str1.trim());

        System.out.println(str1);//we will have spaces in here because String class in immutable

        //if you want to get index of char or String we need to use indexOf () method

        String number="0123456";
        System.out.println(number.indexOf('3'));

        //get the index of 56
        System.out.println(number.indexOf("56"));
        //get the index of 14
        System.out.println(number.indexOf("14")); // it will return -1 means that there is no 14 in that string

        String sentence = "Java is a programming language";

        System.out.println(sentence.indexOf(" programming"));
                         //01234567891011
        String sentence1= "Java is Java";
        System.out.println(sentence1.indexOf("Java"));//return me 0
        System.out.println(sentence1.lastIndexOf("Java")); //return me 8
        //if we want to replace some part of the string we need to use replace() 
/*
Task 1: Given a string, print the string made of its first two chars, so the String "Hello" yields “HE".
 */
        String greeting = "Hello";

        char greeting1 = greeting.charAt(0);
        char greeting2 = greeting.charAt(1);

        String first2 = ""+greeting1 + greeting2;
        System.out.println(first2.toUpperCase());
    }
}
