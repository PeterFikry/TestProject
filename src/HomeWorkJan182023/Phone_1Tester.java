package HomeWorkJan182023;

public class Phone_1Tester {
    public static void main(String[] args) {

        Phone_1 iPhone=new Phone_1();
        iPhone.model="14 Pro Max";
        iPhone.color="Gold";
        iPhone.screenSize=6.15;
        iPhone.memory=256;
        iPhone.camera();

        Phone_1 samsung=new Phone_1();
        samsung.model="Galaxy S22 Ultra";
        samsung.color="Black";
        samsung.screenSize=6.55;
        samsung.memory=512;
        samsung.keyPad();

        Phone_1 pixel=new Phone_1();
        pixel.model="7 Pro";
        pixel.color="Red";
        pixel.screenSize=5.99;
        pixel.memory=128;
        pixel.speaker();

        System.out.println(iPhone.model);
        System.out.println(samsung.color);
        System.out.println(pixel.memory);

    }
}
