import java.util.Scanner;

public class rowWiseBiggest {
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
        int[] big = getBig(mat);
        int[] small = getSmall(mat);
        System.out.println("The bigest in the each rows: ");
        for (int i = 0; i < big.length; i++) {
            System.out.print(big[i] + " ");
        }
        System.out.println();
        System.out.println("The smallest in the each rows: ");
        for (int i = 0; i < small.length; i++) {
            System.out.print(small[i] + " ");
        }
    }

    static int[] getBig(int[][] x) {
        int[] bg = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            int big = x[i][0];
            for (int j = 1; j < x[i].length; j++) {
                if (x[i][j] > big) {
                    big = x[i][j];
                }
            }
            bg[i] = big;

        }

        return bg;
    }

    static int[] getSmall(int[][] x) {
        int[] sm = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            int small = x[i][0];
            for (int j = 1; j < x[i].length; j++) {
                if (x[i][j] < small) {
                    small = x[i][j];
                }
            }
            sm[i] = small;

        }

        return sm;
    }
}