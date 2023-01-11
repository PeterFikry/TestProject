package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {


        System.out.println(true || true);   //means Or
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(false || true || false || false);  //unless we have even only one true condition the result will be true

        boolean boughtCho = false;
        boolean boughtFlowers = false;
        if (boughtCho || boughtFlowers) {
            System.out.println("I Am Happy");
        } else {
            System.out.println("I Am Sad");

        }

        boolean wifi=true;
        boolean fiveG=false;

        if (wifi||fiveG){
            System.out.println("You are good for browsing the internet");

        }else {
            System.out.println("Either connect to wifi to 5G");
    }
}}