import java.util.Scanner;

class Zero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int i = s.nextInt();

        if (i == 0)
            System.out.println("The Given Value Is Zero");

        else
            System.out.println("The Given Value Is Non-Zero");
    }

}
