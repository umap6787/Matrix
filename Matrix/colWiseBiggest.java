import java.util.Scanner;

public class colWiseBiggest {
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
        System.out.println("The bigest in the each colums: ");
        for (int i = 0; i < big.length; i++) {
            System.out.print(big[i] + " ");
        }
        int[] small = getSmall(mat);
        System.out.println();
        System.out.println("The smallest in the each colums: ");
        for (int i = 0; i < small.length; i++) {
            System.out.print(small[i] + " ");
        }
    }

    static int[] getBig(int[][] x) {
        int[] bg = new int[x[0].length];
        for (int i = 0; i < x[0].length; i++) {
            int big = x[0][i];
            for (int j = 1; j < x.length; j++) {
                if (x[j][i] > big) {
                    big = x[j][i];
                }
            }
            bg[i] = big;
        }
        return bg;
    }

    static int[] getSmall(int[][] x) {
        int[] sm = new int[x[0].length];
        for (int i = 0; i < x[0].length; i++) {
            int small = x[0][i];
            for (int j = 1; j < x.length; j++) {
                if (x[j][i] < small) {
                    small = x[j][i];
                }
            }
            sm[i] = small;
        }
        return sm;
    }
}