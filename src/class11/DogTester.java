package class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
     // input.next();
        // this is how we create a object of a class

        Dog Jacky=new Dog();

        Jacky.bark();
        Jacky.sleep();
        Jacky.eat();
        System.out.println(Jacky.age);
    }
}
