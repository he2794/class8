package class12;

public class PhoneTester {
    public static void main(String[] args) {

     Phone iphone=new Phone();

     iphone.brand="Tphone";
     iphone.color="Gold";
     iphone.price=1500;
     iphone.version=11;
     iphone.storage=65;
     iphone.isUnlocked=true;
    iphone.ringing();


        Phone googlePixel2=new Phone();

        googlePixel2.brand="Pixel";
        googlePixel2.color="g";
        googlePixel2.price=1000;
        googlePixel2.version=13;
        googlePixel2.storage=876;
        googlePixel2.isUnlocked=false;
        googlePixel2.sendingMessages();

        Phone phone3=new Phone();

        phone3.brand="Samsung";
        phone3.color="Silver";
        phone3.price=1100;
        phone3.version=9;
        phone3.storage=87;
        phone3.isUnlocked=true;

         phone3.ringing();




    }
}
