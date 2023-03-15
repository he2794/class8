package class10;

import java.util.Arrays;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {


        int[] arr = {10, 13, 20, 25, 45, 50};
/*
        for(int x:arr){
            if(x%2!=0){
                x=0;*/// we can not change the value or update it
// below code prints all the elements from an array without a loop
        System.out.println(Arrays.toString(arr));
    }
}