public class UserInputData {

    private String userName;
    private double yearlyIncome;
    private double loanAmount;
    private double rateOfLoanInterest;
    private double FDAmount;
    private double rateOfFDInterest;
    private double period;

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public void setYearlyIncome(double yearlyIncome)
    {
        this.yearlyIncome = yearlyIncome;
       if (yearlyIncome<0)
        {
            this.yearlyIncome = 0;
        }
    }

    public void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
        if (loanAmount<=0)
        {
            this.loanAmount = 0;
        }
        if(loanAmount >= yearlyIncome)
        {
            this.loanAmount = 0;
            System.out.println("Invalid Loan Amount");
        }

    }

    public void setRateOfLoanInterest(double rateOfLoanInterest)
    {
        this.rateOfLoanInterest = rateOfLoanInterest;
      if ((rateOfLoanInterest <= 0) || (this.loanAmount <= 0))
        {
            this.rateOfLoanInterest = 0;
        }

    }

    public void setFDAmount(double FDAmount)
    {
        this.FDAmount = FDAmount;
        if (FDAmount < 0)
        {
            this.FDAmount = 0;
        }
    }

    public void setRateOfFDInterest(double rateOfFDInterest)
    {
        this.rateOfFDInterest = rateOfFDInterest;
        if ((rateOfFDInterest <= 0) || (this.FDAmount <= 0))
        {
            this.rateOfFDInterest = 0;
        }
    }

    public void setPeriod(double period)
    {
        this.period = period;
        if (period < 0)
        {
            this.period = 0;
        }
    }

    public String getUserName() {
        //System.out.println("User's full name is : "+this.userName);
        return this.userName;
    }

    public double getYearlyIncome()
    {
       //System.out.println("User's Yearly income is : "+this.yearlyIncome);
        return this.yearlyIncome;
    }

    public double getLoanAmount()
    {
       // System.out.println("User's loan amount is : "+this.loanAmount);
        return loanAmount;
    }

    public double getRateOfLoanInterest()
    {
       // System.out.println("User's rate of interest on loan is : "+this.rateOfLoanInterest);
        return rateOfLoanInterest;
    }

    public double getFDAmount()
    {
        //System.out.println("User's FD amount is : "+this.FDAmount);
        return FDAmount;
    }

    public double getRateOfFDInterest()
    {
        //System.out.println("User's rate of interest on FD is : "+this.rateOfFDInterest);
        return rateOfFDInterest;
    }

    public double getPeriod()
    {
        //System.out.println("Calculation period is : "+this.period);
        return period;
    }


}
