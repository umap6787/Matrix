package CTP;

import java.util.Scanner;

public class Encapsulation {

	private int age;

	public void setAge(int age) {
		if(age>=18) {
			this.age=age;
			System.out.println("Eligible for Vote");
		}
		else
			System.out.println("Not Eligible for Vote");
	}
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Encapsulation e=new Encapsulation();
		System.out.println("Enter the age: ");
		int age=s.nextInt();
		e.setAge(age);
		System.out.println(e.getAge());
		s.close();
	}

}
