class prime {
    public static void main(String[] args) {
        int sum = 0;
        for (int n = 2; n <= 100; n++) {
            int res = isprime(n);
            sum = sum + n;
        }
        System.out.println("sum of prime number is " + sum);
    }

    static int isprime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return n;
    }

}
