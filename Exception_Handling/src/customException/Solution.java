package customException;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the Password");
		int password=s.nextInt();

		if(password==123) {
			System.out.println("Login Successful");
		}
		else {
			try {
				throw new InvalidPasswordException("Kindly Enter Valid Password");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

		s.close();
	}

}