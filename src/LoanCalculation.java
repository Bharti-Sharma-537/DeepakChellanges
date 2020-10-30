public class LoanCalculation extends UserInputData {
    private double loanAmount;
    private double rateOfLoanInterest;
    private double period;
    private double property;

    public LoanCalculation(double loanAmount, double rateOfLoanInterest, double period)
    {
        //super(loanAmount, rateOfLoanInterest, period);
        this.loanAmount = loanAmount;
        this.rateOfLoanInterest = rateOfLoanInterest;
        this.period = period;
    }

    @Override
    public double getLoanAmount() {
        return loanAmount;
    }

    @Override
    public double getRateOfLoanInterest() {
        return rateOfLoanInterest;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    public double yearlyInstallmentOfLoan()
    {

        double yearlyInterest;

        //loan Amount = 100000, loan Rate = 5% yearly, Period = 5 years
        yearlyInterest = ((loanAmount * period) * rateOfLoanInterest) / 100;
        yearlyInterest = ((loanAmount + yearlyInterest) / period);
        System.out.println("Yearly installment of your Loan Amount Rs "+loanAmount+" will be Rs "+yearlyInterest);
        return yearlyInterest;
    }

    public double monthlyInstallmentOfLoan()
    {
        double monthlyInstallment;
       // double totalInterest;

        //loan Amount = 500, loan Rate = 2% yearly, Period = 4 years
       // totalInterest = ((loanAmount * period) * rateOfLoanInterest) / 100;
       // monthlyInstallment = ((loanAmount + totalInterest) / period) / 12;

        monthlyInstallment = yearlyInstallmentOfLoan() / 12;
        System.out.println("Monthly installment of your Loan Amount Rs "+loanAmount+" will be Rs "+monthlyInstallment);
        return monthlyInstallment;
    }

}
