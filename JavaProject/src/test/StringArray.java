package test;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st=s.nextLine();
		System.out.println("Enter the 2nd String: ");
		String st2=s.nextLine();


		//anagram
		System.out.println("program for anagram");
		boolean an=getAnagram(st,st2);
		if(an)
			System.out.println("the given string is anagram");
		else
			System.out.println("the given string is not a anagram");


		//1st letter to upper case
		System.out.println("program for anagram");
		String uc=getString(st);
		System.out.println(uc);

		//percentage of each charecter
		System.out.println("program for per");
		perOfCharecter(st);

		//sub string present in main string
		System.out.println("program for sub string");
		boolean sub=getSubString(st,st2);
		if(sub)
			System.out.println("the given string is present");
		else
			System.out.println("the given string is not present");

		//sum of numbers-
		System.out.println("program for sum");
		int sum=getSum(st);
		System.out.println("the sum of number is: "+sum);

		//remove duplicate
		System.out.println("program for duplicate");
		String d=getDuplicate(st);
		System.out.println(st);


		//aaabbacccdda --> abacda
		System.out.println("program for abs");
		String str=getStringarray(st);
		System.out.println(str);

		//swap 1st & last charecter
		System.out.println("program for swap");
		String swap=getSwap(st);



		//count no.of vowles,consonent,digit,special char-
		System.out.println("program for count");
		contString(st);



		//palindrome
		System.out.println("program for palindrome");
		boolean pal=getPalindrome(st);
		if(pal)
			System.out.println("the given string is palindrome");
		else
			System.out.println("the given string is not a palindrome");

	}

	static String getSwap(String st) {
		char[] ch=st.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				f=i;
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				char temp=ch[i];
				ch[i]=ch[f];
				ch[f]=temp;
			}
		}
		String str=new String(ch);
		return str;
	}




	static boolean getSubString(String st,String st2) {
		char[] ch=st.toCharArray();
		char[] c=st2.toCharArray();

		for(int i=0;i<st.length()-1;i++) {
			int s=0;
			for(int j=0;j<st2.length()-1;j++) {
				if(ch[i]==ch[j]) {
					s++;
				}
			}
			if(s==st2.length()-1) {
				return true;
			}
		}	
		return false;
	}

	static String getStringarray(String st) {
		char[] ch=st.toCharArray();
		String s="";
		for(int i=0;i<st.length()-1;i++) {
			if(i==0) {
				s+=ch[i];
			}
			else if(ch[i]!=ch[i-1]) {
				s+=ch[i];
			}
		}

		return s;
	}

	static int getSum(String st) {
		int sum=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='0'&&ch<='9')
				sum=sum+ch-48;
		}
		return sum;
	}

	static String getDuplicate(String st) {
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j = i+1 ; j<ch.length ; j++) {
				if(ch[i]==ch[j])
					ch[j]=0;
			}						 
		}
		for(int i = 0; i<ch.length ; i++) 
		{
			if(ch[i]!=0)
				System.out.print(ch[i]);
		}
		String s=new String(ch);
		return s;
	}

	static void contString(String st) {
		int v=0,c=0,d=0,spl=0;
		char[] ch=st.toCharArray();
		for(int i=0;i<st.length();i++) {
			if(ch[i]=='a'||ch[i]=='A'||ch[i]=='e'||ch[i]=='E'||ch[i]=='i'||ch[i]=='I'||ch[i]=='o'||ch[i]=='O'||ch[i]=='u'||ch[i]=='U') {
				v++;
			}
			else if(ch[i] >= 'a' && ch[i] <='z'||ch[i] >= 'A' && ch[i] <='Z'){
				c++;
			}
			else if(ch[i]>='0'&&ch[i]<='9') {
				d++;
			}
			else if(ch[i]!=' ') {
				spl++;
			}
		}
		System.out.println("the no of vowles is: "+v);
		System.out.println("the no of consonent is: "+c);
		System.out.println("the no of digit is: "+d);
		System.out.println("the no of special charecter is: "+spl);

	}

	static boolean getPalindrome(String st) {
		int f=0,l=st.length()-1;
		char[] ch=st.toCharArray();
		while(f<l) {
			if(ch[f]==ch[l]) {
				f++;
				l--;
			}
			else
				return false;
		}
		return true;
	}

	static void perOfCharecter(String st) {
		char[] ch=st.toCharArray();
		for(int i=0;i<st.length();i++) {
			int count=1;
			for(int j=i+1;j<st.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			System.out.println(ch[i]+" --> "+count/st.length()*100+" percentage" );
		}
	}

	static String getString(String st) {
		char[] ch=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=0&&ch[i-1]==' ') {
				if(ch[i]>='a'&&ch[i]<='z')
					ch[i]=(char)(ch[i]-32);
			}
			else 
				if(ch[i]>='A'&&ch[i]<='Z')
					ch[i]=(char)(ch[i]+32);
		}
		String str=new String(ch);
		return str;
	}


	static boolean getAnagram(String st,String st2) {
		int[] fc=countfreq(st);
		int[] sc=countfreq(st2);
		for (int i=0;i<26;i++)
		{
			if(fc[i]!=sc[i])
				return false;
		}
		return true;
	}
	static int[] countfreq(String st)
	{
		int[] cnt=new int[26];
		for (int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z')
				cnt[ch-65]++;
			else if (ch>='a' && ch<='z')
			{
				cnt[ch-97]++;
			}
		}
		return cnt;
	}
}
