public class Account4 {
	private String name;
	private double balance;

	public Account4(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	public static void main(String[] args) {
		Account4 acct = new Account4("Jane Green" , 1000.0);
		
		System.out.println(acct.getName());
		System.out.println(acct.getBalance());
	}
		
		

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		if (amount <= 0.0) {
			balance = balance + amount;
		}
	}
}
