package week_18_01_07_2023;

public class CustomArithmeticException extends RuntimeException{
    public CustomArithmeticException(String you_have_an_error) {
      super("You have an error with divide with 0");

    }
}
