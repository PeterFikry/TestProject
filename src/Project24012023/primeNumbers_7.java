package Project24012023;

public class primeNumbers_7 {
    public static void main(String[] args) {

        int num = 5;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
/*
                ****Another way****
                int given =10;
                boolean isPrime=true;

                if(given>1){
                for(int i=2; i<given; i++){

                if(given%i==0){

                    isPrime=flase;
                    break;
                    }
                    }
                    }else{
                    isPrime=false;
                }
                System.out.println("Given number "+given+" is a prime?"+isPrime);
 */
