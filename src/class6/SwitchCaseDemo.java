package class6;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String country= scanner.next();

        String country1="USA";

        System.out.println(country.toLowerCase());

        switch( country.toLowerCase()){

            case "usa":
                System.out.println(" Burgers");break;
            case "Italy":
                System.out.println(" pasta");break;

            case "Agh":
                System.out.println(" Ashak");break;
            default:
                System.out.println("Wrong Country");


        }
    }
}
