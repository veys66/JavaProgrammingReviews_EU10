package week15_12_17_2022.method_overriding.task1;

public class TestsInterest {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.calculateTheInterest();

        Akbank akbank=new Akbank();
        akbank.calculateTheInterest();

        GarantiBank garantiBank=new GarantiBank();
        garantiBank.calculateTheInterest();

        IngBank ingBank= new IngBank();
        ingBank.calculateTheInterest();

        TestsInterest testsInterest=new TestsInterest();

        System.out.println(testsInterest.getClass().getSimpleName());


    }
}
