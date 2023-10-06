package RunnableClass;

public class Account {
	int balance;

	public Account(int balance) {
		this.balance=balance;
	}

	synchronized void Withdraw(int amt) {
		if(amt<=balance) {
			System.out.println("low balance..");
			try {
				wait(5000);
			}
			catch(Exception e) {
				Withdraw(amt);
				return;
			}
			balance = balance-amt;
			System.out.println(amt+" withdrawn successfully...!");
			System.out.println("Available balance is: "+balance);
		}
	}
	synchronized void deposit(int amt) {
		balance+=amt;
		System.out.println(amt+" deposited successfully...!");
		System.out.println("Available balance is: "+balance);
		notify();
	}
}
