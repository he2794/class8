package class9;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        // 5 10  2 3
// add all the numbers from below loop
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum + i;
            System.out.println(i);

        }
        //task4 price item
        double total=0;
        for (int i = 0; i < 3; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println(" enter item and its price");
            String itemName = scan.next();
            double itemPrice = scan.nextDouble();
            total=total+itemPrice;
            System.out.println(" this is the total amount the you have tom pay"+ total);

        System.out.println(" please pay for the items");

     // double amountPaid=scanner.nextDouble();

        }
    }
}