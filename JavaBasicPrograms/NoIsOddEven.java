import java.util.Scanner;

class NoIsOddEven {
    static String getvalue(int a) {
        int m = a / 2;
        int n = m * 2;
        if (a == n)
            return "Even";
        else
            return "Odd";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Values");
        int a = s.nextInt();

        String result = getvalue(a);
        System.out.println("The given Number is: " + result);

    }

}
