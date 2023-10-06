package RunnableClass;

public class Fruit {
	void saleApple() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" Apple");

			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public void saleOrange() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" Orange");

			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
