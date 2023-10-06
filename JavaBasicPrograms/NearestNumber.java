import java.util.Scanner;

class NearestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array elements");
        int Size = s.nextInt();
        int[] arr = new int[Size];
        for (int i = 0; i < Size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the element to compare");
        int x = s.nextInt();

        getFarInteger(arr, x);
    }

    static void getFarInteger(int[] arr, int x) {
        int min = Integer.MAX_VALUE;
        int ele = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int diff = x - arr[i];

            if (diff < 0) {
                diff *= -1;
            }

            if (diff < min) {
                min = diff;
                ele = arr[i];
            }
        }
        System.out.println("The Nearest Element is: " + ele);
    }
}