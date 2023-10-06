import java.util.Scanner;

class NegativeValues {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.of Arrays");
        int n = s.nextInt();

        int[] ar = new int[n];

        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();

            if (ar[i] < 0) {
                count++;
            }
        }
        System.out.println("the no of negative value is " + count);
        s.close();
    }
}
