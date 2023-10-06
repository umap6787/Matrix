package RunnableClass;

public class SmallThread extends Thread {
	@Override
	public void run() {
		for (char ch='a';ch<='z';ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
