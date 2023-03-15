package class12;

public class Task6 {
    public static void main(String[] args) {

        String [][] countries= {{"USA", "Canada", " Mexico"},
                {"Brazil", " Argentina", " Peru"},
                {"Germany", "United", " Kingdom", "France"},
                {"China", "India", " Japan", "Russia"}};

        System.out.println();

       int counter = 0;
       for( String [] country:countries){
           for(String s:country){
               System.out.print(s+" ");

       /* for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]+" ");*/
                counter++;
            }
            System.out.println();
        }
        System.out.println(" Total countries "+counter);






        }
    }





