package test;

import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int l=s.nextInt();
		System.out.println("Enter the array index to insert:");
		int m=s.nextInt();
		System.out.println("Enter the array to insert:");
		int n=s.nextInt();
		
		int[] arr=new int[l];
		System.out.println("enter the "+l+ "elements");
		
		int[] res=getEle(arr,m,n);
		System.out.println("the elements");
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}

	static int[] getEle(int[] arr,int m,int n) {
		for(int i=0;i<arr.length;i++) {
			if(m==i) {
				arr[i]=n;
			}
		}
		
		return arr;
	}

}
