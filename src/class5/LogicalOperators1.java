package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {


        System.out.println(true||true);// true
        System.out.println(true||false);// true
        System.out.println(false||false);//false
        System.out.println(false||false||true||false);// true


        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if(boughtCho||boughtFlowers){
            System.out.println("Happy");
        }else{
            System.out.println(" SADDD");
        }
        boolean wifi=true;
        boolean fiveG=true;
        if (wifi|| fiveG){
            System.out.println(" goooddd ");
        }else{
            System.out.println(" connect to wifi or G");
        }
        //end operator



    }
}
