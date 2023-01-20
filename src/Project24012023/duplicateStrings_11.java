package Project24012023;

public class duplicateStrings_11 {
    public static void main(String[] args) {

        String[] name = {"Peter", "Justin", "Jason", "Jianna", "Christine", "Paula", "Justin", "Peter"};


        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < i; j++) {
                if (name[i] == name[j]) {
                    System.out.println("Duplicated name is : " + name[j]);
                }

            }


        }
    }
}
