package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
      //class name-variable // new : reserve memory in computer           // by =we asign value to variable
        Scanner scan=new Scanner(System.in);// system.in: tells  the computer we want to read data from keyword


       /* System.out.println();
        System.out.println("Please Enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+"years old");
        System.out.println("please enter your weight");
        double weight= scan.nextDouble();

        System.out.println(" your weight is "+weight);
        System.out.println("are you hungry? ");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+ hungry);*/

      /*  System.out.println("please enter your gender ");
        char gender=scan.next().charAt(0);// char type of input
        System.out.println("your gender "+gender);
*/
        System.out.println("please enter your name");
        String name=scan.next();// when we have to taken only word as input
        System.out.println("your name is "+ name);

        scan.nextLine();// trick to make nextLine method after we have used any other method from Scanner class
        System.out.println("please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("your full name is "+fullName);

       scan.close();//



    }
}
