import java.util.Scanner;

class OrderNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();
        int x = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(x + " ");
                x++;
                if (x == 10)
                    x = 1;
            }
            System.out.println();
        }
        s.close();
    }
}
