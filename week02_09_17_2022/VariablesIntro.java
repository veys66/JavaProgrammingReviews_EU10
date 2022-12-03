package week02_09_17_2022;

public class VariablesIntro {
    public static void main(String[] args) {
        /*
        Variable Types?
        1. Primitive
        -Numerical Primitives:
        double > float > long > int > short > byte
        -boolean
        -char : define single code


        2. Non-Primitive(in future we will go on deep)
        String define String in "Adam"

        how to declare variables:
   *data type variable name=data;

   Variable Naming Rules:

   1. Must be unique (inside the same block-method)
   2. Lower camelCase
   3. We CAN NOT start with numbers
   4. We CAN NOT use Java Reserved words
   5. For special character _ (underscore) $ (dolar sign)
   6. make it readable and understandable
         */
// *data type variable name=data;
        // we need to use byte (
        int age = 37;
        //byte myByte= 129; //we can not but this value in a byte from

        short myShort= 12;
        long myLong=12233333333333L; //('f you want to make integer to long we need put capasity
        //default data type for compiler is int

        double myDouble=25.5;
        double myDouble1=25; // what is my output?

        float myFloat=12.5f;//default data type for compiler is double
        float myFloat1= (float) 12.5;
        /*
        Explicit casting
        Done by developer
        Manual
         */
        long l=20; //l=20
        int i= (int)l; // we have to say to compiler make l is int

        double d=l; //implicit casting done by compiler

        //implicit casting vs explicit casting
        // implicit casting is assigning small data type to bigger one
        int a = 20;
        long b= 20;
        b=a;             //assingning from right to left //implicit casting

        //explicit casting is assigning bigger data type to smaller one

        a= (int) b; // explicit casting

        //addition
        /*
        number + number = number
        int + int = int
        int + short = int
        6+6=12
         */
        //Concatenation

        /*
        String + anything => String
        123+Adam= 123Adam
         */
        /*
        12+23+Adam= ?
        35+Adam
        35Adam

         */








    }


}
