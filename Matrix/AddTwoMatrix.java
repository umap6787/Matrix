import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the order of two matrix");
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] mat1 = new int[row][col];
        System.out.println("Enter the " + row * col + " vales of 1st martix");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = s.nextInt();
            }
        }

        int[][] mat2 = new int[row][col];
        System.out.println("Enter the " + row * col + " vales of 2nd matrix");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = s.nextInt();
            }
        }
        addMatrix(mat1, mat2);
    }

    static void addMatrix(int[][] mat1, int[][] mat2) {

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(mat1[i][j] + mat2[i][j] + " ");
            }
        }
        System.out.println();
    }
}
