package class3;

public class TypeCasting {
    public static void main(String[] args) {
 // type casting= byte
        long number=125;                 //byte
        byte shorterNumber=(byte)number; //short
        float f=10.5f;                   //int
        int num=(int)f;                  //long
        System.out.println(shorterNumber);//float f
        System.out.println(num);         //double

        byte b=10;
        int number2=b;//if we try to
        short c=(short)number2;
        System.out.println(b);

        float eggs=12.5f;//12 is wholePart -.5 is decimal Part// float to int
        //use typecasting to change  decimal to 12

        int wholePart=(int)eggs;
        System.out.println(wholePart);
        //char to character
        System.out.println((char)97);


    }
}
