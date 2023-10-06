import java.util.Scanner;

class DateMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the 1st date (dd mm yyyy)");
        int d1 = s.nextInt();
        int m1 = s.nextInt();
        int y1 = s.nextInt();

        Date dt1 = new Date(d1, m1, y1);

        System.out.println("Enter the 2nd date (dd mm yyyy)");
        int d2 = s.nextInt();
        int m2 = s.nextInt();
        int y2 = s.nextInt();

        Date dt2 = new Date(d2, m2, y2);

        int x = dt1.NoOfDate();
        int y = dt2.NoOfDate();

        System.out.println("No of Days Between two date is: " + (y - x));

        System.out.println("day name of 1st date " + dt1 + " is " + dt1.GetDay());
        System.out.println("day name of 1st date " + dt2 + " is " + dt2.GetDay());
    }

}
