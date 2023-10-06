package RunnableClass;

public class MainRunner1  {

	public static void main(String[] args) throws InterruptedException {
		Account ac=new Account(12000);

		Thread t1=new Thread() {
			public void run() {
				ac.Withdraw(20000);
			}
		};

		Thread t2=new Thread() {
			public void run() {
				ac.deposit(20000);
			}
		};

		Thread t3=new Thread() {
			public void run() {
				ac.deposit(20000);
			}
		};
		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(7000);
		t3.start();
	}

}
