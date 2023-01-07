package week_18_01_07_2023.exception;

public class ThrowsExample {
    public static void main(String[] args) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
