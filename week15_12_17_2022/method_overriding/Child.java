package week15_12_17_2022.method_overriding;

public class Child extends ParentClass{

    //Access modifier should be more visible

    @Override
    public void move() {
        super.move();
    }
}
