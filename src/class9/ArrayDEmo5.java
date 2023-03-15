package class9;

public class ArrayDEmo5 {
    public static void main(String[] args) {

       /* int number = 10;
        int[] numbers = new int[5]; // an empty array os size 5 will be created// 5 is the size of array
        System.out.println(numbers[2]);*/


    int num;
        int [] numbers2=new int[6];

        numbers2 [0]=45;
    numbers2 [1]=45;
    numbers2 [2]=44;
    numbers2 [3]=45;
    numbers2 [4]=45;
    numbers2 [5]=45;

            int sum=0;
        for (int i = 0; i < numbers2.length; i++) {
            if(i%2==0){
                sum=sum+numbers2[i];
            }

        }
        System.out.println(sum);
    }
}
