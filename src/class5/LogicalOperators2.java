package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        System.out.println(true&&true);        //In this case if we have even only one false the result will be false
        System.out.println(true&&false);
        System.out.println(false&&false);

        /* if the score in all the subjects are greater than 90 print brilliant student
        otherwise print you need to work hard
         */

        double mathScore=92.5;            //&& means and
        double historyScore=91.5;
        double scienceScore=93.5;

       /* if(mathScore>90){
            if (historyScore>90){
                if (scienceScore>90){
                    System.out.println("You are a brilliant student");
                }else {
                    System.out.println("You need to work hard");
                }*/
        if (mathScore>90&&historyScore>90&&scienceScore>90){            // it's good, but it's not give us flexibility like more clarification
            System.out.println("You are a brilliant student");
        }else {
            System.out.println("You need to work hard");
        }

    }
}
