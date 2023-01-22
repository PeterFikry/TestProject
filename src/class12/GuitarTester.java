package class12;

public class GuitarTester {
    public static void main(String[] args) {

        Guitar cordoba=new Guitar();
        cordoba.brand="Cordoba";
        cordoba.model="C7-CE Classical Guitar";
        cordoba.year=2020;
        cordoba.color="Beige";
        cordoba.sounds();
        cordoba.strings();
    }
}
