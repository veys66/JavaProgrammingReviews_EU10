package week19_01_14_2023.animals;

import week15_12_17_2022.method_overriding.task2.Bird;
import week15_12_17_2022.method_overriding.task2.Cow;
import week15_12_17_2022.method_overriding.task2.Fish;

public class AnimalPolymorphismTest {

    public static void main(String[] args) {
        //implement polymorphism
        //ParentClass(Reference Type) reference = new SubClassConstructor();

        Animal animal = new Bird();
        animal.move();
        animal = new Cow();
        animal.move();
        animal = new Fish();
        animal.move();
//======================================
        Animal animal1=new Bird();

        /*
        Reference type is deciding which methods are accessible.
        Object is deciding which methods are implemented.

         */

//Reference Type casting
        ((Bird) animal1).hunt();



    }
}