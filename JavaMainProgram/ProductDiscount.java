import java.util.Scanner;

class ProductDiscount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Values Of Three Product");

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        if (a > 999) {
            a = a - a * 0.15;
        }
        if (b > 999) {
            b = b - b * 0.15;
        }
        if (c > 999) {
            c = c - c * 0.15;
        }
        double Total = a + b + c;
        Total = Total + Total * 0.12;
        System.out.println("The Total Price is: " + Total);
    }
}
