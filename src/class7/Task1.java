package class7;

public class Task1 {
    public static void main(String[] args) {

        boolean workDay = true;
        int day = 4;
        while (day < 8) {
            if (day <= 5) {
                System.out.println("I need a day off");

            } else {
                System.out.println(" i do not need");
                workDay=false;
            }
            day++; // it is equal to day=day+1 day+=1
        }
    }
}