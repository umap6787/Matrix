import java.util.Scanner;

class integer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two integer values");

        int i = s.nextInt();
        int j = s.nextInt();

        if (i == j)
            System.out.println("The integers values are equal");

        else
            System.out.println("The integers values are not equal");

    }
}