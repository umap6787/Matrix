package test;

import java.util.Scanner;

public class Frequency {

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
		int big = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(big<arr[i])
				big=arr[i];
		}
		int[] b = new int[big+1];

		for(int i =0;i<arr.length;i++) {
			b[arr[i]]++;
		}

		for(int i =0 ; i<b.length;i++) {
			if(b[i]!=0)
				System.out.println(b[i]+" present "+i+" times");
		}

	}

}
