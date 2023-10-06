package RunnableClass;

public class AppleRunnable implements Runnable {
	Fruit f=new Fruit();
	public void run() {
		f.saleApple();
	}
}
