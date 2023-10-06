import java.util.Scanner;

class argument {
    static String getinteger(int a) {
        if (a <= -9 && a >= 9)
            return "Digit";
        else
            return "Number";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
        int m = s.nextInt();
        String g = getinteger(m);
        System.out.println("The Given Value Is: " + g);
    }
}