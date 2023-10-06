import java.util.Scanner;

class StarsNumberDecrement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {           //for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {       //for (int j = 1; j <= n; j++){
                System.out.print(j + " ");       //System.out.print(j + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
