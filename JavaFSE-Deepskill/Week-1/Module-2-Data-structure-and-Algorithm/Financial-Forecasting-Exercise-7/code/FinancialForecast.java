public class FinancialForecast {
    public static void main(String[] args) {
        double initialInvestment = 10000;  // ₹10,000
        double growthRate = 8;             // 8% annual growth
        int numberOfYears = 5;             // forecast for 5 years

        double futureValue = calculateFutureValue(initialInvestment, growthRate, numberOfYears);
        System.out.printf("Predicted value after %d years: %.2f\n", numberOfYears, futureValue);
    }

    
    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {
        
        if (years == 0) {
            return initialAmount;
        }

        
        double updatedAmount = initialAmount * (1 + growthRate / 100);
        return calculateFutureValue(updatedAmount, growthRate, years - 1);
    }

    
}
