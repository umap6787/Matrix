import java.util.Scanner;

class Arithmetic{
public static void main(String[] args){
     Scanner s1=new Scanner(System.in);
	 System.out.println("Enter the value of length: ");
	 double a=s1.nextDouble();
	 System.out.println("Enter the value of breath: ");
	 double b=s1.nextDouble();
	 
	 
	 double sum=a+b;
	 double sub=a-b;
	 double mul=a*b;
	 double div=a/b;
	 double mod=a%b;
	 
	 
	 	 System.out.println("the arithemetic opration of a  "+a);
		 System.out.println("the arithemetic opration of b  "+b);
		 System.out.println("sum of the Arithmetic is "+sum);
		 System.out.println("subraction of the Arithmetic is "+sub);
		 System.out.println("multiplication of the Arithmetic is "+mul);
		 System.out.println("division of the Arithmetic is "+div);
		 System.out.println("module of the Arithmetic is "+mod);
}

}