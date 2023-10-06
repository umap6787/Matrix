import java.util.Scanner;

class ReplaceWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array");
        String str = s.nextLine();

        System.out.println("Enter the string to Replace");
        String st = s.nextLine();

        System.out.println("Enter the string to Replace a new string");
        String re = s.nextLine();

        String res = getReplaceWord(str, st, re);

        System.out.println(res);
    }

    static String getReplaceWord(String str, String st, String re) {
        char[] ch = str.toCharArray();
        char[] c = st.toCharArray();
        String replace = "";

        for (int i = 0; i < ch.length; i++) {
            int j = 0, k = i;

            while (j < c.length && k < ch.length && c[j] == ch[k]) {
                j++;
                k++;
            }
            if (j == c.length && (i == 0 || ch[i - 1] == ' ') && (k == ch.length || ch[k] == ' ')) {
                replace += re;
                i = k - 1;
            } else {
                replace += ch[i];
            }

        }

        return replace;
    }
}
