import java.util.Scanner;

class arrayBiggest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of integer values: ");
        int x = s.nextInt();
        int[] ar = new int[x];
        System.out.println("Enter the values: ");
        int big = 0;
        for (int i = 0; i < x; i++) {
            ar[i] = s.nextInt();
            if (big < ar[i]) {
                big = ar[i];
            }
        }
        System.out.println("The Biggest among the Integer number is: " + big);
        s.close();
    }
}
