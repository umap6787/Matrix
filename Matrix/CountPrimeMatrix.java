import java.util.Scanner;

public class CountPrimeMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter the " + row * col + " vales");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        int b = getPrimeCount(mat);
        System.out.println(b);
    }

    static int getPrimeCount(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                boolean c = getCount(mat[i][j]);

                if (c) {
                    count++;
                }
            }
        }
        return count;
    }

    static boolean getCount(int c) {
        /*
         * for (int k = 1; k < c; k++) {
         * if (c % k == 0 || c == 1) {
         * return false;
         * }
         * }
         * return true;
         */
        int count = 0;
        for (int i = 1; i <= c; i++) {
            if (c % i == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }
}
