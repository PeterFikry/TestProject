package HomeWorkFeb262023;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    /*
    1) Create a map of Best Buy store. Place
    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        Map<Integer,String> bestBuyStore=new HashMap<>();
        bestBuyStore.put(7324234,"Printer");
        bestBuyStore.put(3456890,"Speaker");
        bestBuyStore.put(6023480,"TV");
        bestBuyStore.put(9738920,"Refrigerator");

        var entrySet=bestBuyStore.entrySet();
        for (var entry:entrySet){
            System.out.println("Product ID = "+entry.getKey()+" and Product Name is "+entry.getValue());
        }
    }
}
