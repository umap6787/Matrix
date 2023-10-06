import java.util.Scanner;

public class InsertArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size of an array");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int[] arr1 = getInsertArray(arr);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    static int[] getInsertArray(int[] arr) {
        int[] arr1 = new int[arr.length + 1];
        Scanner s = new Scanner(System.in);

        System.out.println("enter the index to insert the array");
        int x = s.nextInt();

        System.out.println("enter the array to insert");
        int a = s.nextInt();
        for (int j = 0; j < arr1.length; j++) {

            if (j < x)
                arr[j] = arr1[j];

            else if (j == x)
                arr[j] = a;

            else
                arr[j] = arr[j - 1];

        }

        return arr1;
    }

}
