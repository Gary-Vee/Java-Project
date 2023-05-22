import java.util.Scanner;

public class Interger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your Number ");
		int user = input.nextInt();

		int sum = 10 + user;

		System.out.printf("Your number is %d%n ", sum);
	}

}
