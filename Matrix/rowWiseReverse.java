import java.util.Scanner;

public class rowWiseReverse {
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
        System.out.println("the reverse row of matrix");
        getRev(mat);

    }

    static void getRev(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = x[i].length - 1; j >= 0; j--) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}