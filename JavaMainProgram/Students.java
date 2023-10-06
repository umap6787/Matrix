import java.util.Scanner;

public class Students {

    String name;
    double per;

    Student(String name, double per) {
        this.name = name;
        this.per = per;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("aishu", 99.5);
        Student s2 = new Student("Suchetha", 98.9);
        Student s3 = new Student("Uma", 10.0);
        Student s4 = new Student("naga", 97.5);
        Student[] s = { s1, s2, s3, s4 };
        Student max = s1;

        System.out.println("enter name or percentage");
        String a = sc.next();

        if ("p" == a) {
            double per = sc.nextDouble();
            System.out.println("max percentage: " + max.per);
        }
        if ("n" == a) {
            double per = sc.nextDouble();
            System.out.println("last name: " + max.name);
        }

        System.out.println(max.per);

        for (int i = 1; i < s.length; i++) {
            if (s[i].per > max.per) {
                max = s[i];
            }
        }

    }
}
