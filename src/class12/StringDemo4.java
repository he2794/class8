package class12;

public class StringDemo4 {
    public static void main(String[] args) {

      /* String str="shafigh";
       boolean isEmpty=str.isEmpty();
        System.out.println(str.isEmpty());
        //   String str="      ";  // not empty
        System.out.println( str.isBlank());
        System.out.println("***************");*/


// chech two string are same or not
        String str="Java";
        String str2="JAVA";
        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);
        boolean areEqual2= str.equalsIgnoreCase(str2);
        System.out.println(areEqual2);

    }
}
