import java.util.Scanner;

class Rectangle{
public static void main(String[] args){
     Scanner s1=new Scanner(System.in);
	 System.out.println("Enter the value of length: ");
	 double l=s1.nextDouble();
	 System.out.println("Enter the value of breath: ");
	 double b=s1.nextDouble();
	 
	 
	 double area=l*b;
	 double peri=0.5*l*b;
	 
	 	 System.out.println("length of the side "+l);
		 	 System.out.println("Area of the Rectangle is "+area);
			 	 System.out.println("perimeter of the Rectangle is "+peri);
}

}