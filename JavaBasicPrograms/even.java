import java.util.*;

public class even {
    static boolean getvalue(int i) {
        if (((i / 2) * 2) == i)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        boolean result = getvalue(a);
        if (result)
            System.out.println(a + "is the even");
        else
            System.out.println(a + "is the odd");

    }

}
