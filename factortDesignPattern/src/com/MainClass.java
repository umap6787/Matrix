package com;

import java.util.Scanner;

class Cab{
	
}

class Uber extends Cab{
	
}

class Ola extends Cab{
	
}

class Rapido extends Cab{
	
}

class Mobile{
	static Cab SelectApp(int choice) {
		if(choice==1) {
			return new Uber();
		}
		else if(choice==2) {
			return new Ola();
		}
		else if(choice==3) {
			return new Rapido();
		}
		else {
			return null;
		}
	}
}
public class MainClass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1.Uber\n2.Ola\n3.Rapido");
		System.out.println("Enter Choice");
		
		int choice = s.nextInt();
		Cab obj=Mobile.SelectApp(choice);
		
		if(obj instanceof Uber) {
			System.out.println("Using Uber App");
		}
		else if(obj instanceof Ola) {
			System.out.println("Using Ola App");
		}
		else if(obj instanceof Rapido) {
			System.out.println("Using Rapido App");
		}
		else  {
			System.out.println("INVALID");
		}
	}
}
