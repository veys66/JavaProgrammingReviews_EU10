package week03_09_24;

public class NumberPositiveOrNegative {
/*
Task 4: Create a class which is "NumberPositiveOrNegaive" and
create a variable if the variable is positive print "positive" if not "negative"
 */
    public static void main(String[] args) {
        //create a variable
        int a= 10;

        //compare variable with zero
        boolean aIsPositive = a >0;
        //if condition is true print the positive
        if (aIsPositive){//if(a>0)
            System.out.println("POSITIVE");
    }else {
            //else print negative
            System.out.println("NON-POSITIVE");
        }
        if(true)
            System.out.println("if block is working");
        System.out.println("I am outside of the block");
/*
if the condition us true
print 45
print 50
 */
if (true)
    System.out.println(45);
    System.out.println(50);

    boolean result=true;
    if (result)
        System.out.println(6);
}


    }

