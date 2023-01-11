package class6;

public class LogicalAnd {
    public static void main(String[] args) {

        boolean understandJava=true;         //if any case one of them is false the result will be false
        boolean enjoyJava=true;

        if (understandJava&&enjoyJava){
            System.out.println("You get the Job Quickly");
        }else {
            System.out.println("We need to work hard");
        }
    }
}
