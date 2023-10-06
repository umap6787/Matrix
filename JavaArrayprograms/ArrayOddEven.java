import java.util.Scanner;

class ArrayOddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values");
        int n = s.nextInt();
        
       String [] st={"even","odd"};

        System.out.println(n+ " is a "+ st[n%2]);
        s.close();
    }
}
