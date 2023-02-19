package class27;

public class Demo2 {
    public static void main(String[] args) {
        String name = "Urwa";
        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        //Create a method which can search a name from this array return true if name is present in the array
        System.out.println(nameSearch(name,names));
        String[]arr=new String[2];
        names[4]="Shah";

    }

    public static boolean nameSearch(String nameToBeSearched, String[] names) {

        for (String name : names) {
            if (nameToBeSearched.equals(name)) {
                return true;
            }
        }
        return false;
    }


}

