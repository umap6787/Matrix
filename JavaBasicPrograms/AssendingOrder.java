import java.util.Scanner;

class AssendingOrder {
    static int getFirstvalue(int a, int b, int c) {
        if (a < b && a < c)
            return a;
        else if (b < a && b < c)
            return b;
        else
            return c;
    }

    static int getMiddleValue(int a, int b, int c) {
        if (a < b && a > c)
            return a;
        else if (b < a && b > c)
            return b;
        else
            return c;
    }

    static int getBigValue(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Three Values");

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        // AssendingOrder ao = new AssendingOrder();
        int r1 = getFirstvalue(a, b, c);
        int r2 = getMiddleValue(a, b, c);
        int r3 = getBigValue(a, b, c);

        System.out.println("The Assending Order of the given Value is: " + r1 + " " + r2 + " " + r3);

        s.close();

    }

}
