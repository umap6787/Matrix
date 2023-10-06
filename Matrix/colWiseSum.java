import java.util.Scanner;

public class colWiseSum {
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
        int[] sum = getSum(mat);
        System.out.println("The sum of each colums: ");
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
    }

    static int[] getSum(int[][] x) {
        int[] sm = new int[x[0].length];
        for (int i = 0; i < x[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < x.length; j++) {

                sum += x[j][i];

            }
            sm[i] = sum;
        }
        return sm;
    }
}