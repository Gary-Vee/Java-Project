import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int user = input.nextInt();
		if (user > 5) {
			System.out.print("Noice");

		} else {
			System.out.print("Not noice");
		}

	}
}