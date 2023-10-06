import java.util.Scanner;

class Temperature{
	 static final double i=0.393701;  //we need to use static keyword to assign in the static method

public static void main(String[] args){
	
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the degree of celcius: ");
	 double c=s.nextDouble();
	 
	 double f=(c*9/5)+32;
	 System.out.println("the celcius is "+c);
	 System.out.println(c+" celcius to farenheit is "+f);
}
}