
public class Account3Test {

	public static void main(String[] args) {
		Account3 acct = new Account3("Jane Green" , 1000.0);
		
		System.out.println(acct.getName());
		System.out.println(acct.getBalance());
		
		acct.deposit(9.0);
		
		System.out.println(acct.getBalance());
	}

}