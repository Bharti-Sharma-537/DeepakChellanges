import java.util.Arrays;

public class FDCalculation extends UserInputData{

    private double FDAmount;
    private double rateOfFDInterest;
    private double period;

    public FDCalculation(double FDAmount, double rateOfFDInterest, double period)
    {
        this.FDAmount = FDAmount;
        this.rateOfFDInterest = rateOfFDInterest;
        this.period = period;
    }

    @Override
    public double getFDAmount() {
       return FDAmount;
    }

    @Override
    public double getRateOfFDInterest() {
        return rateOfFDInterest;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    public double[] yearlyFDInterest()
    {
        /*Compound Interest (CI) = P {(1 + i/100)n – 1}
        Where, P = Principal amount; n = number of years; i = rate of interest per period
        For eg- P = 10000, n = 5 years, i = 8% */

        double totalFDInterest=0;
        double monthlyInterest;
        String interest="";

        for(int i = 1; i <= period; i++)
        {
            totalFDInterest = (FDAmount * 1 * rateOfFDInterest) /100;// 1 = year
            System.out.println("FD interest for the "+i+" year will be : "+totalFDInterest);
            FDAmount = FDAmount + totalFDInterest;
            //interest = String.valueOf(totalFDInterest);
            interest +=totalFDInterest+" ";

        }
        //totalFDInterest = Double.parseDouble(interest);
        System.out.println("FD interest for the year will be : "+interest);

//Store data into an array
        String[] interestYearly = interest.split(" ");

//Converting the String array into double array
        int size = interestYearly.length;
        double[] finalInterestYearly = new double[size];
//now converting each element of String array into double
        for(int i= 0; i < size; i++)
        {
            finalInterestYearly[i] = Double.parseDouble(interestYearly[i]);
        }
//Fetch the finalInterestYearly data in one row
        System.out.println(Arrays.toString(finalInterestYearly));

        return finalInterestYearly;

    }

    /*public double[] monthlyFDInterest()
    {

        double[] finallyMonthlyFDInterest= yearlyFDInterest();
        finallyMonthlyFDInterest[0] = (yearlyFDInterest()[0])/12;
        System.out.println(finallyMonthlyFDInterest[0]);
        return finallyMonthlyFDInterest;

   }*/
}
