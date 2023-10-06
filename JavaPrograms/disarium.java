import java.util.Scanner;

class disarium {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();

        boolean res = getdisarium(a);

        if (res)
            System.out.println(res + " is the desarium value");

        else
            System.out.println(res + " is not the desarium value");
        s.close();
    }

    static boolean getdisarium(int a) {
        int c = getcount(a);
        int sum = 0, t = a;
        while (a != 0) {
            int d = a % 10;

            sum = sum + getsum(d, c);
            c--;
            a = a / 10;
        }
        return sum == t;
    }

    static int getsum(int d, int c) {
        int pw = 1;
        while (c > 0) {
            pw = pw * d;
            c--;
        }

        return pw;
    }

    static int getcount(int a) {
        int count = 0;
        do {
            count++;
            a = a / 10;
        } while (a != 0);
        return count;
    }

}
