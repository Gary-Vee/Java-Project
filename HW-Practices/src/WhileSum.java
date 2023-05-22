public class WhileSum {

	public static void main(String[] args) {
		int counter = 11;
		int sum = 0;

		while (counter < 18) {
			sum = sum + counter;
			counter = counter + 1;
		}
		System.out.println(sum);
	}

}