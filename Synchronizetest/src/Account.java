import java.util.Scanner;

class test {

	String name;
	int age;

	public test(int age) {

		this.age = age;
	}

}

class Account {

	int bal;
	String acc;

	public Account(int bal) {

		this.bal = bal;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public boolean isSufficientBalance(int w) {
		if (bal > w)
			return true;
		else
			return false;

	}

	public void withdraw(int amt) {

		bal = bal - amt;
		System.out.println("withdrawl money is " + amt);
		System.out.println("Your current balance is" + bal);

	}
}

class Customer {
	Account account;
	private String name;
	private test t;

	public Customer(Account account, String n) {
		this.account = account;
		name = n;
		this.t = t;

	}

	public Customer(Account account, String n, test t) {
		this.account = account;
		name = n;
		this.t = t;

	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public void running()
	{

		//System.out.println(account.acc);
		
		System.out.println("Account object is " +account);
		System.out.println("test object is" + t);

	}

	public void running1() {

		System.out.println("Account object is " + account);
		System.out.println("test object is" + t);
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter amount to withdraw");

		int amt = kb.nextInt();

		if (account.isSufficientBalance(amt)) {
			System.out.println(account);

			account.withdraw(amt);

		}

		else {

			System.out.println("Ins");
		}
	}

	/*
	 * @Override public void run() {
	 * 
	 * System.out.println("Account object is " +account);
	 * System.out.println("test object is" + t); // TODO Auto-generated method stub
	 * Scanner kb= new Scanner(System.in);
	 * System.out.println("Enter amount to withdraw");
	 * 
	 * int amt =kb.nextInt();
	 * 
	 * if(account.isSufficientBalance(amt)) { System.out.println(account);
	 * 
	 * account.withdraw(amt);
	 * 
	 * 
	 * }
	 * 
	 * else {
	 * 
	 * System.out.println("Ins"); } }
	 */
}

class ThreadExample {
	public static void main(String[] args) {
		
		
		Account account =new Account(1000);
		System.out.println("Account" + account);
		test t11 = new test(10);
		Customer c3 = new Customer();
		c3.running();

		Account a1 = new Account(1000);
		Account a2=new Account();
		
		/*
		 * Account a3=a2;
		 * 
		 * if(a2==a3) { System.out.println("a2,a3 are same object");
		 * 
		 * 
		 * } else {
		 * 
		 * System.out.println("not"); }
		 * 
		 * System.out.println("a1 is pointing to" + a1); Customer c4=new Customer();
		 */
		Customer c1 = new Customer(a1, "Raj");

		//System.out.println("c1.account" + c4.account);
		c1.running();
		Customer c2 = new Customer(a1, "Raju", t11);
		c2.running();

		/*
		 * Thread t1=new Thread(c1); Thread t2=new Thread(c2); t1.start(); t2.start();
		 */

	}

}
