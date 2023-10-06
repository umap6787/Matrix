package test;

import java.util.Scanner;

public class ReplaceArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int l=s.nextInt();
		int[] arr=new int[l];
		System.out.println("enter the "+l+ "elements");
		for(int i=0;i<l;i++) {
			arr[i]=s.nextInt();
		}
		
		int[] res=getEle(arr);
		System.out.println("the elements");
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

	static int[] getEle(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=getSum(arr[i]);
		}
		return arr;
	}

	static int getSum(int i) {
		int sum=0;
		while(i>0) {
			int a=i%10;
			sum=sum+a;
			i=i/10;
		}
		return sum;
	}
}
