package HomeWorkJan182023;

public class Grocery_5 {
    public static void main(String[] args) {

        String [][] grocery={{"Veggies","Fruits","Dairy","Sweets"},
                          {"Tomatoes","Apples","Milk","Chocolate"}};


        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j <grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------OR-------------");

        for (String[] arr:grocery){
            for (String food:arr){
                System.out.print(food+" ");
            }
            System.out.println();
        }
    }
}
