public class Account3 {
	private String name;
	private double balance;
	
	
	public Account3(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit (double depos) {
		if (depos > 0.0) {
			balance = balance + depos;
		}
	}

}
