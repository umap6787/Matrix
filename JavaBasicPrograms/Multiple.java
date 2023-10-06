import java.util.Scanner;

class Multiple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Value ");

        int m = s.nextInt();

        if (m % 5 == 0)
            System.out.println(m + " is Multiple by 5");

        else
            System.out.println(m + " is not multiple by 5");
    }
}