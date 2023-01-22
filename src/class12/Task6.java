package class12;

public class Task6 {
/*
Create 2D array of countries: North America countries, South America countries, Europe countries, Asian countries, African countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */

    public static void main(String[] args) {
        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                {"Germany", "United kingdom", "France", "Spain"},
                {"China", "India", "Japan", "Russia"},
                {"Egypt", "Nigeria", "South Africa", "Ethiopia"}
        };
        int counter = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("------------------------");
        //using enhanced for loop

        for (String[] country : countries) {
            for (int j = 0; j < country.length; j++) {
                System.out.print(country[j] + " ");
                counter++;
            }
            System.out.println();
        }

        System.out.println("Total number of countries " + counter);

    }
}

