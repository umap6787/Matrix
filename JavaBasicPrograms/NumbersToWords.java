import java.util.Scanner;

class NumbersToWords {
    static void nw(int x, String st) {
        if (x == 0)
            return;

        String[] a = { " " + "one" + "two" + "three" + "four" + "five" + "six" + "seven" + "eight" + "nine" + "ten"
                + "eleven" + "tewel" + "thirteen" + "fourteen" + "fifteen" + "sixteen" + "seventeen" + "eighteen"
                + "ninteen" };
        String[] b = { " " + "" + "twenty" + "thirty" + "fourty" + "fifty" + "sixty" + "seventy" + "eighty" + "ninty" };

        if (x < 20)
            System.out.println(a[x]);
        else
            System.out.println(b[x / 10] + a[x % 10]);

        System.out.println(" " + st + " ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();

        nw(a / 10000000, "crore ");
        nw(a / 100000 % 100, "lakh ");
        nw(a / 1000 % 100, "thousand ");
        nw(a / 100 % 10, "hundred");
        nw(a % 100, " ");

        s.close();
    }
}
