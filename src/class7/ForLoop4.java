package class7;

public class ForLoop4 {
    public static void main(String[] args) {

        //1 2 4 5 7 8 10
        for (int i = 0; i < 20; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("********Time*********");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " =" + (5 * i));
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("4 * " + i+ " =" + (4 * i));

        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("8 * " + i + " =" + (8 * i));
            System.out.println(i);
        }
        for (int i =10; i > 0; i--) {

            System.out.println(i);

        }
      //  for (int i = 30; i >0 ; i--) {
         //   System.out.println(i);

        }
    }
