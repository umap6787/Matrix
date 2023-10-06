public class mobiles {
    int cost = 5000;
    String name = "samsung";
    double size = 8.5;

    void cam() {
        System.out.println("Mobile name is " + name + "  And cost is " + cost);
    }

    void call() {
        System.out.println("call  me now");
    }

    public static void main(String[] args) {
        mobiles m = new mobiles();
        m.cam();
        m.call();
    }

}
