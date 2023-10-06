import java.util.*;

public class ass {
    static int smaller(int a, int b, int c) {
        if (a < b && a < c)
            return a;
        if (b < c && b < a)
            return b;
        else
            return c;
    }

    static int middle(int a, int b, int c) {
        if ((a > b && a < c) || (a < b && a > c))
            return a;
        if ((b > a && b < c) || (b < a && b > c))
            return b;
        else
            return c;
    }

    static int greater(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        else
            return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = smaller(a, b, c);
        int result1 = middle(a, b, c);
        int result2 = greater(a, b, c);

        System.out.println("The ascending order value is");

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
}
