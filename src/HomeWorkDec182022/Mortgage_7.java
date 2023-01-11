package HomeWorkDec182022;

public class Mortgage_7 {
    public static void main(String[] args) {

        double mortgageRate=3;
        int housePrice=190000;

        if (mortgageRate>4.5){
            System.out.println("user will not buy a house");}
        else {
            System.out.println("user will consider buying the house");
            if (housePrice>200000){
                System.out.println("user will take a loan");}
            else{
                System.out.println("user will pay cash");
            }
        }
    }
}
