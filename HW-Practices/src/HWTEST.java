public class HWTEST {
	private String name;
	private double balance;
	public HWTEST(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public void withdraw(double amount) {
		if (amount <= balance){
			System.out.printf("%d <= %d%n" , balance=amount-balance);
		}
	}
}