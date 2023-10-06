import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();
    }
}

/*
 * 
 * *
 * * *
 * * * *
 * * * * *
 */

class Triangle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

class Triangle2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 1; n >= i; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}
/*
 * 54321
 * 5432
 * 543
 * 54
 * 5
 */

class Triangle3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 1; n >= i; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}
/*
 * 1
 * 21
 * 321
 * 4321
 * 54321
 */

class Triangle4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 1; n >= i; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}
/*
 * 12345
 * 2345
 * 345
 * 45
 * 5
 */

class Triangle5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = n; 1 <= i; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}
/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */

class Triangle6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = 1; n >= i; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        s.close();
    }
}
/*
 * 1
 * 22
 * 333
 * 4444
 * 55555
 */

class Triangle7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = n; 1 <= i; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        s.close();
    }
}
/*
 * 55555
 * 4444
 * 333
 * 22
 * 1
 */

class Triangle8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        for (int i = n; 1 <= i; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        s.close();
    }
}
/*
 * 5
 * 45
 * 345
 * 2345
 * 12345
 */

class Triangle9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value");

        int n = s.nextInt();

        int sp = 0, st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print(j + " ");
            }
            if (i <= n / 2) {
                sp++;
                st = st - 2;
            } else {
                sp--;
                st = st + 2;
            }
            System.out.println();
        }
    }
}
