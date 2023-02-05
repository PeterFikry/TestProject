package peterPractice;

 public class Main {
    static int count=0;

    public Main (){
        count++;
    }
   static int countNumber(){
        return count;
    }

     public static void main(String[] args) {
         Main main1=new Main();
         Main main2=new Main();
         Main main3=new Main();
         System.out.println(Main.count);
     }
 }













































