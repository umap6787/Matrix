import java.util.Scanner;

class OddOrEvenMethod {
    static String getIntegerValue(int a) {
        if (a % 2 == 0)
            return "Even";
        else
            return "odd";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");
        int i = s.nextInt();
        String OE = getIntegerValue(i);
        System.out.println("The Given Value Is: " + OE);
    }

}
