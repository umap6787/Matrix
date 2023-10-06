import java.util.Scanner;

class EvenNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 2; i <= n; i = i + 2) {
            System.out.println(i);
        }
        s.close();
    }
}
