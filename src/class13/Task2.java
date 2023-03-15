package class13;

public class Task2 {
    public static void main(String[] args) {
        // create a string print reverse (Sunday>yadnus)

        String str="Sunday";
        for (int i = str.length()-1; i>=0; i--) {
            System.out.println(str.charAt(i));
        }

        for (int j = 5; j >=0; j--) {
            System.out.print(str.charAt(j));
        }
    }
}
