interface LapTop {
    int id = 33;

}

abstract class Coding {

    abstract void Program(String a, int id);
}

public class FamilyOfJava extends Coding implements LapTop {

    static String name = "Aravindhan";

    @Override
    void Program(String a, int b) {
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        FamilyOfJava f = new FamilyOfJava();

        f.Program(name, id);

    }

}
