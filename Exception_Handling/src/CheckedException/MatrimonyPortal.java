package CheckedException;

import java.util.Scanner;

public class MatrimonyPortal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the age");
		int age=s.nextInt();

		s.close();

		if(age>=21) {
			System.out.println("Get Married, Hopefully Stay Happy");
		}
		else {
			try {
				throw new AgeInvalidException("Have Patience");
			}
			catch(AgeInvalidException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
