package test;
import java.util.Scanner;

public class DuplicateElements {

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
		
		int[] t=new int[arr.length];
		int in=0;
		
		for(int i=0;i<arr.length;i++) {
			int j=i-1;
			for(;j>=0;j--) {
				if(arr[i]==arr[j]) {
					break;
				}
			}
			if(j==-1) {
				t[i]=arr[i];
				in++;
			}
		}
		int[] ar=new int[in];
		for(int i=0;i<in;i++) {
			ar[i]=t[i];
		}
		
		
		return ar;
	}

}
