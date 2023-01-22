package class12;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iPhone = new Phone();
        iPhone.brand = "Iphone";
        iPhone.color = "Gold";
        iPhone.price = 1500;
        iPhone.version = 11;
        iPhone.storage = 256;
        iPhone.isUnlocked = true;

        Phone GooglePixel = new Phone();
        GooglePixel.brand = "Pixel";
        GooglePixel.color = "black";
        GooglePixel.price = 900;
        GooglePixel.version = 7;
        GooglePixel.storage = 512;
        GooglePixel.isUnlocked = false;
        GooglePixel.sendingMessages();


        Phone Samsung = new Phone();
        Samsung.brand = "Samsung ";
        Samsung.color = "Silver";
        Samsung.price = 700;
        Samsung.version = 9;
        Samsung.storage = 64;
        Samsung.isUnlocked = false;
        Samsung.ringing();


    }
}
