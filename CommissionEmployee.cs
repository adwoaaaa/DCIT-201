using System;

class CommissionEmployee
{
    private string firstName;
    private string lastName;
    private string socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(string firstName, string lastName, string socialSecurityNumber, double grossSales, double commissionRate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        grossSales = grossSales;
        CommissionRate = commissionRate;
    }

    public string FirstName{
        get {return firstName; }
        set {firstName = value; }
    }

     public string LastName
    {
        get { return lastName; }
        set { lastName = value; }
    }

    public string SocialSecurityNumber
    {
        get { return socialSecurityNumber; }
    }

    public double GrossSales
    {
        get { return grossSales; }
        set 
        {
            if (value >= 0.0)
                grossSales = value;
            else
                throw new ArgumentException("Gross sales must be >= 0.0");
        }
    }

    public double CommissionRate
    {
        get { return commissionRate; }
        set 
        {
            if (value >= 0.0 && value <= 1.0)
                commissionRate = value;
            else
                throw new ArgumentException("Commission rate must be between 0.0 and 1.0");
        }

    }    

    public double Earnings(){
       return  grossSales * commissionRate
    }
}