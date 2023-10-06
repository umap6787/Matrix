import java.util.Scanner;

class NthNaturalNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        s.close();
    }
}
