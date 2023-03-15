package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        boolean summer = true;
        int temp = 75;
        while (summer) {
            if (temp <= 100) {
                System.out.println(" i love summer " + temp);
            } else {
                System.out.println(" its very hot " + temp);
                break;

            }
            temp += 5;
        }
        int temp2 = 75;
        while (temp2 <= 105) {
            if (temp2 <= 100) {
                System.out.println("i love summer " + temp);

            } else{
                System.out.println("very hot");
            }
        }
    }
}