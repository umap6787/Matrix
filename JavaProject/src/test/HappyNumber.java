package test;

import java.util.Scanner;

public class HappyNumber {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int l=s.nextInt();
		int[] arr=new int[l];
		System.out.println("enter the "+l+ "elements");
		for(int i=0;i<l;i++) {
			arr[i]=s.nextInt();
		}
		getEle(arr);
	}

	static void getEle(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			boolean res = gethappy(arr[i]);
			if (res) {
				System.out.println(arr[i] + " is the happy number");
				count=count+arr[i];
			}

			else
				System.out.println(arr[i] + " is not the happy number");
		}
		System.out.println("the sum of happy number is: "+count);
	}
	static boolean gethappy(int a) {
		while (a > 9) {
			int sum = 0;
			while (a != 0) {
				int d = a % 10;
				sum = sum + d * d;
				a = a / 10;
			}
			a = sum;
		}
		if (a == 1 || a == 7)
			return true;
		else
			return false;
	}

}
