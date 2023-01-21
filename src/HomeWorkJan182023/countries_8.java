package HomeWorkJan182023;

public class countries_8 {
    public static void main(String[] args) {

        String[][] countries = {{"USA", "Canada", "Mexico", "Cuba"},
                {"Brazil", "Argentina", "Peru", "Chile"},
                {"Germany", "France", "Greece", "Portugal"},
                {"China", "Russia", "Japan", "Maldives"},
                {"Egypt", "Nigeria", "Kenya", "Morocco"}};

        int totalOfCountries = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
            }
            System.out.println();


        }

        System.out.println("---------------OR-----------------");

        for (String[] arr : countries) {
            for (String country : arr) {
                System.out.print(country + " ");
            }
            System.out.println();
        }


    }

}




