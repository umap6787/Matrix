import java.util.Scanner;

class perfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();

        int res = getperfect(a);

        if (res == a) {
            System.out.println(res + " is the given number is perfect number");
        }

        else {
            System.out.println(a + " is the given number is not a perfect number");
        }
    }

    static int getperfect(int a) {
        int sum = 0;

        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

}
