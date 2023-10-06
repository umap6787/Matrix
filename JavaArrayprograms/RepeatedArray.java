import java.util.Scanner;

class RepeatedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = s.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("Enter the specified array:");
        int b = s.nextInt();

        int res = SpecifiedElement(ar, b);
        System.out.println(b + " presented in the array times is " + res);

        s.close();
    }

    static int SpecifiedElement(int[] ar, int b) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {

            if (b == ar[i]) {
                count++;
            }
        }
        return count;
    }
}