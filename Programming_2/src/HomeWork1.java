import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		double purchaseAmount, stateTax, countyTax, totalTax, totalSale;
		final double STATE_TAX_RATE = 0.055;
		final double COUNTY_TAX_RATE = 0.02;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of the purchase: ");
		purchaseAmount = input.nextDouble();
		stateTax = purchaseAmount * STATE_TAX_RATE;
		countyTax = purchaseAmount * COUNTY_TAX_RATE;
		totalTax = stateTax + countyTax;
		totalSale = purchaseAmount + totalTax;
		System.out.printf("Amount of purchase: $%.2f %n", purchaseAmount);
		System.out.printf("State sales tax: $%.2f %n", stateTax);
		System.out.printf("County sales tax: $%.2f %n", countyTax);
		System.out.printf("Total sales tax: $%.2f %n", totalTax);
		System.out.printf("Total of sale: $%.2f %n", totalSale);
	}
}