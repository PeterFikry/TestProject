package Project24012023;

public class swap2Numbers_6 {
    public static void main(String[] args) {

        int firstNumber=15;
        int secondNumber=30;
        System.out.println("First number before swap is "+firstNumber);
        System.out.println("Second number before swap is "+secondNumber);

        System.out.println("-----------------------------");
        firstNumber=firstNumber-secondNumber;                   //1st   15-30=-15
        secondNumber=firstNumber+secondNumber;                  //2nd   -15+30=15
        firstNumber=secondNumber-firstNumber;                   //1st   15-(-15)=30

        System.out.println("First number after swap is "+firstNumber);
        System.out.println("Second number after swap is "+secondNumber);

    }
}
