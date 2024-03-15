import java.util.Scanner;

public class CurrencyConverter
{
	public static void main(String[] args) 
	{
        	double usdToEurRate = 0.85; // Example: 1 USD = 0.85 EUR

        	System.out.println("Currency Converter Program");
        	System.out.println("1 - US Dollars (USD)");
        	System.out.println("2 - Euros (EUR)");
        	System.out.print("Choose the input currency (1 or 2): ");

        	Scanner scanner = new Scanner(System.in);
        	int inputCurrency = scanner.nextInt();

        	System.out.print("Enter the amount in the input currency: ");
        	double inputAmount = scanner.nextDouble();

        	double convertedAmount;
        	if (inputCurrency == 1)
		{
            		convertedAmount = inputAmount * usdToEurRate;
            		System.out.printf("%.2f USD is equivalent to %.2f EUR%n", inputAmount, convertedAmount);
        	}
		else if (inputCurrency == 2)
		{
            		convertedAmount = inputAmount / usdToEurRate;
            		System.out.printf("%.2f EUR is equivalent to %.2f USD%n", inputAmount, convertedAmount);
        	}
		else
		{
            		System.out.println("Invalid input currency. Please choose 1 or 2.");
        	}
    	}
}
