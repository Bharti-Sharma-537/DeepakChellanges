import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserInputData userData = new UserInputData();

        String userName;
        double yearlyIncome = 0;
        double loanAmount = 0;
        double rateOfLoanInterest=0 ;
        double FDAmount = 0;
        double rateOfFDInterest = 0;
        double period = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the User's full name :");
        userName = scanner.nextLine();
        while (userName.isEmpty()) {
            System.out.println("User's name is Empty.");
            userName = scanner.nextLine();
        }
        System.out.println("Enter your Yearly Income :");
        if (scanner.hasNextDouble()) {
            yearlyIncome = scanner.nextDouble();
        }
        scanner.nextLine();

        System.out.println("Enter your Loan Amount :");
        if (scanner.hasNextDouble()) {
            loanAmount = scanner.nextDouble();
        }
        scanner.nextLine();

        System.out.println("Enter your rate of interest on Loan Amount :");
        if(scanner.hasNextDouble())// && (rateOfLoanInterest <= 0) && (loanAmount > 0))
        {
            rateOfLoanInterest = scanner.nextDouble();

            while ((rateOfLoanInterest <= 0) && (loanAmount > 0))
            {
                System.out.println("User's loan amount is greater then Zero so rate of interest on loan should not be less then or equal to zero or other value.");
                if(scanner.hasNextDouble())
                {
                   // System.out.println("Please write the correct rate of interest on loan.");
                    rateOfLoanInterest = scanner.nextDouble();
                }
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        System.out.println("Enter your FD amount :");
        if(scanner.hasNextDouble())
        {
            FDAmount = scanner.nextDouble();
        }
        scanner.nextLine();

        System.out.println("Enter your rate of interest on FD amount :");
        if(scanner.hasNextDouble())
        {
            rateOfFDInterest = scanner.nextDouble();
            while((rateOfFDInterest <= 0) && (FDAmount > 0))
            {
                System.out.println("User's FD amount is greater then Zero so rate of interest on FD should not be less then or equal to zero or other value.");
                if(scanner.hasNextDouble())
                {
                    rateOfFDInterest = scanner.nextDouble();
                }
                scanner.nextLine();
            }
        }
           scanner.nextLine();
        System.out.println("Enter the period for Loan installment and FD :");
        if(scanner.hasNextDouble())
        {
            if(loanAmount == 0 && FDAmount == 0)
            {
                System.out.println("You can not enter the period.");
            }
            else {
                period = scanner.nextDouble();
            }
        }
        scanner.nextLine();
        scanner.close();

//Calling the set methods
        userData.setUserName(userName);
        userData.setYearlyIncome(yearlyIncome);
        userData.setLoanAmount(loanAmount);
        userData.setRateOfLoanInterest(rateOfLoanInterest);
        userData.setFDAmount(FDAmount);
        userData.setRateOfFDInterest(rateOfFDInterest);
        userData.setPeriod(period);

//calling the get methods
        System.out.println("User's full name is : "+ userData.getUserName());
        System.out.println("User's Yearly income is : "+userData.getYearlyIncome());
        System.out.println("User's loan amount is : "+userData.getLoanAmount());
        System.out.println("User's rate of interest on loan is : "+userData.getRateOfLoanInterest());
        System.out.println("User's FD amount is : "+userData.getFDAmount());
        System.out.println("User's rate of interest on FD is : "+userData.getRateOfFDInterest());
        System.out.println("Calculation period is : "+userData.getPeriod());

//Calling the LoanCalculation class
        LoanCalculation loan = new LoanCalculation(userData.getLoanAmount(), userData.getRateOfLoanInterest(), userData.getPeriod());
        System.out.println("\n\nLoan class Amount :"+loan.getLoanAmount()+ "\n Loan class rate :"+loan.getRateOfLoanInterest()+"\n Loan class Period :"+loan.getPeriod());
        loan.monthlyInstallmentOfLoan();

//Calling FDCalculation class
        FDCalculation fd = new FDCalculation(userData.getFDAmount(), userData.getRateOfFDInterest(), userData.getPeriod());
        System.out.println("\n\nFD class Amount :"+fd.getFDAmount()+ "\n FD class rate :"+fd.getRateOfFDInterest()+"\n FD class Period :"+fd.getPeriod());
        //fd.yearlyFDInterest();
        /*double[] fdArray = fd.yearlyFDInterest();
        System.out.println(fdArray[0]);*/


//Calling TaxCalculation class
        TaxCalculation tax = new TaxCalculation(userData.getYearlyIncome(), fd, loan);// here FD and loan are the objects
System.out.println("\n");
tax.yearlyTaxAndSavings();
    }
}
