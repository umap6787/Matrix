import java.util.Scanner;

public class CountEvenOdd {
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
        int[] count = getEO(mat);
        System.out.println("The no.of even numbers present in given matrix: " + count[0]);
        System.out.println("The no.of odd numbers present in given matrix: " + count[1]);
    }

    static int[] getEO(int[][] x) {
        int ec = 0, oc = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] % 2 == 0) {
                    ec++;
                }

                else {
                    oc++;
                }
            }
        }
        int[] eo = { ec, oc };
        return eo;
    }
}