package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

     /*   String [] names={"Sam", "John","Mary", "Fizzy"};

        for(String name: names){
            System.out.println(name);
        }*/
        int [] arr={ 10, 13,20,25, 45,50 };

        for (int i = 0; i < arr.length; i++) {
            if(i%2!=0){
                arr[i]=0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
