import java.util.Scanner;
public class Zoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thomas wants to be your friend ");
		System.out.println("Type 1 for yes, for NO type 2 ");
		Scanner input = new Scanner(System.in);
		
		int request = input.nextInt();
		
		if (request == 2) {
		System.out.print("Friend Request denied ! ");
		}
		if (request == 1) {
			System.out.print("Friend Request Accepted ! ");
			}
	}

}
