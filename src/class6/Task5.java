package class6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1, number2, number3;
        System.out.println("Please Enter three numbers");
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println(" larger is " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(" largest is " + number2);
        } else if (number3 > number1 && number3 > number3) {
            System.out.println(" largest is " + number3);
        }

    }
}