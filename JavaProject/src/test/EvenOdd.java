package test;

import java.util.Scanner;

public class EvenOdd {

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
		int[] temp=new int[arr.length];
		int f=arr.length-1;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				temp[count]=arr[i];
				count++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				temp[count]=arr[i];
				count++;
			}
		}
		
		return temp;
		
		
	}

}
