package class10;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        // 2D array can hold 1 D array
        // each size of size 3
        String [][] train=new String[3][3];
        String[] cabin0={ "Adam","Zafar" ,"Sam "};
        String[] cabin1={ "Nabi","ali" ,"rose "};
        String[] cabin2={ "Safi","Zahra" ,"Anne "};


        train[0]=cabin0;
        train[1]=cabin1;
        train[2]=cabin2;
        System.out.println(train[2][2]);
        System.out.println(Arrays.toString(train[0]));



    }
}
