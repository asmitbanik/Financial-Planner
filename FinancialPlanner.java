import java.util.Scanner;

public class FinancialPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your monthly salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your monthly expenses: ");
        double expenses = scanner.nextDouble();

        System.out.print("Enter the cost of the item you want to purchase: ");
        double itemCost = scanner.nextDouble();

        System.out.print("Enter the loan interest rate: "); //(Decimal Format)
        double loanInterestRate = scanner.nextDouble();

        double savingsPerMonth = salary - expenses;

        double timeWithSavings = itemCost / savingsPerMonth;

        double monthlyLoanPayment = itemCost * loanInterestRate / 12.0;
        double timeWithLoan = itemCost / monthlyLoanPayment;

        System.out.println("\nResults:");
        System.out.printf("Time to buy the item with savings: " + timeWithSavings);
        System.out.printf("Time to buy the item with a loan: " + timeWithLoan);

        scanner.close();
    }
}
