import java.util.Scanner;

class SubString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array");
        String str = s.nextLine();

        System.out.println("Enter the string to check");
        String st = s.nextLine();
        boolean ss = getSubStr(str, st);

        if (ss)
            System.out.println("Is present");

        else
            System.out.println("Is not present");
    }

    static boolean getSubStr(String str, String st) {
        char[] ch = str.toCharArray();
        char[] c = st.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int j = 0, k = i;

            while (j < c.length && k < ch.length && c[j] == ch[k]) {
                j++;
                k++;
            }
            if (c.length == j)
                return true;
        }

        return false;
    }
}
