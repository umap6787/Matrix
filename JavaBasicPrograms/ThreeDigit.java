import java.util.Scanner;

class ThreeDigit {
    static String getinteger(int a) {
        if (a <= -99 && a >= 99)
            return "Three Digit";
        else
            return "Not a Three Digit";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
        int m = s.nextInt();
        String g = getinteger(m);
        System.out.println("The Given Value Is: " + g);
    }
}