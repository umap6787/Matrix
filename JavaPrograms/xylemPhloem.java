import java.util.Scanner;

class xylemPhloem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();

        boolean res = getxylem(a);

        if (res) {
            System.out.println("The given number is xylem");
        } else {
            System.out.println("The given number is phloem");
        }

        s.close();
    }

    static boolean getxylem(int a) {
        int temp = a, fl = 0, mid = 0;
        while (a != 0) {
            int d = a % 10;
            if (a == temp || a == d) {
                fl = fl + d;
            } else
                mid = mid + d;

            a = a / 10;
        }

        if (fl == mid)
            return true;

        else
            return false;
    }
}
