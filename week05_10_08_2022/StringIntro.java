package week05_10_08_2022;

public class StringIntro {
    public static void main(String[] args) {
        //we can create String two diffirent ways:
        //1. String literal

        String str= "Kazim";
        String str1= "Kazim";
        System.out.println(str1==str);

        //2. new keyword

        String str2= new String("Kazim");
        String str3= new String("Kazim");
        System.out.println(str1==str2);

        System.out.println(str2==str3);


        //if we want to get some part of the string we need to use substring()
                    //01234
        String subs= "Cydeo";
        //get the yde from the subs variable
        System.out.println(subs.substring(1,4));
        //get the Cy from he subs
        System.out.println(subs.substring(0,2));
        //get the "deo" from subs variable
        System.out.println(subs.substring(2));

        //get the "ydeo" from subs variable

        System.out.println(subs.substring(1));

        //if we want to multiply(repeat) one word we need to use repeat()


        String str4= "Adam";
        System.out.println(str4.repeat(4));

        //if we want to check our string is empty or not we need to use isEmpty() method
        String emptyWord= ""; // isEmpty method is checking lenght
        System.out.println(emptyWord.isEmpty());

        //if we want to check our string is blank or not we need to use isBlank() method
        String blankWord= "   "; //it is checking spaces

        System.out.println(blankWord.isBlank());


        //if we want to compare two string values with exact matching we can use equals()


        //if we want to compare two string values without exact matching (lower case or upper case) we can use equals()
        //equalIgnorecase

        String str6="Word";
        String str7="word";

        System.out.println(str6.equals(str7)); //false
        System.out.println(str6.equalsIgnoreCase(str7)); //true


        //starsWith method is using for checking the string is starting with given char sequence or not
        //endsWith method is using for checking the string is ending with char  given sequence or not

        String sentence5= "Java is a good language";
        System.out.println(sentence5.startsWith("Java"));

        System.out.println(sentence5.endsWith("language"));

        //contains method is using for checking the given char sequences is in string or not

        String sentence6= "Java is Java";



    }
}
