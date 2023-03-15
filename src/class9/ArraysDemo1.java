package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {

       /* String[] names = {"Slava", "Sfi ", "Jason", " Nabi", "Anes", "Joseph"};
        System.out.println(names.length);
        for (int i = 0; i <= 5; i++) {
            System.out.println(names[i]);*/
// 10 20 30 45 50
        int sum=0;
        int[] numbers = {10, 20, 30, 45, 50};
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i]; // adding all the numbers
        }
        System.out.println(sum);
    }
}