import java.util.Scanner;

class Product {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Values Of Three Product");

        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

        int Low = x;

        if (Low > y) {
            Low = y;
            // System.out.println(y+" is Lowest Price");
        }
        if (Low > z) {
            Low = z;
            // System.out.println(z+" is Lowest Price");
        }
        System.out.println(Low + " is Lowest Price");

    }

}
