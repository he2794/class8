package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                continue;  // skip
            }
            System.out.println(i);

        }
       // if( i==3 ||i==6||i==9){// simple way
          //  continue;
        }
    }
