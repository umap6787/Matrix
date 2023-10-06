import java.util.Scanner;

class Vote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int i = s.nextInt();

        if (i >= 18)
            System.out.println("Person is Eligible to Vote");

        else
            System.out.println("Person is not Eligible to Vote");
    }

}
