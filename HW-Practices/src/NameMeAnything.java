import java.util.Scanner;

public class NameMeAnything {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");

		int num = input.nextInt();
		if (num > 5) {
			System.out.println("The number is greater than 5.");
		}

	}

}