import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        String ll = str.toLowerCase(); // toLowerCase
        System.out.println(ll);
        String uu = str.toLowerCase(); // toUpperCase
        System.out.println(uu);
        String res = getReverseString(str);

        System.out.println(res);
        s.close();
    }

    static String getReverseString(String str) {
        char[] ch = str.toCharArray();

        String rs = "";
        for (int i = 0; i < ch.length; i++) {
            int f = i;

            while (i < ch.length && ch[i] != ' ') {
                i++;
            }
            int l = i - 1;
            while (l >= f) {
                rs += ch[l];
                l--;
            }
            if (i < ch.length)
                rs = rs + ch[i];

        }

        return rs;
    }
}
