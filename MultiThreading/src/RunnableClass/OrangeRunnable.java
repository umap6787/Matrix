package RunnableClass;

public class OrangeRunnable implements Runnable {
	Fruit f=new Fruit();
	public void run() {
		f.saleOrange();
	}
}
