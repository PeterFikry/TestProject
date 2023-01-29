package class15;

public class MPractice6Tester {
    public static void main(String[] args) {
        MPractice6 mp = new MPractice6();
        System.out.println(mp.userName().toLowerCase() + mp.lastName().toLowerCase() + "@" + mp.emailType().toLowerCase() + ".com");

        System.out.println(mp.createEmail("John","snow"+"@","gmail"+".com"));   // another way
    }

}