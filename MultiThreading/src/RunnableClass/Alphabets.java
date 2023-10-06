package RunnableClass;

public class Alphabets {

	public static void main(String[] args) {
		Thread t1=new CapitalThread();
		Thread t2=new SmallThread();
		
		t1.start();
		t2.start();
		t1.start();
	}
}
