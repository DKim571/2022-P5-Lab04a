// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04v100avst
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Lab04a, Student Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;


        System.out.println("Principal:               $" + principal);
        System.out.println("Annual Rate:             " + annualRate + "%");
        System.out.println("Number of Years:         " + numYears);
        annualRate = annualRate / 100;
        annualRate = annualRate/12;
        numYears = numYears * 12;
        double monthlyPayment = ((annualRate* Math.pow((1+annualRate),numYears))/(Math.pow((1+annualRate),numYears)-1))*principal;
        monthlyPayment = monthlyPayment * 100;
        monthlyPayment = Math.round(monthlyPayment);
        monthlyPayment= monthlyPayment/100;
        System.out.println("Monthly Payment:         $" + monthlyPayment);
        double TotalPayments = monthlyPayment * 360;
        System.out.println("Total Payments:          $" + TotalPayments);
        double TotalInterest = TotalPayments - principal;
        System.out.println("Total Interest:          $" + TotalInterest);
    }
}

