package class5;

public class SwitchCaseDEmo2 {
    public static void main(String[] args) {

        String day="Friday";
        switch (day) {
            case "Monday":
                System.out.println("1");break;
            case "Tuesday":
                System.out.println('2');
               case "Wednesday":
                System.out.println("3");break;
            case "Thursday":
                System.out.println("4");break;
            default:
                    System.out.println("Wrong Day");
        }
    }
}
