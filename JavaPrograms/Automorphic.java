
import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int t=a,b=a*a,count=0;

		do {
			count++;
			a=a/10;
		}while(a!=0);
		
		int c=1;
		for(int i=count;i>0;i--){
			c=c*10;
		}

		if(t==b%c)
			System.out.println("Automorphic");
		
		else
			System.out.println("not Automorphic");
	}
}
