package test;

import java.util.Scanner;

public class NthBiggest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int l=s.nextInt();
		int[] arr=new int[l];
		System.out.println("enter the "+l+ "elements");
		for(int i=0;i<l;i++) {
			arr[i]=s.nextInt();
		}

		int res=getEle(arr);
		System.out.println("the biggest elements is: "+res);
	}

	static int getEle(int[] arr) {
		int big=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(big<arr[i]) {
				big=arr[i];
			}
			
		}
		return big;

	}

}
