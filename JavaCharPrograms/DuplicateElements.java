import java.util.Scanner;

public class DuplicateElements {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the owels");
        String st = s.nextLine();

        String str = getDuplicate(st);

        System.out.println(str);
    }

    static String getDuplicate(String st) {
        char[] c = st.toCharArray();

        String str = "";

        for (int i = 0; i < c.length; i++) {
            int j = i - 1;
            for (; j >= 0; j--) {
                if (c[j] == c[i])
                    break;
            }

            if (j == -1) {
                str += c[i];
            }
        }
        return str;
    }
}
