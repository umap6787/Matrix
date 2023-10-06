package com;
import java.util.Scanner;

/**
 * Factory Design Pattern Or Factory Method:
 * ----------------------------------------------
 * -> A method returning different type of objects is called as factory design Pattern Or Factory Method.
 * -> We achieve Factory Design pattern by having a Generalization return type.
 */

class Food{

}

class Pizza extends Food{

}

class Burger extends Food{

}

class Biryani extends Food{

}

class KFC {
	Food order(int choice){
		if(choice==1) {
			Pizza p=new Pizza();
			return p;
		}
		else if(choice==2) {
			Burger b=new Burger();
			return b;
		}
		else if(choice==3) {
			Biryani br=new Biryani();
			return br;
		}
		else
			return null;
	}
}

public class Solution {

	public static void main(String[] args) {
		
		KFC kfc=new KFC();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("1.Pizza\n2.Burger\n3.Biryani");
		System.out.println("Enter the choice");
		int choice=s.nextInt();
		
		/*
		 * if choice is 1 -> Food obj= new Piza();
		 * if choice is 2 -> Food obj= new Burger();
		 * if choice is 3 -> Food obj= new Biryaniz();
		 * if choice is 4,5, ... -> Food obj= null;
		 */
		
		Food obj=kfc.order(choice);
		
		if(obj instanceof Pizza) {
			System.out.println("Eating Pizza");
		}
		else if(obj instanceof Burger) {
			System.out.println("Eating Burger");
		}
		else if(obj instanceof Biryani) {
			System.out.println("Eating Biryani");
		}
		else {
			System.out.println("INVALID CHOICE");
		}
	}
}
