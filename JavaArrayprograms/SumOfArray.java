import java.util.Scanner;

class SumOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the No.Of integers");
        int n = s.nextInt();

        int[] ar = new int[n];
        System.out.println("enter the integer values");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            int a = ar[i];
            ar[i] = getSum(a);
            System.out.println("The sum of integer " + a + " is " + ar[i]);
        }

        s.close();
    }

    static int getSum(int ar) {
        int sum = 0;

        while (ar != 0) {
            int r = ar % 10;
            sum = sum + r;
            ar = ar / 10;
        }
        return sum;
        // System.out.println("The sum of value is" + sum);
    }
}