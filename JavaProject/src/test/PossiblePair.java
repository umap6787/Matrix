package test;

import java.util.Scanner;

public class PossiblePair {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int l=s.nextInt();
		int[] arr=new int[l];
		System.out.println("enter the "+l+ "elements");
		for(int i=0;i<l;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("entre to check sum of pair:");
		int m=s.nextInt();
		setPair(arr,m);

	}

	static void setPair(int[] arr, int m) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==m) {
					System.out.println(arr[i]+","+arr[j]+"is possible pair of: "+m);
				}
			}
		}
		
	}

}
