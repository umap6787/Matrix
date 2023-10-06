import java.util.Scanner;

class monthName {
    static String getMonthNumber(int a) {
        if (a == 1)
            return "nithish";
        else if (a == 2)
            return "kamal";
        else if (a == 3)
            return "kartheesan";
        else if (a == 4)
            return "aishuu";
        else if (a == 5)
            return "hemanth";
        else if (a == 6)
            return "dinesh Benamin";
        else if (a == 7)
            return "my love";
        else if (a == 8)
            return "thangoo";
        else if (a == 9)
            return "mine";
        else if (a == 10)
            return "arun";
        else if (a == 11)
            return "impuuu";
        else if (a == 12)
            return "sandeep";
        else
            return "invalid";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int m = sc.nextInt();
        String g = getMonthNumber(m);
        System.out.println("It is the BirthDay Month of: " + g);
    }
}