package class13;

public class StringRecap {
    public static void main(String[] args) {

        String str=" Java is great";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
// what is the input to the charAt() method its int out is a char

// count how many times leeter a is appeared in the String?

        }

int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("letter a has appeared ");
    }
}
