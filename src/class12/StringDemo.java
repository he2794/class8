package class12;

public class StringDemo {
     // the most important class
     public static void main(String[] args) {
         //creating of object of the string class
       String strObj=new String ("Java");
        // another way of creating an object of string class a shorter way//objects of string class
       String strObj2="Java";

         System.out.println(strObj2.length());// length is behavior here  //put the inputs here((+))
       String str="Banana";
       int len=str.length();
         System.out.println(len);

       String name="Rafik poyaaa";
       if(name.length()>10){
           System.out.println("name cant be more than 10 letters");
       }



     }
}
