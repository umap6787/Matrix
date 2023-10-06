import java.util.Scanner;

public class BiggestElementMatrix {
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
        int b = getBig(mat);
        System.out.println(b);
    }

    static int getBig(int[][] mat) {
        int big = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > big) {
                    big = mat[i][j];
                }
            }
        }
        return big;
    }
}
