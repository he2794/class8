package class6;

import java.util.Scanner;

class LogicalOrDemo {
    public static void main(String[] args) {

        Scanner san = new Scanner(System.in);
        System.out.println(" Please Enter a day");
        String day = "Monday";

        if (day.equals("Monday") || day.equals("Friday")) {
            System.out.println(" not class");
        } else if (day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Saturday||sunday")) {
            System.out.println("Java class");

        } else {
            System.out.println(" Review class");
        }
        // logical and ||
        boolean undrwstandJava = true;
        boolean enjoyJava = true;

        if (undrwstandJava && enjoyJava) {
            System.out.println(" job quickly");
        } else {
            System.out.println(" we need to work hard");
        }

    }
}
