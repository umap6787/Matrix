import java.util.Scanner;

class sumOfArrayElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no. of array elements");
        int n = s.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter the values:");

        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
            sum = sum + ar[i];
        }
        System.out.println("the sum of value is: " + sum);
    }
}
