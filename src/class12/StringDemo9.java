package class12;

public class StringDemo9 {
    public static void main(String[] args) {
       String str="dfghj2345#$%^&" ;

        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){

                    counter++;
                }
            }
            System.out.println(" total isAlphabet in str "+ counter);
        System.out.println("***************" );
           // int counter2;
        String str1=" Java is not pain";
        System.out.println(str1.indexOf("J"));
        System.out.println(str1.indexOf("a"));

        for (int i = 0; i < str1.length(); i++) {


            System.out.println(str1.charAt(0) + " has the index " + i);

        }
        String Str1= "Send it somewhere";
        String newStr=str1.substring(5);
        System.out.println(newStr);
// we can also specifi the starting and ending point
        System.out.println(str.substring(0,27));


        }

    }

