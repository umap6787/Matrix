import java.util.Scanner;

public class PercentageOfVowels {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the owels");
        String st = s.nextLine();

        double per = getPercentage(st);

        System.out.println("percentage of owel is: " + per + "%");

    }

    static double getPercentage(String st) {
        char[] c = st.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if ((c[i] == 'A') || (c[i] == 'a') || (c[i] == 'E') || (c[i] == 'e') || (c[i] == 'I') || (c[i] == 'i')
                    || (c[i] == 'O') || (c[i] == 'o') || (c[i] == 'U') || (c[i] == 'u'))
                count++;
        }
        double per = count / c.length * 100;
        return per;

    }

}
