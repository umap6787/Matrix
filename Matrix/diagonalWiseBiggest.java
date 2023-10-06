import java.util.Scanner;

public class diagonalWiseBiggest {
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
        if (row == col) {
            int[] big = getBig(mat);
            System.out.println("The big of each diagonal: ");
            for (int i = 0; i < big.length; i++) {
                System.out.print(big[i] + " ");
            }
        } else
            System.out.println("enter vaild square matix");
    }

    static int[] getBig(int[][] x) {

        int big1 = 0, big2 = 0;
        for (int i = 0; i < x[0].length; i++) {

            for (int j = 0; j < x.length; j++) {

                if (i == j && x[i][j] > big1) {
                    big1 = x[i][j];
                }
                if (i + j == x.length - 1 && x[i][j] > big2) {
                    big2 = x[i][j];
                }

            }
        }
        int[] bg = { big1, big2 };
        return bg;
    }
}