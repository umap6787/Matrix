import java.util.Scanner;

class Stick{
	 static final double i=0.393701;

public static void main(String[] args){
	
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the length of the stick in cm: ");
	 double l=s.nextDouble();
	 
	 double inch=i*l;
	 System.out.println("length of the side "+l);
	 System.out.println(l+" cm of stick value in inch is "+inch);
}
}