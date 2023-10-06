class nithish {

    String name;
    int age;
    double height;
    long phNo;

    nithish(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public static void main(String[] args) { // main
        nithish m1 = new nithish("Umapathy", 21, 178.5);
        System.out.println(m1.age + " " + m1.height + m1.name + m1.phNo); // sout

    }
}
