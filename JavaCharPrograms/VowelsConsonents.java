import java.util.Scanner;

class VowelsConsonents {

    static boolean getPalnedrome(String st1) {
        for (int i = 0; i < st1.length(); i++) {
            if (st1.charAt(i) != st1.charAt(st1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static String getLoweCase(String st2) {
        String s = "";
        for (int i = 0; i < st2.length(); i++) {
            char ch = st2.charAt(i);
            if ((ch >= 'A') && (ch <= 'Z')) {
                ch = ((char) (ch + 32));
                s = s + ch;
            } else {
                char ch1 = st2.charAt(i);
                s = s + ch1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = s.nextLine();

        String lower = getLoweCase(st);
        System.out.println(lower);

        String ll = st.toLowerCase();
        System.out.println(ll);

        boolean pal = getPalnedrome(st);

        if (pal) {
            System.out.println("It is a palendrome");
        } else {
            System.out.println("It is not a palendrome");
        }

        int c = 0, v = 0, n = 0, sp = 0, spl = 0, u = 0, l = 0, w = 1;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if ((ch == 'a') || (ch == 'A') || (ch == 'e') || (ch == 'E') || (ch == 'i') || (ch == 'I') || (ch == 'o')
                    || (ch == 'O')
                    || (ch == 'u') || (ch == 'U'))
                v++;
            else if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z')) {
                c++;
            } else if ((ch >= '0' && ch <= '9')) {
                n++;
            } else if (ch == 32) {
                sp++;
            } else {
                spl++;
            }
            if ((ch >= 'a') && (ch <= 'z')) {
                l++;
            } else if ((ch >= 'A') && (ch <= 'Z')) {
                u++;
            }
            if (ch == 32) {
                w++;
            }
        }
        System.out.println(ll);
        System.out.println("the no of vowles is: " + v);
        System.out.println("the no of consonent is: " + c);
        System.out.println("the no of digits is: " + n);
        System.out.println("the no of space is: " + sp);
        System.out.println("the no of special character is: " + spl);
        System.out.println("the no of upper case is: " + u);
        System.out.println("the no of lower case is: " + l);
        System.out.println("the no of words is: " + w);

        s.close();
    }
}