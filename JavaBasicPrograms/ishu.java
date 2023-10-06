import java.util.Scanner;

class ishu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int a = s.nextInt();
        int b = s.nextInt();

        int c = getlcm(a, b);
        System.out.println(c);
    }

    static int getlcm(int a, int b) {
        if (a > b && a % b == 0)
            return a;

        else if (b > a && b % a == 0)
            return b;

        else
            return a * b;
    }
}