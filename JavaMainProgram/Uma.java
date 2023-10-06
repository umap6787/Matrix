import java.util.Scanner;

class Uma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int a = s.nextInt();
        int b = s.nextInt();

        int c = getGcd(a, b);
        System.out.println(c);
    }

    static int getGcd(int a, int b) {
        if (a < b) {
            for (int i = 0; i <= a; i++) {
                if (a % i == 0 && b % i == 0)

                    break;
return i;
            }
            
        } else if (a > b) {
            for (int i = 0; i <= a; i++) {
                if (a % i == 0 && b % i == 0)

                    break;
 return i;
            }
           
        }

    }
}
