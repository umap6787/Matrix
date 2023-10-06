import java.util.Scanner;

class NoOfLeapYear {
    static int getvalue(int a) {
        int m = a / 4;
        int n = a / 100;
        int o = a / 400;
        int p = m - n + o;
        return p;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Values");
        int a = s.nextInt();

        int result = getvalue(a);
        System.out.println("The given Number is: " + result);

    }

}
