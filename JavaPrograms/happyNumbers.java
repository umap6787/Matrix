import java.util.Scanner;

class happyNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();

        boolean res = gethappy(a);

        if (res)
            System.out.println(res + " is the happy number");

        else
            System.out.println(res + " is not the happy number");
        s.close();
    }

    static boolean gethappy(int a) {
        while (a > 9) {
            int sum = 0;
            while (a != 0) {
                int d = a % 10;
                sum = sum + d * d;
                a = a / 10;
            }
            a = sum;
        }
        if (a == 1 || a == 7)
            return true;
        else
            return false;
    }

}
