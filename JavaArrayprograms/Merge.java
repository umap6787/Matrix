import java.util.Scanner;

public class Merge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of an 1st array");
        int s1 = s.nextInt();

        System.out.println("Enter the Size of an 2nd array");
        int s2 = s.nextInt();

        int[] arr1 = new int[s1];
        int[] arr2 = new int[s2];

        System.out.println("Enter the 1st array elements");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = s.nextInt();
        }

        System.out.println("Enter the 1st array elements");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = s.nextInt();
        }

        int[] arr = getMergeArray(arr1, arr2);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] getMergeArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr1.length) {
                arr[i] = arr1[i];
            } else {
                arr[i] = arr2[i - arr1.length];
            }
        }

        return arr;

    }
}
