package class25;

public class WashAbleTester {
    public static void main(String[] args) {

        WashAble[] washAbles = {new Phone(), new SmartWatch(), new Inverter()};

        for (WashAble w : washAbles) {
            w.wash();
        }

    }
}
