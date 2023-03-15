package class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
 Scanner scanner=new Scanner(System.in);
     // credit card 10 times  if yes stop
       /* Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(" Do you apply for credit card");
            String input= scanner.next();
            if (input.equalsIgnoreCase("yes")){
                break;//
                */
        System.out.println(" Entertwo numbers starting point and adding point ");
        int start= scanner.nextInt();
        int end= scanner.nextInt();
        System.out.println("start "+start+ " end "+end);

        for (int i = start; i <= end; i++) {
            if(i%2==0){
                System.out.println("even"+i);
            }else{
                System.out.println(" odd"+i);
            }
        }
        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <=end ; i++) {
            if(i%2==0){
               evenSum+=i;
            }else{
                oddSum=oddSum+i;
            }
        }
        System.out.println("sum of all the even numbers "+evenSum);
        System.out.println("sum of all the odd numbers "+oddSum);
    }
}
