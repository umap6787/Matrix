import java.util.Scanner;

class ReverseSentance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        String res = getReverseSentance(str);

        System.out.println(res);
    }

    static String getReverseSentance(String str) {
        char[] ch = str.toCharArray();

        String rs = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            int l = i;

            while (i >= 0 && ch[i] != ' ') {
                i--;
            }
            int f = i + 1;
            while (f <= l) {
                rs += ch[f];
                f++;
            }
            if (i >= 0)
                rs = rs + ch[i];

        }

        return rs;
    }
}
