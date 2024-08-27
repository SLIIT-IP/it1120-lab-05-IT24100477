import java.util.Scanner;

public class IT24100477Lab5Q3 {
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final double DISCOUNT_3_TO_4_DAYS = 0.10;
    public static final double DISCOUNT_5_OR_MORE_DAYS = 0.20;
    public static final int MAX_DAYS_IN_MONTH = 31;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter end date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > MAX_DAYS_IN_MONTH || endDate < 1 || endDate > MAX_DAYS_IN_MONTH) {
            System.out.println("Error: days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int numberOfDaysReserved = endDate - startDate;
        double totalCost = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;

        double discount = 0.0;
        if(numberOfDaysReserved ==3 || numberOfDaysReserved == 4)
        { discount = DISCOUNT_3_TO_4_DAYS;
        } 

        if(numberOfDaysReserved >= 5)
        { discount = DISCOUNT_5_OR_MORE_DAYS;
        }
        
        totalCost = totalCost-(totalCost*discount);
       
        System.out.println("Room charge per day: " + ROOM_CHARGE_PER_DAY);
        System.out.println("Number of days reserved: " + numberOfDaysReserved);
        System.out.println("Total amount to be paid: "+totalCost);

    }
}
