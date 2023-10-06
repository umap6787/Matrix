package com;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

		System.out.println("----------------------");
		for(int i:a) {
			System.out.println(i);
		}

		System.out.println("----------------------");
		double[] marks= {98.5,67.4,86.4};
		for(double m:marks) {
			System.out.println(m);
		}

		System.out.println("----------------------");
		String[] subjects= {"java","python","javaScript"};
		for(String subject:subjects) {
			System.out.println(subject);
		}
	}
}
