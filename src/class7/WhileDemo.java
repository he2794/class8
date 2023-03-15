package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        boolean condition=true;
        Scanner scanner=new Scanner(System.in);
        int number=10;
        while(condition){
            System.out.println(" enter  number between 10-20");
            int userInput= scanner.nextInt();
            if(userInput>number){
                System.out.println("your Entered num is greater");
            }else if(userInput<number){

                System.out.println("entered num is smaller num");
            }else{
                System.out.println(" you won");
                condition=false;
            }

        }
    }
}
