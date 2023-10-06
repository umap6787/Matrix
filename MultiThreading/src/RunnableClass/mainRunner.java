package RunnableClass;

public class mainRunner {

	public static void main(String[] args) {
		System.out.println("main method starts");
		
		Runnable ar=new AppleRunnable();
		Thread t1=new Thread(ar);
		t1.start();
		
		Runnable or=new OrangeRunnable();
		Thread t2=new Thread(or);
		t2.start();
		
		System.out.println("main method ends");

	}

}
