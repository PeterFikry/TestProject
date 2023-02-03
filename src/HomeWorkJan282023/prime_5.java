package HomeWorkJan282023;

public class prime_5 {
    //Write a method to return whether given number is prime or not

    //prime numbers means the numbers which is can't be divided except on itself or number 1
boolean isPrime(int number) {

    boolean flag=true;
    if(number>1){
        for (int i = 2; i < number; i++) {
            if (number%i==0){
                flag=false;
                break;
            }
        }
    }else {
        flag=false;
    }
return flag;
}

    public static void main(String[] args) {
        prime_5 prime5=new prime_5();
        System.out.println(prime5.isPrime(12));
    }

}
