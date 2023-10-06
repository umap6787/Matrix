import java.util.Scanner;

public class Student {

    String name;
    double per;

    Student(String name, double per) {
        this.name = name;
        this.per = per;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(Sytsem.in);
        Student s1 = new Student("aishu", 99.5);
        Student s2 = new Student("Suchetha", 98.9);
        Student s3 = new Student("Uma", 10.0);
        Student s4 = new Student("naga", 97.5);
        Student[] s = { s1, s2, s3, s4 };
        Student max = s1;
        for (int i = 1; i < s.length; i++) {
            if (s[i].per > max.per) {
                max = s[i];
            }
        }
        System.out.println("enter percentage: ");
        String a = sc.next();
        if (a == "percentage")
            System.out.println(max.per);
        else
            System.out.println("no data");

    }
}
