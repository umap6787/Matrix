import java.util.Scanner;

class DigitOrNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int i = s.nextInt();

        if (i <= 9)
            System.out.println("The value is Digit");

        else
            System.out.println("The Value is Number");
    }

}
