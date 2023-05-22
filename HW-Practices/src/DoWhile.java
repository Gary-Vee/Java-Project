
public class DoWhile {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1; // i is 0 Here

		do {
			sum += i;
			i++;
		} while (i <= 1000);

		System.out.println("The sum = " + sum);
	}
}
