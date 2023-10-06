import java.util.Scanner;

class Alphabets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i+64) + "  ");   //S te m.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
