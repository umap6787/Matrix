package Programming;

import java.util.Scanner;

public class Umapathy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st Matrix: ");
		System.out.println("enter the no of rows");
		int r=s.nextInt();
		System.out.println("enter the no of columns");
		int c=s.nextInt();

		System.out.println("Enter the 2nd Matrix: ");
		System.out.println("enter the no of rows");
		int r1=s.nextInt();
		System.out.println("enter the no of columns");
		int c1=s.nextInt();

		System.out.println("enter the "+r*c+" elements:");
		int[][] mat=new int[r][c];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				mat[i][j]=s.nextInt();
		}

		System.out.println("enter the "+r1*c1+" elements:");
		int[][] mat1=new int[r1][c1];
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				mat1[i][j]=s.nextInt();
		}
		// 1............................................................................................
		System.out.println("Addition of two matrix");
		if(mat.length==mat1.length&&mat[0].length==mat1[0].length) {
			int[][] res=umaAddMatrix(mat,mat1);
			displayMatrix(res);
		}
		else 
			System.out.println("enter valid matrix");

		// 2............................................................................................
		System.out.println("multiplication of two matrix");
		if(mat.length==mat1.length&&mat[0].length==mat[0].length) {
			int[][] res=umaMulMatrix(mat,mat1);
			displayMatrix(res);
		}
		else 
			System.out.println("enter valid matrix");

		// 3............................................................................................
		System.out.println("row wise reverse of given matrix");
		umaRowWiseReverseMatrix(mat);

		// 4............................................................................................
		System.out.println("column wise reverse of given matrix");
		umaColumnWiseReverseMatrix(mat);

		// 5............................................................................................
		System.out.println("Prime numbers in a matrix: ");
		umaPrimeNumber(mat);

		// 6............................................................................................
		System.out.println("column wise biggest:");
		int[] big=umaColumnWiseBiggest(mat);
		for(int i=0;i<big.length;i++)
			System.out.print(big[i]+" ");

		// 7............................................................................................
		System.out.println("Difference between Primary diagonal and secondary diagonal");
		if(mat.length==mat1.length&&mat[0].length==mat[0].length) {
			umaDifference(mat);
		}
		else 
			System.out.println("enter valid matrix");

		// 8............................................................................................
		System.out.println("identity matrix or not:");
		if(mat.length==mat1.length&&mat[0].length==mat[0].length) {
			boolean id=umaIdentity(mat);
			if(id)
				System.out.println("the given matrix is identity matrix");
			else
				System.out.println("the given matrix is not a identity matrix");
		}
		else 
			System.out.println("enter valid matrix");

		// 9............................................................................................
		System.out.println("Matrix element in a spiral order");
		umaSprialOrder(mat);

		// 10............................................................................................
		System.out.println("Transpose of Matrix");
		int[][] trans=umaTranspose(mat);
		displayMatrix(trans);



	}


	//Transpose of Matrix
	static int[][] umaTranspose(int[][] mat) {
		int[][] trans=new int[mat.length][mat[0].length];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				trans[j][i]=mat[i][j];
			}
		}
		return trans;
	}

	//spiral order
	static void umaSprialOrder(int[][] mat) {
		for(int i=0,j=mat.length-1;i<j;i++,j--){
			for(int k=i;k<j;k++){
				System.out.println(mat[i][k]+" ");
			}
			for(int k=i;k<j;k++){
				System.out.println(mat[k][j]+" ");
			}
			for(int k=j;k>i;k--){
				System.out.println(mat[j][k]+" ");
			}
			for(int k=j;k>i;k--){
				System.out.println(mat[k][i]+" ");
			}
		}
		int n=mat.length;
		if(n%2==1)
			System.out.println(mat[n/2][n/2]);
	}

	//identity matrix
	static boolean umaIdentity(int[][] mat) {
		for(int i=0;i<mat.length;i++) {	
			for(int j=0;i<mat.length;j++) {		
				if(i==j&&mat[i][j]!=1)
					return false;
				else if(mat[i][j]!=0)
					return false;
			}
		}
		return true;
	}

	//Difference between Primary diagonal and secondary diagonal
	static void umaDifference(int[][] mat) {
		int f=0,l=mat.length-1,sum1=0,sum2=0;
		for(int i=0;i<mat.length;i++) {		
			sum1 +=mat[i][i];
			sum2 +=mat[f][l];
			f++;
			l--;
		}
		int diff=sum1-sum2;
		if (diff>=0)
			System.out.println(diff);
		else
			System.out.println(diff*(-1));
	}

	//column wise biggest
	static int[] umaColumnWiseBiggest(int[][] mat) {
		int[] big= new int[mat[0].length];
		for(int i=0;i<mat[0].length;i++) {
			int b=Integer.MIN_VALUE;
			for(int j=0;j<mat.length;j++){
				if(mat[j][i]>b)
					b=mat[i][j];
			}
			big[i]=b;
		}
		return big;
	}

	//prime number
	static void umaPrimeNumber(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = mat[i].length - 1; j >= 0; j--) {
				boolean res=isPrime(mat[i][j]);
				if(res)
					System.out.println(mat[i][j]);
			}
		}
	}
	static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) 
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}

	//column wise Reverse Matrix
	static void umaColumnWiseReverseMatrix(int[][] mat) {
		for(int i=0;i<mat.length;i++) {
			for(int j=mat.length-1;j>=0;j--){
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}	
	}

	//Row wise Reverse Matrix
	static void umaRowWiseReverseMatrix(int[][] mat) {
		for (int i=0;i<mat.length;i++){
			for(int j=mat[i].length-1;j>=0;j--){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	//multiplication of two matrix
	static int[][] umaMulMatrix(int[][] mat, int[][] mat1) {
		int[][] add=new int[mat.length][mat[0].length];
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				add[i][j]=mat[i][j]*mat1[i][j];
		}
		return add;
	}

	//Addition of two matrix
	static int[][] umaAddMatrix(int[][] mat, int[][] mat1) {
		int[][] add=new int[mat.length][mat[0].length];
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat[i].length;j++)
				add[i][j]=mat[i][j]+mat1[i][j];
		}
		return add;
	}

	static void displayMatrix(int[][] res) {
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
