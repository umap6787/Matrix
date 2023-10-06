import java.util.Scanner;

class Biggest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Four Integer Values");

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        if (a > b && a > c && a > d)
            System.out.println(a + " is Greater");

        else if (b > c && b > d)
            System.out.println(b + " is Greater");

        else if (c > d)
            System.out.println(c + " is Greater");

        else
            System.out.println(d + " is Greater");

    }

}
