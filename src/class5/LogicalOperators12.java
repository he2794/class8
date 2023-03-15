package class5;

public class LogicalOperators12 {
    public static void main(String[] args) {

        double mathScore = 92.5;
        double historyScore = 91.5;
        double ScienceScore = 93.5;

       /* if(mathScore>90){
            if(historyScore>90)
            if(ScienceScore>90)
            System.out.println("Briliant");
        }else{
            System.out.println("need more practice");
        }*/

        // logical and operator:

        if (mathScore > 90 && ScienceScore > 90 && ScienceScore > 90) {// it is true if allll condition are true
            // when it has  2true and 1 false its false
            System.out.println(" briliant studenu");
        } else {
            System.out.println(" Study more");
        }
        if (10 > 5 || 4 > 6) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
        String name = "Adam";
        int age = 30;
        if (name.equals("Adam") && age == 30) {
            System.out.println(" Adam , batch13");
        } else {
            System.out.println(" ????");
        }
        boolean isTrue=false;
        if(!isTrue){
            System.out.println(" you got it");
        }else{
            System.out.println(" need practice");
        }
    }
}