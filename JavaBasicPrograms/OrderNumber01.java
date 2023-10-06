import java.util.Scanner;

class OrderNumber01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();
        int x = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(x % 2 + " ");
                x++;
            }
            System.out.println();
        }
        s.close();
    }
}
