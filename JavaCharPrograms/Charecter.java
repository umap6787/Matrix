import java.util.Scanner;
import java.util.Scanner;

public class Charecter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = s.nextLine();

        String res = getCharecter(st); // 1st word capital remaining all in small
        System.out.println(res);

        String res1 = getCharecter1(st); // 1st word in small remaining in cap
        System.out.println(res1);

        String res2 = getCharecter2(st); // last word in cap remaining in small
        System.out.println(res2);

        s.close();
    }

    static String getCharecter2(String st) {
        char[] ch = st.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (i == 0 && ch[i] != ' ' || ch[i - 1] == ' ' && ch[i] != ' ') {
                if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    ch[i] = (char) (ch[i] + 32);
                }
            } else {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] - 32);
                }
            }
        }
        st = new String(ch);
        return st;
    }

    static String getCharecter1(String st) {
        char[] ch = st.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if ((i == ch.length - 1 && ch[i] != ' ') || (ch[i + 1] == ' ' && ch[i] != ' ')) {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] - 32);
                }
            } else {
                if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    ch[i] = (char) (ch[i] + 32);
                }
            }
        }
        st = new String(ch);
        return st;
    }

    static String getCharecter(String st) {
        char[] ch = st.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (i == 0 && ch[i] != ' ' || ch[i - 1] == ' ' && ch[i] != ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char) (ch[i] - 32);
                }
            } else {
                if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    ch[i] = (char) (ch[i] + 32);
                }
            }
        }
        st = new String(ch);
        return st;
    }

}
