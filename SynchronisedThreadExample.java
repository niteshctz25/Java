import java.util.Scanner;

class Account {
	private int bal;
	public Account(int bal) {
		this.bal=bal;
	}
	public boolean isSufficientBalance(int w) {
		if(bal > w)
			return true;
		else
			return false;
	}
	public void withdraw(int amt) {
		bal=bal-amt;
		System.out.println("Withdrawl Amount is: " + amt);
		System.out.println("Available Balance is: " + bal);
	}
}

class Customer implements Runnable {
	private String name;
	private Account account;
	public Customer(Account account, String name) {
		this.account = account;
		this.name = name;
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		synchronized(account) {
			System.out.print(name+ " Enter the amount to Withdraw: ");
			int amt = sc.nextInt();
			if(account.isSufficientBalance(amt))
				account.withdraw(amt);
			else
				System.out.print("Insufficient Balance");
		}
	}

}

public class SynchronisedThreadExample {
	public static void main(String[] args) {
		Account a1=new Account(1000);
		Customer c1 = new Customer(a1,"Raj");
		Customer c2 = new Customer(a1,"Nitesh");
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
	}

}
