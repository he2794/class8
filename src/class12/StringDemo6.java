package class12;

public class StringDemo6 {
    public static void main(String[] args) {
        String str=" J   a V a    ";
        //removes space
        System.out.println(str.trim());
        System.out.println("*********************");

        String str2= "I love Java";

        boolean startsWith=str2.startsWith("I love");
        System.out.println(startsWith);
        System.out.println(str2.startsWith("java"));

        System.out.println(str2. toLowerCase().startsWith("java"));// method changing

        String str3="Java is love";
        char c=str3.charAt(2);// how many character are there in the string
        System.out.println(c);

        for (int i = 0; i < str3.length(); i++) {
            System.out.println(str.charAt(i));
            System.out.println("**************");
        }
            int counter=0;
            for (int j = 0; j < str.length(); j++) {

               // if(str3.charAt(i)=='a'){
                    counter++;

            }
        }
       // System.out.println(counter);
    }
//}
