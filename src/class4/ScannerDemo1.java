package class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
        System.out.println("Enter Your age");
       int age=input.nextInt();
        System.out.println("you are "+age+"years old");
        
    boolean diploma=true;
      if(diploma){
          System.out.println("congratulations");
      }else{
          System.out.println(" you should get a degree");
      }

    }
}
