import java.util.Scanner;

class CommonElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of 1st array: ");
        int n = s.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }

        System.out.println("Enter the length of 2nd array: ");
        int m = s.nextInt();

        int[] br = new int[m];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < m; i++) {
            br[i] = s.nextInt();
        }
        System.out.print("The common values are: ");
        getCommon(ar, br);
        s.close();
    }

    static void getCommon(int[] ar, int br[]) {
        for (int i = 0; i < ar.length; i++) {

            for (int j = 0; j < br.length; j++) {
                if (ar[i] == br[j]) {
                    // int[] cr = new int[ar.length];
                    System.out.print(ar[i] + "  ");
                }
            }
        }
        System.exit(0);
    }
}