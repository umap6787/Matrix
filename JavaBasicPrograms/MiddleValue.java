import java.util.Scanner;

class MiddleValue {
    static int getvalue(int a, int b, int c) {
        if ((a > b || a > c) && (a < c || a < b))
            return a;
        else if ((b > a || b > c) && (b < c || b < a))
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

        int result = getvalue(a, b, c);
        System.out.println(result + " is the Middle Value");

    }

}
