package primitivecasting;

public class Solution {

	public static void main(String[] args) {
		
		//WIDENING
		int a=25;
		double b=a;
		System.out.println(a+"-->"+b);//25 25.0
		
		int a1=26;
		double a2=a1;
		System.out.println(a1+"   "+a2);
		
		double c=27;
		System.out.println(c);//27.0
		
		char d='a';
		int e=d;
		System.out.println(d+"-->"+e); //a 67
		
		System.out.println("--------------------");
		
		//NARROWING
		double f=15.20;
		int g=(int)f;
		System.out.println(f+"-->"+g); //15.20 15
		
		int h=(int)20.67;
		System.out.println(h);// 20
		
		int x=97;
		char y=(char)x;
		System.out.println(x+"-->"+y);//97 a
		
		System.out.println("---------------------");
		
		// ->single line comment
		
		/*
		 * ->multi line comment
		 */
		
		/**
		 * ->documentation comment
		 */
		
		System.out.println((int)78.23); //78
		System.out.println((char)68); //D
		System.out.println("A"+"B"); //AB
		System.out.println("A"+10+20); //A1020
		System.out.println(10+20+"A"); //30A
		System.out.println("A"+'B'); //AB
		System.out.println('A'+'B'); //131
		System.out.println('a'+20); //117
		System.out.println('A'+'B'+"A"); //131A
		System.out.println('A'); //A
		
		System.out.println("---------------");
		
		System.out.println(10); //java consider non-decimal value as int
		System.out.println(1.2); //java consider decimal value as double
		
		/**by default decimal value is consider as double
		  *therefore java assume that we are storing double into float
		  *bigger to smaller,so we have to explicitly cast(convert) it.
		*/
		
		float aa=(float)1.2;
		System.out.println(aa); //1.2
		float ab=1.2f; //or -> float ab=1.2F;
		System.out.println(ab); //1.2
		
		long contactNo=12354556l; //or-> long contactNo=12354556L;
		System.out.println(contactNo);
		
		byte bb=5;
		System.out.println(bb); //5
		short cc=10;
		int dd=25;
		long ee=100l; //or-> long ee=100L;
		float ff=1.4f; //or->float ff=1.4F;
		double gg=1.5;
		
	}
}
