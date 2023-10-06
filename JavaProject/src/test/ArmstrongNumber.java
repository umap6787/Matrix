package test;

import java.util.Scanner;

public class ArmstrongNumber {

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

		for(int i=0;i<arr.length;i++) {
			int a=isAmstrong(arr[i]);
			if(a==0)
				System.out.println(arr[i]+" is non amstrong number");
			//if(a!=0)
			//	System.out.println(a+" is amstrong number");

		}
	}

	private static int isAmstrong(int i) {
		int temp=i;
		int count=0;
		while(i>0) {
			int a=i%10;
			count=count*10+a;
			i=i/10;
		}
		if (count==temp)
			return count;

		else
			return 0;
	}
}
