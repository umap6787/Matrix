import java.util.Scanner;

class CountWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array");
        String str = s.nextLine();

        System.out.println("Enter the string to check");
        String st = s.nextLine();

        int res = getCountWord(str, st);

        System.out.println("the given word is present " + res + " times");
    }

    static int getCountWord(String str, String st) {
        char[] ch = str.toCharArray();
        char[] c = st.toCharArray();

        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            int j = 0, k = i;

            while (j < c.length && k < ch.length && c[j] == ch[k]) {
                j++;
                k++;
            }
            if (j == c.length && (i == 0 || ch[i - 1] == ' ') && (k == ch.length || ch[k] == ' ')) {
                count++;
                i = k - 1;
            }

        }

        return count;
    }
}
