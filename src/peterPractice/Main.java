package peterPractice;

class Main {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(a);

        //create method reduce10 here
    }

    public static void reduce10(int[][] arr) {
        Main a=new Main();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] -= 10;
            }
        }
    }}






































