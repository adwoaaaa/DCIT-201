public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);
}

public double getBaseSalary() {
     return baseSalary; 
}


public void setBaseSalary(double baseSalary) {
    if (baseSalary <= 0.0) throw new IllegalArgumentException("Base salary must be > 0.0");
    this.baseSalary = baseSalary;
}

@Override
public double earnings() { 
    return getBaseSalary() + super.earnings(); 
}

@Override
public String toString() {
    return String.format("%s%nBase Salary: %.2f%nTotal Earnings: %.2f", super.toString(), baseSalary, earnings());
}


}