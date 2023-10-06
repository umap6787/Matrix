import java.util.*;

public class special {
    static String getresult(int a, int b, int d) {
        int sum = a + b;
        int product = a * b;
        int num = sum + product;
        if (d == num)
            return "True";
        else
            return "False";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber");
        int s = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String rs = getresult(s, c, d);
        System.out.println("The value is " + rs);
    }
}
