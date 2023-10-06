import java.util.Scanner;

class AscendingOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int small = (a < b && a < c) ? a : (b < c) ? b : c;
        int big = (a > b && a > c) ? a : (b > c) ? b : c;
        int middle = (a + b + c) - (small + big);

        System.out.println(small + " " + middle + " " + big);
        s.close();
    }
}