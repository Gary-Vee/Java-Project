public class ParkingAnswer {

    public static void main(String[] args) {

        // Change hours to get the answer for the those number of hours.
        int hours = 49;

        int result = cost(hours);
        System.out.println(result);
    }

    public static int cost(int hours) {
        
        
        int theCost = 0;
        
        int daysCost = 0;
        
        int hoursCost = 0;

        int days = hours / 24;
        
        daysCost = 30 * days;

        int remainingHours = hours % 24;

        if (remainingHours >= 10) 
        {
            hoursCost = 30;
        } 
        else 
        {
            hoursCost = 3 * remainingHours;
        }
        theCost = daysCost + hoursCost;

        return theCost;
    }

}