package class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) { // outer for loop        //000000
            //
            if(i==1){ // to skip the middle line
                System.out.println();
                continue;                                     //0000000
            }
            for (int j = 0; j < 5; j++) { //inner for loop

                    System.out.print("*");
                }
            System.out.println();
            }
        }}