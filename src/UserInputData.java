import java.util.Scanner;

public class UserInputData {

    private String userName;
    private double yearlyIncome;
    private double loanAmount;
    private double rateOfLoanInterest;
    private double FDAmount;
    private double rateOfFDInterest;
    private double period;

    public UserInputData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the User's full name :");
        this.userName = scanner.nextLine();
        System.out.println("Enter your Yearly Income :");
        if(scanner.hasNextDouble())
        {
            this.yearlyIncome = scanner.nextDouble();
        }
        else
            {
            scanner.close();
            }
    }

    //Setting and getting the user name
   /* public void setUserName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the User's full name :");
        this.userName = scanner.nextLine();
        scanner.close();
    }*/

    public String getUserName() {
        System.out.println("User's full name is : "+this.userName);
         return this.userName;
    }

    //Setting and getting the Yearly income of user
   /* public void setYearlyIncome()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Yearly Income :");
        scanner.nextLine();
        this.yearlyIncome = scanner.nextDouble();

        scanner.close();
    }*/
    public double getYearlyIncome()
    {
        System.out.println("User's Yearly income is : "+this.yearlyIncome);
        return this.yearlyIncome;
    }

    //

}
