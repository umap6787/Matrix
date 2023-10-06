import java.util.Scanner;

class PrimeArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.of array elements");
        int n = s.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter the array elements");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }

        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            int a = ar[i];
            boolean res = getPrime(a);
            if (res)
                count++;
        }
        System.out.println(count);
    }

    static boolean getPrime(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}