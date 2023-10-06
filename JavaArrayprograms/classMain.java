import java.util.Scanner;

class classMain {
    public static void main(String[] args) {
        ArrayOperators ao = new ArrayOperators();
        System.out.println("read the 1st array: ");
        // int[] x = ao.Merge();

        System.out.println("read the 2nd array: ");
        // int[] y = ao.Merge();

        System.out.println("user entered 1st array: ");
        ao.displayArray(x);

        System.out.println("user entered 2nd array: ");
        ao.displayArray(y);

        int[] z = ao.merge(x, y);
        System.out.println("merge array elements: ");
        // ArrayOperators ao=new ArrayOperators();
        ao.displayArray(z);
    }

}
