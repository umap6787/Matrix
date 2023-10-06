import java.util.Scanner;

class FrequencyArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = s.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }

        getFrequency(ar);

        s.close();
    }

    static void getFrequency(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int count = 0;
            for (int j = i; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    count++;

                }
            }
            System.out.println(ar[i] + " present " + count + " times in the array");

        }
    }
}