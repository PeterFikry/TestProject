package class12;

public class StringDemo3 {
    public static void main(String[] args) {
        String firstNmae="Akhter";
        String lastName="Lava";
        String fullName=firstNmae+" "+lastName;         //most widely used
        System.out.println(fullName);
        System.out.println(firstNmae+" "+lastName);
        System.out.println(firstNmae.concat(" "+lastName));
    }
}
