package class12;

public class CarTester {
    public static void main(String[] args) {
        //create the object of the class

        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Black";
        bmw.moveForward();
        bmw.applyBrakes();

            Car audi=new Car();
            audi.model="E-tron";
            audi.make="Audi";
            audi.year=2022;
            audi.color="Black";
            audi.moveForward();



    }
}
