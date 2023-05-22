import java.util.Scanner;

public class Mileage {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        
        System.out.println("I will calculate mileage");
        
        System.out.print("Please input your miles that you have driven: ");
        
        
        Double miles = m.nextDouble();
        
        System.out.print("Please enter the amount of gallons used: ");
        
        Double gallons = m.nextDouble();
        
        Double calculate = miles / gallons;
        
        System.out.println("This is your MPG. \n " + calculate);

    }
    
}