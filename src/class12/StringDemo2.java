package class12;

public class StringDemo2 {
    public static void main(String[] args) {

        String str="JAVA  is FUN 123#$%^&";
        String newStr=str.toLowerCase();
        System.out.println(newStr);

        System.out.println();

        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();

        System.out.println("******************");

        String firstName=" Akhtar";
        String lastName=" lava";
        String fullName=firstName+" "+ lastName;// most widely used
        System.out.println(fullName);
        System.out.println(firstName + " "+lastName);
        System.out.println(firstName.concat(" "+lastName));




    }
}
