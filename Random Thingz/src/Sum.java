public class Sum {
	public static void main(String[] args) {
		int total = 0;

		for (int number = 1; number <= 1000; number++) {
			total = total + number;
		}
		System.out.printf("Sum of this is %d%n", total);
	}
}
