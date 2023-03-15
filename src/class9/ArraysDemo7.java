package class9;

public class ArraysDemo7 {
    public static void main(String[] args) {

      int [] numbers={10,20,' ', 30, ' ',' ',4 ,5,6,7,80};
      int sum=0;
        for (int i = 0; i <numbers.length; i++) {
            if(numbers[i] %2==0){
                sum=sum+numbers[i];

        }}
        System.out.println(sum);
 int count=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==10.5){
                count++;
            }

        }
        System.out.println(count);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
}}
