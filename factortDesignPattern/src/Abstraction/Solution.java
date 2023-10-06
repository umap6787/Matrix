package Abstraction;

import java.util.Scanner;

interface Bank{
	void deposit();
}

class HDFC implements Bank{
	@Override
	public void deposit() {
		System.out.println("Depositing in HDFC Bank");
	}
}

class ICICI implements Bank{
	@Override
	public void deposit() {
		System.out.println("Depositing in ICICI Bank");
	}
}

class Customer{
	static Bank b;  //Bank b=null;(Internally)
	
	static Bank decideBank(int choice){
		
		//Bank b=null; (If we decalre a variable inside the local scope we need to give default value)
		
		if (choice==1) {
			b=new HDFC();
		}
		else if(choice==2){
			b=new ICICI();
		}
		return b;
	}
}

public class Solution {

	public static void main(String[] args) {
		
		//Customer c=new Customer();
		Scanner s=new Scanner(System.in);
		System.out.println("1.HDFC\n2.ICICI");
		System.out.println("Enter choice");
		
		int choice=s.nextInt();
		
		// if choice is 1 -> Bank obj = new HDFC();
		// if choice is 2 -> Bank obj = new ICICI();
		// if choice is 3 -> Bank obj = null;
		
		Bank obj=Customer.decideBank(choice);
		
		//TO AVOID NULLPOINTEREXCEPTION
		if(obj!=null) {
			obj.deposit();
		}
		else {
			System.out.println("Invalid Choice");
		}
		

	}

}
