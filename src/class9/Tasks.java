package class9;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

// print numbers 1-50 exept those divisible by 3
      /*  for (int i = 1; i <=50; i++) {
            if(i%3!=0){

                System.out.println(i);
            }
        }*/
    //task2= credit card 10 times if get yes p stio asking
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
        System.out.println(" Do you want a credit card?");
        String input=scan.nextLine();
        if( input.equalsIgnoreCase("yes")){
            break;
        }



        }
    }
}
