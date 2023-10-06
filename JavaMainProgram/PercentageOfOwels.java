import java.util.Scanner;

public class PercentageOfOwels {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the owels");
        String st = s.nextLine();

        int c = getPercentage(st);

        System.out.println("percentage of owel is: " + c / st.length() * 100 + "%");
        s.close();
    }

    static int getPercentage(String st) {
        // char[] c = st.toCharArray();
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
                    || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')) {
                count++;
            }
        }
        System.out.println("The length of the String is: " + st.length());
        System.out.println("The count of the vowles in the given String is: " + count);
        int per = count;
        return per;
    }
}
