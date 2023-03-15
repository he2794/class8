package class5;

public class Task1 {

    public static void main(String[] args) {

        int num;
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2) {
            if (num1 < num3) {
                System.out.println("number is the largest" + num1);
            }
        }
        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("the migest numbei is " + num2);
            }
        }
        if (num3 > num1) {
            if (num3 > num2) {
                System.out.println("the migest numbei is " + num3);
            }

        }
    }

}