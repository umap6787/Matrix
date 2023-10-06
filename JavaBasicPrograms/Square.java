import java.util.Scanner;

class Square{
public static void main(String[] args){
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the value of side: ");
	 double sq=s.nextDouble();
	 
	 double area=sq*sq;
	 double peri=4*sq;
	 
	 	 System.out.println("length of the side "+sq);
		 	 System.out.println("Area of the square is "+area);
			 	 System.out.println("perimeter of the square is "+peri);
}

}