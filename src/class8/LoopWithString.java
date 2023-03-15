package class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" enter name");

        while (scan.next().equalsIgnoreCase("shah")) {
            System.out.println("Great student  that study String in loop");
        }
    }
}