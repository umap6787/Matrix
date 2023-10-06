import java.util.Scanner;

class TypeDouble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Three Double Values");

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        if (a > b && a > c)
            System.out.println(a + " is Greater");

        else if (b > c)
            System.out.println(b + " is Greater");

        else
            System.out.println(c + " is Greater");

    }

}
