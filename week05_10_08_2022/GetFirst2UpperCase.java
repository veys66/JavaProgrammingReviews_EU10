package week05_10_08_2022;

import java.util.Scanner;

public class GetFirst2UpperCase {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter a word");
                                    //01234
        String word=scanner.next();//Hello
        String result=""+word.charAt(0)+word.charAt(1)+"";
        String result2=word.charAt(0)+""+word.charAt(1);

        System.out.println(result.toUpperCase());
        System.out.println(result2.toUpperCase());
    }
}
