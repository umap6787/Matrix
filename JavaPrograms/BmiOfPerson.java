import java.util.Scanner;

class BmiOfPerson {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the weight of the person");
        double w = s.nextDouble();

        System.out.println("enter the height of the person");
        double h = s.nextDouble();

        double BMI = getBMI(w, h);
        System.out.println(BMI);
    }

    static double getBMI(double w, double h) {
        double bmi = w / (h * h);
        return bmi;
    }
}