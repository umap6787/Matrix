import java.util.Scanner;

public class TransposeMatrix {
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
        int[][] ress = getTranspose(mat);

        System.out.println("The Transpose Matrix is: ");

        for (int i = 0; i < ress.length; i++) {
            for (int j = 0; j < ress[i].length; j++) {
                System.out.print(ress[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] getTranspose(int[][] mat) {
        int[][] res = new int[mat[0].length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                res[j][i] = mat[i][j];
            }
        }
        return res;
    }
}
