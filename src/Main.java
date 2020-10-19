import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserInputData userData = new UserInputData();

        String userName;
        double yearlyIncome=0;
        double loanAmount=0;
        double rateOfLoanInterest=0;
        double FDAmount=0;
        double rateOfFDInterest=0;
        double period=0;



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the User's full name :");
        userName = scanner.nextLine();
        while(userName.isEmpty())
        {
            System.out.println("User's name is Empty.");
            userName = scanner.nextLine();
        }
        System.out.println("Enter your Yearly Income :");
        if(scanner.hasNextDouble())
        {
                yearlyIncome = scanner.nextDouble();
        }

       System.out.println("Enter your Loan Amount :");
        if(scanner.hasNextDouble())
        {
            loanAmount = scanner.nextDouble();
        }
        System.out.println("Enter your rate of interest on Loan Amount :");
        if(scanner.hasNextDouble())
        {
           // rateOfLoanInterest = scanner.nextDouble();
            while((rateOfLoanInterest <= 0) && (loanAmount > 0))
                 {
                     rateOfLoanInterest = scanner.nextDouble();

                     System.out.println("User's loan amount is greater then Zero so rate of interest on loan should not be less then or equal to zero.");

                 }

            scanner.nextLine();
        }
        scanner.close();


        userData.setUserName(userName);
        userData.setYearlyIncome(yearlyIncome);
        userData.setLoanAmount(loanAmount);

        userData.setRateOfLoanInterest(rateOfLoanInterest);

        userData.getUserName();
        userData.getYearlyIncome();
        userData.getLoanAmount();
        userData.getRateOfLoanInterest();

        //userData.setYearlyIncome();
        //userData.getYearlyIncome();
    }
}
