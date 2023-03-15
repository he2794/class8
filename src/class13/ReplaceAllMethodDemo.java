package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
       String str="kKJHerty123451!@@##$$%)(;";
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[a-z,A-Z]","*"));
        System.out.println(str.replaceAll("[a-z,A-Z]","*"));
        System.out.println(str.replaceAll("[a-zA-Z0-9]","*"));


    }
}
