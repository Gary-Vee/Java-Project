import java.util.Scanner;

public class FavoriteCity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their favorite city
        System.out.print("Enter the name of your favorite city: ");
        String city = input.nextLine();

        // Display the number of characters in the city name
        System.out.println("Number of characters: " + city.length());

        // Display the city name in all uppercase letters
        System.out.println(city.toUpperCase());

        // Display the city name in all lowercase letters
        System.out.println(city.toLowerCase());

        // Display the first character in the city name
        System.out.println(city.charAt(0));
    }
}
