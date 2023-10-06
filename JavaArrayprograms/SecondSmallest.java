import java.util.Scanner;

class SecondSmallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = s.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }

        int res = getSmallest(ar, 2);
        System.out.println(res + " is the second smallest element in the array");

        s.close();
    }

    static int getSmallest(int[] ar, int b) {
        for (int i = 0; i < ar.length; i++) {
            int count = 1;
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    count++;
                }
            }
            if (count == b) {
                return ar[i];
            }
        }
        System.out.println("nth biggest is not there");
        System.exit(0);
        return 0;
    }
}