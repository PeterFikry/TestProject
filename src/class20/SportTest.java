package class20;

public class SportTest {
    public static void main(String[] args) {

        Cricket crick=new Cricket("Cricket","Pakistan","Green Helmet");
        crick.display();

        Soccer soccer=new Soccer("Soccer","Argentina","Oliver's",11);
        soccer.display();
        soccer.displayTeam();
    }
}
