package finance;

import java.util.*;

public class FinancialForecast {

    
    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else {
            return predictFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Present Value: ");
        double presentValue = scanner.nextDouble();

        System.out.print("Enter Annual Growth Rate (in %): ");
        double ratePercent = scanner.nextDouble();
        double growthRate = ratePercent / 100;

        System.out.print("Enter Number of Years: ");
        int years = scanner.nextInt();

        
        double futureValue = predictFutureValue(presentValue, growthRate, years);

        
        System.out.printf("Future value after %d years at %.2f%% growth: %.2f\n", years, ratePercent, futureValue);

        scanner.close();
    }
}
