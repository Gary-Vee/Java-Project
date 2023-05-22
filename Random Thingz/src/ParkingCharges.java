import java.util.Scanner;

public class ParkingCharges {

	public static void main(String[] args) {
		// creates an object in order to get user inputs
		Scanner input = new Scanner(System.in);
		// initializing totalCharge at 0.0
		double totalCharges = 0.0;
		// counts the cars who are staying
		int carCount = 1;
		// prints out the variables into columns. I know its for spacing but it does make it look like columns
		System.out.println("Car\tHours\tCharge");
		// this runs a while loop that is true
		while (true) {
			// this ask the user  to enter the number of hours parked for the car/motorcycle
			System.out.print("Enter hours parked for Vehicle (or -1 to exit): ");
			// this has a variable that is set as hours and its gathering the user input based on the question that the user received
			double hours = input.nextDouble();
			// now if the user inputs -1 as an answer the loop stops
			if (hours == -1) {
				break;
			}
			// this is a method that calculates the charge and then adds the information for the user to read
			double charge = calculateCharges(hours);
			totalCharges += charge;
			System.out.printf("%d\t%.1f\t%.2f\n", carCount, hours, charge);
			carCount++;
		}
		System.out.printf("TOTAL\t\t%.2f\n", totalCharges);
	}
	// this is another method that calculates the hours and the fees and everything thats given by the user
	public static double calculateCharges(double hours) {
		double minimumFee = 2.0;
		double hourlyRate = 0.5;
		double maximumFee = 10.0;
		if (hours <= 3.0) {
			return minimumFee;
		} else if (hours <= 23.0) {
			return minimumFee + hourlyRate * (hours - 3.0);
		} else {
			return maximumFee;
		}
	}

}
