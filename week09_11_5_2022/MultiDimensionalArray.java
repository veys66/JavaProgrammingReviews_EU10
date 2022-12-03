package week09_11_5_2022;

public class MultiDimensionalArray {
    public static void main(String[] args) {


        int [] firstArray={1,2,3};
        int [] secondArray={1,2,3};
        int [] thirdArray={1,2,3};

        int [][] twoDimenArray={
                {1,2,3},
                {4,5,6},
                {7,8,9,10}
        };

        int[][] array2D= {firstArray, secondArray, thirdArray}; // we can use like this

        System.out.println(twoDimenArray[0][1]);// in order to reach 2 first we need to go to first array by using
        //index of array which is 0 then I need to go to that element by using index of element which is 1
        System.out.println(twoDimenArray[2][2]);
                        //3





    }
}
