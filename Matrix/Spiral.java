import java.util.Scanner;

class Spiral {
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

        printSpiral(mat);
    }

    static void printSpiral(int[][] mat) {
        for (int i = 0, j = mat.length - 1; i < j; i++, j--) {
            for (int k = i; k < j; k++) {
                System.out.println(mat[i][k] + " "); // ki
            }
            for (int k = i; k < j; k++) {
                System.out.println(mat[k][j] + " ");// jk
            }

            for (int k = j; k > i; k--) {
                System.out.println(mat[j][k] + " ");// kj
            }
            for (int k = j; k > i; k--) {
                System.out.println(mat[k][i] + " ");// ik
            }
        }
        int n = mat.length;
        if (n % 2 == 1)
            System.out.println(mat[n / 2][n / 2]);
    }
}
