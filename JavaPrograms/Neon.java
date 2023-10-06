import java.util.Scanner;

class Neon {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();
        int sq = n * n;
        int sum = 0;
        while (sq != 0) {
            int d = sq % 10;
            sum = sum + d;
            sq /= 10;
        }
        if (sum == n)
            System.out.println(n + " is neon number");
        else
            System.out.println(n + " is not a neon number");
    }
}