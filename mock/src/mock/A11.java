package mock;

public class A11 {
	int a=test();
	
	int test(){
		System.out.println("TB");
		System.out.println("this:"+this);
		System.out.println("var a:"+a);
		System.out.println("TE");
		return 30;
	}
	
	public static void main(String[] args) {
		System.out.println("from main");//1
		A11 obj1=new A11();
		System.out.println("var a:"+obj1.a);
		System.out.println("=======");
		A11 obj2=new A11();
		System.out.println("from main");
	}
}
