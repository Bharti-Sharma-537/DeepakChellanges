import java.util.Arrays;

public class TaxCalculation extends UserInputData{

    private double yearlyIncome;
    private FDCalculation fd;
    private LoanCalculation loan;
    //private double yearlyTax;
    //private property

    public TaxCalculation(double yearlyIncome, FDCalculation fd, LoanCalculation loan)
    {
        this.yearlyIncome = yearlyIncome;
        this.fd = fd;
        this.loan = loan;
    }

    @Override
    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public FDCalculation getFd() {
        return fd;
    }

    public LoanCalculation getLoan() {
        return loan;
    }

    public void yearlyTaxAndSavings()
    {
        double yearlyTax;
        double saving;
       double[] fdArray= fd.yearlyFDInterest();
       double[] finallyMonthlyFDInterest= fdArray;
        System.out.println(Arrays.toString(fdArray));

//Calculating yearly Loan
        double yearlyTaxableIncome;
        for(int i=0; i<fdArray.length; i++)
        {
            int count=i+1;
            yearlyTaxableIncome = (yearlyIncome + fdArray[i])- (loan.yearlyInstallmentOfLoan());
/*Income                   Rate
Up to 2.5 Lakh -           nil
B/w 250001 and 5 Lakh -     5%
b/w 500001 and 7.5 Lakh -   10%
b/w 750001 and 10 Lakh -    15%
b/w 1000001 and 12.5 Lakh - 20%
b/w 1250001 and 15 Lakh -   25%
Above Rs.15 Lakhs -         30%
 */
            if(yearlyTaxableIncome <= 250000)
            {
                System.out.println("There will be no Tax deduction.");
                yearlyTax=0;
                saving = yearlyTaxableIncome / 12;
            }
            else if(yearlyTaxableIncome > 250000 && yearlyTaxableIncome <= 500000)
            {
                yearlyTax = (yearlyTaxableIncome * 5)/100;
                saving = (yearlyTaxableIncome - yearlyTax) / 12;
            }
            else if(yearlyTaxableIncome > 500000 && yearlyTaxableIncome <= 750000)
            {
                yearlyTax = (yearlyTaxableIncome * 10)/100;
                saving = (yearlyTaxableIncome - yearlyTax) / 12;
            }
            else if(yearlyTaxableIncome > 750000 && yearlyTaxableIncome <= 1000000)
            {
                yearlyTax = (yearlyTaxableIncome * 15)/100;
                saving = (yearlyTaxableIncome - yearlyTax) / 12;
            }
            else if(yearlyTaxableIncome > 1000000 && yearlyTaxableIncome <= 1250000)
            {
                yearlyTax = (yearlyTaxableIncome * 20)/100;
                saving = (yearlyTaxableIncome - yearlyTax) / 12;
            }
            else if(yearlyTaxableIncome > 1250000 && yearlyTaxableIncome < 1500000)
            {
                yearlyTax = (yearlyTaxableIncome * 25)/100;
                saving = (yearlyTaxableIncome - yearlyTax) / 12;
            }
            else//above 15 Lakh
            {
                yearlyTax = (yearlyTaxableIncome * 30)/100;
                saving = (yearlyTaxableIncome - yearlyTax) / 12;
            }
           System.out.println(count+" year Tax Rs " + yearlyTax+" Yearly and Monthly Savings of Rs "+saving);
        }
        for(int i=0; i<finallyMonthlyFDInterest.length; i++)
        {
            finallyMonthlyFDInterest[i] = (finallyMonthlyFDInterest[i])/12;
        }
        System.out.println("Monthly interest on FD Amount "+ Arrays.toString(finallyMonthlyFDInterest));

        /*double fdInterest = fd.yearlyFDInterest();
        System.out.println(fdInterest);*/

    }
}
