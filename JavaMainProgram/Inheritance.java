class Inheritance {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    A(double x) {
        this(10);
        System.out.println("hi");
    }

    A(int x) {
        System.out.println("hlo");
    }
}

class B extends A {
    B() {
        this("uma");
        System.out.println("Bye");
    }

    B(String x) {
        super(1.5);
        System.out.println(x);
    }
}