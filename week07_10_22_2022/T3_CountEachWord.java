package week07_10_22_2022;

public class T3_CountEachWord {
    public static void main(String[] args) {
String names= " Adam Adam Barry Aysun Aysun";
        String search = "Adam";
        
        int counter=0;
        
        while (names.contains(search)){
            counter++;
            names= names.replaceFirst(search, "");
        }

        System.out.println("counter = " + counter);



    }
}
/*
 Count each name in sentence.
  
    input : 

  String names = "Adam Adam Barry Aysun Aysun";

    output: 

    Adam-2 Barry-1 Aysun-2
 */