class mobile {

    int price = 999999999;
    double height = 99.99;
    String model = "samsung 99999 ultra double multi ultra pro ++++ with 9999 G";

    mobile() {
        System.out
                .println("the price of the model " + model + " is " + price + " and the height is " + height + " inch");
        // System.out.println(m1.price); //we should not give here it will come in only
        // global scope on main method
    }

    void call() {

        System.out.println("call me from " + model);
    }

    void message() {
        System.out.println("send message");
    }

    void photo() {
        System.out.println("take a cute pic");
    }

    void movie() {
        System.out.println("naruto");
    }

    public static void main(String[] args) {
        mobile m1 = new mobile();
        m1.call();
        m1.message();
        m1.movie();
        m1.call();
        m1.photo();
    }
}
