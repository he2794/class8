package class7;

public class ForLop {
    public static void main(String[] args) {

        int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("***********************");
        for(int i =1;i<30;i+=2){
            System.out.println(i);
           // if()
        }
    }
}




