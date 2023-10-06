import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int i = s.nextInt();

        if (i % 2 == 0)
            System.out.println("The Given Value Is Even");

        else
            System.out.println("The Given Value Is Odd");
    }

}
