import java.util.Scanner;

class SmallestArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = s.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("Enter the Nth no to find array:");
        int b = s.nextInt();

        int res = getSmallest(ar, b);
        System.out.println(res);

        s.close();
    }

    static int getSmallest(int[] ar, int b) {
        for (int i = 0; i < ar.length; i++) {
            int count = 0;
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    count++;
                }
            }
            if (count == b - 1) {
                return ar[i];
            }
        }
        System.out.println("nth biggest is not there");
        System.exit(0);
        return 0;
    }
}