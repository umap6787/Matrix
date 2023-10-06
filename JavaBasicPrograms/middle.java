import java.util.Scanner;

public class middle {
    static int validate(int a, int b, int c) {
        if ((a > b && a < c) || (a < b && a > c))
            return a;
        else if ((b > a && b < c) || (b < a && b > c))
            return b;
        else
            return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = validate(a, b, c);
        System.out.println(result + "is the middle number");

    }
}
